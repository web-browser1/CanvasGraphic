# 
### Teknisk dokumentation 


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
  - Rörelsevariabler (moveX, `





