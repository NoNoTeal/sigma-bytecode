public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1 {
    public void \u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1() {
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
            invokespecial:Object(Object::<init>, this:\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\ufcaf\u3c25\u071d\u97b7.\u718f\ub102\u6fb0\ub171\ud4fe\u64ab \u8bb0\uc229\u8aa5\ubefe\u52d3\uceb8(java.lang.String p0) {
        var_3_67 : Matcher
        var_4_7B : Matcher
        var_5_91 : Matcher
        var_6_A7 : Matcher
        var_7_BD : Matcher
        var_8_D3 : Matcher
        var_9_E9 : Matcher
        var_10_FF : Matcher
        
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
        var_3_67 = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u0b8e\u92ee\ubb2b\u92ff\u3d64\u183a), p0:String[expected:CharSequence])
        
        if (invokevirtual:boolean(Matcher::matches, var_3_67:Matcher)) {
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, xor:int(ldc:int(516), ldc:int(517)), invokevirtual:String(Matcher::group, var_3_67:Matcher, and:int(ldc:int(25681), ldc:int(905))), loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), and:int(ldc:int(-13615), ldc:int(13350))), p0:String))
        }
        
        var_4_7B = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u99f7\ub171\uc246\u8aa5\ub70c\ua61f), p0:String[expected:CharSequence])
        
        if (invokevirtual:boolean(Matcher::matches, var_4_7B:Matcher)) {
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, xor:int(ldc:int(-24527), ldc:int(-24525)), invokevirtual:String(Matcher::group, var_4_7B:Matcher, and:int(ldc:int(4515), ldc:int(16457))), loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), and:int(ldc:int(-18950), ldc:int(18949))), p0:String))
        }
        
        var_5_91 = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\ucef1\u88c5\u8709\ua6bd\u3504\u92ee), p0:String[expected:CharSequence])
        
        if (invokevirtual:boolean(Matcher::matches, var_5_91:Matcher)) {
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, ldc:int(6), invokevirtual:String(Matcher::group, var_5_91:Matcher, xor:int(ldc:int(4677), ldc:int(4679))), invokevirtual:String(Matcher::group, var_5_91:Matcher, and:int(ldc:int(2063), ldc:int(1571))), p0:String))
        }
        
        var_6_A7 = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u946b\u3dd3\u2dcc\uc246\u1187\uff55), p0:String[expected:CharSequence])
        
        if (invokevirtual:boolean(Matcher::matches, var_6_A7:Matcher)) {
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, and:int(ldc:int(8867), ldc:int(1347)), invokevirtual:String(Matcher::group, var_6_A7:Matcher, and:int(ldc:int(29219), ldc:int(277))), invokevirtual:String(Matcher::group, var_6_A7:Matcher, and:int(ldc:int(8322), ldc:int(4099))), p0:String))
        }
        
        var_7_BD = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u71ae\u61a4\u385b\u965f\u7c6b\u4975), p0:String[expected:CharSequence])
        
        if (invokevirtual:boolean(Matcher::matches, var_7_BD:Matcher)) {
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, xor:int(ldc:int(4103), ldc:int(4099)), invokevirtual:String(Matcher::group, var_7_BD:Matcher, xor:int(ldc:int(-16374), ldc:int(-16373))), invokevirtual:String(Matcher::group, var_7_BD:Matcher, and:int(ldc:int(2114), ldc:int(130))), p0:String))
        }
        
        var_8_D3 = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u92ff\u0800\u7af6\u946b\u8aa5\u4daf), p0:String[expected:CharSequence])
        
        if (invokevirtual:boolean(Matcher::matches, var_8_D3:Matcher)) {
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, xor:int(ldc:int(-31605), ldc:int(-31602)), invokevirtual:String(Matcher::group, var_8_D3:Matcher, xor:int(ldc:int(-13824), ldc:int(-13823))), invokevirtual:String(Matcher::group, var_8_D3:Matcher, and:int(ldc:int(3), ldc:int(21154))), p0:String))
        }
        
        var_9_E9 = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u5d20\ud12e\u71f1\u983f\u3a62\u36d3), p0:String[expected:CharSequence])
        
        if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, var_9_E9:Matcher))) {
            var_10_FF = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uc229\u36d3\uc31c\u4d85\u7c6b\uc246), p0:String[expected:CharSequence])
            return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(ternaryop:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(invokevirtual:boolean(Matcher::matches, var_10_FF:Matcher), initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, ldc:int(8), invokevirtual:String(Matcher::group, var_10_FF:Matcher, and:int(ldc:int(1161), ldc:int(25169))), invokevirtual:String(Matcher::group, var_10_FF:Matcher, and:int(ldc:int(131), ldc:int(17002))), p0:String), aconstnull:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab()))
        }
        
        return:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(initobject:\u718f\ub102\u6fb0\ub171\ud4fe\u64ab(\u718f\ub102\u6fb0\ub171\ud4fe\u64ab::<init>, ldc:int(7), invokevirtual:String(Matcher::group, var_9_E9:Matcher, xor:int(ldc:int(16458), ldc:int(16459))), invokevirtual:String(Matcher::group, var_9_E9:Matcher, and:int(ldc:int(4386), ldc:int(1047))), p0:String))
    }
    
    public static int \uafe7\u5f50\uc238\ub70c\u7ce1\ud217(java.lang.String p0, java.lang.String p1, int p2, int p3) {
        var_4_83 : int
        var_4_A4 : int
        var_6_B1 : char
        stack_F0_0 : int [generated]
        
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
        var_4_83 = and:int(ldc:int(1010470898), ldc:int(1031677885))
        
        if (cmpne:boolean(invokevirtual:int(String::length, p0:String), add:int(invokevirtual:int(String::length, p1:String), and:int(ldc:int(19909), ldc:int(1))))) {
            return:int(ldc:int(-1))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_83:int, ldc:int(4)), ldc:int(0))) {
                var_4_83 = and:int(var_4_83:int, ldc:int(-1661022212))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, p0:String, p1:String))) {
                    return:int(ldc:int(-1))
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_83:int, ldc:int(8)), ldc:int(0))) {
                var_4_A4 = and:int(var_4_83:int, ldc:int(1022074367))
                var_6_B1 = sub:char(invokevirtual:char(String::charAt, p0:String, invokevirtual:int(String::length, p1:String)), ldc:char(48))
                
                if (logicaland:boolean(cmpge:boolean(var_6_B1:char[expected:int], p2:int), cmple:boolean(var_6_B1:char[expected:int], p3:int))) {
                    stack_F0_0 = var_6_B1:char[expected:int]
                }
                else {
                    var_4_A4 = and:int(var_4_A4:int, ldc:int(2092076980))
                    stack_F0_0 = ldc:int(-1)
                }
                
                return:int(stack_F0_0:int)
            }
            
            var_4_83 = and:int(var_4_83:int, ldc:int(-1312312409))
        }
    }
    
    public static int \ua068\u4179\u64f2\u7af6\u5654\u527a(java.lang.String p0) {
        var_1_64 : int
        var_4_68 : int
        
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
        var_1_64 = and:int(and:int(ldc:int(-1504849274), ldc:int(1185651911)), ldc:int(-1487948913))
        var_4_68 = ldc:int(-1)
        
        switch (invokevirtual:int(String::hashCode, p0:String)) {
            case -903579360:
                if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), xor:int(ldc:int(4152), ldc:int(4153))))) {
                    looporswitchbreak()
                }
                
                goto(Label_0225)
            
            case 1235669239:
                if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), xor:int(ldc:int(80), ldc:int(82))))) {
                    goto(Label_0204)
                }
                
                goto(Label_0225)
        }
        
        Label_0158:
        
        if (cmpne:boolean(and:int(var_1_64:int, ldc:int(65536)), ldc:int(0))) {
            var_1_64 = and:int(var_1_64:int, ldc:int(-278964249))
            var_4_68 = and:int(ldc:int(580), ldc:int(-581))
            goto(Label_0225)
        }
        
        Label_0204:
        
        if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0158)
        }
        
        var_1_64 = and:int(var_1_64:int, ldc:int(1202566110))
        var_4_68 = and:int(ldc:int(6225), ldc:int(521))
        Label_0225:
        
        switch (var_4_68:int) {
            case 0:
                return:int(and:int(ldc:int(13461), ldc:int(-15862)))
            
            case 1:
                return:int(and:int(ldc:int(5189), ldc:int(809)))
            
            default:
                return:int(invokestatic:int(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uafe7\u5f50\uc238\ub70c\u7ce1\ud217, p0:String, loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), and:int(ldc:int(7203), ldc:int(267))), and:int(ldc:int(-4279), ldc:int(4278)), xor:int(ldc:int(16434), ldc:int(16435))))
        }
    }
    
    public static int \ub1b9\u4daf\u385b\u6ec6\ua068\u4179(java.lang.String p0) {
        var_1_E3 : int
        var_3_66 : int
        
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
        var_1_E3 = and:int(and:int(ldc:int(858282507), ldc:int(-750794562)), ldc:int(2034064634))
        var_3_66 = ldc:int(-1)
        
        loop {
            if (cmpne:boolean(and:int(var_1_E3:int, ldc:int(128)), ldc:int(0))) {
                var_1_E3 = and:int(var_1_E3:int, ldc:int(-1043809855))
                goto(Label_0193)
            }
            
            if (cmpeq:boolean(and:int(var_1_E3:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_E3 = and:int(var_1_E3:int, ldc:int(400940329))
                
                switch (invokevirtual:int(String::hashCode, p0:String)) {
                    case -1560188349:
                        if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), xor:int(ldc:int(-16303), ldc:int(-16299))))) {
                            looporswitchbreak()
                        }
                        
                        looporswitchbreak(Label_0236)
                    
                    default:
                        looporswitchbreak(Label_0236)
                }
            }
            
            Label_0174:
            
            if (cmpeq:boolean(and:int(var_1_E3:int, ldc:int(128)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_E3:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_E3 = and:int(var_1_E3:int, ldc:int(1539042396))
            }
            
            Label_0193:
            
            if (cmpeq:boolean(and:int(var_1_E3:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_E3 = and:int(var_1_E3:int, ldc:int(978149735))
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_1_E3:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_E3 = and:int(var_1_E3:int, ldc:int(1843485511))
                var_3_66 = and:int(ldc:int(-21488), ldc:int(17389))
                looporswitchbreak()
            }
            
            var_1_E3 = and:int(var_1_E3:int, ldc:int(-1062814561))
        }
        
        Label_0236:
        
        switch (var_3_66:int) {
            case 0:
                return:int(and:int(ldc:int(-3386), ldc:int(3353)))
            
            default:
                return:int(invokestatic:int(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uafe7\u5f50\uc238\ub70c\u7ce1\ud217, p0:String, loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), xor:int(ldc:int(5123), ldc:int(5127))), and:int(ldc:int(-10454), ldc:int(10325)), and:int(ldc:int(24709), ldc:int(779))))
        }
    }
    
    public static int \uc31c\u8640\u64ab\uae87\uc2bd\u6d99(java.lang.String p0) {
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
            return:int(invokestatic:int(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uafe7\u5f50\uc238\ub70c\u7ce1\ud217, p0:String, loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), and:int(ldc:int(10261), ldc:int(4269))), and:int(ldc:int(3650), ldc:int(-20035)), and:int(ldc:int(19474), ldc:int(4142))))
        }
        
        goto(Label_0006)
    }
    
    public static int \u92ff\ub6ab\ua6bd\uc910\u946b\u4975(java.lang.String p0) {
        var_1_5F : int
        var_3_7D : int
        stack_B4_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-827216140), ldc:int(-827507028))
            var_3_7D = invokestatic:int(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uafe7\u5f50\uc238\ub70c\u7ce1\ud217, p0:String, loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), xor:int(ldc:int(9987), ldc:int(9989))), xor:int(ldc:int(160), ldc:int(161)), xor:int(ldc:int(302), ldc:int(298)))
            
            if (cmple:boolean(var_3_7D:int, ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-844284228))
                stack_B4_0 = invokestatic:int(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uafe7\u5f50\uc238\ub70c\u7ce1\ud217, p0:String, loadelement:String(getstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d), and:int(ldc:int(16543), ldc:int(4135))), xor:int(ldc:int(24577), ldc:int(24581)), ldc:int(7))
            }
            else {
                stack_B4_0 = add:int(var_3_7D:int, and:int(ldc:int(135), ldc:int(20483)))
            }
            
            return:int(stack_B4_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u7043\u9a18\u5d20\u62da\ufe34\u88c5(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7d52\ucb79\ud171\u6b5f\u51fa\ud12e), p0:String[expected:CharSequence])))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u56bd\u8bb0\ufcaf\u3c25\u6198\u4c04(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u4ab3\u8640\u36d3\u3dd3\ube23\ubff1), p0:String[expected:CharSequence])))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u3711\u8640\ua3b4\u3d64\u6d69\u6d99(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uc87f\u12cb\uae5d\u839e\uc4d2\u92ff), p0:String[expected:CharSequence])))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ub19c\u99f7\u6b5f\ud523\u8709\u392e(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u385b\uc4d2\u3e75\ud51e\u3d64\ufe34), p0:String[expected:CharSequence])))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_453 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F2_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_465_0 : byte[] [generated]
        stack_4D9_0 : byte[] [generated]
        stack_573_0 : byte[] [generated]
        stack_5AE_0 : byte[] [generated]
        var_4_439 : int
        var_3_43E : byte[]
        var_5_43F : int
        expr_465 : byte [generated]
        var_0_4F1 : int
        expr_4D9 : byte [generated]
        stack_527_2 : byte [generated]
        stack_4FC_0 : byte [generated]
        expr_9E : int [generated]
        expr_C9 : int [generated]
        var_2_F2 : byte[]
        expr_F6 : int [generated]
        var_3_59C : byte[]
        var_5_59D : int
        var_3_132 : String
        expr_13A : String[] [generated]
        expr_144 : String[] [generated]
        var_3_37E : String[]
        
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
        var_0_453 = and:int(ldc:int(756350417), ldc:int(2090118275))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_126_0 = stack_465_0 = stack_4D9_0 = stack_573_0 = stack_5AE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HRVDi0NLQwvSqtGBe7TKMxOLnYPYQezMQzvb64KCK9mJe7TKMxOLnYPYQfwtc/or2kGLnYN6eYkrRGRaO3XhuIy96Yqtu1ID60vSK6KT4eCEZeEBjIXpeYT84eiEbeEBG0OkfeHoE5RbNBvAQ7ucFenotPOBDLS50buU9OHohG3hAYyF6eiES8kTW6WMK+HojI3pqk2bYxuyW4u6euvpQlXpYnXp4IRl4QEbQ6R94bodU5NrSmPhshVbI6Kj4eCEZeEBjIXpSYwt6eiEbeEBjIXpeRu6pH3huh1Tk2tKY+GSBXMTY9Jj4eCEZeEBjIXpSYwt6ei0E7FLhHUzEdmMhel5G7qkfeG6HVOTa0pj4eIdU6Jr4eCEZeEBjIXpSYwt6ei0E7FLhHUzEdmMhel5G7qkfeG6HVOTa0pj4RPE2rHCZeHghGXhAYyF6UmMLenoE0tDhIXpeRu6pH3hCx0b+ivbK0qr6UJV6WJ16eCEZeEBG0MVFUMzq2uCkztS07vyO9qTS3qj+2O6qtpry5MLotpryxP6SzOrm+qq2mvLY6Kby3ojE2vr6qraa8sAd+o=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_439 = expr_6B:int
        var_3_43E = newarray:byte[](byte.class, expr_6B:int)
        var_5_43F = expr_6B:int
        Label_1089:
        
        while (cmpne:boolean(and:int(var_0_453:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_453:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_453 = and:int(var_0_453:int, ldc:int(-1628770492))
                goto(Label_1197)
            }
            
            var_0_453 = and:int(var_0_453:int, ldc:int(-1408454429))
            var_5_43F = add:int(var_5_43F:int, ldc:int(-1))
            expr_465 = loadelement:byte(stack_465_0:byte[], var_5_43F:int)
            storeelement:byte(var_3_43E:byte[], var_5_43F:int, add:int(or:int(and:int(shl:int(expr_465:byte, xor:int(ldc:int(9379), ldc:int(9383))), ldc:int(-16)), and:int(shr:int(expr_465:byte[expected:int], and:int(ldc:int(38), ldc:int(4629))), ldc:int(15))), ldc:int(77)))
            
            if (cmpne:boolean(var_5_43F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_126_0 = stack_465_0 = stack_4D9_0 = stack_573_0 = stack_5AE_0 = var_3_43E:byte[]
            goto(Label_0112)
        }
        
        goto(Label_1357)
        Label_1197:
        
        while (cmpeq:boolean(and:int(var_0_453:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_453 = and:int(var_0_453:int, ldc:int(-1942796305))
                goto(Label_1089)
            }
            
            var_0_4F1 = and:int(var_0_453:int, ldc:int(759162635))
            var_5_43F = add:int(var_5_43F:int, ldc:int(-1))
            expr_4D9 = stack_527_2 = loadelement(stack_4D9_0, var_5_43F)
            
            if (cmplt:boolean(add:int(add:int(var_5_43F:int, ldc:int(2)), neg:int(var_4_439:int)), ldc:int(0))) {
                stack_527_2 = stack_4FC_0 = add:byte(expr_4D9:byte, loadelement:byte(var_3_43E:byte[], add:int(var_5_43F:int, ldc:int(2))))
                goto(Label_1292)
            }
            
            Label_1254:
            
            if (cmpne:boolean(and:int(var_0_4F1:int, ldc:int(524288)), ldc:int(0))) {
                var_0_4F1 = and:int(var_0_4F1:int, ldc:int(1983493364))
            }
            else {
                var_0_4F1 = and:int(var_0_4F1:int, ldc:int(-1137724513))
                stack_527_2 = stack_4FC_0 = add:byte(expr_4D9:byte, ldc:byte(2))
            }
            
            Label_1292:
            
            if (cmpeq:boolean(and:int(var_0_4F1:int, ldc:int(262144)), ldc:int(0))) {
                var_0_4F1 = and:int(var_0_4F1:int, ldc:int(-1604638271))
                goto(Label_1254)
            }
            
            var_0_453 = and:int(var_0_4F1:int, ldc:int(-1393804553))
            storeelement:byte(var_3_43E:byte[], var_5_43F:int, stack_527_2:byte)
            
            if (cmpne:boolean(var_5_43F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_126_0 = stack_465_0 = stack_4D9_0 = stack_573_0 = stack_5AE_0 = var_3_43E:byte[]
            goto(Label_0163)
        }
        
        var_0_453 = and:int(var_0_453:int, ldc:int(1687709763))
        Label_1357:
        
        while (cmpne:boolean(and:int(var_0_453:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(8192)), ldc:int(0))) {
                var_0_453 = and:int(var_0_453:int, ldc:int(384839824))
                goto(Label_1089)
            }
            
            var_0_453 = and:int(var_0_453:int, ldc:int(-1404127441))
            var_5_43F = add:int(var_5_43F:int, ldc:int(-1))
            storeelement:byte(var_3_43E:byte[], var_5_43F:int, xor:byte(loadelement:byte(stack_573_0:byte[], var_5_43F:int), ldc:byte(125)))
            
            if (cmpne:boolean(var_5_43F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_126_0 = stack_465_0 = stack_4D9_0 = stack_573_0 = stack_5AE_0 = var_3_43E:byte[]
            goto(Label_0206)
        }
        
        goto(Label_1197)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_453 = and:int(var_0_453:int, ldc:int(-244855075))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_0_453:int, ldc:int(65536)), ldc:int(0))) {
            var_0_453 = and:int(var_0_453:int, ldc:int(1391791531))
        }
        else {
            var_0_453 = and:int(var_0_453:int, ldc:int(2130147669))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_439 = expr_9E:int
                var_3_43E = newarray:byte[](byte.class, expr_9E:int)
                var_5_43F = expr_9E:int
                goto(Label_1197)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_453:int, ldc:int(4)), ldc:int(0))) {
            var_0_453 = and:int(var_0_453:int, ldc:int(1702052864))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_453 = and:int(var_0_453:int, ldc:int(1813279145))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_439 = expr_C9:int
                var_3_43E = newarray:byte[](byte.class, expr_C9:int)
                var_5_43F = expr_C9:int
                goto(Label_1357)
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(8192)), ldc:int(0))) {
                var_0_453 = and:int(var_0_453:int, ldc:int(74062927))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_453:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_453 = and:int(var_0_453:int, ldc:int(740107183))
            var_2_F2 = stack_F2_0:byte[]
            expr_F6 = add:int(arraylength:int(stack_F4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_59C = newarray:byte[](byte.class, expr_F6:int)
                var_5_59D = expr_F6:int
                
                loop {
                    var_0_453 = and:int(var_0_453:int, ldc:int(2134879571))
                    var_5_59D = add:int(var_5_59D:int, ldc:int(-1))
                    storeelement:byte(var_3_59C:byte[], var_5_59D:int, add:int(shl:int(loadelement:byte(stack_5AE_0:byte[], var_5_59D:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_F2:byte[], add:int(var_5_59D:int, xor:int(ldc:int(-23040), ldc:int(-23039)))), ldc:int(7)), xor:int(ldc:int(1122), ldc:int(1123)))))
                    
                    if (cmpne:boolean(var_5_59D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_126_0 = stack_465_0 = stack_4D9_0 = stack_573_0 = stack_5AE_0 = var_3_59C:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_453:int, ldc:int(32)), ldc:int(0))) {
            var_0_453 = and:int(var_0_453:int, ldc:int(33550102))
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_453:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_453:int, ldc:int(4)), ldc:int(0))) {
            var_0_453 = and:int(var_0_453:int, ldc:int(-48192887))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_13A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16820), ldc:int(1045)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(797), ldc:int(3156)))
        storeelement:String(expr_144:String[], and:int(ldc:int(29992), ldc:int(-30057)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-23827), ldc:int(7440)), and:int(ldc:int(-1011), ldc:int(1010))))
        storeelement:String(expr_13A:String[], and:int(ldc:int(17), ldc:int(10035)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2631), ldc:int(-2896)), and:int(ldc:int(7991), ldc:int(8350))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(-32750), ldc:int(-32766)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(8983), ldc:int(16414)), and:int(ldc:int(3691), ldc:int(8251))))
        storeelement:String(expr_13A:String[], and:int(ldc:int(30), ldc:int(13619)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(4127), ldc:int(4148)), and:int(ldc:int(16511), ldc:int(1079))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(2192), ldc:int(2179)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16439), ldc:int(319)), xor:int(ldc:int(1590), ldc:int(1544))))
        storeelement:String(expr_13A:String[], and:int(ldc:int(2319), ldc:int(9743)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(12734), ldc:int(1086)), and:int(ldc:int(868), ldc:int(4214))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(6194), ldc:int(6204)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(6518), ldc:int(100)), and:int(ldc:int(722), ldc:int(8370))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(-23518), ldc:int(-23509)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(5270), ldc:int(8339)), and:int(ldc:int(24814), ldc:int(7086))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(3336), ldc:int(3333)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2735), ldc:int(174)), and:int(ldc:int(4319), ldc:int(247))))
        storeelement:String(expr_13A:String[], xor:int(ldc:int(784), ldc:int(795)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(6399), ldc:int(1239)), and:int(ldc:int(8462), ldc:int(20774))))
        storeelement:String(expr_13A:String[], and:int(ldc:int(138), ldc:int(14378)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(4158), ldc:int(4408)), and:int(ldc:int(947), ldc:int(23871))))
        storeelement:String(expr_13A:String[], and:int(ldc:int(8734), ldc:int(44)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(6338), ldc:int(6641)), and:int(ldc:int(351), ldc:int(21339))))
        storeelement:String(expr_13A:String[], and:int(ldc:int(1324), ldc:int(27208)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(4560), ldc:int(4235)), xor:int(ldc:int(8366), ldc:int(8667))))
        storeelement:String(expr_144:String[], and:int(ldc:int(7), ldc:int(26887)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(503), ldc:int(4981)), xor:int(ldc:int(-30204), ldc:int(-29831))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(1153), ldc:int(1156)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(6653), ldc:int(893)), xor:int(ldc:int(778), ldc:int(655))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(1027), ldc:int(1029)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(320), ldc:int(197)), xor:int(ldc:int(895), ldc:int(758))))
        storeelement:String(expr_144:String[], and:int(ldc:int(89), ldc:int(24835)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(3545), ldc:int(8587)), and:int(ldc:int(415), ldc:int(4495))))
        storeelement:String(expr_144:String[], and:int(ldc:int(24724), ldc:int(5132)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16783), ldc:int(4511)), xor:int(ldc:int(9346), ldc:int(9496))))
        storeelement:String(expr_144:String[], and:int(ldc:int(9043), ldc:int(6159)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(474), ldc:int(4506)), xor:int(ldc:int(1452), ldc:int(1039))))
        storeelement:String(expr_144:String[], and:int(ldc:int(2467), ldc:int(4682)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(16901), ldc:int(17318)), and:int(ldc:int(16879), ldc:int(10686))))
        putstatic:String[](\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7049\u34df\uc29a\u8258\u6c52\u416d, expr_144:String[])
        var_3_37E = expr_13A:String[]
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u0b8e\u92ee\ubb2b\u92ff\u3d64\u183a, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], and:int(ldc:int(25103), ldc:int(1336)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u99f7\ub171\uc246\u8aa5\ub70c\ua61f, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(12374), ldc:int(12383)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u946b\u3dd3\u2dcc\uc246\u1187\uff55, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(2), ldc:int(8)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u71ae\u61a4\u385b\u965f\u7c6b\u4975, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(-24044), ldc:int(-24033)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uc229\u36d3\uc31c\u4d85\u7c6b\uc246, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(14), ldc:int(2)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u92ff\u0800\u7af6\u946b\u8aa5\u4daf, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], and:int(ldc:int(1101), ldc:int(28685)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\ucef1\u88c5\u8709\ua6bd\u3504\u92ee, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], and:int(ldc:int(17934), ldc:int(430)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u5d20\ud12e\u71f1\u983f\u3a62\u36d3, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(-32118), ldc:int(-32123)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u7d52\ucb79\ud171\u6b5f\u51fa\ud12e, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], and:int(ldc:int(6168), ldc:int(8496)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u4ab3\u8640\u36d3\u3dd3\ube23\ubff1, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(-28669), ldc:int(-28654)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\uc87f\u12cb\uae5d\u839e\uc4d2\u92ff, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(18), ldc:int(0)))))
        putstatic:Pattern(\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1::\u385b\uc4d2\u3e75\ud51e\u3d64\ufe34, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_37E:String[], xor:int(ldc:int(-28397), ldc:int(-28416)))))
    }
    
    public void \u71f1\u4f52\ud217\u836c\u7043\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_653 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_65E : int
        
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
        var_3_653 = and:int(ldc:int(-1092170059), ldc:int(2116868284))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u97b7\u8640\u76bc\u8c8a\u3c25\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(1732230630))
        }
        else {
            var_3_653 = and:int(var_3_653:int, ldc:int(-10293924))
            var_5_89 = and:int(ldc:int(1869), ldc:int(-6096))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23874), ldc:int(23873)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_653:int, ldc:int(-269788426))
                    var_9_CF = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_90:int, and:int(ldc:int(24601), ldc:int(167)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, xor:int(ldc:int(17680), ldc:int(17681)))), var_7_9F:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_653 = and:int(var_3_E1:int, ldc:int(-9941419))
                    var_14_11C = var_7_9F:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(6192), ldc:int(6193)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_90:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(205052107))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1842461430))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(681556163))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1106572564))
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(627391307))
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1082163617))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0609)
                            }
                            
                            goto(Label_0847)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1795850494))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-2003780807))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1440833912))
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1628594561))
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1911842291))
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1593118193))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1571843644))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1046511324))
                        var_11_F2 = and:int(ldc:int(27217), ldc:int(-28276))
                        goto(Label_1501)
                    }
                    
                    Label_0609:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1191667269))
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1095035215))
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1864567701))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-278344426))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0847)
                        }
                    }
                    
                    Label_0722:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1464688275))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1784626911))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1827752326))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1526307133))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1103758634))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0847:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-606623802))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1611155967))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(86096132))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1853483030))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F2 = xor:int(ldc:int(384), ldc:int(385))
                                goto(Label_1118)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1628601550))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-2087365500))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(446598369))
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(2130853670))
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1398647332))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(796916148))
                        var_11_F2 = and:int(ldc:int(-23888), ldc:int(7243))
                    }
                    
                    Label_1118:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1440765369))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-650428551))
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1409291318))
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-844276434))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(260385529))
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-269268553))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1368)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1429059195))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(3957948))
                            goto(Label_1118)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(151035634))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1347956931))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_89:int, var_16_120:int)
                        goto(Label_1501)
                    }
                    
                    Label_1368:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1303219102))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1900158616))
                        goto(Label_0609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-348367339))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1112887958))
                        loopcontinue()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(1073565086))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1501:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65E = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1512:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1251813833))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1118)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1748885754))
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-522452778))
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-607169120))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1075511434))
                        var_17_65E = add:int(var_16_120:int, xor:int(ldc:int(160), ldc:int(161)))
                        looporswitchbreak()
                    }
                }
                
                var_3_653 = and:int(var_3_653:int, ldc:int(1849028063))
                
                if (cmple:boolean(var_5_89 = var_17_65E:int, sub:int(var_6_90:int, and:int(ldc:int(4629), ldc:int(16451))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(-2009620608))
            goto(Label_0108)
        }
    }
}
