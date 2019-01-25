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
	private int atkdmg;
	private int ms;
	private int armr;
	private int str;
	private int dex;
	private int intell;
	private int hp;
	private int hpreg;
	private int mana;
	private int manareg;
	private int magres;
	private int statres;
	private int spellamp;
	private String itemImg;

	public Item() {

	}

	public Item(String itemName, int atkdmg, int ms, int armr, int str, int dex, int intell, int hp, int hpreg,
			int mana, int manareg, int magres, int statres, int spellamp,String itemImg) {

		this.setAtkdmg(atkdmg);
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

	public int getAtkdmg() {
		return atkdmg;
	}

	public void setAtkdmg(int atkdmg) {
		this.atkdmg = atkdmg;
	}

	public int getMs() {
		return ms;
	}

	public void setMs(int ms) {
		this.ms = ms;
	}

	public int getArmr() {
		return armr;
	}

	public void setArmr(int armr) {
		this.armr = armr;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getIntell() {
		return intell;
	}

	public void setIntell(int intell) {
		this.intell = intell;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHpreg() {
		return hpreg;
	}

	public void setHpreg(int hpreg) {
		this.hpreg = hpreg;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getManareg() {
		return manareg;
	}

	public void setManareg(int manareg) {
		this.manareg = manareg;
	}

	public int getMagres() {
		return magres;
	}

	public void setMagres(int magres) {
		this.magres = magres;
	}

	public int getStatres() {
		return statres;
	}

	public void setStatres(int statres) {
		this.statres = statres;
	}

	public int getSpellamp() {
		return spellamp;
	}

	public void setSpellamp(int spellamp) {
		this.spellamp = spellamp;
	}

	public String getItemImg() {
		return itemImg;
	}

	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}

}
