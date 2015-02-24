public class SortTest {
	public static void main(String args[]) {
		Sort sort = new Sort();
		int[] list = {791,883,727,397,998,498,67,513,837,164,10,831,358,866,285,93,505,853,264,350,237,177,76,466,22,579,488,102,376,945,815,907,857,476,322,646,109,252,302,771,731,681,640,983,29,361,485,777,613,250,462,867,602,670,561,187,98,590,99,624,569,573,649,948,392,82,165,493,33,833,821,167,190,471,896,266,714,911,106,595,383,142,799,777,382,567,788,47,974,28,65,617,963,595,770,556,480,0,765,159,215,820,470,216,524,274,845,772,818,370,137,175,325,716,359,908,743,42,410,354,230,986,38,547,2,327,904,137,108,771,701,471,266,627,139,466,776,151,964,899,272,324,310,385,298,816,480,63,246,290,296,312,294,987,687,442,225,285,597,382,106,886,961,11,415,993,873,209,773,17,368,849,433,395,773,174,802,519,592,687,10,242,375,981,226,732,167,364,813,745,238,879,901,973,205,36,874,305,988,729,345,61,37,946,841,929,162,281,536,796,66,152,892,888,606,389,750,224,594,555,329,374,583,505,913,813,782,81,310,328,959,559,143,382,287,19,403,203,488,942,322,516,554,285,147,926,831,805,103,91,341,803,786,762,700,550,346,306,79,380,591,755,791,342,155,920,699,608,331,557,612,129,811,770,109,171,568,89,520,640,775,810,274,721,91,199,481,284,36,142,572,858,170,996,632,577,840,552,716,61,670,219,770,542,95,650,262,118,586,909,714,441,851,952,416,401,817,883,697,894,755,615,98,358,963,912,38,862,476,474,334,861,464,49,502,953,402,593,409,377,203,334,252,294,760,689,760,527,816,720,553,864,738,481,747,485,645,947,77,360,474,456,942,733,516,747,987,543,856,930,98,681,639,496,377,363,320,82,296,566,450,627,149,438,96,831,414,875,909,624,320,884,502,41,542,569,199,924,910,474,157,658,566,642,179,327,508,10,40,158,594,123,158,713,424,812,550,629,364,836,430,749,844,332,228,302,948,412,796,218,603,576,29,948,880,207,546,86,282,80,469,890,653,258,198,484,144,118,529,592,875,475,797,245,5,910,976,149,596,339,784,392,662,316,756,340,444,685,953,979,575,34,201,553,898,134,382,945,655,137,605,971,133,380,149,235,983,644,542,545,32,449,630,889,787,770,150,31,887,527,380,625,855,835,426,392,151,820,419,827,562,336,910,570,905,605,835,893,694,388,682,319,678,811,195,786,557,943,592,432,420,275,414,787,221,935,642,906,103,175,105,488,357,510,144,186,464,736,906,453,709,9,56,250,201,869,466,320,857,77,740,476,695,963,676,494,774,770,511,147,342,484,891,811,963,993,503,815,296,386,615,705,177,471,196,223,630,43,304,981,163,562,559,654,612,691,209,415,262,296,468,104,305,935,374,71,297,53,847,283,60,710,877,659,414,515,522,177,616,200,0,190,719,993,717,986,736,656,809,32,113,742,876,164,419,436,973,754,36,28,253,357,616,993,385,976,368,815,198,180,899,617,663,479,464,69,411,429,254,694,746,78,394,454,61,484,120,926,885,270,397,435,99,374,377,23,799,868,50,633,572,373,107,457,361,252,19,949,99,322,306,585,101,653,159,558,650,547,524,786,465,801,251,31,374,732,770,11,122,643,433,164,753,903,165,205,441,352,69,834,370,814,153,220,937,361,474,889,558,109,508,331,294,333,304,83,443,530,807,530,678,489,425,268,47,383,147,393,203,377,279,265,421,972,302,828,423,485,968,75,47,983,443,462,375,247,546,195,804,653,637,880,160,841,846,789,795,576,172,153,564,570,496,167,310,392,533,172,966,127,932,728,600,76,805,287,849,787,715,155,783,496,902,416,164,49,652,475,698,14,897,952,664,630,762,14,778,271,642,345,72,26,124,261,45,512,679,361,711,557,151,871,206,408,160,423,261,916,342,27,182,198,768,562,354,346,506,228,542,789,970,239,25,105,882,852,274,489,724,201,934,905,364,684,254,256,31,592,376,245,25,95,44,19,996,749,447,491,724,92,964,900,592,369,254,946,651,763,722,488,616,707,185,331,692,228,4,764,701,289,712,505,905,709,57,714,561,355,786,3,508,730,226,386,760,917,850,679,299,797,747,123,263,211,173,782,692,213,603,977,592,124,98,253,946,352,439,446,380,353,136,807,630,667,90,827,358,468,434,869,710,390,0,629,182,436,366,792,896,394,270,138,707,429,753,675,143,524,132,123,895,234,484,843,469,257,226,610,87,93,522,648,63,514,573,635,480,730,799,219,604,519,635,404,331,985,546,544,269,901};
		int[] sorted = sort.selectionSort(list);
		for (int i=0; i < sorted.length; i++) {
			System.out.print(sorted[i]+",");
		}
		System.out.print("\n");
	}	
}
