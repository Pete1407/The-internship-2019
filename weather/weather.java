import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class weather {
	public static String id = "";
	public static String name_city = "";
	
	public static String lon;
	public static String lat;
	
	public static String ct;
	
	public static String rise;
	public static String set;
	
	public static String temp_value;
	public static String temp_min;
	public static String temp_max;
	public static String temp_unit;
	
	public static String humid_value;
	public static String humid_unit;
	
	public static String pres_value;
	public static String pres_unit;
	
	public static String speed_value;
	public static String speed_name;
	
	
	public static String direct_value;
	public static String direct_code;
	public static String direct_name;
	
	
	public static String cloud_value;
	public static String cloud_name;
	
	public static String visi_value;
	
	public static String preci_mode;
	
	public static String weather_value;
	public static String weather_number;
	public static String weather_icon;
	
	public static String lastupdate;
	
	public static InfoWeather wet;
	public static String filename;
	public static ArrayList<String> titlelist = new ArrayList<>();
      public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Please choose file XML to convert JSON");
    	  JFileChooser choose = new JFileChooser();
    	  int input_user = choose.showOpenDialog(null);
    	  if(input_user==JFileChooser.APPROVE_OPTION)
    	  {
    		  filename = choose.getSelectedFile().getName();
    		  System.out.println("You choose "+filename);
    	  }
    	  System.out.println("----------------------------------------");
    	    File fXmlFile = new File("./src/"+filename);
    	    BufferedReader read = new BufferedReader(new FileReader(fXmlFile));
    	    String lorde = read.readLine();
    	    while(lorde!=null)
    	    {
    	    	System.out.println(lorde);
    	    	lorde = read.readLine();
    	    }
    		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    		Document doc = dBuilder.parse(fXmlFile);
    		
    		wet = new InfoWeather();
    		
    		NodeList citylist = doc.getElementsByTagName("city");
    		//System.out.println(wlist.getLength());
    		for(int count=0;count<citylist.getLength();count++)
    		{
    		   Node a = citylist.item(count);
    		   if(a.getNodeType()==Node.ELEMENT_NODE)
    		   {
    			 Element e  = (Element) a;
    			 id = e.getAttribute("id");
    			 //System.out.println(id);
    			 wet.setId(id);
    			 name_city = e.getAttribute("name");
    			 //System.out.println(name_city);
    			 wet.setName_city(name_city);
    			 
    			 
    			 NodeList hippolist = a.getChildNodes();
    			 for(int count2=0;count2<hippolist.getLength();count2++)
    			 {
    				 Node b = hippolist.item(count2);
    				 if(b.getNodeType()==Node.ELEMENT_NODE)
    				 {
    					 Element f = (Element) b;
    					 String title = f.getNodeName();
    					 //System.out.println("Title: "+title);
    					 titlelist.add(title);
    					 
    					 if(title.equals("coord"))
    					 {
    						 lon = f.getAttribute("lon");
    						// System.out.println("lon: "+lon);
    						 wet.setLon(lon);
    						 
    						 lat = f.getAttribute("lat");
    						//  System.out.println("lat: "+lat);
    						  wet.setLat(lat);
    						  
    					 }
    					 else if(title.equals("country"))
    					 {
    						 ct = f.getTextContent();
    						// System.out.println("country: "+ct);
    						 wet.setCt(ct);
    					 }
    					 else if(title.equals("sun"))
    					 {
    						 rise = f.getAttribute("rise");
    						// System.out.println("rise: "+rise);
    						 wet.setRise(rise);
    						 
    						 set = f.getAttribute("set");
    						 //System.out.println("set: "+set);
    						 wet.setSet(set);
    					 }
    					 
    					 
    					
    					 
    					 
    				 }
    			 }
    			 
    		   }
    		}
    		
    		NodeList templist = doc.getElementsByTagName("temperature");
    		Node c = templist.item(0);
    		if(c.getNodeType()==Node.ELEMENT_NODE)
    		{
    			Element g = (Element) c;
    			temp_value = g.getAttribute("value");
    			//System.out.println("value: "+temp_value);
    			wet.setTemp_value(temp_value);
    			
    			
    			temp_min = g.getAttribute("min");
    			//System.out.println("min: "+temp_min);
    			wet.setTemp_min(temp_min);
    			
    			temp_max = g.getAttribute("max");
    			//System.out.println("max: "+temp_max);
    			wet.setTemp_max(temp_max);
    			
    			temp_unit = g.getAttribute("unit");
    			//System.out.println("unit: "+temp_unit);
    			wet.setTemp_unit(temp_unit);
    		}
    		
    		NodeList humidlist = doc.getElementsByTagName("humidity");
    		Node d = humidlist.item(0);
    		if(d.getNodeType()==Node.ELEMENT_NODE)
    		{
    			Element h = (Element) d;
    			humid_value = h.getAttribute("value");
    			//System.out.println("humidity value: "+humid_value);
    			wet.setHumid_value(humid_value);
    			
    			humid_unit = h.getAttribute("unit");
    			//System.out.println("humidity unit: "+humid_unit);
    			wet.setHumid_unit(humid_unit);
    		}
    	
    		
    		NodeList preslist = doc.getElementsByTagName("pressure");
    		Node e = preslist.item(0);
    		if(e.getNodeType()==Node.ELEMENT_NODE)
    		{
    			Element g = (Element) e;
    			
    			pres_value = g.getAttribute("value");
    			//System.out.println("pressure value: "+pres_value);
    			wet.setPres_value(pres_value);
    			
    			pres_unit = g.getAttribute("unit");
    			//System.out.println("pressure unit: "+pres_unit);
    			wet.setPres_unit(pres_unit);
    		}
    		
    		NodeList windlist = doc.getElementsByTagName("wind");
    		
    		//for(int count3=0;count3<windlist.getLength();count3++)
    		//{
    		    Node f = windlist.item(0);
    		    if(f.getNodeType()==Node.ELEMENT_NODE)
    		    {
    		    	Element i = (Element) f;
    		        NodeList wlist = i.getChildNodes();
    		        for(int count4=0;count4<wlist.getLength();count4++)
    		        {
    		        	Node g = wlist.item(count4);
    		        	if(g.getNodeType()==Node.ELEMENT_NODE)
    		        	{
    		        		Element j = (Element) g;
    		        		String title = j.getNodeName();
    		        	    if(title.equals("speed"))
    		        	    {
    		        	    	speed_value = j.getAttribute("value");
    		        	    	//System.out.println("speed value: "+speed_value);
    		        	    	wet.setSpeed_value(speed_value);
    		        	    	
    		        	    	speed_name = j.getAttribute("name");
    		        	    	//System.out.println("speed name: "+speed_name);
    		        	    	wet.setSpeed_name(speed_name);
    		        	    }
    		        	    else if(title.equals("direction"))
    		        	    {
    		        	    	direct_value = j.getAttribute("value");
    		        	    	//System.out.println("direct value: "+direct_value);
    		        	    	wet.setDirect_value(direct_value);
    		        	    	
    		        	    	direct_code = j.getAttribute("code");
    		        	    	//System.out.println("direct code: "+direct_code);
    		        	    	wet.setDirect_code(direct_code);
    		        	    	
    		        	    	direct_name = j.getAttribute("name");
    		        	    	//System.out.println("direct name: "+direct_name);
    		        	    	wet.setDirect_name(direct_name);
    		        	    }
    		        	    
    		        		
    		        	}
    		        	
    		        	
    		        }
    		    	
    		    	
    		    }
    		    
    		    NodeList cloudlist = doc.getElementsByTagName("clouds");
    		    Node h = cloudlist.item(0);
    		    if(h.getNodeType()==Node.ELEMENT_NODE)
    		    {
    		    	Element k = (Element) h;
    		    	
    		    	cloud_value = k.getAttribute("value");
    		    	//System.out.println("cloud name: "+cloud_value);
    		    	wet.setCloud_value(cloud_value);
    		    	
    		    	cloud_name = k.getAttribute("name");
    		    	//System.out.println("cloud name: "+cloud_name);
    		    	wet.setCloud_name(cloud_name);
    		    }
    		    
    		    NodeList visilist = doc.getElementsByTagName("visibility");
    		    Node j = visilist.item(0);
    		    if(j.getNodeType()==Node.ELEMENT_NODE)
    		    {
    		    	Element l = (Element) j;
    		    	visi_value = l.getAttribute("value");
    		    	//System.out.println("visibility mode: "+visi_value);
    		    	wet.setVisi_value(visi_value);
    		    }
    		    
    		    
    		    NodeList prelist = doc.getElementsByTagName("precipitation");
    		    Node k = prelist.item(0);
    		    if(k.getNodeType()==Node.ELEMENT_NODE)
    		    {
    		    	Element m = (Element) k;
    		    	preci_mode = m.getAttribute("mode");
    		    	//System.out.println("precipitation mode: "+preci_mode);
    		    	wet.setPreci_mode(preci_mode);
    		    }
    		    
    		    
    		    NodeList wealist = doc.getElementsByTagName("weather");
    		    Node l = wealist.item(0);
    		    if(l.getNodeType()==Node.ELEMENT_NODE)
    		    {
    		    	Element n = (Element) l;
    		    	weather_number = n.getAttribute("number");
    		    	//System.out.println("weather number: "+weather_number);
    		    	wet.setWeather_number(weather_number);
    		    	
    		    	weather_value = n.getAttribute("value");
    		    	//System.out.println("weather value: "+weather_value);
    		    	wet.setWeather_value(weather_value);
    		    	
    		    	weather_icon = n.getAttribute("icon");
    		    	//System.out.println("weather icon: "+weather_icon);
    		    	wet.setWeather_icon(weather_icon);
    		    }
    		    
    		//}
    		    
    		    NodeList lulist = doc.getElementsByTagName("lastupdate");
    		    Node m = lulist.item(0);
    		    if(m.getNodeType()==Node.ELEMENT_NODE)
    		    {
    		    	Element o = (Element) m;
    		    	lastupdate = o.getAttribute("value");
    		    	//System.out.println("last update: "+lastupdate);
    		    	wet.setLastupdate(lastupdate);
    		    }
    		    
    		    
    		    
    		
    		   System.out.printf("Please input file name to save JSON file:");
    		   int save = choose.showSaveDialog(null);
    		   if(save==JFileChooser.APPROVE_OPTION)
    		   {
    			    FileWriter write = new FileWriter(choose.getSelectedFile());
    			    PrintWriter printWriter = new PrintWriter(write);
    			    printWriter.print(wet.toString());
    			    printWriter.close();
    		   }
    		  
    		   System.out.println(wet.toString());
    		   System.out.println("--- Save File completed. ---");
    	
	}
}
