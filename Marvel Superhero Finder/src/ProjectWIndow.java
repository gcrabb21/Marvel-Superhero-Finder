import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import javax.imageio.ImageIO;

import java.awt.image.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ProjectWIndow {
	private static Text SearchBox;
	private static Boolean toggleDetails;
	private static Image img;
	
	private static Image convert(String link) {
		try {
			URL url = new URL(link);
			InputStream is = url.openStream();
			Image image = new Image(Display.getCurrent(), is);
			Image scaled = new Image(Display.getDefault(), 150, 150);
			GC gc = new GC(scaled);
			gc.setAntialias(SWT.ON);
			gc.setInterpolation(SWT.HIGH);
			gc.drawImage(image,  0,  0,
			image.getBounds().width, image.getBounds().height, 0, 0, 150, 150);
			gc.dispose();
			image.dispose();
			return scaled;
		}
		catch(IOException e) {
			e.printStackTrace();
			return null;
			}
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		toggleDetails = false;
		
		Display display = Display.getDefault();
		Shell shlMarvelSuperheroFinder = new Shell();
		shlMarvelSuperheroFinder.setSize(800, 600);
		shlMarvelSuperheroFinder.setText("Marvel Superhero Finder");
		
		Label lblDetails = new Label(shlMarvelSuperheroFinder, SWT.BORDER);
		lblDetails.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblDetails.setBounds(10, 10, 760, 500);
		lblDetails.setText("Detailed Information");
		lblDetails.setVisible(false);
		
		Label lblInfo = new Label(shlMarvelSuperheroFinder, SWT.NONE);
		lblInfo.setBounds(23, 60, 550, 400);
		lblInfo.setText("Information");
		
		Label lblImage = new Label(shlMarvelSuperheroFinder, SWT.NONE);
		lblImage.setBounds(583, 150, 180, 180);
		
		SearchBox = new Text(shlMarvelSuperheroFinder, SWT.BORDER);
		SearchBox.setBounds(20, 20, 250, 30);
		
		Button btnName = new Button(shlMarvelSuperheroFinder, SWT.NONE);
		btnName.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnName.setBounds(350, 20, 90, 30);
		btnName.setText("Name");
		btnName.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				//ignore
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				img = convert("https://images-na.ssl-images-amazon.com/images/I/41j6yIwUtzL._SY355_.jpg");
				
				lblInfo.setText(SearchBox.getText());
				lblDetails.setText(String.format("Detailed info about %s.", SearchBox.getText()));
				lblImage.setImage(img);
			}
		});
		
		Label lblSearchBy = new Label(shlMarvelSuperheroFinder, SWT.NONE);
		lblSearchBy.setBounds(274, 25, 70, 20);
		lblSearchBy.setText("Search by:");
		
		Button btnID = new Button(shlMarvelSuperheroFinder, SWT.NONE);
		btnID.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnID.setBounds(450, 20, 90, 30);
		btnID.setText("ID");
		btnID.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				//ignore
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				img = convert("https://images-na.ssl-images-amazon.com/images/I/41j6yIwUtzL._SY355_.jpg");
				
				lblInfo.setText(SearchBox.getText());
				lblDetails.setText(String.format("Detailed info about %s.", SearchBox.getText()));
				lblImage.setImage(img);
			}
		});
		
		Button btnComic = new Button(shlMarvelSuperheroFinder, SWT.NONE);
		btnComic.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnComic.setBounds(550, 20, 90, 30);
		btnComic.setText("Comic");
		btnComic.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				//ignore
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				img = convert("https://images-na.ssl-images-amazon.com/images/I/41j6yIwUtzL._SY355_.jpg");
				
				lblInfo.setText(SearchBox.getText());
				lblDetails.setText(String.format("Detailed info about %s.", SearchBox.getText()));
				lblImage.setImage(img);
			}
		});
		
		Button btnEtc = new Button(shlMarvelSuperheroFinder, SWT.NONE);
		btnEtc.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnEtc.setBounds(650, 20, 90, 30);
		btnEtc.setText("Etc.");
		btnEtc.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				//ignore
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				img = convert("https://images-na.ssl-images-amazon.com/images/I/41j6yIwUtzL._SY355_.jpg");
				
				lblInfo.setText(SearchBox.getText());
				lblDetails.setText(String.format("Detailed info about %s.", SearchBox.getText()));
				lblImage.setImage(img);
			}
		});
		
		Button btnShowDetailedInfo = new Button(shlMarvelSuperheroFinder, SWT.NONE);
		btnShowDetailedInfo.setBounds(10, 513, 150, 30);
		btnShowDetailedInfo.setText("Show Detailed Info");
		btnShowDetailedInfo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				//ignore
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (toggleDetails == false) {
					lblDetails.setVisible(true);
					btnShowDetailedInfo.setText("Hide Detailed Info");
					toggleDetails = true;
				}
				else {
					lblDetails.setVisible(false);
					btnShowDetailedInfo.setText("Show Detailed Info");
					toggleDetails = false;
				}
			}
		});

		shlMarvelSuperheroFinder.open();
		shlMarvelSuperheroFinder.layout();
		while (!shlMarvelSuperheroFinder.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
