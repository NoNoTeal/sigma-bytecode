public class net.minecraft.client.main.Main {
    public void Main() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:Main)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
        var_1_64 : int
        var_3_6C : OptionParser
        var_1_2B9 : int
        var_4_2CC : ArgumentAcceptingOptionSpec
        var_1_2D2 : int
        var_5_301 : ArgumentAcceptingOptionSpec
        var_1_307 : int
        var_6_33E : ArgumentAcceptingOptionSpec
        var_1_344 : int
        var_7_35C : ArgumentAcceptingOptionSpec
        var_1_362 : int
        var_8_37A : ArgumentAcceptingOptionSpec
        var_1_380 : int
        var_1_39E : int
        var_10_3B1 : ArgumentAcceptingOptionSpec
        var_1_3B7 : int
        var_11_3E7 : ArgumentAcceptingOptionSpec
        var_1_3ED : int
        var_12_400 : ArgumentAcceptingOptionSpec
        var_1_406 : int
        var_13_419 : ArgumentAcceptingOptionSpec
        var_1_41F : int
        var_14_461 : ArgumentAcceptingOptionSpec
        var_1_467 : int
        var_15_47A : ArgumentAcceptingOptionSpec
        var_1_480 : int
        var_16_496 : ArgumentAcceptingOptionSpec
        var_1_49C : int
        var_17_4B2 : ArgumentAcceptingOptionSpec
        var_1_4B8 : int
        var_18_4E7 : ArgumentAcceptingOptionSpec
        var_1_4ED : int
        var_19_51C : ArgumentAcceptingOptionSpec
        var_1_522 : int
        var_20_53A : ArgumentAcceptingOptionSpec
        var_1_540 : int
        var_21_558 : ArgumentAcceptingOptionSpec
        var_1_55E : int
        var_22_589 : ArgumentAcceptingOptionSpec
        var_1_58F : int
        var_23_5BA : ArgumentAcceptingOptionSpec
        var_1_5C0 : int
        var_24_5D3 : ArgumentAcceptingOptionSpec
        var_1_5D9 : int
        var_25_604 : ArgumentAcceptingOptionSpec
        var_1_60A : int
        var_26_635 : ArgumentAcceptingOptionSpec
        var_1_63B : int
        var_27_640 : NonOptionArgumentSpec
        var_1_646 : int
        var_28_64C : OptionSet
        var_1_652 : int
        var_29_65A : List
        var_1_708 : int
        var_30_713 : String
        var_1_719 : int
        var_31_71D : Proxy
        var_1_851 : int
        var_32_85C : String
        var_1_9D3 : int
        var_33_86E : String
        var_1_A03 : int
        var_34_A11 : int
        var_1_A18 : int
        var_35_A26 : int
        var_1_A2D : int
        var_36_A3B : OptionalInt
        var_1_A42 : int
        var_37_A50 : OptionalInt
        var_1_A57 : int
        var_38_A68 : boolean
        var_1_A6F : int
        var_39_A80 : boolean
        var_1_A87 : int
        var_40_A98 : boolean
        var_1_A9F : int
        var_41_AB0 : boolean
        var_1_AB7 : int
        var_42_AC2 : String
        var_1_AC9 : int
        var_43_AE1 : Gson
        var_1_AE8 : int
        var_44_AFE : PropertyMap
        var_1_B05 : int
        var_45_B1B : PropertyMap
        var_1_B22 : int
        var_46_B2D : String
        var_1_B6D : int
        var_47_B3F : File
        stack_B99_0 : File [generated]
        var_1_B98 : int
        var_48_B99 : File
        var_1_BD0 : int
        stack_BFC_0 : File [generated]
        var_1_C2A : int
        var_49_BFC : File
        stack_C56_0 : String [generated]
        var_50_C56 : String
        var_51_C82 : String
        var_52_C8E : String
        var_53_C9A : Integer
        var_55_D2C : \uc29a\u6ec6\ub70c\u5bc4\u9255\u071d
        var_56_D40 : \u98a4\u8258\u74b1\u4bc8\u6bb9\u7ce1
        var_57_D81 : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1
        var_58_D8D : \uc2bd\ubf56\ud51e\ua61f\u4c04\u71f1
        var_59_DBB : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_58_DA9 : Throwable
        var_58_E09 : Thread
        var_59_E38 : Throwable
        var_59_E6A : InterruptedException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_64 = and:int(and:int(ldc:int(-1656837911), ldc:int(-1649685569)), ldc:int(-1623270151))
            var_3_6C = initobject:OptionParser(OptionParser::<init>)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-53657011))
                    goto(Label_0635)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(2)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1213270690))
                    goto(Label_0548)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0461)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0366)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(512)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-139345785))
                    goto(Label_0287)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1102097894))
                }
                else {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1087386305))
                    invokevirtual:void(OptionParser::allowsUnrecognizedOptions, var_3_6C:OptionParser)
                }
                
                Label_0192:
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(559618672))
                    goto(Label_0635)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0548)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(2120809442))
                    goto(Label_0461)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(2)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-466826206))
                    goto(Label_0366)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(1400005189))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1107318343))
                    invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(-28090), ldc:int(18616))))
                }
                
                Label_0287:
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1125284788))
                    goto(Label_0635)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0548)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0461)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(-1713431086))
                        loopcontinue()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-8655431))
                    invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-31998), ldc:int(-31997))))
                }
                
                Label_0366:
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(2)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-529224102))
                    goto(Label_0635)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1280016187))
                    goto(Label_0548)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1069876844))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0287)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(1910596129))
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-571212631))
                    invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(11387), ldc:int(2))))
                }
                
                Label_0461:
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0635)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(1735953117))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(1258175400))
                        goto(Label_0287)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(2)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(-1950334501))
                        loopcontinue()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1107362369))
                    invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(3), ldc:int(1363))))
                }
                
                Label_0548:
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1875561842))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(332121009))
                        goto(Label_0366)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0192)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(887023129))
                        loopcontinue()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-1121531073))
                    invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(1164), ldc:int(10292))))
                }
                
                Label_0635:
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0548)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(2)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-796570293))
                    goto(Label_0461)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0366)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0287)
                }
                
                if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_64 = and:int(var_1_64:int, ldc:int(-914578915))
                    goto(Label_0192)
                }
                
                if (cmpne:boolean(and:int(var_1_64:int, ldc:int(67108864)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_2B9 = and:int(var_1_64:int, ldc:int(-1644975109))
            var_4_2CC = invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(93), ldc:int(5383)))))
            var_1_2D2 = and:int(var_1_2B9:int, ldc:int(-1078022535))
            var_5_301 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(1414), ldc:int(25198))))), ldc:Class<Integer>(java.lang.Integer.class)), invokestatic:Integer[expected:Object](Integer::valueOf, xor:int(ldc:int(32023), ldc:int(7882))), newarray:Integer[][expected:Object[]](java.lang.Integer.class, and:int(ldc:int(-25242), ldc:int(17049))))
            var_1_307 = and:int(var_1_2D2:int, ldc:int(-546120915))
            var_6_33E = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-32758), ldc:int(-32755))))), ldc:Class<File>(java.io.File.class)), initobject:File[expected:Object](File::<init>, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(294), ldc:int(302)))), newarray:File[][expected:Object[]](java.io.File.class, and:int(ldc:int(22786), ldc:int(-22787))))
            var_1_344 = and:int(var_1_307:int, ldc:int(-583100245))
            var_7_35C = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(1053), ldc:int(10281))))), ldc:Class<File>(java.io.File.class))
            var_1_362 = and:int(var_1_344:int, ldc:int(-551104773))
            var_8_37A = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(18954), ldc:int(27))))), ldc:Class<File>(java.io.File.class))
            var_1_380 = and:int(var_1_362:int, ldc:int(-545261141))
            invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(1419), ldc:int(523))))), ldc:Class<File>(java.io.File.class))
            var_1_39E = and:int(var_1_380:int, ldc:int(-537920019))
            var_10_3B1 = invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(2140), ldc:int(268)))))
            var_1_3B7 = and:int(var_1_39E:int, ldc:int(-1082746065))
            var_11_3E7 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(1053), ldc:int(24653))))), loadelement:String[expected:Object](getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(16430), ldc:int(4686))), newarray:String[][expected:Object[]](java.lang.String.class, and:int(ldc:int(28963), ldc:int(-31716)))), ldc:Class<Integer>(java.lang.Integer.class))
            var_1_3ED = and:int(var_1_3B7:int, ldc:int(-1320261))
            var_12_400 = invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(18495), ldc:int(15)))))
            var_1_406 = and:int(var_1_3ED:int, ldc:int(-37844881))
            var_13_419 = invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(8472), ldc:int(18)))))
            var_1_41F = and:int(var_1_406:int, ldc:int(-33912385))
            var_14_461 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(10391), ldc:int(21361))))), invokevirtual:String[expected:Object](StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(2966), ldc:int(16506)))), rem:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(1000L)))), newarray:String[][expected:Object[]](java.lang.String.class, and:int(ldc:int(-22195), ldc:int(22178))))
            var_1_467 = and:int(var_1_41F:int, ldc:int(-1645834771))
            var_15_47A = invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(115), ldc:int(20627)))))
            var_1_480 = and:int(var_1_467:int, ldc:int(-584922581))
            var_16_496 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::required, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(404), ldc:int(11828))))))
            var_1_49C = and:int(var_1_480:int, ldc:int(-570520583))
            var_17_4B2 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::required, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-32733), ldc:int(-32714))))))
            var_1_4B8 = and:int(var_1_49C:int, ldc:int(-1078023939))
            var_18_4E7 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(4125), ldc:int(4107))))), ldc:Class<Integer>(java.lang.Integer.class)), invokestatic:Integer[expected:Object](Integer::valueOf, xor:int(ldc:int(16609), ldc:int(17335))), newarray:Integer[][expected:Object[]](java.lang.Integer.class, and:int(ldc:int(-17668), ldc:int(17667))))
            var_1_4ED = and:int(var_1_4B8:int, ldc:int(-33583889))
            var_19_51C = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(5129), ldc:int(5150))))), ldc:Class<Integer>(java.lang.Integer.class)), invokestatic:Integer[expected:Object](Integer::valueOf, xor:int(ldc:int(-28126), ldc:int(-27710))), newarray:Integer[][expected:Object[]](java.lang.Integer.class, and:int(ldc:int(26757), ldc:int(-26774))))
            var_1_522 = and:int(var_1_4ED:int, ldc:int(-1644963415))
            var_20_53A = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(2364), ldc:int(5850))))), ldc:Class<Integer>(java.lang.Integer.class))
            var_1_540 = and:int(var_1_522:int, ldc:int(-545603777))
            var_21_558 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::ofType, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(541), ldc:int(18651))))), ldc:Class<Integer>(java.lang.Integer.class))
            var_1_55E = and:int(var_1_540:int, ldc:int(-10048069))
            var_22_589 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(16394), ldc:int(16400))))), loadelement:String[expected:Object](getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(25275), ldc:int(4187))), newarray:String[][expected:Object[]](java.lang.String.class, and:int(ldc:int(1304), ldc:int(-1305))))
            var_1_58F = and:int(var_1_55E:int, ldc:int(-1657012241))
            var_23_5BA = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-29695), ldc:int(-29667))))), loadelement:String[expected:Object](getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-32499), ldc:int(-32490))), newarray:String[][expected:Object[]](java.lang.String.class, and:int(ldc:int(-29923), ldc:int(29858))))
            var_1_5C0 = and:int(var_1_58F:int, ldc:int(-33898567))
            var_24_5D3 = invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-32493), ldc:int(-32498)))))
            var_1_5D9 = and:int(var_1_5C0:int, ldc:int(-5260999))
            var_25_604 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(8456), ldc:int(8470))))), loadelement:String[expected:Object](getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(10303), ldc:int(287))), newarray:String[][expected:Object[]](java.lang.String.class, and:int(ldc:int(2722), ldc:int(-2979))))
            var_1_60A = and:int(var_1_5D9:int, ldc:int(-34342529))
            var_26_635 = invokevirtual:ArgumentAcceptingOptionSpec(ArgumentAcceptingOptionSpec::defaultsTo, invokevirtual:ArgumentAcceptingOptionSpec(OptionSpecBuilder::withRequiredArg, invokevirtual:OptionSpecBuilder(OptionParser::accepts, var_3_6C:OptionParser, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(32), ldc:int(5172))))), loadelement:String[expected:Object](getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(16547), ldc:int(8317))), newarray:String[][expected:Object[]](java.lang.String.class, and:int(ldc:int(-14798), ldc:int(2509))))
            var_1_63B = and:int(var_1_60A:int, ldc:int(-574633815))
            var_27_640 = invokevirtual:NonOptionArgumentSpec(OptionParser::nonOptions, var_3_6C:OptionParser)
            var_1_646 = and:int(var_1_63B:int, ldc:int(-1109131463))
            var_28_64C = invokevirtual:OptionSet(OptionParser::parse, var_3_6C:OptionParser, p0:String[])
            var_1_652 = and:int(var_1_646:int, ldc:int(-583271635))
            var_29_65A = invokevirtual:List(OptionSet::valuesOf, var_28_64C:OptionSet, var_27_640:OptionSpec)
            
            loop {
                if (cmpne:boolean(and:int(var_1_652:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1775)
                }
                
                if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1706)
                }
                
                if (cmpne:boolean(and:int(var_1_652:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_652 = and:int(var_1_652:int, ldc:int(-46744579))
                    
                    if (invokeinterface:boolean(List::isEmpty, var_29_65A:List)) {
                        goto(Label_1775)
                    }
                }
                
                Label_1664:
                
                if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(8)), ldc:int(0))) {
                    var_1_652 = and:int(var_1_652:int, ldc:int(623068453))
                    goto(Label_1775)
                }
                
                if (cmpne:boolean(and:int(var_1_652:int, ldc:int(2)), ldc:int(0))) {
                    var_1_652 = and:int(var_1_652:int, ldc:int(761263187))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_652 = and:int(var_1_652:int, ldc:int(-538194899))
                }
                
                Label_1706:
                
                if (cmpne:boolean(and:int(var_1_652:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_652 = and:int(var_1_652:int, ldc:int(565148404))
                        loopcontinue()
                    }
                    
                    var_1_652 = and:int(var_1_652:int, ldc:int(-1623791313))
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-14312), ldc:int(-14278)))), var_29_65A:List[expected:Object])))
                }
                
                Label_1775:
                
                if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1706)
                }
                
                if (cmpne:boolean(and:int(var_1_652:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1664)
                }
                
                if (cmpeq:boolean(and:int(var_1_652:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_708 = and:int(var_1_652:int, ldc:int(-576259397))
            var_30_713 = checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_10_3B1:OptionSpec))
            var_1_719 = and:int(var_1_708:int, ldc:int(-1082738497))
            var_31_71D = getstatic:Proxy(Proxy::NO_PROXY)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(32)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(841744611))
                    goto(Label_2069)
                }
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(760229144))
                    goto(Label_2017)
                }
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(-1233862678))
                    goto(Label_1926)
                }
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(-542180439))
                    
                    if (cmpeq:boolean(var_30_713:String, aconstnull:String())) {
                        goto(Label_2069)
                    }
                }
                
                Label_1885:
                
                if (cmpne:boolean(and:int(var_1_719:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(2023923825))
                    goto(Label_2069)
                }
                
                if (cmpne:boolean(and:int(var_1_719:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_2017)
                }
                
                if (cmpne:boolean(and:int(var_1_719:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_719:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_719 = and:int(var_1_719:int, ldc:int(-1648907525))
                }
                
                try {
                    Label_1926:
                    
                    while (cmpne:boolean(and:int(var_1_719:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_719:int, ldc:int(2)), ldc:int(0))) {
                            var_1_719 = and:int(var_1_719:int, ldc:int(-1700671523))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_719:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Block_114)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_719:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Block_115)
                            }
                            
                            var_1_719 = and:int(var_1_719:int, ldc:int(-1116804165))
                            var_31_71D = initobject:Proxy(Proxy::<init>, getstatic:Type(Type::SOCKS), initobject:InetSocketAddress[expected:SocketAddress](InetSocketAddress::<init>, var_30_713:String, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokestatic:Integer(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_11_3E7:OptionSpec)))))
                        }
                        
                        Label_2017:
                        
                        if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Block_116)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_719:int, ldc:int(32)), ldc:int(0))) {
                            goto(Block_117)
                        }
                    }
                    
                    goto(Label_2069)
                    Block_114:
                    var_1_719 = and:int(var_1_719:int, ldc:int(-275361746))
                    goto(Label_1885)
                    Block_115:
                    var_1_719 = and:int(var_1_719:int, ldc:int(326771137))
                    loopcontinue()
                    Block_116:
                    var_1_719 = and:int(var_1_719:int, ldc:int(-418954464))
                    goto(Label_2069)
                    Block_117:
                    
                    if (cmpne:boolean(and:int(var_1_719:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_719 = and:int(var_1_719:int, ldc:int(-38548997))
                }
                catch (java.lang.Exception stack_813_0) {
                }
                
                Label_2069:
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_2017)
                }
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(-1707262033))
                    goto(Label_1926)
                }
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_719 = and:int(var_1_719:int, ldc:int(1316343640))
                    goto(Label_1885)
                }
                
                if (cmpeq:boolean(and:int(var_1_719:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_719 = and:int(var_1_719:int, ldc:int(631329056))
            }
            
            var_1_851 = and:int(var_1_719:int, ldc:int(-1658155671))
            var_32_85C = checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_12_400:OptionSpec))
            var_1_9D3 = and:int(var_1_851:int, ldc:int(-571761603))
            var_33_86E = checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_13_419:OptionSpec))
            
            loop {
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1354852067))
                    goto(Label_2487)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-992961901))
                    goto(Label_2423)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_2337)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_2288)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(1575229425))
                }
                else {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-572265795))
                    
                    if (invokevirtual:boolean(Proxy::equals, var_31_71D:Proxy, getstatic:Proxy[expected:Object](Proxy::NO_PROXY))) {
                        goto(Label_2487)
                    }
                }
                
                Label_2239:
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2487)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_2423)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_2337)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1611928275))
                    
                    if (logicalnot:boolean(invokestatic:boolean(Main::\u3c25\u8413\u7e3f\u56bd\u71ae\uc29a, var_32_85C:String))) {
                        goto(Label_2487)
                    }
                }
                
                Label_2288:
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_2487)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2423)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_2239)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-42803717))
                    
                    if (logicalnot:boolean(invokestatic:boolean(Main::\u3c25\u8413\u7e3f\u56bd\u71ae\uc29a, var_33_86E:String))) {
                        goto(Label_2487)
                    }
                }
                
                Label_2337:
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(1866612529))
                    goto(Label_2487)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(1)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1106418614))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_9D3 = and:int(var_1_9D3:int, ldc:int(1650917751))
                        goto(Label_2288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_9D3 = and:int(var_1_9D3:int, ldc:int(1002290861))
                        goto(Label_2239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(1)), ldc:int(0))) {
                        var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-663333561))
                        loopcontinue()
                    }
                    
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1620067015))
                }
                
                Label_2423:
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_2337)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(2)), ldc:int(0))) {
                        var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1199227878))
                        goto(Label_2288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_2239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1644242179))
                    invokestatic:void(Authenticator::setDefault, initobject:\u494c\u5db4\u8d98\ub7dc\ubefe\u6b5f(\u494c\u5db4\u8d98\ub7dc\ubefe\u6b5f::<init>, var_32_85C:String, var_33_86E:String))
                }
                
                Label_2487:
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(134217728)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(1736966538))
                    goto(Label_2423)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1437221132))
                    goto(Label_2337)
                }
                
                if (cmpeq:boolean(and:int(var_1_9D3:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1248197124))
                    goto(Label_2288)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_9D3 = and:int(var_1_9D3:int, ldc:int(-1694088172))
                    goto(Label_2239)
                }
                
                if (cmpne:boolean(and:int(var_1_9D3:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_A03 = and:int(var_1_9D3:int, ldc:int(-547174229))
            var_34_A11 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokestatic:Integer(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_18_4E7:OptionSpec)))
            var_1_A18 = and:int(var_1_A03:int, ldc:int(-1107374929))
            var_35_A26 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokestatic:Integer(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_19_51C:OptionSpec)))
            var_1_A2D = and:int(var_1_A18:int, ldc:int(-615443))
            var_36_A3B = invokestatic:OptionalInt(Main::\u4c2b\u51b2\u4f4a\u839e\u600f\u4d85, checkcast:Integer(java.lang.Integer.class, invokestatic:Integer(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_20_53A:OptionSpec)))
            var_1_A42 = and:int(var_1_A2D:int, ldc:int(-1623278849))
            var_37_A50 = invokestatic:OptionalInt(Main::\u4c2b\u51b2\u4f4a\u839e\u600f\u4d85, checkcast:Integer(java.lang.Integer.class, invokestatic:Integer(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_21_558:OptionSpec)))
            var_1_A57 = and:int(var_1_A42:int, ldc:int(-1083727953))
            var_38_A68 = invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(1667), ldc:int(1664))))
            var_1_A6F = and:int(var_1_A57:int, ldc:int(-607765))
            var_39_A80 = invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(2073), ldc:int(-2074))))
            var_1_A87 = and:int(var_1_A6F:int, ldc:int(-808021))
            var_40_A98 = invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(-32736), ldc:int(-32735))))
            var_1_A9F = and:int(var_1_A87:int, ldc:int(-39064771))
            var_41_AB0 = invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(4546), ldc:int(18998))))
            var_1_AB7 = and:int(var_1_A9F:int, ldc:int(-13963793))
            var_42_AC2 = checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_17_4B2:OptionSpec))
            var_1_AC9 = and:int(var_1_AB7:int, ldc:int(-4215575))
            var_43_AE1 = invokevirtual:Gson(GsonBuilder::create, invokevirtual:GsonBuilder(GsonBuilder::registerTypeAdapter, initobject:GsonBuilder(GsonBuilder::<init>), ldc:Class<PropertyMap>[expected:Type](com.mojang.authlib.properties.PropertyMap.class), initobject:PropertyMap$Serializer[expected:Object](PropertyMap$Serializer::<init>)))
            var_1_AE8 = and:int(var_1_AC9:int, ldc:int(-47789393))
            var_44_AFE = checkcast:PropertyMap(com.mojang.authlib.properties.PropertyMap.class, invokestatic:PropertyMap(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u0a06\u6d99\u71f1\u527a\uc87f\u98a4, var_43_AE1:Gson, checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_22_589:OptionSpec)), ldc:Class<PropertyMap>(com.mojang.authlib.properties.PropertyMap.class)))
            var_1_B05 = and:int(var_1_AE8:int, ldc:int(-1079002117))
            var_45_B1B = checkcast:PropertyMap(com.mojang.authlib.properties.PropertyMap.class, invokestatic:PropertyMap(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u0a06\u6d99\u71f1\u527a\uc87f\u98a4, var_43_AE1:Gson, checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_23_5BA:OptionSpec)), ldc:Class<PropertyMap>(com.mojang.authlib.properties.PropertyMap.class)))
            var_1_B22 = and:int(var_1_B05:int, ldc:int(-38286789))
            var_46_B2D = checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_26_635:OptionSpec))
            var_1_B6D = and:int(var_1_B22:int, ldc:int(-1652650771))
            var_47_B3F = checkcast:File(java.io.File.class, invokestatic:File(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_6_33E:OptionSpec))
            
            do {
                if (cmpne:boolean(and:int(var_1_B6D:int, ldc:int(16)), ldc:int(0))) {
                    var_1_B6D = and:int(var_1_B6D:int, ldc:int(789359534))
                }
                else {
                    var_1_B6D = and:int(var_1_B6D:int, ldc:int(-550269955))
                    
                    if (invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, var_7_35C:OptionSpec)) {
                        loopcontinue()
                    }
                    
                    stack_B99_0 = initobject:File(File::<init>, var_47_B3F:File, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(16547), ldc:int(115))))
                    Label_2963:
                    var_1_B98 = and:int(var_1_B6D:int, ldc:int(-571281939))
                    var_48_B99 = stack_B99_0:File
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_B98:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_BD0 = and:int(var_1_B98:int, ldc:int(555062808))
                        }
                        else {
                            var_1_BD0 = and:int(var_1_B98:int, ldc:int(-43062913))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, var_8_37A:OptionSpec))) {
                                stack_BFC_0 = initobject:File(File::<init>, var_47_B3F:File, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(25097), ldc:int(25133))))
                                looporswitchbreak()
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_1_BD0:int, ldc:int(32)), ldc:int(0))) {
                            var_1_BD0 = and:int(var_1_BD0:int, ldc:int(-34345543))
                            stack_BFC_0 = checkcast:File(java.io.File.class, invokestatic:File(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_8_37A:OptionSpec))
                            looporswitchbreak()
                        }
                        
                        var_1_B98 = and:int(var_1_BD0:int, ldc:int(1829575466))
                    }
                    
                    var_1_C2A = and:int(var_1_BD0:int, ldc:int(-47988869))
                    var_49_BFC = stack_BFC_0:File
                    
                    do {
                        if (cmpeq:boolean(and:int(var_1_C2A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_C2A = and:int(var_1_C2A:int, ldc:int(1296366967))
                        }
                        else {
                            var_1_C2A = and:int(var_1_C2A:int, ldc:int(-1657562693))
                            
                            if (invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, var_15_47A:OptionSpec)) {
                                loopcontinue()
                            }
                            
                            stack_C56_0 = invokevirtual:String(UUID::toString, invokestatic:UUID(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b, checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](OptionSpec::value, var_14_461:OptionSpec, var_28_64C:OptionSet))))
                            Label_3152:
                            var_50_C56 = stack_C56_0:String
                            var_51_C82 = ternaryop:String(invokevirtual:boolean(OptionSet::has, var_28_64C:OptionSet, var_24_5D3:OptionSpec), checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](OptionSpec::value, var_24_5D3:OptionSpec, var_28_64C:OptionSet)), aconstnull:String())
                            var_52_C8E = checkcast:String(java.lang.String.class, invokestatic:String(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_4_2CC:OptionSpec))
                            var_53_C9A = checkcast:Integer(java.lang.Integer.class, invokestatic:Integer(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_5_301:OptionSpec))
                            invokestatic:void(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8d98\ud36e\u8c8a\u0c95\u927d\u5140)
                            invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u3a62\u3e2a\ucb79\u67e9\u4e72\u88c5)
                            invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\ub8be\u5140\u5bc4\ufcaf\ud4fe\ub18d)
                            invokestatic:void(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u527a\u8cae\u8aa5\uc4d2\uc246)
                            var_55_D2C = initobject:\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d(\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d::<init>, initobject:\u5fe1\u6435\ud217\u183a\u8cae\u1833(\u5fe1\u6435\ud217\u183a\u8cae\u1833::<init>, initobject:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::<init>, checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](OptionSpec::value, var_14_461:OptionSpec, var_28_64C:OptionSet)), var_50_C56:String, checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](OptionSpec::value, var_16_496:OptionSpec, var_28_64C:OptionSet)), checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](OptionSpec::value, var_25_604:OptionSpec, var_28_64C:OptionSet))), var_44_AFE:PropertyMap, var_45_B1B:PropertyMap, var_31_71D:Proxy), initobject:\u6bb9\ua068\u6c56\u071d\u946b\u36d3(\u6bb9\ua068\u6c56\u071d\u946b\u36d3::<init>, var_34_A11:int, var_35_A26:int, var_36_A3B:OptionalInt, var_37_A50:OptionalInt, var_38_A68:boolean), initobject:\u4f52\ub171\ucfaf\u8d98\u40a9\u64ab(\u4f52\ub171\ucfaf\u8d98\u40a9\u64ab::<init>, var_47_B3F:File, var_49_BFC:File, var_48_B99:File, var_51_C82:String), initobject:\u8709\u6d69\uafe7\u3c25\u0b8e\u6fb0(\u8709\u6d69\uafe7\u3c25\u0b8e\u6fb0::<init>, var_39_A80:boolean, var_42_AC2:String, var_46_B2D:String, var_40_A98:boolean, var_41_AB0:boolean), initobject:\u385b\u64ab\ud171\u5654\u494c\u8258(\u385b\u64ab\ud171\u5654\u494c\u8258::<init>, var_52_C8E:String, invokevirtual:int(Integer::intValue, var_53_C9A:Integer)))
                            var_56_D40 = initobject:\u98a4\u8258\u74b1\u4bc8\u6bb9\u7ce1(\u98a4\u8258\u74b1\u4bc8\u6bb9\u7ce1::<init>, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(37), ldc:int(11637))))
                            invokevirtual:void(Thread::setUncaughtExceptionHandler, var_56_D40:\u98a4\u8258\u74b1\u4bc8\u6bb9\u7ce1[expected:Thread], initobject:\u9a18\u7bad\u5db4\u6d99\u7873\u59ec[expected:UncaughtExceptionHandler](\u9a18\u7bad\u5db4\u6d99\u7873\u59ec::<init>, getstatic:Logger(Main::\ube23\u392e\u4f4a\u9033\u97e6\u0800)))
                            invokevirtual:void(Runtime::addShutdownHook, invokestatic:Runtime(Runtime::getRuntime), var_56_D40:\u98a4\u8258\u74b1\u4bc8\u6bb9\u7ce1[expected:Thread])
                            invokespecial:\u8c8a\ua61f\ub19c\u6bb9\u385b(\u8c8a\ua61f\ub19c\u6bb9\u385b::<init>, __new:\u8c8a\ua61f\ub19c\u6bb9\u385b(\u56bd\u8413\u647c\u5bc4\ud158.\u8c8a\ua61f\ub19c\u6bb9\u385b.class))
                            
                            try {
                                invokevirtual:void(Thread::setName, invokestatic:Thread(Thread::currentThread), loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(20343), ldc:int(166))))
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae5d\ufe34\u4975\u0a06\u416d\ud171)
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u647c\u4f52\ubb2b\u760c\u34df\ud171)
                                var_57_D81 = initobject:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::<init>, var_55_D2C:\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d)
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ub113\u8413\u385b\u6fb0\u12cb\u7e3f)
                            }
                            catch (\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc2bd\ubf56\ud51e\ua61f\u4c04\u71f1 var_58_D8D) {
                                invokeinterface:void(Logger::warn, getstatic:Logger(Main::\ube23\u392e\u4f4a\u9033\u97e6\u0800), loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(6711), ldc:int(303))), var_58_D8D:\uc2bd\ubf56\ud51e\ua61f\u4c04\u71f1[expected:Throwable])
                                return:void()
                            }
                            catch (java.lang.Throwable var_58_DA9) {
                                var_59_DBB = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_58_DA9:Throwable, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(22561), ldc:int(22537))))
                                invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8c8a\u6b0d\uae87\u7330\u446c\uc9f6, var_59_DBB:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(8381), ldc:int(3371))))
                                invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud523\uae5d\ubb2b\u7006\u965f\u92ee, checkcast:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9.class, aconstnull:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9()), getfield:String(\u8709\u6d69\uafe7\u3c25\u0b8e\u6fb0::\ub19c\u416d\u5245\ud523\ub102\u6bb9, getfield:\u8709\u6d69\uafe7\u3c25\u0b8e\u6fb0(\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d::\u52d3\u927d\u4c04\u3504\u5d20\u392e, var_55_D2C:\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d)), checkcast:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3.class, aconstnull:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3()), var_59_DBB:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
                                invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u8753\ub171\ua3b4\u8709\ucef1, var_59_DBB:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
                                return:void()
                            }
                            
                            if (invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud158\u385b\u56bd\u98a4\uc238\u960f, var_57_D81:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)) {
                                var_58_E09 = initobject:\uae5d\u3d64\u7330\ubff1\u93a2\u2dcc[expected:Thread](\uae5d\u3d64\u7330\ubff1\u93a2\u2dcc::<init>, loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(13342), ldc:int(13364))), var_57_D81:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                                invokevirtual:void(Thread::start, var_58_E09:Thread)
                                
                                while (invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4e72\u3d4b\uc87f\u51fa\u516c\u67d0, var_57_D81:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)) {
                                }
                                
                                goto(Label_3663)
                            }
                            
                            var_58_E09 = aconstnull:Thread()
                            
                            try {
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubb2b\u6bb9\u64f2\u16f6\u97b7\ub70c, and:int[expected:boolean](ldc:int(25363), ldc:int(-25372)))
                                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::run, var_57_D81:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                            }
                            catch (java.lang.Throwable var_59_E38) {
                                invokeinterface:void(Logger::error, getstatic:Logger(Main::\ube23\u392e\u4f4a\u9033\u97e6\u0800), loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), and:int(ldc:int(683), ldc:int(17451))), var_59_E38:Throwable)
                            }
                            
                            try {
                                Label_3663:
                                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ua068\u64ab\u6bb9\u52d3\u99f7\ud523, var_57_D81:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                                
                                if (cmpne:boolean(var_58_E09:Thread, aconstnull:Thread())) {
                                    invokevirtual:void(Thread::join, var_58_E09:Thread)
                                }
                            }
                            catch (java.lang.InterruptedException var_59_E6A) {
                                invokeinterface:void(Logger::error, getstatic:Logger(Main::\ube23\u392e\u4f4a\u9033\u97e6\u0800), loadelement:String(getstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e), xor:int(ldc:int(413), ldc:int(433))), var_59_E6A:InterruptedException[expected:Throwable])
                            }
                            finally {
                                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u7043\uc9f6\u3504\ubff1\u97e6, var_57_D81:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                            }
                            
                            return:void()
                        }
                    } while (cmpeq:boolean(and:int(var_1_C2A:int, ldc:int(1)), ldc:int(0)))
                    
                    var_1_C2A = and:int(var_1_C2A:int, ldc:int(-1611232903))
                    stack_C56_0 = checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](OptionSpec::value, var_15_47A:OptionSpec, var_28_64C:OptionSet))
                    goto(Label_3152)
                }
            } while (cmpeq:boolean(and:int(var_1_B6D:int, ldc:int(2147483647)), ldc:int(0)))
            
            var_1_B6D = and:int(var_1_B6D:int, ldc:int(-1111753361))
            stack_B99_0 = checkcast:File(java.io.File.class, invokestatic:File(Main::\u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56, var_28_64C:OptionSet, var_7_35C:OptionSpec))
            goto(Label_2963)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.OptionalInt \u4c2b\u51b2\u4f4a\u839e\u600f\u4d85(java.lang.Integer p0) {
        var_1_61 : int
        stack_83_0 : OptionalInt [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-492734299), ldc:int(1879133481))
            
            if (cmpeq:boolean(p0:Integer, aconstnull:Integer())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2133051881))
                stack_83_0 = invokestatic:OptionalInt(OptionalInt::empty)
            }
            else {
                stack_83_0 = invokestatic:OptionalInt(OptionalInt::of, invokevirtual:int(Integer::intValue, p0:Integer))
            }
            
            return:OptionalInt(stack_83_0:OptionalInt)
        }
        
        goto(Label_0006)
    }
    
    private static T \u927d\uafe7\ub19c\u5fe1\u3bc9\u6c56(joptsimple.OptionSet p0, joptsimple.OptionSpec<T> p1) {
        var_2_61 : int
        stack_73_0 : Object [generated]
        var_4_78 : Throwable
        var_2_C9 : int
        var_5_CE : ArgumentAcceptingOptionSpec
        var_2_D5 : int
        var_6_DB : List
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(98221917), ldc:int(1391700813))
            
            try {
                var_2_61 = and:int(var_2_61:int, ldc:int(1734294381))
                stack_73_0 = invokevirtual:Object(OptionSet::valueOf, p0:OptionSet, p1:OptionSpec)
                var_2_61 = and:int(var_2_61:int, ldc:int(1625243503))
                return:T(stack_73_0:Object)
            }
            catch (java.lang.Throwable var_4_78) {
                loop {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1354088023))
                        goto(Label_0180)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(64)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-2013352066))
                        
                        if (logicalnot:boolean(instanceof:boolean(joptsimple.ArgumentAcceptingOptionSpec.class, p1:ArgumentAcceptingOptionSpec))) {
                            athrow(var_4_78:Throwable)
                        }
                    }
                    
                    Label_0159:
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_61 = and:int(var_2_61:int, ldc:int(903528429))
                    }
                    
                    Label_0180:
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_C9 = and:int(var_2_61:int, ldc:int(1733995517))
                var_5_CE = checkcast:ArgumentAcceptingOptionSpec(joptsimple.ArgumentAcceptingOptionSpec.class, p1:ArgumentAcceptingOptionSpec)
                var_2_D5 = and:int(var_2_C9:int, ldc:int(-59560977))
                var_6_DB = invokevirtual:List(ArgumentAcceptingOptionSpec::defaultValues, var_5_CE:ArgumentAcceptingOptionSpec)
                
                do {
                    if (cmpeq:boolean(and:int(var_2_D5:int, ldc:int(64)), ldc:int(0))) {
                        var_2_D5 = and:int(var_2_D5:int, ldc:int(-1044817231))
                    }
                    else {
                        var_2_D5 = and:int(var_2_D5:int, ldc:int(986906477))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_6_DB:List))) {
                            loopcontinue()
                        }
                        
                        athrow(var_4_78:Throwable)
                    }
                } while (cmpeq:boolean(and:int(var_2_D5:int, ldc:int(8192)), ldc:int(0)))
                
                return:T(invokeinterface:T(List<T>::get, var_6_DB:List<T>, and:int(ldc:int(21267), ldc:int(-23316))))
            }
            
            athrow(var_4_78:Throwable)
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u3c25\u8413\u7e3f\u56bd\u71ae\uc29a(java.lang.String p0) {
        var_1_61 : int
        stack_95_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-1598633056), ldc:int(-320999443))
            
            if (logicaland:boolean(cmpne:boolean(p0:String, aconstnull:String()), logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p0:String)))) {
                stack_95_0 = xor:int(ldc:int(-32718), ldc:int(-32717))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-376190027))
                stack_95_0 = and:int(ldc:int(2457), ldc:int(-2458))
            }
            
            return:boolean(stack_95_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u6c52\u9033\u56bd\ub8be\u88c5\ucfaf() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Logger(getstatic:Logger(Main::\ube23\u392e\u4f4a\u9033\u97e6\u0800))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_694 : int
        expr_6E : int [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_113_0 : byte[] [generated]
        stack_115_0 : byte[] [generated]
        stack_140_0 : byte[] [generated]
        stack_6AE_0 : byte[] [generated]
        stack_6EC_0 : byte[] [generated]
        stack_764_0 : byte[] [generated]
        stack_7D9_0 : byte[] [generated]
        var_4_680 : int
        var_3_685 : byte[]
        var_5_686 : int
        expr_764 : byte [generated]
        var_0_7CF : int
        expr_7D9 : byte [generated]
        stack_809_2 : byte [generated]
        var_2_AC : byte[]
        expr_B0 : int [generated]
        var_3_6DA : byte[]
        var_5_6DB : int
        expr_E7 : int [generated]
        expr_115 : int [generated]
        var_3_14C : String
        expr_154 : String[] [generated]
        expr_15E : String[] [generated]
        var_3_65D : String[]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_694 = and:int(ldc:int(-2108616661), ldc:int(-1298066628))
        expr_6E = arraylength:int(stack_AC_0 = stack_AE_0 = stack_E5_0 = stack_E7_0 = stack_113_0 = stack_115_0 = stack_140_0 = stack_6AE_0 = stack_6EC_0 = stack_764_0 = stack_7D9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bNB8jEhcbncUpN9RsAS7jl87c2NdwLMLYMSgmCy/j4yya1iYp1kPi1ZXn1icDZDPjMeLsmPQ3zRBxBtwvN5fMJSziZSyG1Szh4mc7nSUkJtd3z5clJAAkc+Eu1cLd2tjiAJ0lLKDWdtXUdjGGOC3g4XfW9ZTF2d0X4wkrN9d3xtPUJTsoAefaL9UC2ivfzefbLNgB59o34yzYos/g4eALN9w31gnEKuDU4DyaJDMk13fS09U33jEx4tUllSrYJzfh2Tnn4HEm3C8m4M3Z2yY23Col3OMkKDfaL8zW59QoOzE349YDodIw1dtmNvnjMMrXDd7bxDfBKSgKMgXgyzDSwtYo1M83Ny3fCiXbMivU2DPn6TDYMNoNN+HIM930PigkJQja2zPWLdQ02Scy4t7e3NUlKSkrMuLe3tzaxNQmLdwHLCskMOLi3t7c29jg4S3gL98m4/YnPOfbEdncKy/hLt2Y2gHi7hQt19Ii4iY4LtYx19MtKCc3ONY329rj1NbMKiQ31gYt2uIx4dolOi/C1DPY3hfbKzfAxCzY1hIrKjfC1TPY1hfaKyrHKd3e4C7n4Mc32jfWA+A34dXW08bYMP83AS3hCiU34dXXM8bYMjCWNiklKiDhN+Dn1TDU4tzS490k1gYt2uIlMOPjJsQy59UxA8YvM83n1SkoKNcH0t4rLt8kJd8kLN7fJcopKd8rPMQlJCQ2hoK9r7f")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_680 = expr_6E:int
        var_3_685 = newarray:byte[](byte.class, expr_6E:int)
        var_5_686 = expr_6E:int
        Label_1672:
        
        while (cmpne:boolean(and:int(var_0_694:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_694:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_1843)
            }
            
            var_0_694 = and:int(var_0_694:int, ldc:int(-1483754949))
            var_5_686 = add:int(var_5_686:int, ldc:int(-1))
            storeelement:byte(var_3_685:byte[], var_5_686:int, add:byte(xor:byte(loadelement:byte(stack_6AE_0:byte[], var_5_686:int), ldc:byte(113)), ldc:byte(18)))
            
            if (cmpne:boolean(var_5_686:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_E5_0 = stack_E7_0 = stack_113_0 = stack_115_0 = stack_140_0 = stack_6AE_0 = stack_6EC_0 = stack_764_0 = stack_7D9_0 = var_3_685:byte[]
            goto(Label_0115)
        }
        
        var_0_694 = and:int(var_0_694:int, ldc:int(1672130117))
        goto(Label_1961)
        Label_1843:
        
        while (cmpne:boolean(and:int(var_0_694:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_694:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_694 = and:int(var_0_694:int, ldc:int(1058193884))
                goto(Label_1672)
            }
            
            var_0_694 = and:int(var_0_694:int, ldc:int(-268567825))
            var_5_686 = add:int(var_5_686:int, ldc:int(-1))
            expr_764 = loadelement:byte(stack_764_0:byte[], var_5_686:int)
            storeelement:byte(var_3_685:byte[], var_5_686:int, or:int(and:int(shl:int(expr_764:byte, and:int(ldc:int(21077), ldc:int(11270))), ldc:int(-16)), and:int(shr:int(expr_764:byte[expected:int], and:int(ldc:int(1413), ldc:int(8734))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_686:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_E5_0 = stack_E7_0 = stack_113_0 = stack_115_0 = stack_140_0 = stack_6AE_0 = stack_6EC_0 = stack_764_0 = stack_7D9_0 = var_3_685:byte[]
            goto(Label_0236)
        }
        
        var_0_694 = and:int(var_0_694:int, ldc:int(-289169151))
        Label_1961:
        
        while (cmpeq:boolean(and:int(var_0_694:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_694:int, ldc:int(65536)), ldc:int(0))) {
                var_0_694 = and:int(var_0_694:int, ldc:int(-2036588401))
                goto(Label_1672)
            }
            
            var_0_7CF = and:int(var_0_694:int, ldc:int(-498216787))
            var_5_686 = add:int(var_5_686:int, ldc:int(-1))
            expr_7D9 = loadelement:byte(stack_7D9_0:byte[], var_5_686:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_686:int, ldc:int(5)), neg:int(var_4_680:int)), ldc:int(0))) {
                var_0_7CF = and:int(var_0_7CF:int, ldc:int(-1493363345))
                stack_809_2 = add:byte(expr_7D9:byte, ldc:byte(5))
            }
            else {
                stack_809_2 = add:byte(expr_7D9:byte, loadelement:byte(var_3_685:byte[], add:int(var_5_686:int, ldc:int(5))))
            }
            
            var_0_694 = and:int(var_0_7CF:int, ldc:int(-159917202))
            storeelement:byte(var_3_685:byte[], var_5_686:int, stack_809_2:byte)
            
            if (cmpne:boolean(var_5_686:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_E5_0 = stack_E7_0 = stack_113_0 = stack_115_0 = stack_140_0 = stack_6AE_0 = stack_6EC_0 = stack_764_0 = stack_7D9_0 = var_3_685:byte[]
            goto(Label_0282)
        }
        
        var_0_694 = and:int(var_0_694:int, ldc:int(-1145448557))
        goto(Label_1843)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_694 = and:int(var_0_694:int, ldc:int(-1004327159))
            goto(Label_0282)
        }
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(8192)), ldc:int(0))) {
            var_0_694 = and:int(var_0_694:int, ldc:int(-1553398348))
            goto(Label_0236)
        }
        
        if (cmpeq:boolean(and:int(var_0_694:int, ldc:int(8)), ldc:int(0))) {
            var_0_694 = and:int(var_0_694:int, ldc:int(1158369836))
        }
        else {
            var_0_694 = and:int(var_0_694:int, ldc:int(-483298071))
            var_2_AC = stack_AC_0:byte[]
            expr_B0 = add:int(arraylength:int(stack_AE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_3_6DA = newarray:byte[](byte.class, expr_B0:int)
                var_5_6DB = expr_B0:int
                
                loop {
                    var_0_694 = and:int(var_0_694:int, ldc:int(-1280206276))
                    var_5_6DB = add:int(var_5_6DB:int, ldc:int(-1))
                    storeelement:byte(var_3_6DA:byte[], var_5_6DB:int, add:int(shl:int(loadelement:byte(stack_6EC_0:byte[], var_5_6DB:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_AC:byte[], add:int(var_5_6DB:int, and:int(ldc:int(8713), ldc:int(6209)))), ldc:int(6)), xor:int(ldc:int(2082), ldc:int(2081)))))
                    
                    if (cmpne:boolean(var_5_6DB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AE_0 = stack_AC_0 = stack_E5_0 = stack_E7_0 = stack_113_0 = stack_115_0 = stack_140_0 = stack_6AE_0 = stack_6EC_0 = stack_764_0 = stack_7D9_0 = var_3_6DA:byte[]
            }
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_0_694:int, ldc:int(8)), ldc:int(0))) {
            var_0_694 = and:int(var_0_694:int, ldc:int(-739403860))
            goto(Label_0282)
        }
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_694 = and:int(var_0_694:int, ldc:int(-1894792141))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_694:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_694 = and:int(var_0_694:int, ldc:int(-542920321))
            expr_E7 = arraylength:int(stack_E7_0:byte[])
            
            if (cmpne:boolean(expr_E7:int, ldc:int(0))) {
                var_4_680 = expr_E7:int
                var_3_685 = newarray:byte[](byte.class, expr_E7:int)
                var_5_686 = expr_E7:int
                goto(Label_1843)
            }
        }
        
        Label_0236:
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_694:int, ldc:int(8)), ldc:int(0))) {
                var_0_694 = and:int(var_0_694:int, ldc:int(-347728160))
                goto(Label_0181)
            }
            
            if (cmpeq:boolean(and:int(var_0_694:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_694 = and:int(var_0_694:int, ldc:int(-1950149253))
            expr_115 = arraylength:int(stack_115_0:byte[])
            
            if (cmpne:boolean(expr_115:int, ldc:int(0))) {
                var_4_680 = expr_115:int
                var_3_685 = newarray:byte[](byte.class, expr_115:int)
                var_5_686 = expr_115:int
                goto(Label_1961)
            }
        }
        
        Label_0282:
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0236)
        }
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0181)
        }
        
        if (cmpne:boolean(and:int(var_0_694:int, ldc:int(32768)), ldc:int(0))) {
            var_0_694 = and:int(var_0_694:int, ldc:int(893791828))
            goto(Label_0115)
        }
        
        var_3_14C = initobject:String(String::<init>, stack_140_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12911), ldc:int(1455)))
        expr_15E = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(297), ldc:int(262)))
        storeelement:String(expr_15E:String[], and:int(ldc:int(11658), ldc:int(16461)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(19212), ldc:int(-23309)), xor:int(ldc:int(-20478), ldc:int(-20477))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(4119), ldc:int(4121)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(10754), ldc:int(10755)), and:int(ldc:int(22597), ldc:int(397))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(16472), ldc:int(16509)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(16647), ldc:int(2757)), xor:int(ldc:int(409), ldc:int(386))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(2082), ldc:int(1594)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(283), ldc:int(22683)), xor:int(ldc:int(1577), ldc:int(1552))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-23796), ldc:int(-23776)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(16), ldc:int(41)), and:int(ldc:int(8292), ldc:int(242))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(20663), ldc:int(8999)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(2118), ldc:int(2086)), xor:int(ldc:int(17423), ldc:int(17526))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(17199), ldc:int(42)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(5753), ldc:int(24953)), xor:int(ldc:int(-32657), ldc:int(-32533))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(17465), ldc:int(555)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(6310), ldc:int(16597)), and:int(ldc:int(17618), ldc:int(4242))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(4232), ldc:int(4256)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(16822), ldc:int(658)), xor:int(ldc:int(-21389), ldc:int(-21296))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(9302), ldc:int(9284)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(764), ldc:int(607)), and:int(ldc:int(5353), ldc:int(10409))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(294), ldc:int(16422)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(1193), ldc:int(10495)), xor:int(ldc:int(-29865), ldc:int(-29727))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(2324), ldc:int(2367)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(22198), ldc:int(191)), xor:int(ldc:int(-15170), ldc:int(-15248))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(57), ldc:int(45)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(18433), ldc:int(18639)), and:int(ldc:int(223), ldc:int(1785))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(315), ldc:int(294)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(217), ldc:int(8697)), and:int(ldc:int(227), ldc:int(20963))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(4135), ldc:int(187)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(17302), ldc:int(17269)), xor:int(ldc:int(189), ldc:int(87))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(13330), ldc:int(13339)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(144), ldc:int(122)), and:int(ldc:int(9459), ldc:int(251))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-32376), ldc:int(-32372)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(2188), ldc:int(2175)), xor:int(ldc:int(13489), ldc:int(13745))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(28831), ldc:int(75)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(2496), ldc:int(2240)), xor:int(ldc:int(-27945), ldc:int(-27684))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(-6557), ldc:int(6556)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(10223), ldc:int(22795)), and:int(ldc:int(6927), ldc:int(303))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(646), ldc:int(20770)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(17081), ldc:int(17334)), xor:int(ldc:int(16710), ldc:int(16476))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-16096), ldc:int(-16095)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(670), ldc:int(900)), and:int(ldc:int(812), ldc:int(12588))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-32757), ldc:int(-32760)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(3), ldc:int(303)), xor:int(ldc:int(274), ldc:int(36))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(1081), ldc:int(10911)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(19326), ldc:int(5430)), and:int(ldc:int(846), ldc:int(375))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(541), ldc:int(12344)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(21047), ldc:int(21361)), and:int(ldc:int(10613), ldc:int(17751))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(9351), ldc:int(20783)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(4447), ldc:int(981)), and:int(ldc:int(1372), ldc:int(17278))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(23), ldc:int(1047)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(4346), ldc:int(4518)), and:int(ldc:int(25578), ldc:int(358))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(160), ldc:int(141)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(17027), ldc:int(17377)), xor:int(ldc:int(16584), ldc:int(16827))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(16406), ldc:int(16393)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(28753), ldc:int(28962)), xor:int(ldc:int(16837), ldc:int(16572))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(8480), ldc:int(8486)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(377), ldc:int(377)), xor:int(ldc:int(4943), ldc:int(4658))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(81), ldc:int(77)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(235), ldc:int(406)), and:int(ldc:int(16271), ldc:int(398))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(4869), ldc:int(4873)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(500), ldc:int(122)), and:int(ldc:int(22935), ldc:int(1471))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(4141), ldc:int(4157)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(2007), ldc:int(16791)), and:int(ldc:int(9138), ldc:int(5600))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(16749), ldc:int(3725)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(482), ldc:int(4541)), and:int(ldc:int(441), ldc:int(2479))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(8271), ldc:int(6191)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(425), ldc:int(9657)), and:int(ldc:int(502), ldc:int(8626))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(654), ldc:int(687)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(14771), ldc:int(434)), xor:int(ldc:int(17611), ldc:int(17778))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(2826), ldc:int(13339)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(4250), ldc:int(4387)), and:int(ldc:int(19404), ldc:int(4600))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(14892), ldc:int(16868)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(250), ldc:int(306)), and:int(ldc:int(29654), ldc:int(503))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(3081), ldc:int(3084)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(28118), ldc:int(991)), xor:int(ldc:int(11744), ldc:int(11324))))
        storeelement:String(expr_154:String[], and:int(ldc:int(2606), ldc:int(8430)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(11158), ldc:int(10826)), xor:int(ldc:int(-32620), ldc:int(-32396))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(542), ldc:int(8475)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(-24466), ldc:int(-24178)), xor:int(ldc:int(4196), ldc:int(4490))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(670), ldc:int(6430)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(1116), ldc:int(1458)), and:int(ldc:int(8702), ldc:int(17911))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(4120), ldc:int(4105)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(8398), ldc:int(8504)), and:int(ldc:int(2046), ldc:int(6654))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(563), ldc:int(20887)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(28670), ldc:int(510)), and:int(ldc:int(770), ldc:int(3723))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(5141), ldc:int(18805)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(8378), ldc:int(8888)), and:int(ldc:int(2571), ldc:int(30697))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-32476), ldc:int(-32508)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(8713), ldc:int(17133)), and:int(ldc:int(790), ldc:int(532))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(4182), ldc:int(574)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(16677), ldc:int(17201)), xor:int(ldc:int(2936), ldc:int(2401))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(27), ldc:int(3675)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(24988), ldc:int(25477)), xor:int(ldc:int(3386), ldc:int(3873))))
        putstatic:String[](Main::\u12cb\ubf56\ud523\u3bc9\u52d3\ud36e, expr_15E:String[])
        var_3_65D = expr_154:String[]
        putstatic:Logger(Main::\ube23\u392e\u4f4a\u9033\u97e6\u0800, invokestatic:Logger(LogManager::getLogger))
        invokestatic:String(System::setProperty, loadelement:String(var_3_65D:String[], and:int(ldc:int(12989), ldc:int(45))), loadelement:String(var_3_65D:String[], xor:int(ldc:int(-31612), ldc:int(-31574))))
    }
    
    public void \u76bc\u3dd3\u946b\u51fa\u4d85\u392e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_632 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_63D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_632 = and:int(ldc:int(1258690673), ldc:int(2043048057))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:Main[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
            var_3_632 = and:int(var_3_632:int, ldc:int(-1640456723))
        }
        else {
            var_3_632 = and:int(var_3_632:int, ldc:int(-38471053))
            var_5_89 = and:int(ldc:int(1117), ldc:int(-3678))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14310), ldc:int(9061)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_632:int, ldc:int(1734296049))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, and:int(ldc:int(4741), ldc:int(17409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(277), ldc:int(21057)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_632 = and:int(var_3_D9:int, ldc:int(-376541703))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(3), ldc:int(817)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1342989903))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1680561181))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-649116467))
                    }
                    else {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-202941463))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0566)
                            }
                            
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0394:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(279262966))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1991842428))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1359992866))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1609755129))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1119412924))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1871661559))
                        var_11_EA = and:int(ldc:int(13845), ldc:int(-13846))
                        goto(Label_1474)
                    }
                    
                    Label_0566:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1127232474))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(986892376))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1745956945))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1383973884))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-471997315))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-466172415))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(2026900257))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1342673793))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-835060079))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-2051957252))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-374447387))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0819:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(578217094))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(807014404))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(468191980))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1644587078))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1609944683))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = and:int(ldc:int(1025), ldc:int(7009))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1845352182))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1355630615))
                            goto(Label_0819)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1308386029))
                        var_11_EA = and:int(ldc:int(-6087), ldc:int(5956))
                    }
                    
                    Label_1073:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-737829043))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(18240067))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(170397782))
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1728743095))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(707139114))
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1579536082))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-943264009))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1212:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1693661674))
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(87855914))
                            goto(Label_1073)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1506636773))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                            goto(Label_1474)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1324:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(534371555))
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-864189668))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(492430900))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-2122994619))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-629211087))
                        goto(Label_0394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1601505425))
                        loopcontinue()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(-980066961))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1474:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63D = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1485:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1732673015))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1645608333))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(284880555))
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-283284125))
                        var_17_63D = add:int(var_16_118:int, xor:int(ldc:int(16530), ldc:int(16531)))
                        looporswitchbreak()
                    }
                }
                
                var_3_632 = and:int(var_3_632:int, ldc:int(-909668637))
                
                if (cmple:boolean(var_5_89 = var_17_63D:int, sub:int(var_6_90:int, and:int(ldc:int(18753), ldc:int(9273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
