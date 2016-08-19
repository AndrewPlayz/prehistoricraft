package net.andrewplayz.prehistoricraft.client.model.entity.dinosaur;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPachyrhinosaurusLakustai extends AdvancedModelBase {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bellyfront;
    public AdvancedModelRenderer Bodyback;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer Lshoulder;
    public AdvancedModelRenderer Rshoulder;
    public AdvancedModelRenderer Bellyback;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Rthigh;
    public AdvancedModelRenderer Lthigh;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Rshin;
    public AdvancedModelRenderer Rheelfoot;
    public AdvancedModelRenderer RBToe2Part1;
    public AdvancedModelRenderer RBToe1Part1;
    public AdvancedModelRenderer RBToe3Part1;
    public AdvancedModelRenderer RBToe4Part1;
    public AdvancedModelRenderer RBToe5Part1;
    public AdvancedModelRenderer Lshin;
    public AdvancedModelRenderer Lheelfoot;
    public AdvancedModelRenderer LBToe2Part1;
    public AdvancedModelRenderer LBToe1Part1;
    public AdvancedModelRenderer LBToe3Part1;
    public AdvancedModelRenderer LBToe4Part1;
    public AdvancedModelRenderer RBToe5Part1_1;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Frill;
    public AdvancedModelRenderer Sidefacehornright;
    public AdvancedModelRenderer Sidefacehornright_1;
    public AdvancedModelRenderer Head2;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Frillleft;
    public AdvancedModelRenderer Frillright;
    public AdvancedModelRenderer Frillmiddlehornleft;
    public AdvancedModelRenderer Frillmiddlehornright;
    public AdvancedModelRenderer eyeboss;
    public AdvancedModelRenderer Lowerfrillleft;
    public AdvancedModelRenderer Leftfrillsidehorn;
    public AdvancedModelRenderer Lowerfrillright;
    public AdvancedModelRenderer Rightfrillsidehorn;
    public AdvancedModelRenderer shape172;
    public AdvancedModelRenderer shape173;
    public AdvancedModelRenderer Snout;
    public AdvancedModelRenderer Beakfront;
    public AdvancedModelRenderer BeakR;
    public AdvancedModelRenderer BeakL;
    public AdvancedModelRenderer Nasalbump;
    public AdvancedModelRenderer Lowerjaw2;
    public AdvancedModelRenderer shape68;
    public AdvancedModelRenderer Lowerjawunder;
    public AdvancedModelRenderer Larm;
    public AdvancedModelRenderer LFfoot;
    public AdvancedModelRenderer LToe3Part1;
    public AdvancedModelRenderer LToe2Part1;
    public AdvancedModelRenderer LToe1Part1;
    public AdvancedModelRenderer LToe4Part1;
    public AdvancedModelRenderer LToe5Part1;
    public AdvancedModelRenderer Rarm;
    public AdvancedModelRenderer RFfoot;
    public AdvancedModelRenderer RToe3Part1;
    public AdvancedModelRenderer RToe2Part1;
    public AdvancedModelRenderer RToe1Part1;
    public AdvancedModelRenderer RToe4Part1;
    public AdvancedModelRenderer RToe5Part1;

    public ModelPachyrhinosaurusLakustai() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Snout = new AdvancedModelRenderer(this, 177, 112);
        this.Snout.setRotationPoint(0.0F, 0.6F, -4.0F);
        this.Snout.addBox(-3.0F, 0.0F, -9.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(Snout, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 5, 40);
        this.Tail4.setRotationPoint(0.0F, 1.5F, 8.0F);
        this.Tail4.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 12, 0.0F);
        this.setRotateAngle(Tail4, 0.136659280431156F, 0.0F, 0.0F);
        this.Lshoulder = new AdvancedModelRenderer(this, 325, 225);
        this.Lshoulder.mirror = true;
        this.Lshoulder.setRotationPoint(7.0F, 6.0F, 4.0F);
        this.Lshoulder.addBox(0.0F, 0.0F, 0.0F, 6, 15, 10, 0.0F);
        this.setRotateAngle(Lshoulder, 0.045553093477052F, 0.0F, -0.091106186954104F);
        this.LToe3Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LToe3Part1.setRotationPoint(-1.5F, 3.0F, 1.0F);
        this.LToe3Part1.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LToe3Part1, -1.0471975511965976F, 0.27314402793711257F, 0.0F);
        this.Rarm = new AdvancedModelRenderer(this, 325, 200);
        this.Rarm.setRotationPoint(-0.5F, 10.0F, 4.5F);
        this.Rarm.addBox(-5.0F, 0.0F, 0.0F, 5, 15, 7, 0.0F);
        this.setRotateAngle(Rarm, -0.6829473363053812F, 0.0F, -0.091106186954104F);
        this.RBToe5Part1 = new AdvancedModelRenderer(this, 430, 140);
        this.RBToe5Part1.setRotationPoint(3.0F, 4.0F, 3.0F);
        this.RBToe5Part1.addBox(-3.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RBToe5Part1, -0.136659280431156F, 0.0F, -0.27314402793711257F);
        this.Rightfrillsidehorn = new AdvancedModelRenderer(this, 290, 210);
        this.Rightfrillsidehorn.setRotationPoint(0.0F, 0.1F, 15.0F);
        this.Rightfrillsidehorn.addBox(-2.0F, 0.0F, 0.1F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Rightfrillsidehorn, 0.0F, -1.0016444577195458F, 0.0F);
        this.Lshin = new AdvancedModelRenderer(this, 415, 190);
        this.Lshin.mirror = true;
        this.Lshin.setRotationPoint(3.3F, 17.7F, 0.1F);
        this.Lshin.addBox(-3.0F, 0.0F, 0.0F, 6, 15, 7, 0.0F);
        this.setRotateAngle(Lshin, 0.7740535232594852F, 0.0F, 0.136659280431156F);
        this.Lheelfoot = new AdvancedModelRenderer(this, 415, 170);
        this.Lheelfoot.mirror = true;
        this.Lheelfoot.setRotationPoint(-0.02F, 11.5F, 0.9F);
        this.Lheelfoot.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 7, 0.0F);
        this.setRotateAngle(Lheelfoot, -0.5009094953223726F, 0.0F, 0.0F);
        this.Lowerjaw2 = new AdvancedModelRenderer(this, 176, 66);
        this.Lowerjaw2.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Lowerjaw2.addBox(-2.5F, -2.0F, -7.0F, 5, 2, 6, 0.0F);
        this.LBToe4Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LBToe4Part1.setRotationPoint(-1.5F, 5.0F, 1.0F);
        this.LBToe4Part1.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LBToe4Part1, -1.0471975511965976F, 0.5918411493512771F, 0.0F);
        this.Sidefacehornright = new AdvancedModelRenderer(this, 270, 240);
        this.Sidefacehornright.setRotationPoint(2.5F, 8.5F, -8.0F);
        this.Sidefacehornright.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Sidefacehornright, 0.4553564018453205F, 0.18203784098300857F, -0.27314402793711257F);
        this.RBToe4Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RBToe4Part1.setRotationPoint(1.5F, 5.0F, 1.0F);
        this.RBToe4Part1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RBToe4Part1, -1.0471975511965976F, -0.7285004297824331F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 175, 220);
        this.Neck1.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Neck1.addBox(-6.0F, 0.0F, -9.0F, 12, 16, 9, 0.0F);
        this.setRotateAngle(Neck1, 0.045553093477052F, 0.0F, 0.0F);
        this.Head2 = new AdvancedModelRenderer(this, 175, 135);
        this.Head2.setRotationPoint(0.0F, 0.5F, -9.0F);
        this.Head2.addBox(-3.5F, 0.0F, -7.0F, 7, 8, 7, 0.0F);
        this.setRotateAngle(Head2, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 5, 65);
        this.Tail3.setRotationPoint(0.0F, 1.0F, 12.0F);
        this.Tail3.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(Tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.Frillleft = new AdvancedModelRenderer(this, 225, 155);
        this.Frillleft.setRotationPoint(3.6F, 0.0F, 0.1F);
        this.Frillleft.addBox(0.0F, 0.0F, 0.0F, 7, 1, 15, 0.0F);
        this.setRotateAngle(Frillleft, 0.0F, 0.0F, 0.7285004297824331F);
        this.LBToe1Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LBToe1Part1.setRotationPoint(1.5F, 5.0F, 1.0F);
        this.LBToe1Part1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LBToe1Part1, -1.0471975511965976F, -0.5918411493512771F, 0.0F);
        this.LToe4Part1 = new AdvancedModelRenderer(this, 415, 140);
        this.LToe4Part1.setRotationPoint(-2.5F, 2.0F, 2.0F);
        this.LToe4Part1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LToe4Part1, -0.136659280431156F, 0.0F, 0.22759093446006054F);
        this.Head1 = new AdvancedModelRenderer(this, 175, 155);
        this.Head1.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.Head1.addBox(-4.5F, 0.0F, -11.0F, 9, 12, 11, 0.0F);
        this.setRotateAngle(Head1, 0.5462880558742251F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 5, 90);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 10.0F);
        this.Tail2.addBox(-5.5F, 0.0F, 0.0F, 11, 11, 14, 0.0F);
        this.setRotateAngle(Tail2, -0.18203784098300857F, 0.0F, 0.0F);
        this.RToe4Part1 = new AdvancedModelRenderer(this, 415, 140);
        this.RToe4Part1.setRotationPoint(2.5F, 2.0F, 2.0F);
        this.RToe4Part1.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RToe4Part1, -0.136659280431156F, 0.0F, -0.22759093446006054F);
        this.Rshoulder = new AdvancedModelRenderer(this, 325, 225);
        this.Rshoulder.setRotationPoint(-7.0F, 6.0F, 4.0F);
        this.Rshoulder.addBox(-6.0F, 0.0F, 0.0F, 6, 15, 10, 0.0F);
        this.setRotateAngle(Rshoulder, 0.045553093477052F, 0.0F, 0.091106186954104F);
        this.LBToe2Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LBToe2Part1.setRotationPoint(-0.3F, 5.0F, 1.0F);
        this.LBToe2Part1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LBToe2Part1, -1.0471975511965976F, -0.27314402793711257F, 0.0F);
        this.Bellyfront = new AdvancedModelRenderer(this, 92, 215);
        this.Bellyfront.setRotationPoint(0.0F, 9.9F, 6.2F);
        this.Bellyfront.addBox(-7.0F, 0.0F, 0.0F, 14, 12, 16, 0.0F);
        this.setRotateAngle(Bellyfront, -0.40980330836826856F, 0.0F, 0.0F);
        this.RFfoot = new AdvancedModelRenderer(this, 325, 180);
        this.RFfoot.setRotationPoint(-2.49F, 15.0F, 0.0F);
        this.RFfoot.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(RFfoot, 0.31869712141416456F, 0.0F, 0.0F);
        this.Bellyback = new AdvancedModelRenderer(this, 92, 165);
        this.Bellyback.setRotationPoint(0.0F, 2.0F, 11.4F);
        this.Bellyback.addBox(-6.5F, 0.0F, 0.0F, 13, 11, 21, 0.0F);
        this.setRotateAngle(Bellyback, 0.40980330836826856F, 0.0F, 0.0F);
        this.Lowerfrillleft = new AdvancedModelRenderer(this, 280, 185);
        this.Lowerfrillleft.setRotationPoint(-2.0F, 0.1F, -2.9F);
        this.Lowerfrillleft.addBox(0.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
        this.setRotateAngle(Lowerfrillleft, 0.0F, 0.5462880558742251F, 0.0F);
        this.Rthigh = new AdvancedModelRenderer(this, 415, 220);
        this.Rthigh.setRotationPoint(-6.0F, 4.0F, 11.5F);
        this.Rthigh.addBox(-7.0F, 0.0F, 0.0F, 7, 18, 10, 0.0F);
        this.setRotateAngle(Rthigh, -0.18203784098300857F, 0.0F, 0.136659280431156F);
        this.Frillmiddlehornleft = new AdvancedModelRenderer(this, 290, 240);
        this.Frillmiddlehornleft.setRotationPoint(1.5F, 0.1F, 15.0F);
        this.Frillmiddlehornleft.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Frillmiddlehornleft, -0.091106186954104F, -0.31869712141416456F, 0.0F);
        this.Nasalbump = new AdvancedModelRenderer(this, 225, 230);
        this.Nasalbump.setRotationPoint(0.0F, -3.0F, -8.0F);
        this.Nasalbump.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 12, 0.0F);
        this.setRotateAngle(Nasalbump, -0.0598647933434055F, 0.0F, 0.0F);
        this.Bodyback = new AdvancedModelRenderer(this, 5, 150);
        this.Bodyback.setRotationPoint(0.0F, 0.0F, 22.0F);
        this.Bodyback.addBox(-8.0F, 0.0F, 0.0F, 16, 19, 25, 0.0F);
        this.setRotateAngle(Bodyback, -0.40980330836826856F, 0.0F, 0.0F);
        this.Lowerfrillright = new AdvancedModelRenderer(this, 280, 170);
        this.Lowerfrillright.setRotationPoint(2.0F, 0.1F, -2.9F);
        this.Lowerfrillright.addBox(-6.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
        this.setRotateAngle(Lowerfrillright, 0.0F, -0.5462880558742251F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 5, 120);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 22.0F);
        this.Tail1.addBox(-6.5F, 0.0F, 0.0F, 13, 15, 14, 0.0F);
        this.setRotateAngle(Tail1, -0.36425021489121656F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 175, 85);
        this.Lowerjaw.setRotationPoint(0.0F, 8.5F, -9.9F);
        this.Lowerjaw.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 7, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.18203784098300857F, 0.0F, 0.0F);
        this.RBToe2Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RBToe2Part1.setRotationPoint(0.3F, 5.0F, 1.0F);
        this.RBToe2Part1.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RBToe2Part1, -1.0471975511965976F, 0.27314402793711257F, 0.0F);
        this.LToe2Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LToe2Part1.setRotationPoint(0.2F, 3.0F, 1.0F);
        this.LToe2Part1.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LToe2Part1, -1.0471975511965976F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 6, 200);
        this.Bodyfront.setRotationPoint(0.0F, -8.0F, -27.0F);
        this.Bodyfront.addBox(-8.5F, 0.0F, 0.0F, 17, 21, 22, 0.0F);
        this.setRotateAngle(Bodyfront, 0.31869712141416456F, 0.0F, 0.0F);
        this.BeakL = new AdvancedModelRenderer(this, 175, 50);
        this.BeakL.setRotationPoint(3.0F, 7.0F, -9.0F);
        this.BeakL.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.BeakR = new AdvancedModelRenderer(this, 175, 50);
        this.BeakR.setRotationPoint(-3.0F, 7.0F, -9.0F);
        this.BeakR.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.Lthigh = new AdvancedModelRenderer(this, 415, 220);
        this.Lthigh.mirror = true;
        this.Lthigh.setRotationPoint(6.0F, 4.0F, 11.5F);
        this.Lthigh.addBox(0.0F, 0.0F, 0.0F, 7, 18, 10, 0.0F);
        this.setRotateAngle(Lthigh, -0.18203784098300857F, 0.0F, -0.136659280431156F);
        this.shape172 = new AdvancedModelRenderer(this, 234, 215);
        this.shape172.setRotationPoint(0.0F, -0.8F, -0.3F);
        this.shape172.addBox(-0.5F, -4.0F, -2.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(shape172, 0.36425021489121656F, 0.0F, 0.0F);
        this.Frill = new AdvancedModelRenderer(this, 225, 175);
        this.Frill.setRotationPoint(0.0F, 0.4F, -1.0F);
        this.Frill.addBox(-3.5F, 0.0F, 0.0F, 7, 2, 16, 0.0F);
        this.setRotateAngle(Frill, 0.22759093446006054F, 0.0F, 0.0F);
        this.RBToe3Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RBToe3Part1.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.RBToe3Part1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RBToe3Part1, -1.0471975511965976F, -0.27314402793711257F, 0.0F);
        this.Lowerjawunder = new AdvancedModelRenderer(this, 175, 75);
        this.Lowerjawunder.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Lowerjawunder.addBox(-2.0F, -1.0F, -7.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Lowerjawunder, -0.136659280431156F, 0.0F, 0.0F);
        this.LBToe3Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LBToe3Part1.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.LBToe3Part1.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LBToe3Part1, -1.0471975511965976F, 0.18203784098300857F, 0.0F);
        this.RToe1Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RToe1Part1.setRotationPoint(-0.7F, 3.0F, 1.5F);
        this.RToe1Part1.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RToe1Part1, -1.0471975511965976F, 0.36425021489121656F, 0.0F);
        this.Leftfrillsidehorn = new AdvancedModelRenderer(this, 290, 210);
        this.Leftfrillsidehorn.setRotationPoint(0.0F, 0.1F, 15.0F);
        this.Leftfrillsidehorn.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Leftfrillsidehorn, 0.0F, 1.0016444577195458F, 0.0F);
        this.RToe2Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RToe2Part1.setRotationPoint(-0.2F, 3.0F, 1.0F);
        this.RToe2Part1.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RToe2Part1, -1.0471975511965976F, 0.0F, 0.0F);
        this.Rshin = new AdvancedModelRenderer(this, 415, 190);
        this.Rshin.setRotationPoint(-3.3F, 17.7F, 0.1F);
        this.Rshin.addBox(-3.0F, 0.0F, 0.0F, 6, 15, 7, 0.0F);
        this.setRotateAngle(Rshin, 0.7740535232594852F, 0.0F, -0.136659280431156F);
        this.eyeboss = new AdvancedModelRenderer(this, 234, 215);
        this.eyeboss.setRotationPoint(0.0F, 1.3F, 2.7F);
        this.eyeboss.addBox(-1.0F, -6.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(eyeboss, -0.091106186954104F, 0.0F, 0.0F);
        this.RBToe1Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RBToe1Part1.setRotationPoint(-1.5F, 5.0F, 1.0F);
        this.RBToe1Part1.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RBToe1Part1, -1.0471975511965976F, 0.7285004297824331F, 0.0F);
        this.Sidefacehornright_1 = new AdvancedModelRenderer(this, 270, 220);
        this.Sidefacehornright_1.setRotationPoint(-2.5F, 8.5F, -8.0F);
        this.Sidefacehornright_1.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Sidefacehornright_1, 0.4553564018453205F, -0.18203784098300857F, 0.27314402793711257F);
        this.Rheelfoot = new AdvancedModelRenderer(this, 415, 170);
        this.Rheelfoot.setRotationPoint(0.02F, 11.5F, 0.9F);
        this.Rheelfoot.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 7, 0.0F);
        this.setRotateAngle(Rheelfoot, -0.5009094953223726F, 0.0F, 0.0F);
        this.RToe5Part1 = new AdvancedModelRenderer(this, 415, 140);
        this.RToe5Part1.setRotationPoint(2.5F, 1.5F, 3.5F);
        this.RToe5Part1.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RToe5Part1, -0.136659280431156F, 0.0F, -0.22759093446006054F);
        this.Neck2 = new AdvancedModelRenderer(this, 175, 190);
        this.Neck2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Neck2.addBox(-4.0F, 0.0F, -7.0F, 8, 12, 7, 0.0F);
        this.setRotateAngle(Neck2, -0.136659280431156F, 0.0F, 0.0F);
        this.LFfoot = new AdvancedModelRenderer(this, 325, 180);
        this.LFfoot.mirror = true;
        this.LFfoot.setRotationPoint(2.49F, 14.8F, 0.0F);
        this.LFfoot.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(LFfoot, 0.31869712141416456F, 0.0F, 0.0F);
        this.Frillright = new AdvancedModelRenderer(this, 225, 155);
        this.Frillright.mirror = true;
        this.Frillright.setRotationPoint(-3.6F, 0.0F, 0.1F);
        this.Frillright.addBox(-7.0F, 0.0F, 0.0F, 7, 1, 15, 0.0F);
        this.setRotateAngle(Frillright, 0.0F, 0.0F, -0.7285004297824331F);
        this.Beakfront = new AdvancedModelRenderer(this, 175, 45);
        this.Beakfront.setRotationPoint(0.0F, 7.0F, -9.0F);
        this.Beakfront.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.shape173 = new AdvancedModelRenderer(this, 234, 215);
        this.shape173.setRotationPoint(0.0F, -1.0F, 0.2F);
        this.shape173.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(shape173, -0.40980330836826856F, 0.0F, 0.0F);
        this.shape68 = new AdvancedModelRenderer(this, 175, 10);
        this.shape68.setRotationPoint(0.0F, -6.0F, -9.0F);
        this.shape68.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 10, 0.0F);
        this.LToe5Part1 = new AdvancedModelRenderer(this, 415, 140);
        this.LToe5Part1.setRotationPoint(-2.5F, 1.5F, 3.5F);
        this.LToe5Part1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LToe5Part1, -0.136659280431156F, 0.0F, 0.22759093446006054F);
        this.LToe1Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.LToe1Part1.setRotationPoint(0.7F, 3.0F, 1.5F);
        this.LToe1Part1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(LToe1Part1, -1.0471975511965976F, -0.36425021489121656F, 0.0F);
        this.Frillmiddlehornright = new AdvancedModelRenderer(this, 290, 240);
        this.Frillmiddlehornright.setRotationPoint(-1.5F, 0.1F, 15.0F);
        this.Frillmiddlehornright.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Frillmiddlehornright, -0.091106186954104F, 0.31869712141416456F, 0.0F);
        this.RBToe5Part1_1 = new AdvancedModelRenderer(this, 430, 140);
        this.RBToe5Part1_1.setRotationPoint(-3.0F, 4.0F, 3.0F);
        this.RBToe5Part1_1.addBox(0.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RBToe5Part1_1, -0.136659280431156F, 0.0F, 0.27314402793711257F);
        this.Larm = new AdvancedModelRenderer(this, 325, 200);
        this.Larm.mirror = true;
        this.Larm.setRotationPoint(0.5F, 10.0F, 4.5F);
        this.Larm.addBox(0.0F, 0.0F, 0.0F, 5, 15, 7, 0.0F);
        this.setRotateAngle(Larm, -0.6829473363053812F, 0.0F, 0.091106186954104F);
        this.RToe3Part1 = new AdvancedModelRenderer(this, 415, 150);
        this.RToe3Part1.setRotationPoint(1.5F, 3.0F, 1.0F);
        this.RToe3Part1.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(RToe3Part1, -1.0471975511965976F, -0.27314402793711257F, 0.0F);
        this.Head2.addChild(this.Snout);
        this.Tail3.addChild(this.Tail4);
        this.Bodyfront.addChild(this.Lshoulder);
        this.LFfoot.addChild(this.LToe3Part1);
        this.Rshoulder.addChild(this.Rarm);
        this.Rheelfoot.addChild(this.RBToe5Part1);
        this.Frillright.addChild(this.Rightfrillsidehorn);
        this.Lthigh.addChild(this.Lshin);
        this.Lshin.addChild(this.Lheelfoot);
        this.Lowerjaw.addChild(this.Lowerjaw2);
        this.Lheelfoot.addChild(this.LBToe4Part1);
        this.Head1.addChild(this.Sidefacehornright);
        this.Rheelfoot.addChild(this.RBToe4Part1);
        this.Bodyfront.addChild(this.Neck1);
        this.Head1.addChild(this.Head2);
        this.Tail2.addChild(this.Tail3);
        this.Frill.addChild(this.Frillleft);
        this.Lheelfoot.addChild(this.LBToe1Part1);
        this.LFfoot.addChild(this.LToe4Part1);
        this.Neck2.addChild(this.Head1);
        this.Tail1.addChild(this.Tail2);
        this.RFfoot.addChild(this.RToe4Part1);
        this.Bodyfront.addChild(this.Rshoulder);
        this.Lheelfoot.addChild(this.LBToe2Part1);
        this.Bodyfront.addChild(this.Bellyfront);
        this.Rarm.addChild(this.RFfoot);
        this.Bellyfront.addChild(this.Bellyback);
        this.Frillleft.addChild(this.Lowerfrillleft);
        this.Bodyback.addChild(this.Rthigh);
        this.Frill.addChild(this.Frillmiddlehornleft);
        this.Snout.addChild(this.Nasalbump);
        this.Bodyfront.addChild(this.Bodyback);
        this.Frillright.addChild(this.Lowerfrillright);
        this.Bodyback.addChild(this.Tail1);
        this.Head1.addChild(this.Lowerjaw);
        this.Rheelfoot.addChild(this.RBToe2Part1);
        this.LFfoot.addChild(this.LToe2Part1);
        this.Snout.addChild(this.BeakL);
        this.Snout.addChild(this.BeakR);
        this.Bodyback.addChild(this.Lthigh);
        this.eyeboss.addChild(this.shape172);
        this.Head1.addChild(this.Frill);
        this.Rheelfoot.addChild(this.RBToe3Part1);
        this.Lowerjaw2.addChild(this.Lowerjawunder);
        this.Lheelfoot.addChild(this.LBToe3Part1);
        this.RFfoot.addChild(this.RToe1Part1);
        this.Frillleft.addChild(this.Leftfrillsidehorn);
        this.RFfoot.addChild(this.RToe2Part1);
        this.Rthigh.addChild(this.Rshin);
        this.Frill.addChild(this.eyeboss);
        this.Rheelfoot.addChild(this.RBToe1Part1);
        this.Head1.addChild(this.Sidefacehornright_1);
        this.Rshin.addChild(this.Rheelfoot);
        this.RFfoot.addChild(this.RToe5Part1);
        this.Neck1.addChild(this.Neck2);
        this.Larm.addChild(this.LFfoot);
        this.Frill.addChild(this.Frillright);
        this.Snout.addChild(this.Beakfront);
        this.eyeboss.addChild(this.shape173);
        this.Lowerjaw.addChild(this.shape68);
        this.LFfoot.addChild(this.LToe5Part1);
        this.LFfoot.addChild(this.LToe1Part1);
        this.Frill.addChild(this.Frillmiddlehornright);
        this.Lheelfoot.addChild(this.RBToe5Part1_1);
        this.Lshoulder.addChild(this.Larm);
        this.RFfoot.addChild(this.RToe3Part1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Bodyfront.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
}
