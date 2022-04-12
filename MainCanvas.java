package com.example.game;


/***
Author: David A.

Copyright 2022
*/


public class MainCanvas extends SurfaceView {


    private static MainCanvas instance;

    public static MainCanvas getInstance() {

        return instance;
    }

    Canvas canvas;

    Context mContext;

   /* public MainCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        mContext = context;
        init();
    }

    public MainCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mContext = context;
        init();
    }*/

    public MainCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setZOrderOnTop(true);

        getHolder().setFormat(PixelFormat.TRANSLUCENT);

        mContext = context;
        init();
    }

/*
   public MainCanvas(Context context) {
        super(context);

        mContext = context;
       init();


    }*/


    int e = 0;

    Bitmap drawables[][];

    RectF rectb = null;

    RectF rectf = null;
    Paint paint = null;
    int colorb = 0;
    float cHeight = 0;
    float cWidth = 0;

    Bitmap d1 = null;
    Bitmap d2 = null;
    Bitmap d3 = null;
    Bitmap d4 = null;

    int d1w = 0;
    int d1h = 0;
    int d2w = 0;
    int d2h = 0;
    int d3w = 0;
    int d3h = 0;
    int d4w = 0;
    int d4h = 0;

    Bitmap d11 = null;
    Bitmap d12 = null;
    Bitmap d13 = null;

    Bitmap d14 = null;
    Bitmap d15 = null;
    Bitmap d16 = null;
    Bitmap d17 = null;


    Bitmap d18 = null;
    Bitmap d19 = null;
    Bitmap d20 = null;
    Bitmap d21 = null;

    Bitmap dweb1 = null;


    int d11w = 0;
    int d11h = 0;
    int d12w = 0;
    int d12h = 0;
    int d13w = 0;
    int d13h = 0;

    int d14w = 0;
    int d14h = 0;
    int d15w = 0;
    int d15h = 0;
    int d16w = 0;
    int d16h = 0;
    int d17w = 0;
    int d17h = 0;


    int d18w = 0;
    int d18h = 0;
    int d19w = 0;
    int d19h = 0;
    int d20w = 0;
    int d20h = 0;
    int d21w = 0;
    int d21h = 0;


    Drawable d40, d41, d42, d43;

    Drawable d41m, d42m, d43m;

    int trophies = 0;

    int tr_1 = 0;


    float dp = 0;

    Rect rectbg = null;
    Paint paintbg = null;
    int bgcolor = 0;

    float cY = 0;
    float cMoveToY = 0;

    Bitmap d = null;
    Paint paintL = null;


    int canvas_v = 1;

    int color2 = 1;
    int color3 = 1;
    Paint paint2 = new Paint();

    int sx = 2;
    int sy = 2;
    Paint paint3 = new Paint();
    LightingColorFilter lightingColorFilter = null;

    public void setLevel(int level) {

        if (level < 5) {
            e = 0;
        }
        if (level >= 5) {
            e = 1;
        }
        if (level >= 10) {
            e = 2;
        }
        if (level >= 15) {
            e = 3;
        }

        // e = e + 1 > drawables.length-1 ? drawables.length-1 : e + 1;
    }


    public void moveYStartRun() {

        moveYStart = 1;
    }


    public void startWeb() {
        webp = 1;


        lpr = 0;
        webpx = 0;
    }


    int spiderY_r = 1;


    public void bricksb() {


        brickbr = new int[][]{

                {4, 3, 0},

                {2, 2, 2},

                {2, 3, 3},
                {2, 3, 2},

                {2, 4, 2},
                {1, 2, 3},

                {1, 7, 3},
                {1, 5, 4},

                {2, 5, 4},
                {2, 5, 5},
                {2, 5, 4},
                {2, 5, 2},

                {1, 2, 3},
                {1, 2, 4},
                {1, 2, 3}, // 53
                {1, 2, 4},
                {1, 2, 3},
                {1, 2, 4},


                {1, 6, 3},
                {2, 0, 4},

                {1, 6, 3}, // 71
                {2, 0, 4},

                {4, 4, 1},

                {1, 6, 6},
                {2, 0, 2},

                {1, 6, 2},
                {2, 0, 6},


                {1, 6, 4},
                {1, 3, 5},
                {1, 3, 3},
                {1, 3, 5},  // 99
                {2, 0, 3},


                {1, 6, 4}, // 105
                {1, 3, 5},
                {1, 3, 3},
                {1, 3, 1},


                {1, 6, 1},
                {1, 3, 3},
                {1, 2, 5},
                {1, 3, 7},
                {1, 3, 7},
                {1, 3, 6},
                {1, 3, 3}, // 137

                {2, 6, 5},
                {2, 3, 7},
                {2, 3, 7},
                {2, 3, 6},
                {2, 3, 3},

                {1, 6, 3},
                {2, 0, 4},

                {4, 6, 2},

                {1, 6, 2},
                {2, 0, 4},

                {5, 8, 1},


                {1, 6, 5}, // 177
                {2, 1, 2},

                {1, 6, 2},
                {2, 1, 6},


                {1, 6, 7},
                {2, 6, 7},
                {1, 6, 7}, // 199
                {2, 6, 7},
                {2, 4, 6},
                {2, 4, 5},

                {1, 6, 2}, // 219
                {1, 4, 3},
                {1, 4, 5},
                {1, 4, 7},

                {1, 6, 5},
                {2, 1, 2},

                {1, 6, 2}, // 244
                {2, 1, 6},

                {2, 6, 7},
                {1, 6, 7},
                {2, 6, 7},


                {1, 6, 3}, // 269
                {2, 0, 5},

                {1, 6, 3},
                {1, 6, 3},
                {1, 6, 3},


                {1, 12, 3}, // 295
                {2, 0, 5},

                {4, 6, 3},

                {1, 6, 4},  // 301
                {2, 0, 4},

                {1, 6, 5},
                {2, 0, 3},

                {1, 6, 6},
                {2, 0, 2},


                {2, 6, 6},

                {2, 6, 7},  // 325

                {2, 3, 1},
                {2, 3, 2},
                {2, 3, 3},
                {2, 3, 1},
                {2, 3, 2},
                {2, 3, 3},
                {2, 3, 2},
                {2, 3, 1}, // 349

                {1, 6, 2},
                {2, 0, 2},
                {1, 2, 3},
                {2, 0, 3},
                {1, 2, 2},
                {2, 0, 2},
                {1, 2, 3},
                {2, 0, 3},
                {1, 2, 2},
                {2, 0, 2},

                {1, 6, 4}, // 369
                {2, 0, 4},

                {5, 8, 2},

                {1, 6, 5}, // 375
                {2, 0, 3},

                {4, 6, 4},

                {1, 6, 3},
                {2, 0, 3},
                {1, 2, 2},
                {2, 0, 2},

                {1, 2, 4},
                {2, 0, 3},
                {1, 2, 2}, // 387
                {2, 0, 4},

                {1, 2, 4},
                {2, 0, 3},
                {1, 2, 2}, // 391
                {2, 0, 4},


                {2, 7, 3},
                {2, 1, 2},
                {2, 1, 4},
                {2, 1, 2},
                {1, 0, 4},
                {2, 1, 3},
                {1, 1, 3},
                {2, 1, 2},
                {2, 1, 4},
                {1, 1, 2},
                {2, 1, 3},
                {1, 0, 4},
                {2, 1, 2},
                {2, 1, 3},

                {1, 6, 4},
                {1, 1, 5},
                {1, 1, 6},
                {1, 1, 7},

                {2, 6, 4},
                {2, 1, 5},
                {2, 1, 6},
                {2, 1, 7},  // 425

                {1, 6, 2},
                {2, 0, 2},
                {1, 2, 3},
                {2, 0, 3},
                {1, 2, 4},
                {2, 0, 4},

                {2, 2, 4},
                {2, 2, 4},
                {2, 2, 4},
                {2, 2, 4},

                {2, 2, 3},
                {2, 2, 2},
                {2, 2, 1}, // 447


                {1, 6, 2},
                {2, 0, 2},
                {1, 2, 3},
                {2, 0, 3},
                {1, 2, 4},
                {2, 0, 4},

                {1, 4, 2},
                {2, 0, 2},
                {1, 2, 3},
                {2, 0, 3},
                {1, 2, 4}, // 465
                {2, 0, 4},

                {1, 4, 4},
                {2, 0, 4},
                {1, 2, 3},
                {2, 0, 3},
                {1, 2, 2},
                {2, 0, 2},
                {1, 2, 1}, // 475
                {2, 0, 1},

                {2, 6, 1},
                {2, 1, 1},
                {2, 1, 2},
                {2, 1, 3},
                {2, 1, 4},
                {2, 1, 5},

                {1, 6, 3},
                {1, 1, 2},

                {2, 6, 3},
                {2, 1, 2},
                {2, 1, 3},
                {2, 1, 2},
                {2, 1, 3},

                {4, 6, 7},

                {1, 6, 4},
                {1, 1, 5},


                {1, 5, 1},

                {2, 1, 1},

                {1, 1, 2},

                {2, 1, 2},

                {1, 1, 3},
                {2, 1, 3},

                {1, 3, 3},
                {2, 3, 2},

                {1, 3, 2},
                {2, 3, 3},


                {2, 6, 1},
                {2, 1, 2},
                {2, 1, 3},

                {1, 4, 1},
                {1, 1, 2},
                {1, 1, 3},

                {2, 6, 2},
                {2, 1, 4},
                {2, 1, 6},

                {1, 4, 2},
                {1, 1, 4},
                {1, 1, 6},


                {1, 6, 4},
                {2, 0, 3},
                {1, 2, 3},
                {2, 0, 2},
                {1, 2, 2},
                {2, 0, 2},
                {1, 2, 1},
                {2, 0, 3},
                {1, 2, 1},
                {2, 0, 3},
                {1, 2, 3},
                {2, 0, 2},
                {1, 2, 4},
                {2, 0, 3},
                {1, 2, 3},
                {2, 0, 2},

                {4, 6, 7},


                {1, 6, 1},
                {2, 0, 1},
                {1, 2, 2},
                {2, 0, 2},
                {1, 2, 1},
                {2, 0, 1},
                {1, 2, 3},
                {2, 0, 2},
                {1, 2, 4},
                {2, 0, 3},
                {1, 2, 3},
                {2, 0, 2},
                {1, 2, 2},
                {2, 0, 2},
                {1, 2, 1},
                {2, 0, 1},


                {5, 8, 3},


                {1, 6, 6},

                {1, 4, 4},

                {1, 4, 4},


                {1, 4, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 4},


                {5, 8, 4},


                {2, 14, 10},
                {1, 3, 9},
                {2, 3, 8},

        };

        int df = 1;


        df = MainActivity.getInstance().difficult;


        int df_s = 1;

        if (MainActivity.getInstance().difficult >= 10) {
            df_s = 2;

            df = df - 10;

        } else {
            df_s = 1;

        }


        // df = 2;


        /*
           0

           1

           2


         */


        webr1 = new int[300][2];


       /* webr1[0][0] = 0;
        webr1[0][0] += 1;*/


        int web_fr = MainActivity.getInstance().webf;


        int br3 = 0;

        int br_c = 0;


        for (int br = 0; br < brickbr.length; br++) {

            br_c++;


            if (br_c > web_fr) {


                webr1[br3][0] = br;

                webr1[br3][1] = 1;


                br3++;

                br_c = 0;
            }


            // by = brickbr[br][2];

            if (df_s == 1 && brickbr[br][2] >= 6) {

                // brickbr[br][2] = 4;

                brickbr[br][2] = brickbr[br][2] - df;
            }

            if (df_s == 2 && brickbr[br][2] >= 5) {

                // brickbr[br][2] = 4;

                brickbr[br][2] = brickbr[br][2] - df;
            }


            if (brickbr[br][1] == 0 && brickbr[br][2] >= 3) {

                brickbr[br][2] = brickbr[br][2] - 1;
            }



            /*  if(  brickbr[br][2] >= 4 ) {

                brickbr[br][2] = brickbr[br][2] - 1;
             }
               */


        }


    }

    int webr1[][] = new int[300][2];

    RectF rectt = new RectF();


    float sc_c1 = 0;

    float sc_2 = 0;

    float sc_y = 0;

    float sc_y2 = 0;


    float sc_rd = 0;

    int sc_cd = 0;


    float sc_r0 = 0;


    float sc_rd1 = 0;

    float sc_r1 = 0;


    float y_1c = 0;
    float y_2c = 0;

    float y_3c = 1.06f;


    float qs1 = 0;

    float qs3 = 0;


    int px_c = 120;

    float px_3c = 6.06f;

    float px_1c = 0;

    float px_2c = 0;

    float px_c0 = 0;

    float px_q1 = 0;


    int px_qe = 0;


    public void init() {


        px_c0 = (float) Math.pow(20, 2) * 0.4f;

        //   px_qe = (int)(Math.sqrt(px_3c/0.4) / 0.01  );
        px_qe = 304;

        for (int p = 0; p < px_qe; p++) {

            // px_q1 += ( Math.pow(p*0.01f, 2) * 0.4f);

            //  px_q1 +=  (float) (Math.pow(p*0.01f, 2)* 0.4f);

            px_q1 += 2 * (p * 0.01f);
        }


        instance = this;

        rectt = new RectF();


        rectb = new RectF();

        setWillNotDraw(false);



        /*


            {1, 3},

            {1, 73},

            {1, 173},

            {1, 300},

            {1, 379},


            {1, 483},

            {1, 543},


         */


        bricksb();


        GAME_STATE = 1230;


        int fc = 140;
        int color_f = Color.argb(255, fc, fc, fc);

        lightingColorFilter = new LightingColorFilter(color_f, 0x00000000);


        paintL = new Paint();

        paintL.setColor(Color.argb(255, 218, 218, 218));
        paintL.setStrokeWidth(2f);


        dp = mContext.getResources().getDisplayMetrics().density;


        float webcx = (int) (45.71f * dp);  // 120


        lp1 = new float[][]{


                {0, 0, 0, 120, 0},   // v

                {webcx, 0, webcx, 120, 0},   // v

                {-webcx, 0, -webcx, 100, 0},   // v

                {-webcx, 40, 0, 50, 0},   // h

                {0, 50, webcx, 60, 0},   // h

                {0, 70, webcx, 80, 0},   // h

                {webcx * 2, 0, webcx * 2, 110, 0},   // v

                {webcx, 50, webcx * 2, 60, 0},   // h

                {webcx, 70, webcx * 2, 80, 0},   // h

                {webcx, 30, webcx * 2, 20, 0},   // h


                {webcx * 3, 0, webcx * 3, 130, 0},   // v

                {webcx * 2, 35, webcx * 3, 45, 0},   // h

                {webcx * 2, 55, webcx * 3, 65, 0},   // h


                {webcx * 4, 0, webcx * 4, 130, 0},   // v

                {webcx * 3, 85, webcx * 4, 75, 0},   // h

                {webcx * 3, 15, webcx * 4, 25, 0},   // h

        };


        color3 = Color.argb(255, 255, 255, 255);

        paint3.setColor(color3);


        color2 = Color.argb(255, 255, 255, 255);

        paint2.setColor(color2);


        spiderX = (int) (114.28f * dp); // 300


        cHeight = getHeight();
        cHeight = getWidth();

        //  tile = (int)getHeight()/10;

        // tile = 100;


        //   tile = (int)(38.09f * dp);

        tile = (int) (137.28f * dp * sc1);

        //    moveToY = (int)(152.38f * dp); // 400

        //   moveToY = (int)(320f * dp); // 400

        //  tile_b = (int)getHeight()/10;

        // 2.625   ,   38.09


        rectbg = new Rect();
        paintbg = new Paint();
        bgcolor = Color.argb(255, 37, 37, 55);


        rectf = new RectF();
        paint = new Paint();

        // colorb = Color.argb(255, 30, 30, 44);

        colorb = Color.argb(255, 22, 22, 33);
        canvas_v = 1;

        y11 = 0;


        DisplayMetrics displayMetrics = new DisplayMetrics();

        MainActivity.getInstance().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;


        cHeight = height;
        cWidth = width;


        spiderY = -150 * dp;


        sc_c1 = 0;


        sc_2 = cHeight / 2;

        sc_y = (cHeight * sc_0) - cHeight;

        sc_y2 = sc_y / 2;


        sc_rd = (sc_2 - (100 * dp));

        sc_rd1 = (sc_2 + (100 * dp));



   /*   1.06 = (0.01*x)^2

                   sqrt(1.06) / 0.01  =   102  frames
             */

        int sq_e = (int) (Math.sqrt(y_3c) / 0.01f);

        for (int sq = 0; sq < sq_e; sq++) {
            qs1 += (float) Math.pow(sq * 0.01f, 2);
        }

        qs3 = (qs1 * 2);


        //  moveYStart = 1;

        //   isMove = 1;


        moveToY = (int) (cHeight / 2) + (120f * dp);

        // Log.d("TAG", "init moveToY: " + moveToY + "  cHeight/2: " + (cHeight/2));

        if (moveToY < 100) {

            moveToY = (int) (320f * dp); // 400

            //   Log.d("TAG", "init moveToY <<<<<<");
        }


        if (spiderY_r == 1) {

            spiderY = (int) (130f * dp); // 400

            moveToY = (int) (40f * dp); // 400
        }





       /* Log.d("TAG", "init moveToY: " + moveToY + "  cHeight/2: " + (cHeight/2));




        Log.d("TAG", "canvas width: " + getWidth() + "  display width: " + width + " dp: " + dp );
        Log.d("TAG", "canvas height: " + getHeight() + "  display height: " + height + " dp: " + dp );


        Log.d("TAG",  " moveToY: " + moveToY + "  spiderY: " + spiderY );
*/

        tile_b = (height) / 10;


        // moveToX = (int)(45.71f * dp);  // 120


        int hq = 2;   // hq 1 ,  hq 0

        reloadResources(hq);


    }

        Bitmap d41 = BitmapFactory.decodeResource(getResources(), dr2[hq][12]);
        Bitmap d42 = BitmapFactory.decodeResource(getResources(), dr2[hq][13]);
        Bitmap d43 = BitmapFactory.decodeResource(getResources(), dr2[hq][14]);
        Bitmap d44 = BitmapFactory.decodeResource(getResources(), dr2[hq][15]);


        drawables = new Bitmap[][]{
                {d11, d12, d13, d14},
                {d21, d22, d23, d24},
                {d31, d32, d33, d34},
                {d41, d42, d43, d44},
        };


        invalidate();

    }


    int dw1 = 0;
    int dh1 = 0;

    int d11r[][];

    int d40r[][];

    float checkpointStartXc = 300;


    public void checkpointStart(int level) {



        moveToY = (int) (cHeight / 2) + (120f * dp); // 400

        if (moveToY < 100) {

            moveToY = (int) (220f * dp); // 400
            //    Log.d("TAG", "checkpoint moveToY <<<<<" );
        }



        if (checkpointc > 0) {

            cameraH = 2;


        } else {

            offsetX = 0;
        }

        if (cameraH == 2) {
            //   rx11 = ((float)getWidth()/2 );

            cx11 = ((float) getWidth() / 2);

            startX = checkpointStartXc;

            spiderX = startX;
            spiderCurrentX = spiderX;

            cameraH = 3;


            offsetX = ((spiderCurrentX) - cx11);
        }
        update_game = 1;
        invalidate();


    }

    int update_game = 0;

    int p_run = 0;

    int evolve_d = 0;
    int evolve_c = 1;

    int run_evolve = 0;

    public void evolve64(int e) {


        if (e == 1) {


            float webcx = (int) (45.71f * dp);  // 120


            lp1 = new float[][]{


                    {0, 0, 0, 120, 0},   // v

                    {webcx, 0, webcx, 120, 0},   // v

                    {-webcx, 0, -webcx, 100, 0},   // v

                    {-webcx, 40, 0, 50, 0},   // h

                    {0, 50, webcx, 60, 0},   // h

                    {0, 70, webcx, 80, 0},   // h

                    {webcx * 2, 0, webcx * 2, 110, 0},   // v

                    {webcx, 50, webcx * 2, 60, 0},   // h


                    {webcx, 30, webcx * 2, 20, 0},   // h

                    {webcx * 3, 0, webcx * 3, 130, 0},   // v

                    {webcx * 2, 35, webcx * 3, 45, 0},   // h

            };


        }

        if (e == 2) {


            float webcx = (int) (45.71f * dp);  // 120


            lp1 = new float[][]{


                    {0, 0, 0, 120, 0},   // v

                    {webcx, 0, webcx, 120, 0},   // v

                    {-webcx, 0, -webcx, 100, 0},   // v

                    {-webcx, 40, 0, 50, 0},   // h

                    {0, 50, webcx, 60, 0},   // h

                    {0, 70, webcx, 80, 0},   // h

                    {webcx * 2, 0, webcx * 2, 110, 0},   // v

                    {webcx, 50, webcx * 2, 60, 0},   // h

                    {webcx, 70, webcx * 2, 80, 0},   // h

                    {webcx, 30, webcx * 2, 20, 0},   // h


                    {webcx * 3, 0, webcx * 3, 130, 0},   // v

                    {webcx * 2, 35, webcx * 3, 45, 0},   // h

                    {webcx * 2, 55, webcx * 3, 65, 0},   // h


                    {webcx * 4, 0, webcx * 4, 130, 0},   // v

                    {webcx * 3, 85, webcx * 4, 75, 0},   // h

                    {webcx * 3, 15, webcx * 4, 25, 0},   // h

            };


        }


        if (e == 3) {


            float webcx = (int) (45.71f * dp);  // 120


            lp1 = new float[][]{


                    {0, 0, 0, 120, 0},   // v

                    {webcx, 0, webcx, 120, 0},   // v

                    {-webcx, 0, -webcx, 100, 0},   // v

                    {-webcx, 40, 0, 50, 0},   // h

                    {0, 50, webcx, 60, 0},   // h

                    {0, 70, webcx, 80, 0},   // h

                    {webcx * 2, 0, webcx * 2, 110, 0},   // v

                    {webcx, 50, webcx * 2, 60, 0},   // h

                    {webcx, 70, webcx * 2, 80, 0},   // h

                    {webcx, 30, webcx * 2, 20, 0},   // h


                    {webcx * 3, 0, webcx * 3, 130, 0},   // v

                    {webcx * 2, 35, webcx * 3, 45, 0},   // h

                    {webcx * 2, 55, webcx * 3, 65, 0},   // h


                    {webcx * 4, 0, webcx * 4, 130, 0},   // v

                    {webcx * 3, 85, webcx * 4, 75, 0},   // h

                    {webcx * 3, 15, webcx * 4, 25, 0},   // h


                    {webcx * 5, 0, webcx * 5, 160, 0},   // v

                    {webcx * 4, 35, webcx * 5, 45, 0},   // h

                    {webcx * 4, 55, webcx * 5, 65, 0},   // h


                    {webcx * 6, 0, webcx * 6, 150, 0},   // v

                    {webcx * 5, 105, webcx * 6, 95, 0},   // h

                    {webcx * 5, 75, webcx * 6, 85, 0},   // h


            };


        }


        startWeb();

       /* moveYStart = 1;

        moveToY =  -(70f * dp); // 400
        */

        run_evolve = 1;

        GAME_STATE = 5;

        update_game = 1;
        invalidate();
    }


  

    public void StartA() {

        if (a1 == 1) {

            update_game = 1;
            br_1 = 1;  /////////// <<<<<<<<<<

            invalidate();
        }

    }


    public void ResetA() {


        if (a1 == 1) {


            //  MainActivity.getInstance().canvasState(4);

            // reset

            //

            //   Log.d("TAG", " reset checkpoint: " + checkpointc);

            if (checkpointc > 0) {

                cameraH = 2;

            } else {
                cx11 = 0;

                rx11 = 0;
                cameraH = 0;
                position = 0;
            }

            moveToX = 0;
            movetoXb = 0;

          

            startX = checkpointStartXc;


            spiderX = startX;


            moveYStart = 1;


            moveToY = (int) (92.38f * dp); // 400


            br_1 = 1;


            update_game = 1;
            invalidate();

        }


    }

    int moveX = 0;

    float moveToX = 0;

    float moveToY = 0;
    float downY = 0;
    float isMove = 0;
    float pTouchAreaLocalY = 0;
    int moveY_s = 0;

    int y11 = 0;


    int spider5_r = 1;


    int GAME_STATE = -1;


    int move_s = 0;


    
    int re = 1;

    int moveBack = 0;

    int game_over = 0;

    int game_re = 0;

    int spider_c = 1;

    int brick_c = 0;


    int cameraH = 0;
    float movetoXb = 0;
    float rx11 = 0;
    float ry11 = 0;
    int position = 0;
    float pXb = 0;

    float pWidth = 0;
    float pHeight = 0;

    float offsetX = 0;

    int a1 = 0;

    int br_1 = 0;


    int game_start = 0;


    float lp1[][] = new float[][]{

            //  { 0, 0, 0, 100, 0 },   // v

            {100, 0, 100, 120, 0},   // v

            {-100, 0, -100, 100, 0},   // v

            {-100, 40, 0, 50, 0},   // h

            {0, 50, 100, 60, 0},   // h

            {0, 70, 100, 80, 0},   // h

            {200, 0, 200, 110, 0},   // v

            {100, 50, 200, 60, 0},   // h

            {100, 60, 200, 70, 0},   // h


    };


    float lpr = 0;

    float web1s = 0.2f;

    int webp = 0;

    float webpx = 0;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        if (canvas_v == 1) {

            canvas_v = 0;
        }


        canvas.drawColor(Color.argb(0, 255, 255, 255));
/*
        rectbg.set(0, 0, getWidth(), getHeight());

        paintbg.setColor(Color.argb(255, 37, 37, 55));


        canvas.drawRect(rectbg, paintbg);

        */


        if (moveYStart == 1) {

                    /*
                    Vector2 vector2 = Vector2Pool.obtain(0, 5);

                    spiderBody.setLinearVelocity(vector2);
                    Vector2Pool.recycle(vector2);*/


            //  animatedSprite.setCurrentTileIndex(2 + (level*4));


            if (spiderCurrentY < (spiderY + (moveToY * 0.3f))) {
                pY = (((spiderCurrentY - spiderY) + 1) / 40) * (float) (1.904 * dp);
            } else if (spiderCurrentY > (spiderY + (moveToY * 0.9f))) {
                pY = ((moveToY - (spiderCurrentY - spiderY)) / 40) * (float) (1.904 * dp);
            } else {
                //  pY = 5;

                pY = (float) (1.142 * dp);
            }

            if (pY < (float) (0.076 * dp)) {
                pY = (float) (0.076 * dp);
            }

            if (pY > (float) (1.142 * dp)) {
                pY = (float) (1.142 * dp);
            }
            //  if( pY < 0 ) { pY = 0; }


            if (spiderCurrentY >= (spiderY + moveToY)) {

                pY = 0;

                update_game = 0;

                y11 = 1;
                isIdle = 1;
                //  animatedSprite.setCurrentTileIndex(0 + (level*4) );

                moveYStart = 0;


                Log.d("Tag", " moveYStart Run");

                // a1 = 1;

                if (a1 == 1 && game_start == 1) {

                    update_game = 1;
                    br_1 = 1;  /////////// <<<<<<<<<<

                }


                MainActivity.getInstance().canvasState(0);
            }


            //  moveYStart = 2;
        }


        // Brick move

        if (moveX == 1) {


           

            int sq_e = (int)(Math.sqrt(y_3c) / 0.01f);

            for( int sq = 0; sq<sq_e; sq++ ) {
                qs1 += (float) Math.pow(sq*0.01f, 2);
            }

      

            if (spiderCurrentX < (spiderX + px_q1)) {


                //  if( spiderCurrentX < (spiderX + (moveToX * 0.1f) ) ) {

                //  pX = ( ( (spiderCurrentX - spiderX) + 1) / 40 ) * (float)(3.809*dp);

                /*
                   if (y_2c * 100 < (y_3c) * 100) {
                        y_1c += 0.01f;
                    }

                    y_2c = (float) Math.pow(y_1c, 2);

                    if (y_2c * 100 > (y_3c) * 100) {
                        y_2c = y_3c;
                    }


                 */



                /*

                y  x^2

                y'  2x


                2x =   6.04

                x =  6.04 / 2   =  3.02


                */
                if (px_1c * 100 < 3.02f * 100) {

                    px_1c += 0.01f;
                }


                pX = 2 * px_1c;


                //   pX = 2 * 3.02f;


             /*   if( (Math.pow(px_1c, 2)* 0.4f) < px_3c ) {



                    px_2c = (float) (Math.pow(px_1c, 2)* 0.4f);

                    pX = px_2c;
                }*/


                //  pX = ( ( (spiderCurrentX - spiderX) + 1) / 60 ) * (float)(3.809*dp);

                //   pX =  (float) Math.pow ( ((spiderCurrentX - spiderX) + 1), 2)  * (float)(3.809*dp);

            } else if (spiderCurrentX > (spiderX + (moveToX - px_q1))) {


                px_1c -= 0.01f;

                // px_2c = (float) (Math.pow(px_1c, 2)* 0.4f);

                //  pX = px_2c;


                if (px_1c * 100 < 0) {

                    px_1c = 0;
                }

                pX = 2 * px_1c;


                //   pX = ( ( moveToX - (spiderCurrentX - spiderX) ) / 120 ) * (float)(3.809*dp);


            } else {

                //  pX = 2 * 3.02f;

                //   pX = ((float)3.04*dp);

                // pX = px_2c;
            }

            ///    100  -  50  - 10  = 40  , 60

            // if( pX < (0.076*dp) ) { pX = (float)(0.076*dp); }


            //  if( pX > ((float)3.04*dp) ) { pX = ((float)3.04*dp); }

            if (pX < 0) {
                pX = 0;
            }


            pXb += pX;


            if (spiderCurrentX >= (spiderX + moveToX)) {

                pX = 0;  // velocity


                //  update_game = 0;


                // animatedSprite.setCurrentTileIndex(0 + (level*4));

                // isIdle = 1;
                isIdle = 0;

                moveToY = 0;


                spider_c = 1;


                if (t1 == 1) {
                    update_game = 1;
                }


                spider5_r = 1;


                if (a1 == 1 && GAME_STATE != 5) {


                    // moveToX = (int)(45.71f * dp);  // 120

                    moveToX = (int) (137.28f * dp * sc1);

                    spiderX = spiderCurrentX;

                    //   Log.d("TAG",  "br_1  moveToX: " + moveToX + "  spiderX: " + spiderX );
                    isIdle = 0;


                    update_game = 1;
                    br_1 = 1;  /////////// <<<<<<<<<<

                }


                // guideTiled1Screen.setAlpha(0.4f);

                //   moveToY = 50;

                moveX = 0;
            } else {

                pY = 0;

                isIdle = 0;
            }


            //
        }


        if (isIdle == 1) {


            //  animatedSprite.setCurrentTileIndex(2 + (level*4) );

                        /*
                        Vector2 vector2 = Vector2Pool.obtain(0, 1);

                        spiderBody.setLinearVelocity(vector2);
                        Vector2Pool.recycle(vector2);
                        */


            cY = spiderCurrentY - spiderY;


            if (cY < 0) {
                cY *= -1;
            }


            if (moveToY < 0) {

                if (cY < 20) {
                    pY = (((spiderCurrentY - spiderY) - 1) / 40) * (float) (0.761 * dp);

                    if (pY < (float) (-1.904 * dp)) {
                        pY = (float) (-1.904 * dp);
                    }
                }

                if (cY > (50)) {
                    pY = ((moveToY - (spiderCurrentY - spiderY)) / 40) * (float) (0.761 * dp);

                    if (pY > (float) (-0.076 * dp)) {
                        pY = (float) (-0.076 * dp);
                    }
                } else {
                    pY = -(float) (0.761 * dp);
                }

            } else if (moveToY >= 0) {

                if (cY < 20) {
                    pY = (((spiderCurrentY - spiderY) + 1) / 40) * (float) (0.761 * dp);

                    if (pY > (float) (1.904 * dp)) {
                        pY = (float) (1.904 * dp);
                    }
                }

                if (cY > (50)) {
                    pY = ((moveToY - (spiderCurrentY - spiderY)) / 40) * (float) (0.761 * dp);

                    if (pY < (float) (0.076 * dp)) {
                        pY = (float) (0.076 * dp);
                    }
                } else {
                    pY = (float) (0.761 * dp);
                }

            }


            cMoveToY = moveToY > 0 ? moveToY : (moveToY * -1);

            if (cY >= cMoveToY) {

                pY = 0;


                if (isMove == 1) {
                    //  guideTiled2Screen.setAlpha(0.4f);
                }
                update_game = 0;


                if (t1 == 1) {
                    update_game = 1;
                }
                //   animatedSprite.setCurrentTileIndex(0 + (level*4));

                if (a1 == 1 && GAME_STATE != 5) {

                    //  Log.d("TAG",  "br_1 moveY  Completed " );

                    update_game = 1;
                    br_1 = 1;  /////////// <<<<<<<<<<

                }


                isIdle = 0;


                if (re == 1) {

                    game_re = 0;

                    if (spider_c == 0 && move_s == 2) {
                        isIdle = 1;

                        update_game = 1;

                        spider_c = 1;

                        ///  moveToY = preSpiderY - spiderCurrentY;

                        //    moveToY = 0;

                    } else if (spider_c == 2) {
                        isIdle = 0;

                        move_s = 0;
                        spider_c = 1;
                    }

                }


            }

            //   isIdle = 2;

        }


        if (moveBack >= 1) {

                    /*Vector2 vector2 = Vector2Pool.obtain(-4, 0);

                    spiderBody.setLinearVelocity(vector2);
                    Vector2Pool.recycle(vector2);*/



                   /* if( animatedSprite.getX() < (spiderX + (moveToX * 0.3f) ) ) {
                        pX = ( ( (animatedSprite.getX() - spiderX) + 1) / 40 ) * 5;
                    }*/

            isIdle = 0;


            moveToX = 0;


            if (spiderCurrentX < (spiderX + (20))) {
                pX = -((((spiderCurrentX - spiderX)) / 40) * (float) (2.66 * dp));
            } else {
                pX = (float) (-1.904 * dp);
            }

            if (pX > -(float) (0.076 * dp)) {
                pX = -(float) (0.076 * dp);
            }


            pXb += pX;


            if (spiderCurrentX <= (spiderX)) {

                pX = 0;

                // animatedSprite.setCurrentTileIndex(3 + (level*4));

                moveBack = 0;

                if (re == 0) {
                    game_over = 1;

                    MainActivity.getInstance().canvasState(3);
                    GAME_STATE = 2;


                } else {

                    spider_c = 1;

                    game_re = 0;
                }


                spider5_r = 1;

                update_game = 0;


                // retry,  reset spiderX, spiderCurrentX at start, checkpoint


                isIdle = 0;

               /* if (moveBack == 2) {
                    isIdle = 1;
                }*/

            }


            //  moveBack = 2;
        }


        if (run_evolve == 10) {

            update_game = 1;

            p_run++;

            if (p_run > 20) {

                spider_r += 1;

                if (spider_t == 1) {
                    evolve_c = spider_r % 2 == 0 ? 1 : 2;
                } else if (spider_t == 2) {
                    evolve_c = spider_r % 2 == 0 ? 1 : 3;
                }

                // 1   2   1   2   1 , 1   3   1   3,  2   3   2   3,

                if (spider_r == spider_e) {
                    run_evolve = 0;

                    evolve_c = 1;
                    update_game = 0;

                    if (a1 == 1) {

                        update_game = 1;
                        br_1 = 1;  /////////// <<<<<<<<<<

                    }


                }

                p_run = 0;
            }


        }


        if (run_evolve == 1) {

            update_game = 1;

            p_run++;

            if (p_run > 20) {

                evolve_c += 1;

                if (evolve_c > 4) {
                    evolve_c = 1;
                    //e = e + 1 > drawables.length-1 ? drawables.length-1 : e + 1;

                    evolve_d += 1;

                    if (evolve_d > 10) {


                        // 4
                        e = e + 1 > drawables.length - 1 ? drawables.length - 1 : e + 1;

                        run_evolve = 2;

                        evolve_c = 1;

                        evolve_d = 0;
                    }

                }

                p_run = 0;
            }

        } else if (run_evolve == 2) {

            update_game = 0;

            MainActivity.getInstance().evolveR();

            if (GAME_C == 0) {

                GAME_STATE = 1;

                if (a1 == 1) {

                    update_game = 1;
                    br_1 = 1;  /////////// <<<<<<<<<<

                }


            }

            run_evolve = 0;
        }


        //  buildBrickL(canvas);


        // Camera

        if (cameraH == 0 && (spiderCurrentX + pX > (float) getWidth() / 2)) {

            cameraH = 1;

            position = 1;
        }


        if (cameraH == 2) {
            //   rx11 = ((float)getWidth()/2 );

            cx11 = ((float) getWidth() / 2);

            startX = checkpointStartXc;

            spiderX = startX;
            spiderCurrentX = spiderX;

            cameraH = 3;
        }


        canvas.drawLine(((rx11) + (movetoXb - pXb)), yb, (rx11), spiderCurrentY, paintL);


        canvas.drawLine((rx11 - (pXb)), yb1, (rx11 - (pXb)), preSpiderY, paintL);


        // canvas.drawLine(( (cameraH == 1 || cameraH == 3 ? rx11 : spiderX )  + ( cameraH == 1 || cameraH == 3 ? (movetoXb - pXb ) : moveToX )), yb, rx11, spiderCurrentY, paintL);


        //    canvas.drawLine(  (cameraH == 1 || cameraH == 3 ? rx11-( pXb ) :  preSpiderX) , yb1, (cameraH == 1 || cameraH == 3 ? rx11-( pXb ) :  preSpiderX), preSpiderY, paintL);


        dw1 = d11r[0][0];
        dh1 = d11r[0][1];


        d = drawables[e][0];

        if (evolve_c == 1) {

            d = drawables[e][0];

            dw1 = d11r[0][0];
            dh1 = d11r[0][1];
        }


        if (moveX == 1 || evolve_c == 2) {

            d = drawables[e][1];

            dw1 = d11r[1][0];
            dh1 = d11r[1][1];
        }
        if (isIdle == 1 || moveYStart == 1 || evolve_c == 3) {

            d = drawables[e][2];

            dw1 = d11r[2][0];
            dh1 = d11r[2][1];
        }

        if (game_over == 1 || game_re == 1 || evolve_c == 4) {

            d = drawables[e][3];

            dw1 = d11r[3][0];
            dh1 = d11r[3][1];
        }

        //  int rx = (int)((spiderCurrentX-(int)((d.getMinimumWidth()/2)*dsc*dp)) + pX);
        //int ry = (int)((spiderCurrentY-(int)((d.getMinimumHeight()/2)*dsc*dp)) + pY);


        if ((y11 == 1) && (spiderCurrentY + pY) > (canvas.getHeight() - 1 * tile)) {

            pY = 0;
        }
        if ((y11 == 1) && (spiderCurrentY + pY) < (1 * tile)) {

            pY = 0;
        }


        // rx11 = (spiderCurrentX + ( cameraH == 1 ? 0 : pX ) );
        ry11 = (spiderCurrentY + pY);


        // float rx = 0;

        // int ry = (int)(spiderY*dp);
        //  d.setColorFilter(new LightingColorFilter(color_f, 0x00000000));


        if (cameraH == 1 && position == 1) {

            //  rx11 = (spiderCurrentX + ( cameraH == 1 ? 0 : pX ) );

            cx11 = (spiderCurrentX + (cameraH == 1 ? 0 : pX));

            position = 0;
        }

        if (cameraH == 0) {

            // rx11 = (spiderCurrentX + ( cameraH == 1 ? 0 : pX ) );

            cx11 = (spiderCurrentX + (cameraH == 1 ? 0 : pX));
        }


        rx11 = (spiderCurrentX + pX) - offsetX;


        spiderCurrentX = (spiderCurrentX + (pX));


        spiderCurrentY = ry11;




    /*

            (x - x1) * f  + x1

     */
















    

        /*

        sc_r0 = sc_rd - ry11;

        sc_r1 = ry11 - sc_rd1;


        if( sc_cd == 0 && ry11 > sc_2 ) {

            sc_cd = 1;
        }


        if( sc_cd == 1 ) {


            if (ry11 < sc_2 - (100 * dp)) {


                if (sc_r0 > qs3) {


                }


                if ((sc_r0 < qs3 || sc_r0 > qs3) && (offsetY < (sc_r0 / 2))) {

                    if (y_2c * 100 < (y_3c) * 100) {
                        y_1c += 0.01f;
                    }

                    y_2c = (float) Math.pow(y_1c, 2);

                    if (y_2c * 100 > (y_3c) * 100) {
                        y_2c = y_3c;
                    }

                }


                if ((sc_r0 < qs3 && offsetY > (sc_r0 / 2)) || (sc_r0 > qs3 && offsetY > (sc_r0 - qs1))) {

                    if (y_2c * 100 > 0) {
                        y_1c -= 0.01f;
                    }

                    y_2c = (float) Math.pow(y_1c, 2);

                    if (y_2c * 100 < 0) {
                        y_2c = 0;

                        sc_rd = ry11;
                    }

                }

                // offsetY -= 1;


                offsetY += y_2c;


                if (offsetY > sc_r0) {   // spider m
                    offsetY = sc_r0;
                }

                if (offsetY > sc_y2) {    // window m
                    offsetY = sc_y2;
                }



            }


            if (ry11 > sc_2 + (100 * dp)) {


                if ((sc_r1 < qs3 || sc_r1 > qs3) && (offsetY > -(sc_r1 / 2))) {

                    if (y_2c * 100 < (y_3c) * 100) {
                        y_1c += 0.01f;
                    }

                    y_2c = (float) Math.pow(y_1c, 2);

                    if (y_2c * 100 > (y_3c) * 100) {
                        y_2c = y_3c;
                    }

                }


                if ((sc_r1 < qs3 && offsetY < -(sc_r1 / 2)) || (sc_r1 > qs3 && offsetY < -(sc_r1 - qs1))) {

                    if (y_2c * 100 > 0) {
                        y_1c -= 0.01f;
                    }

                    y_2c = (float) Math.pow(y_1c, 2);

                    if (y_2c * 100 < 0) {
                        y_2c = 0;

                        sc_rd1 = ry11;
                    }

                }

                // offsetY -= 1;


                offsetY -= y_2c;


                if (offsetY < -sc_r1) {   // spider m
                    offsetY = -sc_r1;
                }

                if (offsetY < -sc_y2) {    // window m
                    offsetY = -sc_y2;
                }




            }



       /// if ( -5 < -2 ) { y_3c = 1.06f;}


            Log.d("TAG", " offsetY: " + offsetY  + " sc_y2: " + sc_y2 +
                    "  sc_y: " + sc_y + " sc_r0: " + sc_r0 + "  sc_r1: " + sc_r1);


        }

        */


        ///   spiderCurrentX    delay camera   0    120

        /*
              pXb += pX;

            if( spiderCurrentX >= (spiderX + moveToX ) ) {

                0.8    1.2      1


                pX = 0;  // velocity


                100   120

                0.1   0.2   0.5      1.0

                10 -  p  += c   =    + f

         */


        if (c_a1 == 1 && (cameraH == 1 || cameraH == 3)) {

            if ((offsetXC + x_1) < (offsetXC + moveToX)) {

                if ((offsetXC + x_1) < (offsetXC + (moveToX / 2))) {


                    if (x_2c * 100 < (x_3c) * 100) {
                        x_1c += 0.01f;
                    }

                    x_2c = (float) Math.pow(x_1c, 2);

                    if (x_2c * 100 > (x_3c) * 100) {
                        x_2c = x_3c;
                    }


                } else if ((offsetXC + x_1) > (offsetXC + (moveToX - qs1))) {

                    if (x_2c * 100 > 0) {
                        x_1c -= 0.01f;
                    }


                    x_2c = (float) Math.pow(x_1c, 2);

                    if (x_2c * 100 < 0) {
                        x_2c = 0;
                    }


                } else {

                    x_2c = x_3c;
                }


                x_1 += x_2c;

                offsetX += x_2c;
            }

            if ((offsetXC + x_1) >= (offsetXC + moveToX)) {


                //  offsetX = ((spiderCurrentX) - cx11);

                offsetXC = ((spiderCurrentX) - cx11);

                x_1 = 0;

                c_a1 = 0;

                update_game = 0;
            }


        }


        // offsetX = ((spiderCurrentX) - cx11);


        // offsetX = (spiderCurrentX) - rx11;


        buildMountains(canvas);

        //   d.setColorFilter(lightingColorFilter);


        // d.setBounds((int)rx11-(int)((d.getMinimumWidth()/2)*dsc1*dp), (int)ry11-(int)((d.getMinimumHeight()/2)*dsc1*dp), (int)rx11+(int)((d.getMinimumWidth()/2)*dsc1*dp), (int)ry11+(int)((d.getMinimumHeight()/2)*dsc1*dp));


        //   int d_ratio = (d.getMinimumHeight() / d.getMinimumWidth());


        drect5.set(((int) rx11 - (int) ((dw1 / 2) * dsc1 * dp)), (int) ry11 - (int) ((dh1 / 2) * dsc1 * dp),
                ((int) rx11 + (int) ((dw1 / 2) * dsc1 * dp)), (int) ry11 + (int) ((dh1 / 2) * dsc1 * dp));

        //  d.setBounds((int)rx11-(int)((0.6f/d_ratio)*tile), (int)ry11-(int)((0.6f*d_ratio)*tile), (int)rx11+(int)((0.6f/d_ratio)*tile), (int)ry11+(int)((0.6f*d_ratio)*tile));

        canvas.drawBitmap(d, null, drect5, null);

        //  d.draw(canvas);


        pWidth = (int) (dw1 * dsc1 * dp);

        pHeight = (int) (dh1 * dsc1 * dp);






/*
        Drawable d1 = getResources().getDrawable(R.drawable.g6706, null);

        float rx1 = 700 - offsetX;
        float ry1 = canvas.getHeight() - ((d1.getMinimumHeight()/2)*dsc*dp);

        d1.setBounds((int)rx1-(int)((d1.getMinimumWidth()/2)*dsc*dp), (int)ry1-(int)((d1.getMinimumHeight()/2)*dsc*dp), (int)rx1+(int)((d1.getMinimumWidth()/2)*dsc*dp), (int)ry1+(int)((d1.getMinimumHeight()/2)*dsc*dp));

        d1.draw(canvas);*/


        buildBrick(canvas);


        if (webp >= 1) {


            if (webp == 1) {
                lpr += (1 * web1s);

                webpx = rx11;
            }


            if (lpr >= 100) {

                lpr = 100;

                webp = 2;

                webpx -= pX;
            }

            for (int l = 0; l < lp1.length; l++) {


                if (lp1[l][0] == lp1[l][2]) {  // v

                    canvas.drawLine(webpx + (lp1[l][0]), lp1[l][1] * dp, webpx + (lp1[l][2]), ((lp1[l][3] / 100) * lpr) * dp, paintL);

                }


                if (lp1[l][0] != lp1[l][2]) {  // h


                    canvas.drawLine(webpx + (lp1[l][0]), lp1[l][1] * dp,
                            webpx + ((lp1[l][0] + (((lp1[l][2] - lp1[l][0]) / 100) * lpr))), (lp1[l][1] + (((lp1[l][3] - lp1[l][1]) / 100) * lpr)) * dp, paintL);

                }


                lp1[l][4] += 1;


            }


        }


        if (update_game == 1) {

            invalidate();
        }


    }

    float c_a1 = 0;

    float x_1 = 0;

    float x_1c = 0;   // 0.86

    float x_2c = 0f;


    float x_3c = 1.46f;   // 0.86  ,  1.06 ,  1.76


    float cx11 = 0;

    float offsetXC = 0;

    RectF drect5 = new RectF();

    public void outOfWeb() {

        // stop spider

        GAME_STATE = 10;


    }


    int GAME_C = 0;


    public void canceled() {

      
        GAME_STATE = 10;

        GAME_C = 1;
    }

    public void started() {

      

        GAME_STATE = 1;

        GAME_C = 0;
    }


    int brickb[][] = new int[][]{


            {1, 900},

            {6, 200},
            {6, 400},
            {6, 600},

            {7, 300},
            {7, 500},
            {7, 800},

            {1, 1200},

            {10, 1200},
            {11, 1300},


            /* {1, 2},


             {12, 2},

             {13, 4},

             {2, 2},


             {2, 1},
             {2, 1},

             {5, 2},

             {2, 1},

             {2, 4},


             {3, 3, 4},

             {1, 3},
             {1, 1},
             {2, 3},
             {2, 2},
             {3, 2, 4},


             {5, 2},

             {1, 3},
             {1, 1},
             {1, 1},
             {1, 1},
             {2, 3},
             {1, 3},
             {1, 1},
             {2, 3},*/

    };


    int brickbr[][] = new int[][]{

            {1, 7, 1},
            {1, 5, 0},
            {1, 2, -2},
            {1, 6, 1},
            {1, 7, 1},


            {1, 8, 1},

            {2, 8, 1},
            {2, 4, 1},  // 7

            {1, 8, -3},
            {2, 6, -2},  // 6      61


            {1, 2, 1},
            {1, 2, 1},
            {1, 2, 1},
            {1, 2, 1},


            {2, 6, -3},
            {1, 6, 1},


            {1, 6, 0},
            {2, 0, 1},

            {2, 6, 1},
            {1, 6, -1},
            {2, 7, 2},  // 6


            {2, 7, -2},
            {1, 8, 1},
            {2, 6, 1},
            {1, 6, 0},
            {2, 6, -4}, // 7

            {1, 6, 0},
            {2, 0, 1},
            {1, 6, 0},
            {2, 0, -1},
            {1, 6, 0},
            {2, 0, 0},


            {2, 7, -2},
            {1, 7, 1},

            {1, 3, 1},
            {1, 3, 1},
            {1, 3, 1},
            {1, 3, 1},

            {2, 7, -4},
            {2, 2, -1},
            {2, 2, -1},
            {2, 2, -1},


            {2, 6, 1},
            {1, 6, 0},
            {2, 7, 2},  // 8
            {2, 4, -5},
            {1, 7, 1},
            {2, 6, 1},
            {1, 8, 0},
            {2, 7, 2},  // 7
            {2, 4, 3},
            {1, 7, 1}, {1, 6, 0},
            {2, 0, 1},

            {2, 7, 1},
            {1, 7, -2},
            {2, 7, 2}, // 10
            {2, 7, -3},
            {1, 7, 1}, {1, 6, 0},
            {2, 0, 1},
            {1, 8, 0},
            {2, 7, 2},  // 7
            {2, 4, -3},
            {1, 7, 1}, {1, 6, 0},
            {2, 0, 1},

    };


    int checkbr[][] = new int[][]{

            {1, 3},

            {1, 73},

            {1, 173},

            {1, 300},

            {1, 379},


            {1, 483},

            {1, 543},


    };


    int stars[][] = new int[][]{
            {1, 3}, {3, 3}, {2, 5}, {1, 5}, {6, 7}, {3, 2}, {3, 5}, {6, 1}, {4, 2}, {5, 8}, {7, 7},

            {5, 3}, {16, 3}, {7, 5}, {8, 5}, {9, 7}, {13, 2}, {14, 5}, {8, 1}, {9, 2}, {7, 8}, {15, 7},

            {5, 4}, {16, 6}, {7, 7}, {8, 6}, {9, 7}, {13, 6}, {14, 8}, {8, 9}, {9, 6}, {7, 8}, {15, 12}
    };


    int treebr[][] = new int[][]{

            {1, 2},

            {1, 1},

            {2, 2},

            {1, 3},
            {3, 4},
            {1, 5},
            {1, 3},
            {4, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {4, 5},
            {1, 3},
            {2, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {3, 5},
            {3, 3},
            {3, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {2, 4},
            {1, 5}, {1, 3},
            {4, 4},
            {3, 5},
            {3, 3},
            {4, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {1, 3},
            {2, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {4, 5},
            {3, 3},
            {3, 4},
            {1, 5}, {1, 3}, {1, 5}, {1, 3}, {1, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {2, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {4, 5},
            {1, 3},
            {2, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {3, 5},
            {3, 3},
            {3, 4},
            {4, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {2, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {4, 5}, {1, 5}, {1, 3}, {1, 5}, {1, 3}, {1, 5}, {1, 3},
            {1, 3},
            {2, 4},
            {1, 5}, {1, 3},
            {4, 4},
            {4, 5},
            {4, 3},
            {3, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3},
            {1, 5}, {1, 3},
            {4, 4},
            {4, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3},
            {1, 5}, {1, 3},
            {3, 4},
            {3, 4},
            {1, 5}, {1, 3},
            {3, 4},
            {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3},
            {1, 5}, {1, 3},
            {3, 4}, {1, 5}, {1, 3},
            {4, 4},
            {4, 3},
            {4, 3},
            {3, 4},
            {1, 5}, {1, 5}, {1, 3},
            {4, 4},
            {4, 4},
            {4, 3},
            {3, 4},
            {1, 5}, {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3}, {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3}, {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3}, {4, 4},
            {4, 5},
            {4, 3}, {1, 5},
            {2, 4}, {1, 5}, {1, 3}, {1, 5}, {1, 3},

            {1, 5}, {2, 5}, {3, 5}, {2, 5},
            {2, 5}, {1, 5}, {3, 5}, {1, 5},
            {1, 5}, {3, 5}, {1, 5}, {2, 5},
            {1, 5}, {2, 5}, {3, 5}, {2, 5},
            {2, 5}, {1, 5}, {3, 5}, {1, 5},
            {1, 5}, {3, 5}, {1, 5}, {2, 9}, {3, 2},
    };


    int mountbr[][] = new int[][]{

            {1, 2},

            {6, 1},
            {7, 3},
            {4, 4},
            {5, 5}, {1, 3},
            {3, 4},
            {6, 3},
            {7, 4},
            {1, 5},
            {1, 5},
            {6, 4},
            {6, 5}, {1, 3},
            {1, 5}, {1, 3},

            {3, 5},
            {5, 3},
            {6, 4},

            {7, 5}, {6, 3},
            {2, 2},
            {1, 5}, {1, 3},
            {3, 4},
            {3, 4},
            {4, 5},
            {6, 3},
            {7, 4},

            {7, 4},
            {5, 5},
            {3, 3},
            {3, 4},

            {6, 4},


            {6, 3},
            {7, 4},

            {6, 5}, {1, 3},
            {2, 2},
            {1, 5}, {1, 3},
            {3, 4},
            {3, 4},
            {1, 5},
            {6, 3},
            {2, 4},

            {8, 2},
            {9, 1},
            {10, 2},


            {3, 4},

            {4, 3},
            {3, 4},

            {1, 5}, {1, 3},
            {2, 2},
            {5, 5}, {1, 3},
            {5, 4},
            {3, 4},
            {1, 5},
            {1, 3},
            {2, 4},

            {8, 2},
            {9, 1},
            {11, 2},
            {9, 1},


            {1, 1},
            {1, 3},
            {3, 2},
            {1, 1}, {1, 3},
            {3, 4},
            {3, 3},
            {6, 4},
            {6, 5},
            {6, 4},
            {7, 1}, {7, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3},
            {3, 3},
            {3, 4},
            {3, 3},
            {3, 4},
            {3, 3},
            {7, 4},
            {7, 3},
            {6, 4},
            {1, 5},
            {3, 4},
            {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3},
            {3, 3},
            {3, 4},
            {3, 3},

            {6, 4},
            {6, 5},
            {6, 4},
            {6, 5},
            {6, 4},
            {6, 5},
            {6, 4},
            {6, 5},
            {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3},
            {3, 3},
            {3, 4},
            {3, 3},

            {6, 4},
            {6, 5},
            {6, 4},
            {6, 5}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3},
            {3, 3},
            {3, 4},
            {3, 3},

            {6, 4},
            {6, 5},
            {6, 4},
            {6, 5}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3}, {1, 1}, {1, 3},
            {3, 3},
            {3, 4},
            {3, 3},

            {6, 4},
            {6, 5},

            {6, 4},
            {6, 5},
            {6, 4},
            {6, 5},

            {8, 2},
            {9, 1},

            {8, 2},
            {9, 1},

            {6, 5},
            {6, 4},
            {7, 5},
            {6, 4},
            {7, 5},
            {6, 4},

            {9, 1},
            {9, 1},

            {7, 7},
            {6, 6},
            {7, 5},
            {6, 4},

            {8, 2},
            {8, 2},

            {9, 3},

            {7, 2},
            {6, 2},
            {7, 5},
            {6, 4},

            {8, 2},


    };


    float preSpiderX = 0;
    float preSpiderY = 0;

    float yb1 = 0;

    float yb = 0;

    float tile = 100;
    float tile_b = 100;

    float bx = 0;
    float by = 3;
    float by2 = 3;
    float by3 = 3;

    float tx = 0;
    float ty = 3;

    float gx = 0;
    float gy = 3;


    float cx = 0;
    float cy = 3;

    int checkpointc = 0;

    float startX = 300;
    int r = 30;   // 14  // 20


    private void buildBrickL(Canvas canvas) {


        canvas.drawCircle(3 * tile, 5 * tile, 0.5f * tile, paint2);


        for (int f = 0; f < stars.length; f++) {


            sx = stars[f][0];
            sy = stars[f][1];

            canvas.drawCircle(sx * tile, sy * tile, 4, paint3);


        }


    }


    private void buildMountains(Canvas canvas) {


        float ra = 1.0f;


        gx = 0;
        gy = 3;

        for (int gr = 0; gr < mountbr.length; gr++) {

            // gx += mountbr[gr][1];


            gx += gr % 2 == 0 ? 2 : 3;

            if ((((gx * ra) * tile) - (offsetX * 0.7f)) > (rx11 - (r * tile)) && (((gx * ra) * tile) - (offsetX * 0.7f)) < (rx11 + (r * tile))) {


                if (mountbr[gr][0] == 1) {


                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d11w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d11h / 2) * dsc * dp)) - (int) ((d11h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d11w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d11h / 2) * dsc * dp)) + (int) ((d11h / 2) * dsc * dp));

                    canvas.drawBitmap(d11, null, rectb, null);


                }


                if (mountbr[gr][0] == 2) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d12w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d12h / 2) * dsc * dp)) - (int) ((d12h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d12w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d12h / 2) * dsc * dp)) + (int) ((d12h / 2) * dsc * dp));

                    canvas.drawBitmap(d12, null, rectb, null);
                }

                if (mountbr[gr][0] == 3) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d13w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d13h / 2) * dsc * dp)) - (int) ((d13h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d13w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d13h / 2) * dsc * dp)) + (int) ((d13h / 2) * dsc * dp));


                    canvas.drawBitmap(d13, null, rectb, null);
                }

                if (mountbr[gr][0] == 4) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d14w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d14h / 2) * dsc * dp)) - (int) ((d14h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d14w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d14h / 2) * dsc * dp)) + (int) ((d14h / 2) * dsc * dp));

                    canvas.drawBitmap(d14, null, rectb, null);

                }

                if (mountbr[gr][0] == 5) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d15w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d15h / 2) * dsc * dp)) - (int) ((d15h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d15w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d15h / 2) * dsc * dp)) + (int) ((d15h / 2) * dsc * dp));

                    canvas.drawBitmap(d15, null, rectb, null);

                }

                if (mountbr[gr][0] == 6) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d16w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d16h / 2) * dsc * dp)) - (int) ((d16h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d16w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d16h / 2) * dsc * dp)) + (int) ((d16h / 2) * dsc * dp));

                    canvas.drawBitmap(d16, null, rectb, null);

                }

                if (mountbr[gr][0] == 7) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d17w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d17h / 2) * dsc * dp)) - (int) ((d17h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d17w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d17h / 2) * dsc * dp)) + (int) ((d17h / 2) * dsc * dp));

                    canvas.drawBitmap(d17, null, rectb, null);

                }


                if (mountbr[gr][0] == 8) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d18w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d18w / 2) * dsc * dp * 1.2f), (int) (((d18h / 2) * dsc * dp * 1.2f)) + (int) ((d18h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d18, null, rectb, null);

                }
                if (mountbr[gr][0] == 9) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d19w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d19w / 2) * dsc * dp * 1.2f), (int) (((d19h / 2) * dsc * dp * 1.2f)) + (int) ((d19h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d19, null, rectb, null);

                }
                if (mountbr[gr][0] == 10) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d20w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d20w / 2) * dsc * dp * 1.2f), (int) (((d20h / 2) * dsc * dp * 1.2f)) + (int) ((d20h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d20, null, rectb, null);

                }
                if (mountbr[gr][0] == 11) {

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d21w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d21w / 2) * dsc * dp * 1.2f), (int) (((d21h / 2) * dsc * dp * 1.2f)) + (int) ((d21h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d21, null, rectb, null);

                }


            }


        }


    }


    RectF rectw = new RectF();


    int br_ = 0;

    int t_run = 0;
    float trpy = 0;

    int t1 = 0;


    int br_c = 0;

    float sc_0 = 1.4f;

    float offsetY = 0;


    private void buildBrick(Canvas canvas) {







        /* roof  1

           ground 2

           tunnel 3

           coins 4

           checkpoint 5

            tree 6

            mountain 7

            mountain 8

            guide 1 enter   10
            guide 1 exit    11
            guide 2 enter   12
            guide 2 exit    13


            state, x+10, y, th
        */


        br_c = 0;

        bx = 0;
        by = 3;
        by2 = 3;
        by3 = 3;

        yb = 0;

        Paint paintT = new Paint();
        paintT.setColor(Color.WHITE);
        paintT.setTextSize(16);


        for (int br = 0; br < brickbr.length; br++) {


            //  bx += brickbr[br][1];
            // by += brickbr[br][2];


            // bx += brickbr[br][1];
            // bx += brickbr[br][1]*sc_0;

            bx += brickbr[br][1];

            by = brickbr[br][2];




/*
            if( br_c > 10 ) {

                br_c = 0;
            }*/


            if (((bx * tile) - offsetX) > (rx11 - (r * tile)) && ((bx * tile) - offsetX) < (rx11 + (r * tile))) {


                br_ = br;


                rectf = new RectF();

                paint.reset();

                if (brickbr[br][0] == 1) {
                    // roof


                    paint.setColor(colorb);


                    rectf.set((((bx * tile) - ((tile / 2) * sc_0)) - offsetX), (((by * tile_b) / 2) - sc_y2 - (((by * tile_b) / 2))) + offsetY,
                            ((bx * tile) + ((tile / 2) * sc_0) - offsetX), (((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY);


                    //  rectf.set(((bx*tile) - offsetX), 0, ((bx*tile) - offsetX)+(tile), by*tile_b);


                    canvas.drawRoundRect(rectf, 15, 15, paint);


                    //  canvas.drawText(""+br, ((bx*tile) - offsetX), (by+1)*tile_b, paintT);


               /* float bx1 = ((bx*tile) - offsetX) + (1*tile);
                float by1 = 0 + ((by*tile)/2);


                if( ( Math.abs( (rx11+(pWidth/2) - (bx1 + (1*tile)) ) ) < ((pWidth/2) + (1*tile)) ) &&
                        (Math.abs(  ((ry11+(pHeight/2)) - (by1 + ((by*tile)/2)) ) ) < ((pHeight/2) + ((by*tile)/2) ) )
                ) {

                    // game over

                 //   moveBack = 1;

                }*/


                }


                if (brickbr[br][0] == 2) {

                    // ground
                    // by2 += brickbr[br][2];


                /*
                float by_m = 0;

                int b1s = 1;


                int brick_m[][] = new int[][] {

                        { 10, 1, 0 },
                        { 20, 1, 0 },
                        { 30, 1, 0 },
                        { 40, 1, 0 },
                        { 50, 1, 0 },
                        { 60, 1, 0 },

                };



                if(  brick_m[1][1] == 1 ) {

                 by_m += 1;

                    if( by_m < 0 ) {

                        b1s = 2;
                    }

                }

                if( b1s == 2 ) {

                    by_m -= 1;

                    if( by_m < 0 ) {

                        b1s = 1;
                    }
                }
*/


                    //    rectf.set(( ((bx*tile) - ((tile/2)*sc_0) )- offsetX), ((by*tile_b)/2) - (((by*tile_b)/2)*sc_0), ((bx*tile) + ((tile/2)*sc_0) - offsetX), ((by*tile_b)/2) + (((by*tile_b)/2)*sc_0));


                    rectf.set((((bx * tile) - ((tile / 2) * sc_0)) - offsetX), (canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY,
                            ((bx * tile) + ((tile / 2) * sc_0) - offsetX), (canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 + (((by * tile_b) / 2))) + offsetY);


                    //  rectf.set(((bx*tile) - offsetX), (canvas.getHeight()-(by*tile_b)), ((bx*tile) - offsetX)+(tile), canvas.getHeight());

                    paint.setColor(colorb);

                    canvas.drawRoundRect(rectf, 15, 15, paint);

                    //   canvas.drawText(""+br, ((bx*tile) - offsetX), (by+1)*tile_b, paintT);

                }


                if (brickbr[br][0] == 3) {

                    // tunnel
                    // by2 += brickbr[br][2];

                    rectf.set(((bx * tile) - offsetX), canvas.getHeight() - (by * tile_b), ((bx * tile) - offsetX) + (tile), canvas.getHeight());

                    paint.setColor(colorb);

                    canvas.drawRoundRect(rectf, 15, 15, paint);

                }


                if (brickbr[br][0] == 1 || brickbr[br][0] == 2) {

                    // web

                    //  int webp = brickbr[br][1];   // left top bottom right ,  distance

                    for (int b0 = 0; b0 < webr1.length; b0++) {


                        if (webr1[b0][0] == br &&


                                webr1[b0][1] == 1) {


                            if (brickbr[br][0] == 1) {
                                // roof

                                rectw.set((((bx * tile) + ((tile / 2) * sc_0)) - offsetX) + (1 * tile) - (0.3f * tile), ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) + (1 * tile) - (0.3f * tile),
                                        ((bx * tile) + ((tile / 2) * sc_0) - offsetX) + (1 * tile) + (0.3f * tile), ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) + (1 * tile) + (0.3f * tile));


                            }

                            if (brickbr[br][0] == 2) {
                                // ground     canvas.getHeight()-(by*tile_b)

                                rectw.set((((bx * tile) + ((tile / 2) * sc_0)) - offsetX) + (1 * tile) - (0.3f * tile), ((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY) - (1 * tile) - (0.3f * tile),
                                        ((bx * tile) + ((tile / 2) * sc_0) - offsetX) + (1 * tile) + (0.3f * tile), ((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY) - (1 * tile) + (0.3f * tile));


                            }




               /* if( webp == 1 ) {

                }*/


                            canvas.drawBitmap(dweb1, null, rectw, null);

               /* Paint paintw = new Paint();


                paintw.setStyle(Paint.Style.STROKE);
                paintw.setColor(Color.WHITE);
                paintw.setStrokeWidth(0.4f);

                canvas.drawRect(rectw, paintw);*/


                            //    int webr = brickbr[br][2];


                            //   webr1[br3][0] = br;

                            //   webr1[br3][1] = 1;


                            if (webr1[b0][1] == 1 &&
                                    (rx11 + (pWidth / 2) > (((bx * tile) - ((tile / 2) * sc_0)) - offsetX) + (1 * tile) - (0.3f * tile)) &&
                                    (rx11 - (pWidth / 2) < ((bx * tile) + ((tile / 2) * sc_0) - offsetX) + (1 * tile) + (0.3f * tile)) &&

                                    (
                                            ((brickbr[br][0] == 1) &&

                                                    (ry11 + (pHeight / 2) > (((((by * tile_b) / 2) - sc_y2 - (((by * tile_b) / 2))) + offsetY) + (1 * tile) - (0.3f * tile))) &&
                                                    (ry11 - (pHeight / 2) < ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) + (1 * tile) + (0.3f * tile)))


                                                    || ((brickbr[br][0] == 2) &&

                                                    (ry11 + (pHeight / 2) > (((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY) - (1 * tile) - (0.3f * tile))) &&
                                                    (ry11 - (pHeight / 2) < (((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 + (((by * tile_b) / 2))) + offsetY) - (1 * tile) + (0.3f * tile))))
                                    )

                            ) {

                                // animation
                                webr1[b0][1] = 2;


                                // add web

                                MainActivity.getInstance().canvasState(13);

                            }


                            br_c++;
                        }

                    }

                }


                //  cx = 0;

                if (brickbr[br][0] == 4) {
                    cy = 3;
                    //  if (checkbr[cr][0] == 1) {
                    // tree
                    //  cx = checkbr[br][1];
                    //   ty += treebr[tr][2];

                    int cr = brickbr[br][2];

                    rectf.set((((bx * tile) - offsetX) - (tile)), canvas.getHeight() - (cy * tile), ((bx * tile) - offsetX) + (tile), canvas.getHeight());


                    paint.setColor(Color.argb(cr == 0 ? 0 : 160, 255, 255, 255));

                    canvas.drawRoundRect(rectf, 35, 35, paint);


                    if (cr == (checkpointc) && (rx11 + (pWidth / 2) > ((bx * tile) - offsetX)) && (rx11 + (pWidth / 2) < (((bx * tile) + 3 * tile) - offsetX))) {

                        // checkpoint, ui


                        checkpointc = cr + 1;


                        //  startX = checkbr[ checkpointc > checkbr.length-1 ? checkbr.length-1 : checkpointc ][1] * tile;

                        startX = bx * tile;

                        checkpointStartXc = startX;


                        if (cr > 0) {

                            MainActivity.getInstance().canvasState(6);
                        }
                        //xp += lvls[ level > lvls.length-1 ? lvls.length-1 : level ];
                    }

                    //  }


                }


                if (brickbr[br][0] == 5) {
                    cy = 3;


                    rectf.set((((bx * tile) - offsetX) - (1f * tile)), canvas.getHeight() - (1f * tile), ((bx * tile) - offsetX) + (1f * tile), canvas.getHeight());

                    paint.setColor(Color.argb(0, 255, 255, 255));

                    canvas.drawRoundRect(rectf, 35, 35, paint);


                    int tr = brickbr[br][2];

                    //  Log.d("TAG", "tr: " + tr);

                    if (tr == 1) {
                        d41m = d41;

                        tr_1 = 1;

                    } else if (tr == 2) {
                        tr_1 = 2;
                        d41m = d42;
                    } else if (tr == 3) {
                        tr_1 = 3;
                        d41m = d43;
                    }

                    if (tr != 4 && tr != 11) {
                        d41m.setBounds((int) (((bx + 4) * tile) - (offsetX)) - (int) ((d40r[tr_1][0] / 2) * dsc * dp * 1.3f),
                                (int) (getHeight() - ((3.0f + trpy) * tile) - (int) ((d40r[tr_1][1] / 2) * dsc * dp * 1.3f)),
                                (int) (((bx + 4) * tile) - (offsetX)) + (int) ((d40r[tr_1][0] / 2) * dsc * dp * 1.3f),
                                (int) (getHeight() - ((3.0f + trpy) * tile) + (int) ((d40r[tr_1][1] / 2) * dsc * dp * 1.3f)));


                        d40.setBounds((int) (((bx + 4) * tile) - (offsetX)) - (int) ((d40r[tr_1][0] / 2) * dsc * dp * 1.3f),
                                (int) (getHeight() - (3 * tile) - (int) ((d40r[0][1] / 2) * dsc * dp * 1.3f)),
                                (int) (((bx + 4) * tile) - (offsetX)) + (int) ((d40r[tr_1][0] / 2) * dsc * dp * 1.3f),
                                (int) (getHeight()));

                        d40.draw(canvas);
                    }







                   /* if( t1 == 3 ) {
                        d41.setAlpha(255);
                        d42.setAlpha(255);
                        d43.setAlpha(255);

                    }
                    }*/


                    if (t1 == 1) {
                        update_game = 1;
                        t_run++;

                        if (t_run > 200) {

                            d41m.setAlpha(255 - (int) ((255f / 200f) * (t_run - 200)));

                            trpy = (1f / 200f) * (t_run - 200);

                            if (t_run > 395) {


                                t1 = 0;

                                d41m.setAlpha(0);

                                // completed trophy, start spider

                                GAME_STATE = 1;


                                update_game = 0;

                                // MainActivity.getInstance().evolveR();

                                //  run_evolve = 0;

                                //   MainActivity.getInstance().canvasState(8);


                                if (a1 == 1 && GAME_STATE != 5) {

                                    //  Log.d("TAG",  "br_1 moveY  Completed " );

                                    update_game = 1;
                                    br_1 = 1;  /////////// <<<<<<<<<<

                                }


                            }

                        }

                    }


                    if (tr != 4 && tr != 11) {

                        d41m.draw(canvas);
                    }


                    if (tr == ((trophies + 1)) && (rx11 + (pWidth / 2) > ((bx * tile) - offsetX)) && (rx11 + (pWidth / 2) < (((bx * tile) + 3 * tile) - offsetX))) {

                        // checkpoint, ui

                        //    checkpointc = tr + 1;

                        trophies += 1;


                        // run spider animation

                        run_evolve = 10;

                        spider_r = 0;

                        spider_t = 1;
                        spider_e = 13;


                        MainActivity.getInstance().canvasState(9);


                        // trophy collected

                        t1 = 1;
                        t_run = 0;
                        trpy = 0;


                        // stop spider, game state

                        GAME_STATE = 5;


                        //  update_game = 1;
                        //  invalidate();


                        brickbr[br][2] = 0;


                        if (trophies == 4) {
                            t1 = 2;

                            startX = bx * tile;

                            checkpointStartXc = startX;


                            MainActivity.getInstance().runTrophies();

                            brickbr[br][2] = 11;
                        }


                        if (t1 == 1) {

                            MainActivity.getInstance().canvasState(8);

                        }





                      /*  if( cr > 0 ) {

                         //   MainActivity.getInstance().canvasState(6);
                        }*/
                        //xp += lvls[ level > lvls.length-1 ? lvls.length-1 : level ];
                    }

                    //  }


                }


                ///  if( spiderCurrentX >= (spiderX + moveToX ) ) {


                //  br_1 += 1;

                // int by_1 = brickbr[br_1][2];

                // int bx_1 = brickbr[br_1][1];

                // brickbr[br_1][0]


                /// roof //  rectf.set(((bx*tile) - offsetX), 0, ((bx*tile) - offsetX)+(2*tile), by*tile_b);

                /// ground /// rectf.set(((bx*tile) - offsetX), canvas.getHeight()-(by*tile_b), ((bx*tile) - offsetX)+(2*tile), canvas.getHeight());


                if (br_1 == 1 && (((rx11 + (pWidth / 2) + (2 * tile)) > (((bx * tile) - ((tile / 2) * sc_0)) - offsetX)) && rx11 - (pWidth / 2) < ((bx * tile) + ((tile / 2) * sc_0) - offsetX)

                        && (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) && (ry11 + (pHeight / 2) > 0)))

                        || ((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < getHeight()) && (ry11 + (pHeight / 2)) > ((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY)))))

                ) {


                    //   moveX

                    //   moveY -> moveX

                    //    1         2


                    br_1 = 0;

                    //  Log.d("TAG",  "br_1 moveY   br_1: " + br_1 );


                    float moveY = 0;


                    if (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) && (ry11 + (pHeight / 2) > 0)))) {

                        // roof     moveY = ((by*tile_b) - ry11) + (1.4f*tile);

                        moveY = (((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) - ry11) + (1.4f * tile);

                    }

                    if (((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < getHeight()) && (ry11 + (pHeight / 2)) > ((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY)))) {

                        // ground    moveY = ((getHeight()-(by*tile_b))  - ry11) - (1.4f*tile);

                        moveY = (((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY) - ry11) - (1.4f * tile);

                    }


                    if ((moveY > 10 || moveY < -10) && run_evolve != 1) {

                        //  guideTiled2Screen.setAlpha(1f);

                        isMove = 1;

                        moveToY = moveY;


                        isIdle = 1;

                        update_game = 1;
                        invalidate();
                    }


                    // } else if( br_1 == 1  &&  (( (bx*tile) - offsetX ) - (4*tile)) > (rx11+(pWidth/2) ) ) {


                } else if (br_1 == 1 && (((((bx * tile) - ((tile / 2) * sc_0)) - offsetX)) - (4 * tile)) > (rx11 + (pWidth / 2))) {

                    br_1 = 0;

                    // update_game = 0;


                    // score, web, xp,
                    MainActivity.getInstance().canvasState(2);

                    moveX = 1;

                    /// moveToX = (int)(45.71f * dp);  // 120

                    moveToX = (int) (137.28f * dp * sc1);


                    c_a1 = 1;

                    movetoXb = moveToX;

                    pXb = 0;

                    yb1 = yb;

                    preSpiderY = spiderCurrentY;

                    preSpiderX = spiderCurrentX;

                    spiderX = spiderCurrentX;

                    spiderY = spiderCurrentY;

                    update_game = 1;
                    invalidate();
                    // GAME_STATE = 2;


                }















                /* roof
                    rectf.set(( ((bx*tile) - ((tile/2)*sc_0) )- offsetX), ((((by*tile_b)/2) - (((by*tile_b)/2)*sc_0)) + offsetY),
                        ((bx*tile) + ((tile/2)*sc_0) - offsetX), (((by*tile_b)/2) + (((by*tile_b)/2)*sc_0)) + offsetY);

                ground
                 rectf.set((((bx*tile) - ((tile/2)*sc_0)) - offsetX), (canvas.getHeight()- ((by*tile_b)/2) - (((by*tile_b)/2)*sc_0)  ) + offsetY,
                        ((bx*tile) + ((tile/2)*sc_0) - offsetX),(canvas.getHeight() - ((by*tile_b)/2) + (((by*tile_b)/2)*sc_0)  ) + offsetY);

                 */


                if (spider_c == 1 && ((rx11 + (pWidth / 2) > ((((bx * tile) - ((tile / 2) * sc_0)) - offsetX))) && rx11 - (pWidth / 2) < ((bx * tile) + ((tile / 2) * sc_0) - offsetX)

                        && (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) && (ry11 + (pHeight / 2) > ((((by * tile_b) / 2) - sc_y2 - (((by * tile_b) / 2))) + offsetY))))

                        || ((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < (canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 + (((by * tile_b) / 2))) + offsetY) && (ry11 + (pHeight / 2)) > ((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY))))
                )) {


                    update_game = 1;


                    if (re == 1) {

                        MainActivity.getInstance().canvasState(12);

                        game_re = 1;

                        if (move_s == 1) {
                            moveX = 0;
                            movetoXb = 0;
                            moveBack = 2;


                            movetoXb = -(10 * dp);

                            spiderX = spiderX - (10 * dp);
                        }
                        if (move_s == 2) {

                            isIdle = 1;

                            moveBack = 0;

                            spiderY = spiderCurrentY;

                            if (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((((by * tile_b) / 2) - sc_y2 + (((by * tile_b) / 2) * sc_0)) + offsetY) && (ry11 + (pHeight / 2) > ((((by * tile_b) / 2) - sc_y2 - (((by * tile_b) / 2))) + offsetY))))) {

                                // roof

                                moveToY = 30 * dp;

                            }

                            if (((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < (canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 + (((by * tile_b) / 2))) + offsetY) && (ry11 + (pHeight / 2)) > ((canvas.getHeight() - ((by * tile_b) / 2) + sc_y2 - (((by * tile_b) / 2) * sc_0)) + offsetY)))) {

                                // ground

                                moveToY = -30 * dp;

                            }


                            move_s = 2;

                            update_game = 1;


                        }

                    } else {
                        moveX = 0;
                        movetoXb = 0;
                        moveBack = 1;

                    }

                    spider_c = 0;


                    brick_c = br;


                    MainActivity.getInstance().canvasState(11);

                }


                if (((cameraH == 1 || cameraH == 3 ? rx11 : spiderX) + (cameraH == 1 || cameraH == 3 ? (movetoXb - pXb) : moveToX)) > ((bx * tile) - offsetX) &&
                        ((cameraH == 1 || cameraH == 3 ? rx11 : spiderX) + (cameraH == 1 || cameraH == 3 ? (movetoXb - pXb) : moveToX)) < (((bx * tile) - offsetX)) + (tile) &&

                        ((brickbr[br][0] == 1) && ((ry11 + (pHeight))) > (0 + (by * tile_b)))) {

                    yb = (0 + (by * tile_b));

                }
                //

            }


        }


        cx = 0;
        cy = 3;
/*
        for( int cr = 0; cr<checkbr.length; cr++ ) {

            if (checkbr[cr][0] == 1) {
                // tree
                cx = checkbr[cr][1];
                //   ty += treebr[tr][2];

                rectf.set(  (( (cx*tile) - offsetX) - (1*tile)), canvas.getHeight()-(cy*tile), ((cx*tile) - offsetX)+(1*tile), canvas.getHeight());

                paint.setColor(Color.argb(160, 255, 255, 255));

                canvas.drawRoundRect(rectf, 35, 35, paint);



                if(  cr == (checkpointc) && (rx11+(pWidth/2) > ( (cx*tile) - offsetX ) ) && (rx11+(pWidth/2) < ( ((cx*tile) + 3*tile) - offsetX ) ) ) {

                    // checkpoint, ui

                    if( cr > 0 ) {

                        MainActivity.getInstance().canvasState(6);
                    }

                    checkpointc = cr + 1;

                    startX = checkbr[ checkpointc > checkbr.length-1 ? checkbr.length-1 : checkpointc ][1] * tile;

                    //xp += lvls[ level > lvls.length-1 ? lvls.length-1 : level ];
                }

            }




        }
            */


        tx = 0;
        ty = 3;

        float ra = 1.3f;

        for (int tr = 0; tr < treebr.length; tr++) {

            // tx += treebr[tr][1];

            tx += tr % 2 == 0 ? 2 : 3;

            if ((((tx * ra) * tile) - (offsetX * 1.3f)) > (rx11 - (r * tile)) && (((tx * ra) * tile) - (offsetX * 1.3f)) < (rx11 + (r * tile))) {


                if (treebr[tr][0] == 1) {
                    // tree

                    //   ty += treebr[tr][2];


                    // float rx1 = ((tx*tile) - (offsetX*0.7f));
                    // float ry1 = (cHeight - ((d1h/2)*dsc*dp));


                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d1w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d1h / 2) * dsc * dp)) - (int) ((d1h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d1w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d1h / 2) * dsc * dp)) + (int) ((d1h / 2) * dsc * dp));


                    canvas.drawBitmap(d1, null, rectt, null);
                }


                if (treebr[tr][0] == 2) {
                    // tree
                    //  tx += treebr[tr][1];
                    //  ty += treebr[tr][2];


                    //  float rx1 = ((tx*tile) - (offsetX*0.7f));
                    //   float ry1 = (cHeight - ((d2h/2)*dsc*dp));


                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d2w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d2h / 2) * dsc * dp)) - (int) ((d2h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d2w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d2h / 2) * dsc * dp)) + (int) ((d2h / 2) * dsc * dp));


                    canvas.drawBitmap(d2, null, rectt, null);
                }

                if (treebr[tr][0] == 3) {
                    // tree
                    //  tx += treebr[tr][1];
                    // ty += treebr[tr][2];


                    //  float rx1 = ((tx*tile) - (offsetX*0.5f));
                    //  float ry1 = (cHeight - ((d3h/2)*dsc*dp));


                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d3w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d3h / 2) * dsc * dp)) - (int) ((d3h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d3w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d3h / 2) * dsc * dp)) + (int) ((d3h / 2) * dsc * dp));


                    canvas.drawBitmap(d3, null, rectt, null);
                }


                if (treebr[tr][0] == 4) {


                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d4w / 2) * dsc * dp * t3), (int) ((getHeight() + (1 * dp)) - ((d4h / 2) * dsc * dp * t3)) - (int) ((d4h / 2) * dsc * dp * t3),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d4w / 2) * dsc * dp * t3), (int) ((getHeight() + (1 * dp)) - ((d4h / 2) * dsc * dp * t3)) + (int) ((d4h / 2) * dsc * dp * t3));

                    canvas.drawBitmap(d4, null, rectt, null);

                }


            }


        }




}
