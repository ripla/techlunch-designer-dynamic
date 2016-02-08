package com.example.backend;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class BackendImpl implements Backend {

	@Override
	public Collection<User> getUsers() {
		return Arrays.asList(new User("John Appleseed", "Online"), new User("Mary Appleseed", "Online"),
				new User("John Travolta", "Online"), new User("Tom Cruise", "Online"),
				new User("Henri Muurimaa", "Online"));
	}

	@Override
	public Collection<Message> getMessages() {
		return Arrays.asList(
				new Message("John Appleseed",
						"Jukolan talo, eteläisessä Hämeessä, seisoo erään mäen pohjoisella rinteellä, liki Toukolan kylää. Sen läheisin ym­päristö on kivinen tanner, mutta alempana alkaa pellot, joissa, ennenkuin talo oli häviöön mennyt, aaltoili teräinen vilja."),
				new Message("Mary Appleseed",
						"Peltojen alla on niittu, apilaäyräinen, halkileikkaama monipolvisen ojan; ja runsaasti antoi se heiniä, ennenkuin joutui laitumeksi kylän karjalle."),
				new Message("John Travolta",
						"Muutoin on talolla avaria metsiä, soita ja erämaita, jotka, tämän tilustan ensimmäisen perustajan oivallisen toiminnan kautta, olivat langenneet sille osaksi jo ison jaon käydessä entisinä aikoina."),
				new Message("Tom Cruise",
						"illoinpa Jukolan isäntä, pitäen enemmän huolta jälkeentulevainsa edusta kuin omasta parhaastansa, otti vastaan osaksensa kulon polttaman metsän ja sai sillä keinolla seitsemän vertaa enemmän kuin toiset naapurinsa."),
				new Message("Henri Muurimaa",
						"Mutta kaikki kulovalkean jäljet olivat jo kadonneet hänen piiristänsä ja tuuhea metsä kasvanut sijaan. Ja tämä on niiden seitsemän veljen koto, joiden elämänvaiheita tässä nyt käyn kertoilemaan."));
	}

}
