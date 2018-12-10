package com.william.paintWizard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PaintCalculation
{
	private List<Paint> listOfPaints = new ArrayList<>();
	public float bestPaint;
	
	public PaintCalculation()
	{
		listOfPaints = new ArrayList<>();
	}
	
	public void add(Paint paint)
	{
		listOfPaints.add(paint);
	}
	
	public List<Paint> wastesLeast(int surfaceArea)
	{
		List<Paint> wastage = listOfPaints;
		bestPaint = surfaceArea;
		for(int i = 0; i < 2; i++)
		{
			wastage.stream()
			.filter(paint ->
			{
				System.out.println("1: " + bestPaint);
				if(paint.paintRemaining(paint.getTotalLitres(), paint.getCoveragePerLitre(), surfaceArea) <= bestPaint)
				{
					bestPaint = paint.paintRemaining(paint.getTotalLitres(), paint.getCoveragePerLitre(), surfaceArea);
					System.out.println("2: " + bestPaint);
					return true;
				}
				else
				{
					return false;
				}
		
			}).collect(Collectors.toList());
		}
			
			return wastage;
	}	
	
	public float paintRemaining(int totalLitres, int coveragePerLitre, float surfaceArea)
	{
		int totalBuckets = numberOfBuckets(totalLitres, coveragePerLitre, surfaceArea);
		
		float remainingPaint = ((totalLitres * coveragePerLitre) * totalBuckets) % surfaceArea;
		
		return remainingPaint;
	}
	
	public static int numberOfBuckets(int totalLitres, int coveragePerLitre, float surfaceArea)
	{
		int numberOfBuckets = 1;
		
		if (surfaceArea > totalLitres * coveragePerLitre)
		{
			numberOfBuckets = ((int)Math.ceil(surfaceArea / (totalLitres * coveragePerLitre)));
		}
		
		return numberOfBuckets;
	}
}
