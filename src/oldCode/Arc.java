package oldCode;

/*
public class Arc extends Shape {
    String type = "arc";
    int radius;

    int xa;
    int ya;
    int xb;
    int yb;

    int centerX;
    int centerY;
    int theta;


    public Arc(){

    }

    public void updateShape()
    {
        int possibleRadius = (int) sqrt(
                ((x2 - x1) * (x2 - x1)
                        +
                        ((y2 - y1) * (y2 - y1))
                ));

        /*
        if(possibleRadius > 6)
        {
            radius = possibleRadius;
        }
        else
        {
            radius = 6;
        }
        */

/*
        radius = possibleRadius;

        centerX = x1;
        centerY = y1;

        if(x2 == x1)
        {
            x2 = x1 + 1;
        }

        theta = (int) (-1 * Math.toDegrees(Math.atan2((y2 - y1), ((x2 - x1)))));

        xa = x2;
        ya = y2;

        xb = x1 - (xa - x1);
        yb = y1 - (ya - y1);
    }

    public void draw(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Map<RenderingHints.Key, Object> hints = new HashMap<RenderingHints.Key, Object>();
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(hints);

        //Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

        int xc = (x1 + x2)/2  ;
        int yc = (y1 + y2)/2  ;    // Center point
        int xd = (x1 - x2)/2  ;
        int yd = (y1 - y2)/2  ;    // Half-diagonal

        //Draw arc from corner to corner. --> Pretty obnoxious
        //g2.drawArc(xc + Display.LEFT_BUFFER - radius / 2, yc + Display.TOP_BUFFER - radius / 2, radius, radius, theta,180);

        //Draw Arc from center toward middle of arc --> Pretty weird but the best of them all.
        g2.drawArc(centerX - radius + Display.LEFT_BUFFER, centerY - radius + Display.TOP_BUFFER, radius * 2, radius * 2,theta - 90, 180);

        //Draw arc from center to other corner. -- Too weird
        //g2.drawArc(centerX - radius + Display.LEFT_BUFFER, centerY - radius + Display.TOP_BUFFER, radius * 2, radius * 2,theta, 180);
        //g2.drawLine(x1 + Display.LEFT_BUFFER,y1 + Display.TOP_BUFFER, x2 + Display.LEFT_BUFFER, y2 + Display.TOP_BUFFER);
        //g2.drawLine(xa + Display.LEFT_BUFFER,ya + Display.TOP_BUFFER, xb + Display.LEFT_BUFFER, yb + Display.TOP_BUFFER);

    }

*/
