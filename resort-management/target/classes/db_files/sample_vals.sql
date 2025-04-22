INSERT INTO resort (resort_id, name, location, description, longdescription) VALUES
(101, 'Palm Grove Resort', 'Goa', 'A beachside resort with spa and pool facilities.',
 'Palm Grove Resort offers a tranquil beach experience with luxurious amenities including a spa, pool, and beachfront access. The resort is perfect for couples, families, and solo travelers looking to unwind and enjoy the beautiful coastal surroundings. Guests can indulge in local delicacies, take part in yoga sessions, and explore the nearby attractions such as the vibrant markets and historic forts.'),
(102, 'Mountain Retreat', 'Manali', 'A serene mountain resort with skiing and trekking options.',
 'Mountain Retreat is nestled in the serene hills of Manali, offering a perfect escape for adventure seekers and nature lovers. The resort provides skiing and trekking expeditions, along with cozy accommodations and stunning mountain views. The warm atmosphere, coupled with activities like bonfires and local cultural experiences, makes it an ideal getaway for those looking for a refreshing holiday.'),
(103, 'Desert Oasis', 'Jaisalmer', 'Luxurious desert-themed resort with camel rides and cultural shows.',
 'Desert Oasis brings the magic of the Thar Desert to life with its unique camel rides and mesmerizing cultural shows. The resort is designed with traditional Rajasthani architecture, offering guests a luxurious stay amidst the desert dunes. Guests can enjoy camel safaris, live folk performances, and authentic Rajasthani cuisine while experiencing the rich cultural heritage of Jaisalmer.'),
(104, 'Royal Palace Resort', 'Jaipur', 'A royal retreat with traditional Rajasthani architecture and royal hospitality.',
 'Experience the grandeur of Rajasthan at the Royal Palace Resort, where you are treated like royalty. Located in Jaipur, this resort offers opulent suites, traditional Rajasthani architecture, and a wide range of royal experiences. Guests can indulge in royal dinners, visit historical landmarks, and enjoy the unique blend of luxury and culture. The resort is ideal for those looking for a lavish and regal stay.'),
(105, 'Seaside Haven', 'Kochi', 'A relaxing beach resort with water sports and seafood dining.',
 'Seaside Haven in Kochi is a perfect destination for beach lovers and water sports enthusiasts. With its scenic views of the Arabian Sea, guests can enjoy activities like snorkeling, kayaking, and windsurfing. The resort also boasts a variety of seafood dining options, where guests can savor fresh catches from the sea. Whether you are looking to relax by the beach or explore the underwater world, Seaside Haven offers it all.'),
(106, 'Hilltop Retreat', 'Mysore', 'A peaceful hilltop resort offering nature walks and eco-friendly accommodations.',
 'Hilltop Retreat is situated in the peaceful hills of Mysore, offering a serene escape from the hustle and bustle of the city. With its eco-friendly accommodations and nature walks through lush forests, it’s the ideal resort for nature lovers and those seeking tranquility. Guests can participate in bird watching, meditation, and organic farming activities, making it a holistic getaway that combines relaxation with nature.'),
(107, 'Ocean Breeze Resort', 'Andaman', 'An idyllic resort on a tropical island with pristine beaches and coral reefs.',
 'Ocean Breeze Resort offers a tropical paradise experience on the pristine beaches of Andaman. Surrounded by clear blue waters and colorful coral reefs, the resort provides a range of activities, including diving, island hopping, and beach sports. Guests can unwind on the white sandy beaches, enjoy gourmet seafood, and explore the rich marine life, making this an ideal destination for nature lovers and adventure seekers alike.');


INSERT INTO facility (name, resort_id) VALUES
('Swimming Pool', 101),
('Spa & Wellness Center', 101),
('Free WiFi', 101),

('Skiing Area', 102),
('Mountain View Rooms', 102),
('Indoor Games', 102),

('Camel Rides', 103),
('Cultural Dance Show', 103),
('Luxury Tents', 103),

('Ayurvedic Spa', 104),
('Infinity Pool', 104),

('Cycling Trails', 105),
('Farm-to-Table Restaurant', 105),

('Private Beach Access', 106),
('Scuba Diving', 106),

('Yoga Center', 107),
('Library & Study Area', 107);
