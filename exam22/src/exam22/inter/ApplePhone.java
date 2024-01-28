package exam22.inter;

public class ApplePhone implements Phone{

	private int batteryCapacity = 40;
	private boolean isOn = false;
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if(batteryCapacity > 30) {
			System.out.println("@@@@@ power On @@@@@");
			isOn = true;
		}else {
			System.out.println("@@@@@ LowBettery On @@@@@");
		}
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("@@@@@ power Off @@@@@");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void watchYoutube() {
		// TODO Auto-generated method stub
		if(batteryCapacity > 10) {
			System.out.println("================== watching Youtube ==================");
			batteryCapacity -= 10;
			System.out.println("Battery is " + this.batteryCapacity + "%");
		}else {
			System.out.println("================= Low Battery =============");
			powerOff();
		}
	}

	@Override
	public void charge() {
		
		if(this.batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
			
			System.out.println("=========== start charaging =============");
			//5프로이상 차이날때는 5를 더하고, 아니면 100에서 현재값을 뺸만큼 더하기
			if(Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity >= 5) {
				this.batteryCapacity += 5;
			}else {
				this.batteryCapacity += (Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity);
			}
		}
		
	}
	

}
