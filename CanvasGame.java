package com.example.game;

// import ...

/**
author: David Anderberg
Copyright 2022
*/

public class CanvasGame extends SurfaceView {


    private static CanvasGame instance;
    private int dw1 = 0;
    private int dh1 = 0;
    private int d11r[][];

    private int d40r[][];

    private float checkpointStartXc = 300;
    private int update_game = 0;
    private int spider_r = 0;
    private int spider_t = 1;
    private int spider_e = 7;
    private int p_run = 0;
    private int evolve_d = 0;
    private int evolve_c = 1;
    private int run_evolve = 0;
    private float dsc1 = 0.50f;
    private float dsc = 0.43f;
    private float sc1 = 0.47f;
    private float spiderX = 300;
    private float spiderY = -150;
    private int moveX = 0;
    private float moveToX = 0;
    private float moveToY = 0;
    private float downY = 0;
    private float isMove = 0;
    private float pTouchAreaLocalY = 0;
    private int moveY_s = 0;
    private int y11 = 0;
    private int spider5_r = 1;
    private int GAME_STATE = -1;
    private int move_s = 0;
    private int state_r = 0;
    private int states1[][] = new int[300][3];
    private int canvasT = 0;
    private float sc = 0;
    private float sc_a1 = 1.0f;
    private float f_sc = 0.2f;
    private float sc_m = 1.1f;
    private float sc_a2 = 1.0f;
    private int sc_state = 0;
    private float sc_3 = (float) ((sc_m - 1.0) / 3);
    private int dbPurchase = 1;
    private int isPurchasedSku = 0;
    private int purchaseLevelm = 100;
    private int moveYStart = 0;
    private float pX = 0;
    private float pY = 0;
    private float spiderCurrentX = 0;
    private float spiderCurrentX2 = 0;
    private float spiderCurrentY = 0;
    private int isIdle = 0;
    private int moveXr = 0;
    private int re = 1;
    private int moveBack = 0;
    private int game_over = 0;
    private int game_re = 0;
    private int spider_c = 1;
    private int brick_c = 0;
    private int cameraH = 0;
    private float movetoXb = 0;
    private float rx11 = 0;
    private float ry11 = 0;
    private int position = 0;
    private float pXb = 0;
    private float pWidth = 0;
    private float pHeight = 0;
    private float offsetX = 0;
    private int a1 = 0;
    private int br_1 = 0;
    private int game_start = 0;


    private float lp1[][] = new float[][] {
            {100, 0, 100, 120, 0},
            {-100, 0, -100, 100, 0},
            {-100, 40, 0, 50, 0},
            {0, 50, 100, 60, 0},
            {0, 70, 100, 80, 0},
            {200, 0, 200, 110, 0},
            {100, 50, 200, 60, 0},
            {100, 60, 200, 70, 0},
    };


    private float lpr = 0;
    private float web1s = 0.2f;
    private int webp = 0;
    private float webpx = 0;
    private Paint paintb = null;
    private int GAME_C = 0;


    private int brickbr[][] = new int[][]{

            {1, 7, 1},
            {1, 5, 0},
            {1, 2, -2},
            {1, 6, 1},
            {1, 7, 1},
            {1, 8, 1},
            {2, 8, 1, 2, 1, 3, 0},
            {2, 4, 1},  // 7

            {1, 8, -3},
            {2, 6, -2},  // 6      61

            {1, 2, 1},
            {1, 2, 1, 1, 1, 3, 0},
            {1, 2, 1},
            {1, 2, 1},
            {2, 6, -3, 2, 1, 2, 0},
            {1, 6, 1},
            {1, 6, 0},
            {2, 0, 1},

            {2, 6, 1},
            {1, 6, -1},
            {2, 7, 2},  // 6
            {2, 7, -2, 2, 1, 3, 0},
            {1, 8, 1, 1, 1, 2, 0},
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

    private int stars[][] = new int[][]{
            {1, 3}, {3, 3}, {2, 5}, {1, 5}, {6, 7}, {3, 2}, {3, 5}, {6, 1}, {4, 2}, {5, 8}, {7, 7},
            {5, 3}, {16, 3}, {7, 5}, {8, 5}, {9, 7}, {13, 2}, {14, 5}, {8, 1}, {9, 2}, {7, 8}, {15, 7},
            {5, 4}, {16, 6}, {7, 7}, {8, 6}, {9, 7}, {13, 6}, {14, 8}, {8, 9}, {9, 6}, {7, 8}, {15, 12}
    };


    private int treebr[][] = new int[][]{
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
    private int mountbr[][] = new int[][]{
            {1, 2}, {6, 1}, {7, 3}, {4, 4},
            {5, 5}, {1, 3}, {12, 3}, {3, 4},
            {6, 3}, {7, 4}, {1, 5}, {1, 5},
            {6, 4}, {6, 5}, {1, 3},
            {1, 5}, {1, 3}, {3, 5},
            {5, 3}, {6, 4},
            {7, 5}, {6, 3}, {2, 2}, {9, 3},
            {7, 2}, {6, 2},
            {7, 5},{6, 4}, {8, 2},
    };



    private float preSpiderX = 0;
    private float preSpiderY = 0;
    private float yb1 = 0;
    private float yb = 0;
    private int tile = 100;
    private int tile_b = 100;
    private float bx = 0;
    private float by = 3;
    private float by2 = 3;
    private float by3 = 3;
    private float tx = 0;
    private float ty = 3;
    private float gx = 0;
    private float gy = 3;
    private float cx = 0;
    private float cy = 3;
    private int checkpointc = 0;
    private float startX = 300;
    private int r = 30;   // 14  // 20
    private int gr_r = 0;
    private float ra = 1.0f;
    private RectF rectw = new RectF();
    private int br_ = 0;
    private int t_run = 0;
    private float trpy = 0;
    private int t1 = 0;
    private int br_c = 0;
    private  float sunX = 250;
    private float sunY = 150;
    private float sunA = 0;
    private int sunState = 1;
    private float sunSpeed = 10;
    private Canvas canvas;
    private Context mContext;
    private int e = 0;
    private Bitmap drawables[][];
    private RectF rectb = null;
    private RectF rectf = null;
    private Paint paint = null;
    private int colorb = 0;
    private float cHeight = 0;
    private float cWidth = 0;
    private Bitmap d1 = null;
    private Bitmap d2 = null;
    private Bitmap d3 = null;
    private Bitmap d4 = null;
    private int d1w = 0;
    private int d1h = 0;
    private int d2w = 0;
    private int d2h = 0;
    private int d3w = 0;
    private int d3h = 0;
    private int d4w = 0;
    private int d4h = 0;
    private Bitmap d11 = null;
    private Bitmap d12 = null;
    private Bitmap d13 = null;
    private Bitmap d14 = null;
    private Bitmap d15 = null;
    private Bitmap d16 = null;
    private Bitmap d17 = null;
    private Bitmap d18 = null;
    private Bitmap d19 = null;
    private Bitmap d20 = null;
    private Bitmap d21 = null;
    private Bitmap d22 = null;
    private Bitmap d23 = null;
    private Bitmap d24 = null;
    private Bitmap dweb1 = null;
    private int d11w = 0;
    private int d11h = 0;
    private int d12w = 0;
    private int d12h = 0;
    private int d13w = 0;
    private int d13h = 0;
    private int d14w = 0;
    private int d14h = 0;
    private int d15w = 0;
    private int d15h = 0;
    private int d16w = 0;
    private int d16h = 0;
    private int d17w = 0;
    private int d17h = 0;
    private int d18w = 0;
    private int d18h = 0;
    private int d19w = 0;
    private int d19h = 0;
    private int d20w = 0;
    private int d20h = 0;
    private int d21w = 0;
    private int d21h = 0;
    private int d22w = 0;
    private int d22h = 0;
    private int d23w = 0;
    private int d23h = 0;
    private int d24w = 0;
    private int d24h = 0;
    private Drawable d40, d41, d42, d43;
    private Drawable d41m, d42m, d43m;
    private int trophies = 0;
    private int tr_1 = 0;
    private float dp = 0;
    private Rect rectbg = null;
    private Paint paintbg = null;
    private int bgcolor = 0;

    private float cY = 0;
    private float cMoveToY = 0;
    private Bitmap d = null;
    private Paint paintL = null;
    private int canvas_v = 1;
    private int color2 = 1;
    private int color3 = 1;
    private Paint paint2 = new Paint();
    private int sx = 2;
    private int sy = 2;
    private Paint paint3 = new Paint();
    private LightingColorFilter lightingColorFilter = null;
    private int spiderY_r = 1;
    private int webr1[][] = new int[300][2];
    private RectF rectt = new RectF();


    public Canvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setZOrderOnTop(true);

        getHolder().setFormat(PixelFormat.TRANSLUCENT);

        mContext = context;
        init();
    }

    public Canvas(Context context) {
        super(context);
    }

    public static Canvas getInstance() {
        return instance;
    }


    public void moveYStartRun() {
        moveYStart = 1;
    }

    public void startWeb() {
        webp = 1;
        lpr = 0;
        webpx = 0;
    }

    public void bricksb() {


        brickbr = new int[][]{

                {4, 3, 0}, {2, 2, 2},

                {2, 3, 3}, {2, 3, 2},

                {2, 4, 2, 2, 1, 3, 0},
                {1, 2, 3},
                {1, 7, 3},
                {1, 5, 4},
                {2, 5, 4, 2, 1, 2, 0},
                {2, 5, 5},
                {2, 5, 4},
                {2, 5, 2},
                {1, 2, 3, 1, 1, 3, 0},
                {1, 2, 4},
                {1, 2, 3}, // 53
                {1, 2, 4},
                {1, 2, 3},
                {1, 2, 4, 1, 1, 3, 0},
                {1, 6, 3},
                {2, 0, 4},

                {1, 6, 3}, // 71
                {2, 0, 4},
                {4, 4, 1},
                {1, 6, 6},
                {2, 0, 2, 2, 1, 4, 0},
                {1, 6, 2},
                {2, 0, 6, 2, 1, 4, 0},
                {1, 6, 4},
                {1, 3, 5},
                {1, 3, 3, 1, 1, 2, 0},
                {1, 3, 5},  // 99
                {2, 0, 3},
                {1, 6, 4}, // 105
                {1, 3, 5},
                {1, 3, 3},
                {1, 3, 1},
                {1, 6, 1, 1, 1, 4, 0},
                {1, 3, 3},
                {1, 2, 5},
                {1, 3, 7},
                {1, 3, 7, 1, 1, 3, 0},
                {1, 3, 6},
                {1, 3, 3}, // 137

                {2, 6, 5},
                {2, 3, 7},
                {2, 3, 7, 2, 1, 3, 0},
                {2, 3, 6, 2, 1, 2, 0},
                {2, 3, 3, 2, 1, 4, 0},

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
        };


    }
    
    

    public void init() {

        instance = this;

        rectt = new RectF();
        rectb = new RectF();
        setWillNotDraw(false);
        paintb = new Paint();

        bricksb();

        GAME_STATE = 1230;

        int fc = 140;

        int color_f = Color.argb(fc, 0, 0, 0);
        lightingColorFilter = new LightingColorFilter(color_f, 0x00000000);


        paintL = new Paint();
        paintL.setColor(Color.argb(255, 218, 218, 218));
        paintL.setStrokeWidth(2f);


        dp = mContext.getResources().getDisplayMetrics().density;


        float webcx = (int) (45.71f * dp);  // 120


        lp1 = new float[][] {
                {0, 0, 0, 120, 0},
                {webcx, 0, webcx, 120, 0},
                {-webcx, 0, -webcx, 100, 0},
                {-webcx, 40, 0, 50, 0},
                {0, 50, webcx, 60, 0},
                {0, 70, webcx, 80, 0},
                {webcx * 2, 0, webcx * 2, 110, 0},
                {webcx, 50, webcx * 2, 60, 0},
                {webcx, 70, webcx * 2, 80, 0},
                {webcx, 30, webcx * 2, 20, 0},
                {webcx * 3, 0, webcx * 3, 130, 0},
                {webcx * 2, 35, webcx * 3, 45, 0},
                {webcx * 2, 55, webcx * 3, 65, 0},
                {webcx * 4, 0, webcx * 4, 130, 0},
                {webcx * 3, 85, webcx * 4, 75, 0},
                {webcx * 3, 15, webcx * 4, 25, 0},
        };


        color3 = Color.argb(255, 255, 255, 255);
        paint3.setColor(color3);
        color2 = Color.argb(255, 255, 255, 255);
        paint2.setColor(color2);


        spiderX = (int) (114.28f * dp); // 300
        cHeight = getHeight();
        cHeight = getWidth();

        tile = (int) (38.09f * dp);

        rectbg = new Rect();
        paintbg = new Paint();
        bgcolor = Color.argb(255, 37, 37, 55);

        rectf = new RectF();
        paint = new Paint();

        colorb = Color.argb(255, 3, 3, 38);
        canvas_v = 1;
        y11 = 0;


        DisplayMetrics displayMetrics = new DisplayMetrics();
        MainActivity.getInstance().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        cHeight = height;
        cWidth = width;

        spiderY = -150 * dp;
        moveToY = (int) (cHeight / 2) + (120f * dp);

        if (moveToY < 100) {
            moveToY = (int) (320f * dp); // 400
        }

        if (spiderY_r == 1) {
            spiderY = (int) (130f * dp);
            moveToY = (int) (40f * dp);
        }

        tile_b = (height) / 10;
        int hq = 0;   // hq 1 ,  hq 0

        reloadResources(hq);
    }

    public void reloadResources(int hq) {


        hq = 0;

        int dr2[][] = new int[][]{
                {
                        R.drawable.g152023, R.drawable.g152043, R.drawable.g152075, R.drawable.g152059,
                        R.drawable.g152095, R.drawable.g152117, R.drawable.g152153, R.drawable.g33790,
                        R.drawable.g152267, R.drawable.g152291, R.drawable.g152331, R.drawable.g33112,
                        R.drawable.g152461, R.drawable.g152483, R.drawable.g152505, R.drawable.g33202,
                 },


        };


        int dr1[][] = new int[][]{
                {
                        R.drawable.path151929c, R.drawable.path151929c, R.drawable.path151929c,
                        R.drawable.path152531, R.drawable.path152533,
                        R.drawable.path151931, R.drawable.path151931,
                        R.drawable.g152005, R.drawable.g151967, R.drawable.g151993, R.drawable.g151927
                },


        };

        d1 = BitmapFactory.decodeResource(getResources(), dr1[hq][7]);
        d2 = BitmapFactory.decodeResource(getResources(), dr1[hq][8]);
        d3 = BitmapFactory.decodeResource(getResources(), dr1[hq][9]);
        d4 = BitmapFactory.decodeResource(getResources(), dr1[hq][10]);

        // trees

        d1w = 126;
        d1h = 200;
        d2w = 98;
        d2h = 155;
        d3w = 128;
        d3h = 205;

        d4w = (int) (522 * 0.7);
        d4h = (int) (1583 * 0.7);



        d11 = BitmapFactory.decodeResource(getResources(), dr1[hq][0]);
        d12 = BitmapFactory.decodeResource(getResources(), dr1[hq][1]);
        d13 = BitmapFactory.decodeResource(getResources(), dr1[hq][2]);
        d14 = BitmapFactory.decodeResource(getResources(), dr1[hq][3]);
        d15 = BitmapFactory.decodeResource(getResources(), dr1[hq][4]);
        d16 = BitmapFactory.decodeResource(getResources(), dr1[hq][5]);
        d17 = BitmapFactory.decodeResource(getResources(), dr1[hq][6]);

        d18 = BitmapFactory.decodeResource(getResources(), R.drawable.rect9494);
        d19 = BitmapFactory.decodeResource(getResources(), R.drawable.rect94942);
        d20 = BitmapFactory.decodeResource(getResources(), R.drawable.g9523);
        d21 = BitmapFactory.decodeResource(getResources(), R.drawable.g9629);
        d22 = BitmapFactory.decodeResource(getResources(), R.drawable.g16612);
        d23 = BitmapFactory.decodeResource(getResources(), R.drawable.g16664);
        d24 = BitmapFactory.decodeResource(getResources(), R.drawable.g16705);

        d40 = getResources().getDrawable(R.drawable.rect9003, null);
        d41 = getResources().getDrawable(R.drawable.g8757, null);
        d42 = getResources().getDrawable(R.drawable.g8767, null);
        d43 = getResources().getDrawable(R.drawable.g8777, null);

        d40r = new int[][] {
                {59, 123},
                {80, 101},
                {80, 91},
                {91, 80},
        };

        dweb1 = BitmapFactory.decodeResource(getResources(), R.drawable.g13522);
        Bitmap d11 = BitmapFactory.decodeResource(getResources(), dr2[hq][0]);  // 75 , 98
        Bitmap d12 = BitmapFactory.decodeResource(getResources(), dr2[hq][1]);   //  71,  96
        Bitmap d13 = BitmapFactory.decodeResource(getResources(), dr2[hq][2]);
        Bitmap d14 = BitmapFactory.decodeResource(getResources(), dr2[hq][3]);

        d11r = new int[][]{
                {74, 99},
                {72, 98},
                {72, 92},
                {74, 86},
        };

        Bitmap d21 = BitmapFactory.decodeResource(getResources(), dr2[hq][4]);
        Bitmap d22 = BitmapFactory.decodeResource(getResources(), dr2[hq][5]);
        Bitmap d23 = BitmapFactory.decodeResource(getResources(), dr2[hq][6]);
        Bitmap d24 = BitmapFactory.decodeResource(getResources(), dr2[hq][7]);

        Bitmap d31 = BitmapFactory.decodeResource(getResources(), dr2[hq][8]);
        Bitmap d32 = BitmapFactory.decodeResource(getResources(), dr2[hq][9]);
        Bitmap d33 = BitmapFactory.decodeResource(getResources(), dr2[hq][10]);
        Bitmap d34 = BitmapFactory.decodeResource(getResources(), dr2[hq][11]);

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


    public void evolveSpider(int e) {

        // ## TWO DIMENSIONAL ARRAY, with set variable webcx, for animation frame solution

        if (e == 3) {
            float webcx = (int) (45.71f * dp);  // 120
            lp1 = new float[][]{
                    {0, 0, 0, 120, 0},
                    {webcx, 0, webcx, 120, 0},
                    {-webcx, 0, -webcx, 100, 0},
                    {-webcx, 40, 0, 50, 0},
                    {0, 50, webcx, 60, 0},
                    {0, 70, webcx, 80, 0},
                    {webcx * 2, 0, webcx * 2, 110, 0},
                    {webcx, 50, webcx * 2, 60, 0},
                    {webcx, 70, webcx * 2, 80, 0},
                    {webcx, 30, webcx * 2, 20, 0},
                    {webcx * 3, 0, webcx * 3, 130, 0},
                    {webcx * 2, 35, webcx * 3, 45, 0},
                    {webcx * 2, 55, webcx * 3, 65, 0},
                    {webcx * 4, 0, webcx * 4, 130, 0},
                    {webcx * 3, 85, webcx * 4, 75, 0},
                    {webcx * 3, 15, webcx * 4, 25, 0},
                    {webcx * 5, 0, webcx * 5, 160, 0},
                    {webcx * 4, 35, webcx * 5, 45, 0},
                    {webcx * 4, 55, webcx * 5, 65, 0},
                    {webcx * 6, 0, webcx * 6, 150, 0},
                    {webcx * 5, 105, webcx * 6, 95, 0},
                    {webcx * 5, 75, webcx * 6, 85, 0},
            };
        }

        startWeb();

        run_evolve = 1;
        GAME_STATE = 5;
        update_game = 1;
        invalidate();

    }





    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (canvas_v == 1) {
            canvas_v = 0;
        }

        canvas.drawColor(Color.argb(0, 255, 255, 255));

        // ## VECTOR MOVE, y-axis start

        if (moveYStart == 1) {

            if (spiderCurrentY < (spiderY + (moveToY * 0.3f))) {
                pY = (((spiderCurrentY - spiderY) + 1) / 40) * (float) (1.904 * dp);
            } else if (spiderCurrentY > (spiderY + (moveToY * 0.9f))) {
                pY = ((moveToY - (spiderCurrentY - spiderY)) / 40) * (float) (1.904 * dp);
            } else {
                pY = (float) (1.142 * dp);
            }
            if (pY < (float) (0.076 * dp)) {
                pY = (float) (0.076 * dp);
            }
            if (pY > (float) (1.142 * dp)) {
                pY = (float) (1.142 * dp);
            }

            if (spiderCurrentY >= (spiderY + moveToY)) {
                pY = 0;
                update_game = 0;
                y11 = 1;
                isIdle = 1;
                moveYStart = 0;

                if (a1 == 1 && game_start == 1) {
                    update_game = 1;
                    br_1 = 1;
                }
                MainActivity.getInstance().canvasState(0);
            }

        }


        // ## VECTOR MOVE, x-axis

        if (moveX == 1) {

            if (spiderCurrentX < (spiderX + (moveToX * 0.1f))) {
                pX = (((spiderCurrentX - spiderX) + 1) / 40) * (float) (3.809 * dp);
            } else if (spiderCurrentX > (spiderX + (moveToX * 0.8f))) {
                pX = ((moveToX - (spiderCurrentX - spiderX)) / 40) * (float) (3.809 * dp);
            } else {
                pX = ((float) 3.04 * dp);
            }

            if (pX < (0.076 * dp)) {
                pX = (float) (0.076 * dp);
            }
            if (pX > ((float) 3.04 * dp)) {
                pX = ((float) 3.04 * dp);
            }
            if (pX < 0) {
                pX = 0;
            }

            pXb += pX;

            if (spiderCurrentX >= (spiderX + moveToX)) {

                pX = 0;
                isIdle = 1;
                moveToY = 0;
                spider_c = 1;

                if (t1 == 1) {
                    update_game = 1;
                }
                spider5_r = 1;

                if (a1 == 1 && GAME_STATE != 5) {
                    moveToX = (int) (137.28f * dp * sc1);
                    spiderX = spiderCurrentX;

                    isIdle = 0;
                    update_game = 1;
                    br_1 = 1;

                }

                moveX = 0;
            } else {

                pY = 0;

                isIdle = 0;
            }
        }






        //## LINEAR INTERPOLATION SOLUTION, scale in 3 steps

        if (canvasT == 1) {

            if (sc_state == 1) {

                // scale in step 3
                if (sc_a1 < sc_a2) {
                    sc_a1 += 0.4 * 0.001;
                    sc = (float) ((sc_a2 - sc_a1) * f_sc + sc_a1);
                    canvas.scale(sc, sc, getWidth(), getHeight());
                } else {
                    sc_state = 2;
                    canvas.scale(sc, sc, getWidth(), getHeight());
                }

            } else if (sc_state == 2) {

                // scale out
                if (sc_a1 > 1.0) {
                    sc_a1 -= 0.2 * 0.001;
                    sc = (float) ((sc_a1 - 1.0) * f_sc + sc_a1);
                    canvas.scale(sc, sc, getWidth(), getHeight());
                } else {
                    canvas.scale(sc, sc, getWidth(), getHeight());
                    sc_state = 3;

                    canvasT = 0;
                    // stop update
                    update_game = 0;

                }
            }
        }






        //## VECTOR MOVE, idle state, y-axis, variable pY for velocity

        if (isIdle == 1) {

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

                }
                update_game = 0;

                if (canvasT == 1) {
                    update_game = 1;
                }

                if (t1 == 1) {
                    update_game = 1;
                }
                if (a1 == 1 && GAME_STATE != 5) {
                    update_game = 1;
                    br_1 = 1;
                }

                isIdle = 0;

                if (re == 1) {

                    game_re = 0;
                    if (spider_c == 0 && move_s == 2) {
                        isIdle = 1;
                        update_game = 1;
                        spider_c = 1;

                    } else if (spider_c == 2) {
                        isIdle = 0;
                        move_s = 0;
                        spider_c = 1;
                    }
                }
            }

        }


        if (moveXr == 1) {

            if (spiderCurrentX > (spiderX + (moveToX * 0.1f))) {
                pX = -((((spiderCurrentX - spiderX) + 1) / 40) * (float) (3.809 * dp));
            } else if (spiderCurrentX < (spiderX + (moveToX * 0.9f))) {
                pX = -(((moveToX - (spiderCurrentX - spiderX)) / 40) * (float) (3.809 * dp));
            } else {
                pX = -(float) (3.04 * dp);
            }

            pXb += pX;

            if (spiderCurrentX <= (spiderX + moveToX)) {

                pX = 0;
                moveXr = 0;
                isIdle = 1;
                update_game = 0;
            } else {

                pY = 0;
                update_game = 1;
            }
        }


        if (moveBack >= 1) {

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
                isIdle = 0;

            }
        }






        // ## STEP PROGRESS SOLUTION

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
                        br_1 = 1;

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
                    br_1 = 1;
                }
            }

            run_evolve = 0;
        }




        // ## CAMERA STATE X-AXIS SOLUTION

        if (cameraH == 0 && (spiderCurrentX + pX > (float) getWidth() / 2)) {

            cameraH = 1;
            position = 1;
        }

        if (cameraH == 2) {
            rx11 = ((float) getWidth() / 2);

            startX = checkpointStartXc;

            spiderX = startX;
            spiderCurrentX = spiderX;

            cameraH = 3;
        }


        // ## SET DYNAMIC DELTA VALUES, selection for camera states, yb variable is from pre collision detection

        canvas.drawLine(((cameraH == 1 || cameraH == 3 ? rx11 : spiderX) + (cameraH == 1 || cameraH == 3 ? (movetoXb - pXb) : moveToX)), yb, rx11, spiderCurrentY, paintL);

        canvas.drawLine((cameraH == 1 || cameraH == 3 ? rx11 - (pXb) : preSpiderX), yb1, (cameraH == 1 || cameraH == 3 ? rx11 - (pXb) : preSpiderX), preSpiderY, paintL);




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

        if ((y11 == 1) && (spiderCurrentY + pY) > (canvas.getHeight() - 1 * tile)) {
            pY = 0;
        }
        if ((y11 == 1) && (spiderCurrentY + pY) < (1 * tile)) {
            pY = 0;
        }


        ry11 = (spiderCurrentY + pY);


        // ## CAMERA selection, reset x value

        if (cameraH == 1 && position == 1) {
            rx11 = (spiderCurrentX + (cameraH == 1 ? 0 : pX));
            position = 0;
        }

        if (cameraH == 0) {
            rx11 = (spiderCurrentX + (cameraH == 1 ? 0 : pX));
        }


        spiderCurrentX = (spiderCurrentX + (pX));
        spiderCurrentY = ry11;


        offsetX = ((spiderCurrentX) - rx11);


        RectF drect = new RectF();

        drect.set((int) rx11 - (int) ((dw1 / 2) * dsc1 * dp), (int) ry11 - (int) ((dh1 / 2) * dsc1 * dp), (int) rx11 + (int) ((dw1 / 2) * dsc1 * dp), (int) ry11 + (int) ((dh1 / 2) * dsc1 * dp));

        paintb.reset();
        paintb.setColorFilter(lightingColorFilter);
        canvas.drawBitmap(d, null, drect, paintb);


        pWidth = (int) (dw1 * dsc1 * dp);

        pHeight = (int) (dh1 * dsc1 * dp);



        buildMountains(canvas);

        buildBrick(canvas);




        //## GRAPHIC ANIMATION SOLUTION, with frame progress

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

    public void outOfWeb() {
        GAME_STATE = 10;
    }

    public void canceled() {
        GAME_STATE = 10;
        GAME_C = 1;
    }

    public void started() {
        GAME_STATE = 1;
        GAME_C = 0;
    }

    private void buildBrickL(Canvas canvas) {

        canvas.drawCircle(3 * tile, 5 * tile, 0.5f * tile, paint2);

        for (int f = 0; f < stars.length; f++) {

            sx = stars[f][0];
            sy = stars[f][1];

            canvas.drawCircle(sx * tile, sy * tile, 4, paint3);
        }


    }

    private void buildMountains(Canvas canvas) {


        gr_r = 1;

        gx = 0;
        gy = 3;

        for (int gr = 0; gr < mountbr.length; gr++) {

            gx += gr % 2 == 0 ? 2 : 3;


            // ## GRAPHIC BUILD, with graphic recycling solution, radius from offset

            if ((((gx * ra) * tile) - (offsetX * 0.7f)) > (rx11 - (r * tile)) && (((gx * ra) * tile) - (offsetX * 0.7f)) < (rx11 + (r * tile))) {


                if (mountbr[gr][0] == 4) {

                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.2f)) - (int) ((d14w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d14h / 2) * dsc * dp)) - (int) ((d14h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.2f)) + (int) ((d14w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d14h / 2) * dsc * dp)) + (int) ((d14h / 2) * dsc * dp));

                    canvas.drawBitmap(d14, null, rectb, paintb);

                }

                if (mountbr[gr][0] == 5) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.2f)) - (int) ((d15w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d15h / 2) * dsc * dp)) - (int) ((d15h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.2f)) + (int) ((d15w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d15h / 2) * dsc * dp)) + (int) ((d15h / 2) * dsc * dp));

                    canvas.drawBitmap(d15, null, rectb, paintb);

                }

                if (mountbr[gr][0] == 1) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);

                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d11w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d11h / 2) * dsc * dp)) - (int) ((d11h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d11w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d11h / 2) * dsc * dp)) + (int) ((d11h / 2) * dsc * dp));

                    canvas.drawBitmap(d11, null, rectb, paintb);


                }


                if (mountbr[gr][0] == 2) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d12w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d12h / 2) * dsc * dp)) - (int) ((d12h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d12w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d12h / 2) * dsc * dp)) + (int) ((d12h / 2) * dsc * dp));

                    canvas.drawBitmap(d12, null, rectb, paintb);
                }

                if (mountbr[gr][0] == 3) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d13w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d13h / 2) * dsc * dp)) - (int) ((d13h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d13w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d13h / 2) * dsc * dp)) + (int) ((d13h / 2) * dsc * dp));


                    canvas.drawBitmap(d13, null, rectb, paintb);
                }


                if (mountbr[gr][0] == 6) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d16w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d16h / 2) * dsc * dp)) - (int) ((d16h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d16w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d16h / 2) * dsc * dp)) + (int) ((d16h / 2) * dsc * dp));

                    canvas.drawBitmap(d16, null, rectb, paintb);

                }

                if (mountbr[gr][0] == 7) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d17w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d17h / 2) * dsc * dp)) - (int) ((d17h / 2) * dsc * dp),
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d17w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d17h / 2) * dsc * dp)) + (int) ((d17h / 2) * dsc * dp));

                    canvas.drawBitmap(d17, null, rectb, paintb);

                }


                if (mountbr[gr][0] == 8) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d18w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d18w / 2) * dsc * dp * 1.2f), (int) (((d18h / 2) * dsc * dp * 1.2f)) + (int) ((d18h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d18, null, rectb, paintb);

                }
                if (mountbr[gr][0] == 9) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d19w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d19w / 2) * dsc * dp * 1.2f), (int) (((d19h / 2) * dsc * dp * 1.2f)) + (int) ((d19h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d19, null, rectb, paintb);

                }
                if (mountbr[gr][0] == 10) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d20w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d20w / 2) * dsc * dp * 1.2f), (int) (((d20h / 2) * dsc * dp * 1.2f)) + (int) ((d20h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d20, null, rectb, paintb);

                }
                if (mountbr[gr][0] == 11) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.7f)) - (int) ((d21w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.7f)) + (int) ((d21w / 2) * dsc * dp * 1.2f), (int) (((d21h / 2) * dsc * dp * 1.2f)) + (int) ((d21h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d21, null, rectb, paintb);

                }


                if (mountbr[gr][0] == 12) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.1f)) - (int) ((d22w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.1f)) + (int) ((d22w / 2) * dsc * dp * 1.2f), (int) (((d22h / 2) * dsc * dp * 1.2f)) + (int) ((d22h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d22, null, rectb, paintb);

                }


                if (mountbr[gr][0] == 13) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.1f)) - (int) ((d23w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.1f)) + (int) ((d23w / 2) * dsc * dp * 1.2f), (int) (((d23h / 2) * dsc * dp * 1.2f)) + (int) ((d23h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d23, null, rectb, paintb);

                }
                if (mountbr[gr][0] == 14) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);
                    rectb.set((int) (((gx * ra) * tile) - (offsetX * 0.1f)) - (int) ((d24w / 2) * dsc * dp * 1.2f), 0,
                            (int) (((gx * ra) * tile) - (offsetX * 0.1f)) + (int) ((d24w / 2) * dsc * dp * 1.2f), (int) (((d24h / 2) * dsc * dp * 1.2f)) + (int) ((d24h / 2) * dsc * dp * 1.2f));

                    canvas.drawBitmap(d24, null, rectb, paintb);

                }


            }


        }


    }

    private void buildBrick(Canvas canvas) {


        br_c = 0;

        bx = 0;
        by = 3;
        by2 = 3;
        by3 = 3;

        yb = 0;

        Paint paintT = new Paint();
        paintT.setColor(Color.WHITE);
        paintT.setTextSize(16);

        int brick_c4 = 0;


        // ## GRAPHIC BUILD

        for (int br = 0; br < brickbr.length; br++) {


            bx += brickbr[br][1];
            by = brickbr[br][2];

            //## MAIN GRAPHIC RECYCLING SOLUTION

            if (((bx * tile) - offsetX) > (rx11 - (r * tile)) && ((bx * tile) - offsetX) < (rx11 + (r * tile))) {


                brick_c4 = 0;

                br_ = br;


                rectf = new RectF();

                paint.reset();

                if (brickbr[br][0] == 1) {
                    //  {2, 8, 1, 2, 1, 3, 0},


                    //## TRANSFORM SOLUTION ##

                    if (brickbr[br].length > 3 && brickbr[br][3] == 1) {
                        update_game = 1;

                        if (brickbr[br][6] == 0 && brickbr[br][4] < (brickbr[br][5] * tile_b)) {
                            brickbr[br][4] += 1;

                        } else if (brickbr[br][4] >= (brickbr[br][5] * tile_b)) {

                            brickbr[br][6] = 1;
                        }

                        if (brickbr[br][6] == 1 && brickbr[br][4] > 0) {
                            brickbr[br][4] -= 1;

                        } else if (brickbr[br][4] <= 0) {

                            brickbr[br][6] = 0;
                        }

                        brick_c4 = brickbr[br][4];
                    }


                    paint.setColor(colorb);
                    paint.setColorFilter(lightingColorFilter);

                    rectf.set(((bx * tile) - offsetX), 0 + (brick_c4), ((bx * tile) - offsetX) + (tile * 2), (by * tile_b) + (brick_c4));

                    canvas.drawRoundRect(rectf, 15, 15, paint);


                }


                if (brickbr[br][0] == 2) {


                    //## TRANSFORM SOLUTION ##

                    if (brickbr[br].length > 3 && brickbr[br][3] == 2) {

                        update_game = 1;

                        if (brickbr[br][6] == 0 && brickbr[br][4] < (brickbr[br][5] * tile_b)) {
                            brickbr[br][4] += 1;

                        } else if (brickbr[br][4] >= (brickbr[br][5] * tile_b)) {

                            brickbr[br][6] = 1;
                        }

                        if (brickbr[br][6] == 1 && brickbr[br][4] > 0) {
                            brickbr[br][4] -= 1;

                        } else if (brickbr[br][4] <= 0) {

                            brickbr[br][6] = 0;
                        }

                        brick_c4 = brickbr[br][4];
                    }


                    rectf.set(((bx * tile) - offsetX), canvas.getHeight() - ((by * tile_b) + (brick_c4)), ((bx * tile) - offsetX) + (tile * 2), canvas.getHeight() - (brick_c4));

                    paint.setColor(colorb);
                    paint.setColorFilter(lightingColorFilter);
                    canvas.drawRoundRect(rectf, 15, 15, paint);


                }


                if (brickbr[br][0] == 3) {

                    rectf.set(((bx * tile) - offsetX), canvas.getHeight() - ((by * tile_b) + (brick_c4)), ((bx * tile) - offsetX) + (tile * 2), canvas.getHeight() + (brick_c4));

                    paint.setColor(colorb);
                    paint.setColorFilter(lightingColorFilter);
                    canvas.drawRoundRect(rectf, 15, 15, paint);

                }


                if (brickbr[br][0] == 1 || brickbr[br][0] == 2) {

                    for (int b0 = 0; b0 < webr1.length; b0++) {

                        if (webr1[b0][0] == br && webr1[b0][1] == 1) {

                            if (brickbr[br][0] == 1) {
                                // roof
                                rectw.set(((bx * tile) - offsetX) + (1 * tile) - (0.3f * tile), (by * tile_b) + (brick_c4) + (1 * tile) - (0.3f * tile),
                                        (int) ((bx * tile) - offsetX) + (1 * tile) + (0.3f * tile), (by * tile_b) + (brick_c4) + (1 * tile) + (0.3f * tile));

                            }

                            if (brickbr[br][0] == 2) {
                                // ground
                                rectw.set(((bx * tile) - offsetX) + (1 * tile) - (0.3f * tile), (canvas.getHeight() - ((by * tile_b) + (brick_c4))) - (1 * tile) - (0.3f * tile),
                                        (int) ((bx * tile) - offsetX) + (1 * tile) + (0.3f * tile), (canvas.getHeight() - ((by * tile_b) + (brick_c4))) - (1 * tile) + (0.3f * tile));

                            }

                            canvas.drawBitmap(dweb1, null, rectw, null);



                            // ## COLLISION DETECTION SINGLE ###

                            if (webr1[b0][1] == 1 &&
                                    (rx11 + (pWidth / 2) > ((bx * tile) - offsetX) + (1 * tile) - (0.3f * tile)) &&
                                    (rx11 - (pWidth / 2) < ((bx * tile) - offsetX) + (1 * tile) + (0.3f * tile)) &&

                                    (
                                            ((brickbr[br][0] == 1) &&

                                                    (ry11 + (pHeight / 2) > ((by * tile_b) + (brick_c4) + (1 * tile) - (0.3f * tile))) &&
                                                    (ry11 - (pHeight / 2) < (by * tile_b) + (brick_c4) + (1 * tile) + (0.3f * tile)))


                                                    || ((brickbr[br][0] == 2) &&

                                                    (ry11 + (pHeight / 2) > ((canvas.getHeight() - ((by * tile_b) + (brick_c4)) - (1 * tile) - (0.3f * tile)))) &&
                                                    (ry11 - (pHeight / 2) < ((canvas.getHeight() - ((by * tile_b) + (brick_c4)) - (1 * tile) + (0.3f * tile))))
                                            )
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


                if (brickbr[br][0] == 4) {
                    cy = 3;

                    int cr = brickbr[br][2];

                    rectf.set((((bx * tile) - offsetX) - (tile)), canvas.getHeight() - (cy * tile), ((bx * tile) - offsetX) + (tile * 2), canvas.getHeight());


                    paint.setColor(Color.argb(cr == 0 ? 0 : 160, 255, 255, 255));

                    canvas.drawRoundRect(rectf, 35, 35, paint);


                    if (cr == (checkpointc) && (rx11 + (pWidth / 2) > ((bx * tile) - offsetX)) && (rx11 + (pWidth / 2) < (((bx * tile) + 3 * tile) - offsetX))) {

                        checkpointc = cr + 1;

                        //  startX = checkbr[ checkpointc > checkbr.length-1 ? checkbr.length-1 : checkpointc ][1] * tile;

                        startX = bx * tile;

                        checkpointStartXc = startX;

                        if (cr > 0) {
                            MainActivity.getInstance().canvasState(6);
                        }
                    }


                }


                if (brickbr[br][0] == 5) {
                    cy = 3;

                    rectf.set((((bx * tile) - offsetX) - (1f * tile)), canvas.getHeight() - (1f * tile), ((bx * tile) - offsetX) + (2 * tile), canvas.getHeight());

                    paint.setColor(Color.argb(0, 255, 255, 255));

                    canvas.drawRoundRect(rectf, 35, 35, paint);

                    int tr = brickbr[br][2];

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



                    if (t1 == 1) {
                        update_game = 1;
                        t_run++;

                        if (t_run > 200) {

                            d41m.setAlpha(255 - (int) ((255f / 200f) * (t_run - 200)));

                            trpy = (1f / 200f) * (t_run - 200);

                            if (t_run > 395) {
                                t1 = 0;
                                d41m.setAlpha(0);
                                GAME_STATE = 1;
                                update_game = 0;

                                if (a1 == 1 && GAME_STATE != 5) {
                                    update_game = 1;
                                    br_1 = 1;

                                }

                            }

                        }

                    }


                    if (tr != 4 && tr != 11) {

                        d41m.draw(canvas);
                    }


                    if (tr == ((trophies + 1)) && (rx11 + (pWidth / 2) > ((bx * tile) - offsetX)) && (rx11 + (pWidth / 2) < (((bx * tile) + 3 * tile) - offsetX))) {

                        trophies += 1;
                        run_evolve = 10;

                        spider_r = 0;

                        spider_t = 1;
                        spider_e = 13;

                        MainActivity.getInstance().canvasState(9);

                        t1 = 1;
                        t_run = 0;
                        trpy = 0;

                        GAME_STATE = 5;
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

                    }


                }





                // ## PRE COLLISION DETECTION, EXTENSION, automatic ai script ##

                if (br_1 == 1 && (((rx11 + (pWidth / 2) + (2 * tile)) > ((bx * tile) - offsetX)) && rx11 - (pWidth / 2) < (((bx * tile) - offsetX) + (2 * tile))

                        && (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((by * tile_b) + (brick_c4)) && (ry11 + (pHeight / 2) > 0 + (brick_c4))))

                        || ((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < getHeight() + (brick_c4)) && (ry11 + (pHeight / 2)) > (getHeight() - ((by * tile_b) + (brick_c4)))))))

                ) {
                    // COLLSION DETECTION STEPS LOGIC, set states

                    //   moveX
                    //   moveY -> moveX
                    //    1         2

                    br_1 = 0;

                    float moveY = 0;

                    if (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((by * tile_b) + (brick_c4)) && (ry11 + (pHeight / 2) > 0 + (brick_c4))))) {
                        moveY = (((by * tile_b) + (brick_c4)) - ry11) + (1.4f * tile);
                    }

                    if (((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < getHeight() + (brick_c4)) && (ry11 + (pHeight / 2)) > (getHeight() - ((by * tile_b) + (brick_c4)))))) {
                        moveY = ((getHeight() - ((by * tile_b) + (brick_c4))) - ry11) - (1.4f * tile);
                    }

                    if ((moveY > 10 || moveY < -10) && run_evolve != 1) {

                        isMove = 1;
                        moveToY = moveY;
                        isIdle = 1;
                        update_game = 1;
                        invalidate();
                    }


                    //## SECOND STEP, reset detection

                } else if (br_1 == 1 && (((bx * tile) - offsetX) - (4 * tile)) > (rx11 + (pWidth / 2))) {

                    br_1 = 0;
                    MainActivity.getInstance().canvasState(2);

                    moveX = 1;
                    moveToX = (int) (137.28f * dp * sc1);
                    movetoXb = moveToX;

                    pXb = 0;
                    yb1 = yb;
                    preSpiderY = spiderCurrentY;
                    preSpiderX = spiderCurrentX;

                    spiderX = spiderCurrentX;

                    spiderY = spiderCurrentY;
                    update_game = 1;
                    invalidate();
                }



                // ## COLLISION DETECTION MAIN ###

                if (spider_c == 1 && ((rx11 + (pWidth / 2) > ((bx * tile) - offsetX)) && rx11 - (pWidth / 2) < (((bx * tile) - offsetX) + (tile * 2))
                        && (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((by * tile_b) + (brick_c4)) && (ry11 + (pHeight / 2) > 0 + (brick_c4))))
                        || ((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < getHeight() + (brick_c4)) && (ry11 + (pHeight / 2)) > (getHeight() - ((by * tile_b) + (brick_c4))))))
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

                            if (((brickbr[br][0] == 1) && ((ry11 - (pHeight / 2)) < ((by * tile_b) + (brick_c4)) && (ry11 + (pHeight / 2) > 0 + (brick_c4))))) {
                                // roof
                                moveToY = 30 * dp;
                            }

                            if (((brickbr[br][0] == 2) && (((ry11 - (pHeight / 2)) < getHeight() + (brick_c4)) && (ry11 + (pHeight / 2)) > (getHeight() - ((by * tile_b) + (brick_c4)))))) {
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


                //## PRE COLLISION DETECTION WITH DYNAMIC DELTA VALUE, set yb variable, camera state selection

                if (((cameraH == 1 || cameraH == 3 ? rx11 : spiderX) + (cameraH == 1 || cameraH == 3 ? (movetoXb - pXb) : moveToX)) > ((bx * tile) - offsetX) &&
                        ((cameraH == 1 || cameraH == 3 ? rx11 : spiderX) + (cameraH == 1 || cameraH == 3 ? (movetoXb - pXb) : moveToX)) < (((bx * tile) - offsetX)) + (tile * 2) &&

                        ((brickbr[br][0] == 1) && ((ry11 + (pHeight))) > (0 + ((by * tile_b) + (brick_c4))))) {

                    yb = (0 + (by * tile_b) + (brick_c4));

                }


            }


        }


        cx = 0;
        cy = 3;

        tx = 0;
        ty = 3;

        float ra = 1.3f;

        for (int tr = 0; tr < treebr.length; tr++) {


            tx += tr % 2 == 0 ? 2 : 3;

            //## GRAPHIC BUILD, radius graphic recycle with bigger offset

            if ((((tx * ra) * tile) - (offsetX * 1.3f)) > (rx11 - (r * tile)) && (((tx * ra) * tile) - (offsetX * 1.3f)) < (rx11 + (r * tile))) {


                if (treebr[tr][0] == 1) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);

                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d1w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d1h / 2) * dsc * dp)) - (int) ((d1h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d1w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d1h / 2) * dsc * dp)) + (int) ((d1h / 2) * dsc * dp));


                    canvas.drawBitmap(d1, null, rectt, paintb);
                }


                if (treebr[tr][0] == 2) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);

                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d2w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d2h / 2) * dsc * dp)) - (int) ((d2h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d2w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d2h / 2) * dsc * dp)) + (int) ((d2h / 2) * dsc * dp));


                    canvas.drawBitmap(d2, null, rectt, paintb);
                }

                if (treebr[tr][0] == 3) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);

                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d3w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d3h / 2) * dsc * dp)) - (int) ((d3h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d3w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d3h / 2) * dsc * dp)) + (int) ((d3h / 2) * dsc * dp));


                    canvas.drawBitmap(d3, null, rectt, paintb);
                }


                if (treebr[tr][0] == 4) {
                    paintb.reset();
                    paintb.setColorFilter(lightingColorFilter);

                    rectt.set((int) (((tx * ra) * tile) - (offsetX * 1.3f)) - (int) ((d4w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d4h / 2) * dsc * dp)) - (int) ((d4h / 2) * dsc * dp),
                            (int) (((tx * ra) * tile) - (offsetX * 1.3f)) + (int) ((d4w / 2) * dsc * dp), (int) ((getHeight() + (1 * dp)) - ((d4h / 2) * dsc * dp)) + (int) ((d4h / 2) * dsc * dp));

                    canvas.drawBitmap(d4, null, rectt, paintb);

                }


            }


        }


    }


}
