public class P3 {
    public static void main(String[] args) {
        double x0 = 0.1, y0 = 0.1;
        double factor = 0.5;
        double[] xy = {x0, y0};

        for (int i = 0; i < 100; i+=5) {
            xy = lambda(xy, factor);
            System.out.println("λ = " + factor + "\tx:" + xy[0] + "\ty:" + xy[1]);
        }

        factor = 1.0;
        xy[0] = x0;
        xy[1] = y0;
        for (int i = 0; i < 100; i+=5) {
            xy = lambda(xy, factor);
            System.out.println("λ = " + factor + "\tx:" + xy[0] + "\t\ty:" + xy[1]);
        }

        factor = 1.5;
        xy[0] = x0;
        xy[1] = y0;
        for (int i = 0; i < 100; i+=5) {
            xy = lambda(xy, factor);
            System.out.println("λ = " + factor + "\tx:" + xy[0] + "\t\ty:" + xy[1]);
        }

        factor = 2.0;
        xy[0] = x0;
        xy[1] = y0;
        for (int i = 0; i < 100; i+=5) {
            xy = lambda(xy, factor);
            System.out.println("λ = " + factor + "\tx:" + xy[0] + "\t\ty:" + xy[1]);
        }

        factor = 2.5;
        xy[0] = x0;
        xy[1] = y0;
        for (int i = 0; i < 100; i+=5) {
            xy = lambda(xy, factor);
            System.out.println("λ = " + factor + "\tx:" + xy[0] + "\t\ty:" + xy[1]);
        }

    }

    public static double[] lambda(double[] xy, double factor){
        double x = xy[0];
        double y = xy[1];
        double x_next = factor*x*(1-x)-0.2*x*y;
        double y_next = 0.9*y+0.2*x*y;
        return new double[]{x_next,y_next};
    }
}


/**
 λ = 0.5	x:0.043000000000000003	y:0.09200000000000001
 λ = 0.5	x:0.0197843	y:0.08359120000000002
 λ = 0.5	x:0.009365682061123001	y:0.07556283867563202
 λ = 0.5	x:0.0044974435257921	y:0.0681480943126032
 λ = 0.5	x:0.0021773098226499483	y:0.06139458332245514
 λ = 0.5	x:0.0010595495664279737	y:0.05528185999607472
 λ = 0.5	x:5.174986864140934E-4	y:0.04976538877062528
 λ = 0.5	x:2.5346473609828954E-4	y:0.04479400059822629
 λ = 0.5	x:1.2442950595483888E-4	y:0.040316871278311746
 λ = 0.5	x:6.120368995148233E-5	y:0.036286187472155534
 λ = 0.5	x:3.0155802316395892E-5	y:0.0326580128946535
 λ = 0.5	x:1.488048075581178E-5	y:0.029392408570904326
 λ = 0.5	x:7.352655029530867E-6	y:0.026453255188447915
 λ = 0.5	x:3.6374001520356806E-6	y:0.023807968569935088
 λ = 0.5	x:1.8013736389787187E-6	y:0.021427189032763277
 λ = 0.5	x:8.92965522319659E-7	y:0.019284477849161645
 λ = 0.5	x:4.4303828769906975E-7	y:0.01735603350832025
 λ = 0.5	x:2.199811682347179E-7	y:0.015620431695365698
 λ = 0.5	x:1.0930331975896632E-7	y:0.01405838921306929
 λ = 0.5	x:5.434432818358489E-8	y:0.012652550599088083
 λ = 1.0	x:0.08800000000000001		y:0.09200000000000001
 λ = 1.0	x:0.0786368		y:0.08441920000000001
 λ = 1.0	x:0.07112536253644801		y:0.07730497114931201
 λ = 1.0	x:0.06496687652073395		y:0.07067414285415372
 λ = 1.0	x:0.05982788581347075		y:0.06452502423114126
 λ = 1.0	x:0.05547643073619862		y:0.058844600964389565
 λ = 1.0	x:0.05174589868305034		y:0.05361303855387065
 λ = 1.0	x:0.048513409680314014		y:0.0488065856707034
 λ = 1.0	x:0.04568630398435599		y:0.0443994818807811
 λ = 1.0	x:0.043193375967414356		y:0.04036522333789364
 λ = 1.0	x:0.040979006186423486		y:0.036677403057632736
 λ = 1.0	x:0.038999126533036416		y:0.0333102634572296
 λ = 1.0	x:0.03721838042681318		y:0.0302390513473901
 λ = 1.0	x:0.03560808288185957		y:0.02744023591600971
 λ = 1.0	x:0.03414472847637918		y:0.024891631163367747
 λ = 1.0	x:0.032808882396172044		y:0.022572451644512447
 λ = 1.0	x:0.03158434424980658		y:0.02046332186234082
 λ = 1.0	x:0.030457509327677334		y:0.018546253796545693
 λ = 1.0	x:0.02941687491363143		y:0.016804602956491475
 λ = 1.0	x:0.028452654603318323		y:0.015223010441471197
 λ = 1.5	x:0.13300000000000003		y:0.09200000000000001
 λ = 1.5	x:0.17051930000000004		y:0.08524720000000001
 λ = 1.5	x:0.20925644391707304		y:0.079629738574192
 λ = 1.5	x:0.24486966970956459		y:0.07499937190158912
 λ = 1.5	x:0.2736897575636466		y:0.07117244899662359
 λ = 1.5	x:0.29427967719037906		y:0.06795103815918062
 λ = 1.5	x:0.30751940125981103		y:0.06515525625810951
 λ = 1.5	x:0.31541952758424285		y:0.06264703171098324
 λ = 1.5	x:0.3199430543747972		y:0.0603343479692516
 λ = 1.5	x:0.3225085333835853		y:0.05816162428692528
 λ = 1.5	x:0.3239936448879346		y:0.05609698588782943
 λ = 1.5	x:0.3248976310552433		y:0.054122300684051466
 λ = 1.5	x:0.32549189912899984		y:0.0522269120715479
 λ = 1.5	x:0.3259204967364329		y:0.05040410822355539
 λ = 1.5	x:0.326258943417309		y:0.04864924379915547
 λ = 1.5	x:0.3265466177103025		y:0.04695876959523264
 λ = 1.5	x:0.326804040781764		y:0.0453297381123415
 λ = 1.5	x:0.3270419512491742		y:0.04375955261764582
 λ = 1.5	x:0.3272660281636873		y:0.04224583925065439
 λ = 1.5	x:0.3274793368568773		y:0.04078638092918961
 λ = 2.0	x:0.17800000000000002		y:0.09200000000000001
 λ = 2.0	x:0.2893568		y:0.08607520000000002
 λ = 2.0	x:0.40627759570124805		y:0.08244896888627203
 λ = 2.0	x:0.4757327880954902		y:0.08090350576707715
 λ = 2.0	x:0.4911245147797089		y:0.08051084526342367
 λ = 2.0	x:0.49193428156130814		y:0.08036793069998195
 λ = 2.0	x:0.4919627403222426		y:0.08023828567987669
 λ = 2.0	x:0.4919759555333783		y:0.08010930649225524
 λ = 2.0	x:0.49198885889906674		y:0.07998074636475844
 λ = 2.0	x:0.49200171600894327		y:0.07985259895586123
 λ = 2.0	x:0.4920145317635853		y:0.07972486220308664
 λ = 2.0	x:0.49202730644473675		y:0.07959753413213158
 λ = 2.0	x:0.4920400402512126		y:0.07947061278265356
 λ = 2.0	x:0.4920527333791223		y:0.07934409620686128
 λ = 2.0	x:0.492065386023297		y:0.07921798246939157
 λ = 2.0	x:0.4920779983773238		y:0.07909226964721
 λ = 2.0	x:0.4920905706335569		y:0.07896695582951273
 λ = 2.0	x:0.49210310298312654		y:0.07884203911762942
 λ = 2.0	x:0.4921155956159493		y:0.07871751762492699
 λ = 2.0	x:0.4921280487207375		y:0.07859338947671428
 λ = 2.5	x:0.223		y:0.09200000000000001
 λ = 2.5	x:0.4290743		y:0.08690320000000001
 λ = 2.5	x:0.604966276757223		y:0.08567046594155202
 λ = 2.5	x:0.5870896532975717		y:0.08746896790914026
 λ = 2.5	x:0.5957680555124573		y:0.08899249632704095
 λ = 2.5	x:0.5914674215600152		y:0.090697023992729
 λ = 2.5	x:0.5933554099980769		y:0.09235618857828536
 λ = 2.5	x:0.5922519097322818		y:0.09408057854840246
 λ = 2.5	x:0.5925800824140653		y:0.09581640115636408
 λ = 2.5	x:0.5922165426717407		y:0.09759053921949916
 λ = 2.5	x:0.592181326797369		y:0.09939043164435779
 λ = 2.5	x:0.5919850759382678		y:0.10122282001634582
 λ = 2.5	x:0.5918623847527653		y:0.10308501777352366
 λ = 2.5	x:0.5917008267784936		y:0.10497894488651509
 λ = 2.5	x:0.5915541702236149		y:0.10690427609460057
 λ = 2.5	x:0.591396650718964		y:0.10886178255284006
 λ = 2.5	x:0.5912405318747801		y:0.1108517030161652
 λ = 2.5	x:0.5910799093879175		y:0.11287453668464922
 λ = 2.5	x:0.5909175510815687		y:0.11493065719933743
 λ = 2.5	x:0.5907520887640403		y:0.11702049997868924

 Process finished with exit code 0

 **/