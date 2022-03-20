import java.applet.Applet;
import java.awt.*;
/*<applet code="Myname" width="300" height="300"><?applet>*/
publicclass Myname extends Applet{
label l1,l2;
TextField t1,t2;
Button b1;
public void init()
{
l1=new label("first number");
l2=new label("second number");
t1=new TextField();
t2=new TextField();
b1=new Button("Add");
setlayout(null);
l1.setBounds(30,40,50,60);
l2.setBounds(30,40,50,60);
t1.setBounds(30,40,50,60);
t2.setBounds(30,40,50,60);
b1.setBounds(100,150,80,20);


add(t1);
add(l1);
add(l2);
add(t2);
add(b1);
}
}

