package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class TankDrive extends SubsystemBase{
    private final MotorController m_leftMotor = new CANSparkMax(2, MotorType.kBrushless);
    private final MotorController m_rightMotor = new CANSparkMax(2, MotorType.kBrushless);

    public TankDrive() {}

    
}