package org.lutra.yandexmaps;

import com.google.gson.Gson;
import org.junit.Test;
import org.lutra.yandexmaps.model.RouteWrapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RouteTest
{
	@Test
	public void unmarshallTest() throws Exception
	{
		Gson g = new Gson();
		String json = null;
		try
		(
			InputStreamReader isr = new InputStreamReader(RouteTest.class.getResourceAsStream("route-response1.json"));
			BufferedReader br = new BufferedReader(isr)
		)
		{
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = br.readLine()) != null)
				sb.append(line);
			json =  sb.toString();
		}
		RouteWrapper rw = g.fromJson(json, RouteWrapper.class);
		assertEquals("Type deserialization", rw.response.type, "FeatureCollection");
		//TODO: some robustness
	}
}
