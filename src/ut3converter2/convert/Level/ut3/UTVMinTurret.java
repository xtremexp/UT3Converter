/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ut3converter2.convert.Level.ut3;

import ut3converter2.convert.Level.UTActor;

/**
 *
 * @author Hyperion
 */
public class UTVMinTurret extends UTActor{

    String otherdata="";

    public void AnalyseT3DData(String line)
    {
        parseOtherData(line);
    }

    public String toString()
    {
        String tmp="";
        tmp +="      Begin Actor Class=UTVehicleFactory_ShieldedTurret_Stinger Name=UTVehicleFactory_ShieldedTurret_Stinger_0 Archetype=UTVehicleFactory_ShieldedTurret_Stinger\'UTGameContent.Default__UTVehicleFactory_ShieldedTurret_Stinger\'\n";
        tmp +="         VehicleClass=Class\'UTGameContent.UTVehicle_ShieldedTurret_Stinger\'\n";
        tmp +="         bPathsChanged=True\n";
        tmp +="         Tag=\"UTVehicleFactory_ShieldedTurret_Stinger\"\n";
        tmp += getOtherdata();
        tmp +="         CollisionComponent=CylinderComponent\'CylinderComponent_1766\'\n";
        tmp +="         Name=\"UTVehicleFactory_ShieldedTurret_Stinger_0\"\n";
        tmp +="         ObjectArchetype=UTVehicleFactory_ShieldedTurret_Stinger\'UTGameContent.Default__UTVehicleFactory_ShieldedTurret_Stinger\'\n";
        tmp +="      End Actor\n";
        return tmp;
    }

}
