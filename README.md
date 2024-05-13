

#
 ### Technical documentation


 ## Before collision detection - Logic walkthrough
 This code implements preemptive collision detection for a moving object (most likely a player character) against bricks in a game.  It follows a clear red thread by checking for potential collisions and taking appropriate action.

 ## Variables:

 - br_1: Flag indicating potential collision with brick (probably 1 when in collision zone).
 - rx11, ry11: Center coordinates (x and y) of the player character.
 - pWidth, pHeight: Player character width and height.
 - bx, by: Brick grid position (x and y).
 - tile: The size of a single square in the game world.
 - offsetX: Potential adjustment for brick placement.
 - brickbr: Array containing information about bricks (probably type and size).
 - brick_c4: Constant value related to brick size/collision area.
 - moveX, moveY: Variables to store movement adjustments for the player.
 - isMove, moveToY, isIdle: Flags to control player movement and state.
 - update_game, invalidate: Flags to trigger game updates and screen scan.
 - dp, sc1: Scaling factors (probably for screen size adjustments).
 - spiderX, spiderY, spiderCurrentX, spiderCurrentY: Player character position variables (current and potential future positions).
 - preSpiderX, preSpiderY: Player character's previous positions (used for calculations).

 ## Logic flow:

 ### 1. Collision check:

 - The code first checks if br_1 is set to 1, indicating a potential collision zone.
 - It then performs complex calculations using player and brick positions, size information (pWidth, pHeight, tile) and tile data (brickbr) to determine if the player's center (rx11, ry11) overlaps with a tile's collision area.

 ### 2. Collision handling (Type 1):

 - If a collision is detected based on tilebr[br][0] == 1, it likely means the player is hitting an upper or lower brick.
 - The code calculates a moveY value to adjust the player's position based on the brick placement and a small adjustment.
 - It checks if moveY is significant (greater than 10 or less than -10) to avoid unnecessary adjustments.
 - If a significant adjustment is needed, several flags are set:
   - isMove: Starts the player's movement.
   - moveToY: Stores the calculated movement distance.
   - isIdle: Optionally puts the player to an idle state after the adjustment.
   - update_game: Flags the game for update.
   - invalidate: Triggers screen scan.

 ### 3. Collision handling (Type 2):

 - This part handles a different type of collision, potentially when the player has completely passed the brick on the right side.
 - It checks if br_1 is set and if the player's center (rx11) is further to the right than a specific threshold based on the brick's position (bx).
 - If this condition is met, the following actions take place:
   - br_1 is reset to 0, likely indicating that the player is no longer in a collision zone.
   - canvasState function in MainActivity is called with argument 2 (possibly indicating a specific game state change).
   - Movement variables (moveX, moveY)






# 
### Teknisk dokumentation - Swedish 


## Före kollisionsdetektering - Logisk genomgång
Den här koden implementerar förebyggande kollisionsdetektering för ett rörligt objekt (troligtvis en spelarkaraktär) mot tegelstenar i ett spel. Den följer en tydlig röd tråd genom att kontrollera för potentiella kollisioner och vidta lämpliga åtgärder.

## Variabler:

- br_1: Flagga som indikerar potentiell kollision med tegel (förmodligen 1 när den befinner sig i kollisionszonen).
- rx11, ry11: Spelarkaraktärens centralkoordinater (x och y).
- pWidth, pHeight: Spelarkaraktärens bredd och höjd.
- bx, by: Tegelstens rutnätsposition (x och y).
- tile: Storleken på en enda ruta i spelvärlden.
- offsetX: Potentiell justering för placering av tegel.
- brickbr: Array innehållande information om tegelstenar (troligtvis typ och storlek).
- brick_c4: Konstantvärde relaterat till tegelstensstorlek/kollisionsområde.
- moveX, moveY: Variabler för att lagra rörelsejusteringar för spelaren.
- isMove, moveToY, isIdle: Flaggor för att kontrollera spelarens rörelse och tillstånd.
- update_game, invalidate: Flaggor för att utlösa speluppdateringar och skärmavsökning.
- dp, sc1: Skaleringsfaktorer (troligtvis för justeringar av skärmstorlek).
- spiderX, spiderY, spiderCurrentX, spiderCurrentY: Spelarkaraktärens positionsvariabler (aktuella och potentiella framtida positioner).
- preSpiderX, preSpiderY: Spelarkaraktärens tidigare positioner (används för beräkningar).

## Logikflöde:

### 1. Kollisionskontroll:

- Koden kontrollerar först om br_1 är satt till 1, vilket indikerar en potentiell kollisionszon.
- Den utför sedan komplexa beräkningar med hjälp av spelarens och tegelstens positioner, storleksinformation (pWidth, pHeight, tile) och tegeldata (brickbr) för att avgöra om spelarens centrum (rx11, ry11) överlappar med en tegelstens kollisionsområde.

### 2. Kollisionshantering (Typ 1):

- Om en kollision upptäcks baserat på brickbr[br][0] == 1, betyder det troligtvis att spelaren träffar en övre eller nedre tegel.
- Koden beräknar ett moveY-värde för att justera spelarens position baserat på tegelstens placering och en liten justering.
- Den kontrollerar om moveY är signifikant (större än 10 eller mindre än -10) för att undvika onödiga justeringar.
- Om en signifikant justering behövs, ställs flera flaggor in:
  - isMove: Startar spelarens rörelse.
  - moveToY: Lagrar det beräknade rörelseavståndet.
  - isIdle: Sätter eventuellt spelaren till ett viloläge efter justeringen.
  - update_game: Flaggar spelet för uppdatering.
  - invalidate: Utlöser skärmavsökning.

### 3. Kollisionshantering (Typ 2):

- Den här delen hanterar en annan typ av kollision, potentiellt när spelaren helt har passerat teglet på höger sida.
- Den kontrollerar om br_1 är satt och om spelarens centrum (rx11) är längre till höger än en specifik tröskel baserat på tegelstens position (bx).
- Om detta villkor uppfylls sker följande åtgärder:
  - br_1 återställs till 0, vilket troligtvis indikerar att spelaren inte längre befinner sig i en kollisionszon.
  - canvasState-funktionen i MainActivity anropas med argumentet 2 (möjligen som indikerar en specifik spelstatsändring).
  - Rörelsevariabler (moveX, moveY)





