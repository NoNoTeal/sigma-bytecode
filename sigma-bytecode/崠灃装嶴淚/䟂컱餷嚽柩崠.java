public class \u5d20\u7043\u88c5\u5db4\uf94d.\u47c2\ucef1\u9937\u56bd\u67e9\u5d20 {
    public void \u47c2\ucef1\u9937\u56bd\u67e9\u5d20(\u5d20\u7043\u88c5\u5db4\uf94d.\u0c95\u67d0\u6435\u8350\u5140\u8d90 p0) {
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
            putfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90(\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u4cd9\u965f\u839e\u5654\u62da\u8753, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20, p0:\u0c95\u67d0\u6435\u8350\u5140\u8d90)
            invokespecial:Object(Object::<init>, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72 \u67d0\u6d69\u7af6\u59ec\u4492\u5654(java.lang.Object p0) {
        var_2_BE : int
        stack_BF_0 : TimeZone [generated]
        var_4_A3 : Calendar
        var_2_D1 : int
        var_5_DE : int
        var_6_F4 : int
        var_7_102 : int
        var_8_10B : int
        var_9_114 : int
        var_10_11D : int
        var_11_126 : int
        var_12_134 : StringBuilder
        var_2_578 : int
        var_13_5BF : int
        var_14_896 : int
        var_15_89D : int
        var_16_8A4 : int
        
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
            var_2_BE = and:int(ldc:int(1269676709), ldc:int(-1617576203))
            
            if (logicalnot:boolean(instanceof:boolean(java.util.Calendar.class, p0:Object))) {
                loop {
                    if (cmpne:boolean(and:int(var_2_BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_BE = and:int(var_2_BE:int, ldc:int(-1114642259))
                        
                        if (cmpeq:boolean(invokevirtual:TimeZone(\u0c95\u67d0\u6435\u8350\u5140\u8d90::\ua6bd\u7049\u8c8a\uc246\u69d9\ud4fe, getfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90(\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u4cd9\u965f\u839e\u5654\u62da\u8753, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20)), aconstnull:TimeZone())) {
                            stack_BF_0 = invokestatic:TimeZone(TimeZone::getTimeZone, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(13329), ldc:int(-13338))))
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_BE = and:int(var_2_BE:int, ldc:int(1205316533))
                        stack_BF_0 = getfield:TimeZone(\u0c95\u67d0\u6435\u8350\u5140\u8d90::\u67d0\uc910\u69d9\ub70c\u760c\uc2e8, getfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90(\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u4cd9\u965f\u839e\u5654\u62da\u8753, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20))
                        looporswitchbreak()
                    }
                    
                    var_2_BE = and:int(var_2_BE:int, ldc:int(268341794))
                }
                
                var_2_BE = and:int(var_2_BE:int, ldc:int(-1732264784))
                var_4_A3 = invokestatic:Calendar(Calendar::getInstance, stack_BF_0:TimeZone)
                invokevirtual:void(Calendar::setTime, var_4_A3:Calendar, checkcast:Date(java.util.Date.class, p0:Object[expected:Date]))
            }
            else {
                var_4_A3 = checkcast:Calendar(java.util.Calendar.class, p0:Object[expected:Calendar])
            }
            
            var_2_D1 = and:int(var_2_BE:int, ldc:int(1423948467))
            var_5_DE = invokevirtual:int(Calendar::get, var_4_A3:Calendar, and:int(ldc:int(20833), ldc:int(8223)))
            var_6_F4 = add:int(invokevirtual:int(Calendar::get, var_4_A3:Calendar, xor:int(ldc:int(4353), ldc:int(4355))), and:int(ldc:int(24843), ldc:int(2081)))
            var_7_102 = invokevirtual:int(Calendar::get, var_4_A3:Calendar, and:int(ldc:int(7309), ldc:int(8213)))
            var_8_10B = invokevirtual:int(Calendar::get, var_4_A3:Calendar, ldc:int(11))
            var_9_114 = invokevirtual:int(Calendar::get, var_4_A3:Calendar, ldc:int(12))
            var_10_11D = invokevirtual:int(Calendar::get, var_4_A3:Calendar, ldc:int(13))
            var_11_126 = invokevirtual:int(Calendar::get, var_4_A3:Calendar, ldc:int(14))
            var_12_134 = initobject:StringBuilder(StringBuilder::<init>, invokestatic:String(String::valueOf, var_5_DE:int))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2004)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1824)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-879573784))
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1294)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(276337916))
                    goto(Label_1163)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1013)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-28148025))
                    goto(Label_0863)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0721)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-2111129370))
                    goto(Label_0563)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1089450158))
                    
                    if (cmplt:boolean(invokevirtual:int(StringBuilder::length, var_12_134:StringBuilder), and:int(ldc:int(9284), ldc:int(36)))) {
                        invokevirtual:StringBuilder(StringBuilder::insert, var_12_134:StringBuilder, and:int(ldc:int(26690), ldc:int(-30819)), loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(16961), ldc:int(2235))))
                        loopcontinue()
                    }
                }
                
                Label_0432:
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_2004)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1824)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1130660303))
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-2071568923))
                    goto(Label_1294)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1768043376))
                    goto(Label_1163)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1013)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0863)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0721)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1794079273))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-824721942))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(10), ldc:int(7906))))
                    
                    if (cmplt:boolean(var_6_F4:int, ldc:int(10))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(26405), ldc:int(17))))
                    }
                }
                
                Label_0563:
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1227452349))
                    goto(Label_2004)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1352751014))
                    goto(Label_1824)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-716857119))
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1294)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1665607236))
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1013)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0863)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-1540967268))
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(679352157))
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1117776060))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, invokestatic:String(String::valueOf, var_6_F4:int))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), xor:int(ldc:int(8472), ldc:int(8474))))
                    
                    if (cmplt:boolean(var_7_102:int, ldc:int(10))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(18243), ldc:int(33))))
                    }
                }
                
                Label_0721:
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(227531916))
                    goto(Label_2004)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1824)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1710)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1294)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_1013)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1947498542))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-1621554666))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(529812148))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1061830683))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, invokestatic:String(String::valueOf, var_7_102:int))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), xor:int(ldc:int(1089), ldc:int(1090))))
                    
                    if (cmplt:boolean(var_8_10B:int, ldc:int(10))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(515), ldc:int(20557))))
                    }
                }
                
                Label_0863:
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1417904984))
                    goto(Label_2004)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(191696547))
                    goto(Label_1824)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1294)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1163)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1500089898))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(18483608))
                        goto(Label_0721)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-1617118997))
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-19401233))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, invokestatic:String(String::valueOf, var_8_10B:int))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(17460), ldc:int(12550))))
                    
                    if (cmplt:boolean(var_9_114:int, ldc:int(10))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(2321), ldc:int(21673))))
                    }
                }
                
                Label_1013:
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2004)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1864012548))
                    goto(Label_1824)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1860656730))
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-468565157))
                    goto(Label_1294)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(2036490748))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-605432854))
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-68307715))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, invokestatic:String(String::valueOf, var_9_114:int))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(8204), ldc:int(4853))))
                    
                    if (cmplt:boolean(var_10_11D:int, ldc:int(10))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), xor:int(ldc:int(-31216), ldc:int(-31215))))
                    }
                }
                
                Label_1163:
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_2004)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(947668792))
                    goto(Label_1824)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(91476162))
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(414472587))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(387568232))
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(973365419))
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-843728450))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, invokestatic:String(String::valueOf, var_10_11D:int))
                    
                    if (cmpgt:boolean(var_11_126:int, ldc:int(0))) {
                        if (cmpge:boolean(var_11_126:int, ldc:int(10))) {
                            goto(Label_1710)
                        }
                        
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), xor:int(ldc:int(16413), ldc:int(16408))))
                        goto(Label_2004)
                    }
                }
                
                Label_1294:
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1970995841))
                    goto(Label_2004)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_1824)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-720708460))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-995230702))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(547683060))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_1710:
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_2004)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-405660049))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(2139542270))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-715327584))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-847341019))
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-592581912))
                    
                    if (cmplt:boolean(var_11_126:int, ldc:int(100))) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), and:int(ldc:int(142), ldc:int(1078))))
                        goto(Label_2004)
                    }
                }
                
                Label_1824:
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(438756148))
                        goto(Label_1710)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-1978113747))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-480740480))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-1035087634))
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32)), ldc:int(0))) {
                        var_2_D1 = and:int(var_2_D1:int, ldc:int(-1651844655))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1147817538))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, loadelement:String(getstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4), xor:int(ldc:int(1025), ldc:int(1030))))
                }
                
                Label_2004:
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1824)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(1777201472))
                    goto(Label_1710)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-764494698))
                    goto(Label_1294)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1839637131))
                    goto(Label_1163)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1013)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-284518787))
                    goto(Label_0863)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(256)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1148155541))
                    goto(Label_0721)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0563)
                }
                
                if (cmpeq:boolean(and:int(var_2_D1:int, ldc:int(128)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(-1723505505))
                    goto(Label_0432)
                }
                
                if (cmpne:boolean(and:int(var_2_D1:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_D1 = and:int(var_2_D1:int, ldc:int(734508724))
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, invokestatic:String(String::valueOf, var_11_126:int))
                    goto(Label_1294)
                }
            }
            
            var_2_578 = and:int(var_2_D1:int, ldc:int(1334158011))
            var_13_5BF = invokevirtual:int(TimeZone::getOffset, invokevirtual:TimeZone(Calendar::getTimeZone, var_4_A3:Calendar), invokevirtual:int(Calendar::get, var_4_A3:Calendar, and:int(ldc:int(61), ldc:int(-128))), invokevirtual:int(Calendar::get, var_4_A3:Calendar, and:int(ldc:int(27653), ldc:int(457))), invokevirtual:int(Calendar::get, var_4_A3:Calendar, and:int(ldc:int(290), ldc:int(11906))), invokevirtual:int(Calendar::get, var_4_A3:Calendar, xor:int(ldc:int(8837), ldc:int(8832))), invokevirtual:int(Calendar::get, var_4_A3:Calendar, ldc:int(7)), invokevirtual:int(Calendar::get, var_4_A3:Calendar, ldc:int(14)))
            
            if (cmpne:boolean(var_13_5BF:int, ldc:int(0))) {
                loop {
                    if (cmpne:boolean(and:int(var_2_578:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_578 = and:int(var_2_578:int, ldc:int(-1098196502))
                        goto(Label_2174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_578:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_578 = and:int(var_2_578:int, ldc:int(-910036202))
                    }
                    else {
                        var_2_578 = and:int(var_2_578:int, ldc:int(-1728726792))
                        
                        if (cmplt:boolean(var_13_5BF:int, ldc:int(0))) {
                            invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, ldc:char(45))
                            var_13_5BF = mul:int(var_13_5BF:int, ldc:int(-1))
                            goto(Label_2174)
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpeq:boolean(and:int(var_2_578:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_578:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_578 = and:int(var_2_578:int, ldc:int(1770911719))
                        invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, ldc:char(43))
                    }
                    
                    Label_2174:
                    
                    if (cmpne:boolean(and:int(var_2_578:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_578:int, ldc:int(32)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_14_896 = div:int(var_13_5BF:int, ldc:int(60000))
                var_15_89D = div:int(var_14_896:int, ldc:int(60))
                var_16_8A4 = rem:int(var_14_896:int, ldc:int(60))
                
                if (cmplt:boolean(var_15_89D:int, ldc:int(10))) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, ldc:char(48))
                }
                
                invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, var_15_89D:int)
                invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, ldc:char(58))
                
                if (cmplt:boolean(var_16_8A4:int, ldc:int(10))) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, ldc:char(48))
                }
                
                invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, var_16_8A4:int)
            }
            else {
                invokevirtual:StringBuilder(StringBuilder::append, var_12_134:StringBuilder, ldc:char(90))
            }
            
            return:\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72(invokevirtual:\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72(\u1833\u92ff\u36d3\u4492\u8c8a\u120d::\u12cb\u61a4\ubff1\u8258\u93a2\u93a2, getfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90[expected:\u1833\u92ff\u36d3\u4492\u8c8a\u120d](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u4cd9\u965f\u839e\u5654\u62da\u8753, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20), invokevirtual:\u6c52\u8308\u4c2b\u120d\u0a06\u4179(\u0c95\u67d0\u6435\u8350\u5140\u8d90::\u965f\u3d64\uceb8\u3a62\u67d0\u0b8e, getfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90(\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u4cd9\u965f\u839e\u5654\u62da\u8753, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20), invokevirtual:Class<?>(Object::getClass, p0:Object), getstatic:\u6c52\u8308\u4c2b\u120d\u0a06\u4179(\u6c52\u8308\u4c2b\u120d\u0a06\u4179::\u74b1\u12b2\ub6ab\u7d52\ufe34\uc29a)), invokevirtual:String(StringBuilder::toString, var_12_134:StringBuilder), getstatic:\u7d52\uf94d\u4daf\u34df\u873d\u516c(\u7d52\uf94d\u4daf\u34df\u873d\u516c::\uc238\u6c56\u71ae\ub8be\u6435\u4c04)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_23D : int
        expr_6B : int [generated]
        stack_A1_0 : byte[] [generated]
        stack_A3_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_D2_0 : byte[] [generated]
        stack_F8_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_250_0 : byte[] [generated]
        stack_2CD_0 : byte[] [generated]
        stack_308_0 : byte[] [generated]
        stack_35E_0 : byte[] [generated]
        var_4_229 : int
        var_3_22E : byte[]
        var_5_22F : int
        var_0_246 : int
        expr_250 : byte [generated]
        stack_290_2 : byte [generated]
        stack_26D_0 : byte [generated]
        expr_A3 : int [generated]
        var_2_D0 : byte[]
        expr_D4 : int [generated]
        var_3_2F6 : byte[]
        var_5_2F7 : int
        expr_FA : int [generated]
        var_3_34C : byte[]
        var_5_34D : int
        expr_361 : byte [generated]
        var_3_132 : String
        stack_222_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_23D = and:int(ldc:int(1115344188), ldc:int(-806375557))
        expr_6B = arraylength:int(stack_A1_0 = stack_A3_0 = stack_D0_0 = stack_D2_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_250_0 = stack_2CD_0 = stack_308_0 = stack_35E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BMADgX+EAP6BmMBBPOc=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_229 = expr_6B:int
        var_3_22E = newarray:byte[](byte.class, expr_6B:int)
        var_5_22F = expr_6B:int
        Label_0561:
        
        while (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_246 = and:int(var_0_23D:int, ldc:int(-946614471))
            var_5_22F = add:int(var_5_22F:int, ldc:int(-1))
            expr_250 = stack_290_2 = loadelement(stack_250_0, var_5_22F)
            
            if (cmplt:boolean(add:int(add:int(var_5_22F:int, ldc:int(1)), neg:int(var_4_229:int)), ldc:int(0))) {
                stack_290_2 = stack_26D_0 = add:byte(expr_250:byte, loadelement:byte(var_3_22E:byte[], add:int(var_5_22F:int, ldc:int(1))))
                goto(Label_0637)
            }
            
            Label_0605:
            
            if (cmpne:boolean(and:int(var_0_246:int, ldc:int(2048)), ldc:int(0))) {
                var_0_246 = and:int(var_0_246:int, ldc:int(511216889))
                stack_290_2 = stack_26D_0 = add:byte(expr_250:byte, ldc:byte(1))
            }
            
            Label_0637:
            
            if (cmpeq:boolean(and:int(var_0_246:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0605)
            }
            
            var_0_23D = and:int(var_0_246:int, ldc:int(732073148))
            storeelement:byte(var_3_22E:byte[], var_5_22F:int, stack_290_2:byte)
            
            if (cmpne:boolean(var_5_22F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A3_0 = stack_A1_0 = stack_D0_0 = stack_D2_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_250_0 = stack_2CD_0 = stack_308_0 = stack_35E_0 = var_3_22E:byte[]
            goto(Label_0112)
        }
        
        var_0_23D = and:int(var_0_23D:int, ldc:int(724789386))
        Label_0694:
        
        while (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(1)), ldc:int(0))) {
            var_0_23D = and:int(var_0_23D:int, ldc:int(-2109956296))
            var_5_22F = add:int(var_5_22F:int, ldc:int(-1))
            storeelement:byte(var_3_22E:byte[], var_5_22F:int, add:byte(loadelement:byte(stack_2CD_0:byte[], var_5_22F:int), ldc:byte(124)))
            
            if (cmpne:boolean(var_5_22F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A3_0 = stack_A1_0 = stack_D0_0 = stack_D2_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_250_0 = stack_2CD_0 = stack_308_0 = stack_35E_0 = var_3_22E:byte[]
            goto(Label_0168)
        }
        
        goto(Label_0561)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0255)
        }
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(512)), ldc:int(0))) {
            var_0_23D = and:int(var_0_23D:int, ldc:int(415914479))
            goto(Label_0217)
        }
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_23D = and:int(var_0_23D:int, ldc:int(1663515326))
        }
        else {
            var_0_23D = and:int(var_0_23D:int, ldc:int(-541033155))
            expr_A3 = arraylength:int(stack_A3_0:byte[])
            
            if (cmpne:boolean(expr_A3:int, ldc:int(0))) {
                var_4_229 = expr_A3:int
                var_3_22E = newarray:byte[](byte.class, expr_A3:int)
                var_5_22F = expr_A3:int
                goto(Label_0694)
            }
        }
        
        Label_0168:
        
        if (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0255)
        }
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(2)), ldc:int(0))) {
                var_0_23D = and:int(var_0_23D:int, ldc:int(-72303338))
                goto(Label_0112)
            }
            
            var_0_23D = and:int(var_0_23D:int, ldc:int(-1508860294))
            var_2_D0 = stack_D0_0:byte[]
            expr_D4 = add:int(arraylength:int(stack_D2_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D4:int, ldc:int(0))) {
                var_3_2F6 = newarray:byte[](byte.class, expr_D4:int)
                var_5_2F7 = expr_D4:int
                
                loop {
                    var_0_23D = and:int(var_0_23D:int, ldc:int(111684985))
                    var_5_2F7 = add:int(var_5_2F7:int, ldc:int(-1))
                    storeelement:byte(var_3_2F6:byte[], var_5_2F7:int, add:int(shl:int(loadelement:byte(stack_308_0:byte[], var_5_2F7:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_D0:byte[], add:int(var_5_2F7:int, xor:int(ldc:int(802), ldc:int(803)))), ldc:int(2)), xor:int(ldc:int(17221), ldc:int(17274)))))
                    
                    if (cmpne:boolean(var_5_2F7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A3_0 = stack_A1_0 = stack_D0_0 = stack_D2_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_250_0 = stack_2CD_0 = stack_308_0 = stack_35E_0 = var_3_2F6:byte[]
            }
        }
        
        Label_0217:
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0168)
            }
            
            if (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_23D = and:int(var_0_23D:int, ldc:int(1665052537))
            expr_FA = arraylength:int(stack_FA_0:byte[])
            
            if (cmpne:boolean(expr_FA:int, ldc:int(0))) {
                var_3_34C = newarray:byte[](byte.class, expr_FA:int)
                var_5_34D = expr_FA:int
                
                loop {
                    var_0_23D = and:int(var_0_23D:int, ldc:int(-545673223))
                    var_5_34D = add:int(var_5_34D:int, ldc:int(-1))
                    expr_361 = xor:byte(loadelement:byte(stack_35E_0:byte[], var_5_34D:int), ldc:byte(45))
                    storeelement:byte(var_3_34C:byte[], var_5_34D:int, or:int(and:int(shl:int(expr_361:byte, and:int(ldc:int(694), ldc:int(29701))), ldc:int(-16)), and:int(shr:int(expr_361:byte[expected:int], xor:int(ldc:int(1026), ldc:int(1030))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_34D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A3_0 = stack_A1_0 = stack_D0_0 = stack_D2_0 = stack_F8_0 = stack_FA_0 = stack_126_0 = stack_250_0 = stack_2CD_0 = stack_308_0 = stack_35E_0 = var_3_34C:byte[]
            }
        }
        
        Label_0255:
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0217)
        }
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(2)), ldc:int(0))) {
            var_0_23D = and:int(var_0_23D:int, ldc:int(194954853))
            goto(Label_0168)
        }
        
        if (cmpne:boolean(and:int(var_0_23D:int, ldc:int(8)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_222_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(368), ldc:int(376)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32252), ldc:int(-32244)))
            storeelement:String(expr_144:String[], and:int(ldc:int(322), ldc:int(5794)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-20514), ldc:int(20513)), xor:int(ldc:int(15), ldc:int(14))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(1286), ldc:int(1281)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(16397), ldc:int(16396)), xor:int(ldc:int(1), ldc:int(3))))
            storeelement:String(expr_144:String[], and:int(ldc:int(4102), ldc:int(38)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(9490), ldc:int(22662)), xor:int(ldc:int(17925), ldc:int(17921))))
            storeelement:String(expr_144:String[], and:int(ldc:int(8205), ldc:int(22677)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(1043), ldc:int(1047)), xor:int(ldc:int(650), ldc:int(653))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(17432), ldc:int(17433)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(11271), ldc:int(4167)), and:int(ldc:int(2954), ldc:int(25688))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(132), ldc:int(128)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2186), ldc:int(4108)), and:int(ldc:int(4361), ldc:int(1051))))
            storeelement:String(expr_144:String[], and:int(ldc:int(515), ldc:int(6227)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(24649), ldc:int(2729)), and:int(ldc:int(14), ldc:int(2826))))
            storeelement:String(expr_144:String[], and:int(ldc:int(5946), ldc:int(-5947)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16490), ldc:int(1050)), xor:int(ldc:int(10245), ldc:int(10248))))
            putstatic:String[](\u47c2\ucef1\u9937\u56bd\u67e9\u5d20::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ub19c\ucfaf\ua6bd\ubded\u183a\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_649 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_654 : int
        
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
        var_3_649 = and:int(ldc:int(1880917647), ldc:int(-559965557))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u47c2\ucef1\u9937\u56bd\u67e9\u5d20[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_649 = and:int(var_3_649:int, ldc:int(-132231169))
            var_5_81 = and:int(ldc:int(12034), ldc:int(-12035))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1063), ldc:int(-1384)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_649:int, ldc:int(-914418705))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, and:int(ldc:int(16513), ldc:int(19)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(73), ldc:int(4149)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_649 = and:int(var_3_D9:int, ldc:int(-490788689))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(9729), ldc:int(16391)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1482947652))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(256)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1041294444))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(930973347))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-138348476))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(569999799))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1054447749))
                    }
                    else {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1703791103))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1438406132))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1856933135))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(2104091130))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-769748593))
                        var_11_EA = and:int(ldc:int(-28024), ldc:int(19826))
                        goto(Label_1479)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1218739682))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-95868730))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-2014264827))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-318965265))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-241762654))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(191756185))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1692942453))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1923601087))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-757583842))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-168949253))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0837:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(256)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-591405040))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1218076547))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(860202425))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(939272808))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-167940177))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = and:int(ldc:int(129), ldc:int(513))
                                goto(Label_1098)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-418918605))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(206801001))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-15973729))
                        var_11_EA = and:int(ldc:int(8066), ldc:int(-8067))
                    }
                    
                    Label_1098:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(865951523))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1865324289))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-931617212))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(699824588))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-727879457))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1346)
                            }
                        }
                    }
                    
                    Label_1221:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1098)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(144695394))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-944570025))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(1904209503))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(1842242495))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1346:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1231616157))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-252695195))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1772325104))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(256)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1684998858))
                        loopcontinue()
                    }
                    
                    var_3_649 = and:int(var_3_649:int, ldc:int(1642022043))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_654 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-483040455))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1811679181))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(300949832))
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1951893043))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1091340783))
                        var_17_654 = add:int(var_16_118:int, xor:int(ldc:int(-7936), ldc:int(-7935)))
                        looporswitchbreak()
                    }
                    
                    var_3_649 = and:int(var_3_649:int, ldc:int(1396354736))
                }
                
                var_3_649 = and:int(var_3_649:int, ldc:int(1545514495))
                
                if (cmple:boolean(var_5_81 = var_17_654:int, sub:int(var_6_88:int, xor:int(ldc:int(20576), ldc:int(20577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_649 = and:int(var_3_649:int, ldc:int(-585237640))
            goto(Label_0108)
        }
    }
}
