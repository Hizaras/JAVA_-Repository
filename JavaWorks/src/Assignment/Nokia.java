package Assignment;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                                
                List of Menu Functions -
                                
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                
                0. Cancel
                """);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> phoneBookMenu(input);
            case 2 -> messageMenu(input);
            case 3 -> {
                System.out.println("""
                        Chat -
                                                
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 4 -> callRegisterMenu(input);
            case 5 -> toneMenu(input);
            case 6 -> settingMenu(input);
            case 7 -> {
                System.out.println("""
                        Call divert -
                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 8 -> {
                System.out.println("""
                        Games -
                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 9 -> {
                System.out.println("""
                        Calculator -
                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 10 -> {
                System.out.println("""
                        Reminders -
                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 11 -> clockMenu(input);
            case 12 -> {
                System.out.println("""
                        Profile -
                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 13 -> {
                System.out.println("""
                        SIM service -
                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 0 -> {
                break;
            }
        }
    }

    private static void clockMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Clock -
                                    
                1. Alarm clock
                2. Clock setting
                3. Date setting
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                                    
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Alarm clock -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    clockMenu(input);
                }
            }

            case 2 -> {
                System.out.println("""
                         Clock setting -
                         
                         0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    clockMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Date setting -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    clockMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Stopwatch -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    clockMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Countdown timer -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    clockMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Auto update of date and time -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    clockMenu(input);
                }
            }
            case 0 -> mainMenu();
        }
    }

    private static void settingMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Settings -
                                    
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                                    
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> callSettingsMenu(input);
            case 2 -> phoneSettingsMenu(input);
            case 3 -> securitySettingsMenu(input);
            case 4 -> {
                System.out.println("""
                        Restore factory settings -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 0 -> mainMenu();

        }
    }

    private static void securitySettingsMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Security settings -
                                                    
                1. PIN code request
                2. Call baring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access code
                                                    
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                         PIN code request -
                         
                         0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    securitySettingsMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Call baring service -
                                                                        
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    securitySettingsMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Fixed dialling -
                                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    securitySettingsMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Closed user group -
                                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    securitySettingsMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                         Phone security -
                         
                         0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    securitySettingsMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Change access code -
                                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    securitySettingsMenu(input);
                }
            }
            case 0 -> settingMenu(input);
        }
    }

    private static void phoneSettingsMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Phone settings -
                                                    
                1. Language
                2. Call info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions
                                                    
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                         Language -
                         
                         0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneSettingsMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Call info display -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneSettingsMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Fixed dialling -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneSettingsMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Network selection -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneSettingsMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Lights -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneSettingsMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Confirm SIM service actions -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneSettingsMenu(input);
                }
            }
            case 0 -> settingMenu(input);
        }
    }

    private static void callSettingsMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Call settings -
                                                
                1. Automatic redial
                2. Speed dialling
                3. Call waiting
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                                         
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Automatic redial -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                         Speed dialling -
                         
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Call waiting -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Own number sending -
                                                            
                        0.Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Phone line in use -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Automatic answer -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    settingMenu(input);
                }
            }
            case 0 -> settingMenu(input);
        }
    }


    private static void toneMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Tones -
                                    
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                                    
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Ringing tone -
                                                
                         0. Back                      
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                         Ringing volume -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Incoming call alert -
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Composer -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Message alert tone -
                                                    
                        0.Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Keypad tones -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 7 -> {
                System.out.println("""
                        Warning and game tones -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 8 -> {
                System.out.println("""
                        Vibrating alert -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 9 -> {
                System.out.println("""
                        Screen saver
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    toneMenu(input);
                }
            }
            case 0 -> mainMenu();

        }
    }

    private static void callRegisterMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Call register -
                                        
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call list
                5. Show call duration
                6. Show call cost
                7. Call cost settings
                8. Prepaid credit
                                        
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Missed calls -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callRegisterMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Received calls -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callRegisterMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Dialled calls -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callRegisterMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Erase recent call list -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callRegisterMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Show call duration -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callRegisterMenu(input);
                }
            }
            case 6 -> callCostMenu(input);
            case 7 -> callCostSettings(input);
            case 8 -> {
                System.out.println("""
                        Prepaid credit
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callRegisterMenu(input);
                }
            }
            case 0 -> mainMenu();
        }
    }

    private static void callCostSettings(Scanner input) {
        int userInput;
        System.out.println("""
                Call cost settings -
                                            
                1. Call cost limit
                2. Show costs in
                                            
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Call cost limit -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callCostSettings(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Show costs in -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callCostSettings(input);
                }
            }
            case 0 -> callRegisterMenu(input);
        }
    }

    private static void callCostMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Show call costs -
                                            
                1. Show call cost
                2. Last call cost
                3. Clear counters
                                            
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Show call cost -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callCostMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Last call cost -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callCostMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Clear counters -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    callCostMenu(input);
                }
            }
            case 0 -> callRegisterMenu(input);
        }
    }

    private static void messageMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Messages -
                                        
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5.Templates
                6. Smileys
                7. Message setting
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                                        
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Write messages-
                                                        
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Inbox-
                                                        
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Outbox -
                                                        
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Picture messages -
                                                        
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Templates-
                                                
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Smileys-
                                                
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 7 -> messageSettings(input);
            case 8 -> {
                System.out.println("""
                        Info services -
                                                
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 9 -> {
                System.out.println("""
                        Voice mailbox number-
                                                
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 10 -> {
                System.out.println("""
                        Service command editor-
                                                
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    messageMenu(input);
                }
            }
            case 0 -> mainMenu();
        }
    }

    private static void messageSettings(Scanner input) {
        int userInput;
        System.out.println("""
                Message settings-
                                                
                1. Set
                2. Common
                                        
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> setMenu(input);
            case 2 -> commonMenu(input);
            case 0 -> messageMenu(input);
        }
    }

    private static void commonMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Common -
                                                        
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                                                       
                0. Back
                """);

        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Delivery reports -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    commonMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Reply via same centre -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    commonMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Character support -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    commonMenu(input);
                }
            }
            case 0 -> messageSettings(input);
        }
    }

    private static void setMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Set 1 -
                                                        
                1. Message centre number
                2. Message sent as
                3. Message validity
                                                        
                0. Back
                    """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Message centre number -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    setMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Message sent as -
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    setMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Message validity
                                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    setMenu(input);
                }
            }
            case 0 -> messageSettings(input);
        }
    }

    private static void phoneBookMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Phonebook -
                                        
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                                        
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Search -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Service Nos. -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 3 -> {
                System.out.println("""
                        Add name -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 4 -> {
                System.out.println("""
                        Erase -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 5 -> {
                System.out.println("""
                        Edit -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 6 -> {
                System.out.println("""
                        Assign tone -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 7 -> {
                System.out.println("""
                        Send b'card -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 8 -> optionMenu(input);
            case 9 -> {
                System.out.println("""
                        Speed dials -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 10 -> {
                System.out.println("""
                        Voice tags -
                                                    
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phoneBookMenu(input);
                }
            }
            case 0 -> mainMenu();
        }
    }

    private static void optionMenu(Scanner input) {
        int userInput;
        System.out.println("""
                Options -
                
                1. Type of view
                2. Memory status
                                            
                0. Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Type of view -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    optionMenu(input);
                }
            }
            case 2 -> {
                System.out.println("""
                        Memory status -
                                                            
                        0. Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    optionMenu(input);
                }
            }
            case 0 -> phoneBookMenu(input);
        }
    }
}
