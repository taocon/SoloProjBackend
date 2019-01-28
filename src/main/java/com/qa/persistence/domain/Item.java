package com.qa.persistence.domain;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.qa.persistence.repository.AccountRepository;

@Entity
public class Item {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long itemId;
	private String itemName;
	private float atkdmg;
	private float atkspd;
	private float ms;
	private float armr;
	private float str;
	private float dex;
	private float intell;
	private float hp;
	private float hpreg;
	private float mana;
	private float manareg;
	private float magres;
	private float statres;
	private float spellamp;
	private String itemImg;

	public Item() {

	}

	public Item(String itemName, float atkdmg,float atkspd, float ms, float armr, float str, float dex, float intell, float hp, float hpreg,
			float mana, float manareg, float magres, float statres, float spellamp,String itemImg) {

		this.setAtkdmg(atkdmg);
		this.setAtkspd(atkspd);
		this.setMs(ms);
		this.setArmr(armr);
		this.setStr(str);
		this.setDex(dex);
		this.setIntell(intell);
		this.setHp(hpreg);
		this.setHpreg(hpreg);
		this.setMana(mana);
		this.setManareg(manareg);
		this.setStatres(statres);
		this.setSpellamp(spellamp);
		this.setItemImg(itemImg);

	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getAtkdmg() {
		return atkdmg;
	}

	public void setAtkdmg(float atkdmg2) {
		this.atkdmg = atkdmg2;
	}

	public float getMs() {
		return ms;
	}

	public void setMs(float ms) {
		this.ms = ms;
	}

	public float getArmr() {
		return armr;
	}

	public void setArmr(float armr) {
		this.armr = armr;
	}

	public float getStr() {
		return str;
	}

	public void setStr(float str2) {
		this.str = str2;
	}

	public float getDex() {
		return dex;
	}

	public void setDex(float dex) {
		this.dex = dex;
	}

	public float getIntell() {
		return intell;
	}

	public void setIntell(float intell) {
		this.intell = intell;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getHpreg() {
		return hpreg;
	}

	public void setHpreg(float hpreg) {
		this.hpreg = hpreg;
	}

	public float getMana() {
		return mana;
	}

	public void setMana(float mana) {
		this.mana = mana;
	}

	public float getManareg() {
		return manareg;
	}

	public void setManareg(float manareg) {
		this.manareg = manareg;
	}

	public float getMagres() {
		return magres;
	}

	public void setMagres(float magres) {
		this.magres = magres;
	}

	public float getStatres() {
		return statres;
	}

	public void setStatres(float statres) {
		this.statres = statres;
	}

	public float getSpellamp() {
		return spellamp;
	}

	public void setSpellamp(float spellamp) {
		this.spellamp = spellamp;
	}

	public String getItemImg() {
		return itemImg;
	}

	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}

	public float getAtkspd() {
		return atkspd;
	}

	public void setAtkspd(float atkspd2) {
		this.atkspd = atkspd2;
	}

}
