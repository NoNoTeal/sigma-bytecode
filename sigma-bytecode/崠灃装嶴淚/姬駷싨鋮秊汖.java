public class \u5d20\u7043\u88c5\u5db4\uf94d.\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56 {
    public void \u59ec\u99f7\uc2e8\u92ee\uf995\u6c56() {
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
            invokespecial:Object(Object::<init>, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56)
            putfield:\u6198\uc246\ua068\u8640\u718f\u4975(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u47c2\ub70c\uf94d\u8753\u5d20\u8640, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, getstatic:\u6198\uc246\ua068\u8640\u718f\u4975(\u6198\uc246\ua068\u8640\u718f\u4975::\u0a06\u6435\u3711\ubded\ucef1\ubf56))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7d52\u5654\u52d3\u836c\ub1b9\u6b0d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, boolean p1, boolean p2) {
        var_4_25E : int
        stack_296_1 : \u6198\uc246\ua068\u8640\u718f\u4975 [generated]
        
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
        var_4_25E = and:int(ldc:int(-1971720270), ldc:int(-1048770))
        
        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uf9c5\u983f\u6d69\u4bc8\u527a\ub19c, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])), p1:boolean)) {
            if (cmpeq:boolean(f2d:double(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u8753\u8709\ubff1\ub32d\u4d85], ldc:float(0.0f))), ldc:double(0.5))) {
                if (cmpne:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(10)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1704490434))
                    stack_296_1 = getstatic:\u6198\uc246\ua068\u8640\u718f\u4975(\u6198\uc246\ua068\u8640\u718f\u4975::\u0a06\u6435\u3711\ubded\ucef1\ubf56)
                }
                else {
                    stack_296_1 = getstatic:\u6198\uc246\ua068\u8640\u718f\u4975(\u6198\uc246\ua068\u8640\u718f\u4975::\u16f6\u9937\uf94d\u9a18\ub8be\uceb8)
                }
                
                var_4_25E = and:int(var_4_25E:int, ldc:int(-917377094))
                putfield:\u6198\uc246\ua068\u8640\u718f\u4975(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u47c2\ub70c\uf94d\u8753\u5d20\u8640, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, stack_296_1:\u6198\uc246\ua068\u8640\u718f\u4975)
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(16)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(569154000))
                    goto(Label_0695)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-2055213525))
                    goto(Label_0541)
                }
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0436)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(2144359680))
                    goto(Label_0342)
                }
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1313588374))
                }
                else {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1737884046))
                    
                    if (cmpeq:boolean(getfield:\u6198\uc246\ua068\u8640\u718f\u4975(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u47c2\ub70c\uf94d\u8753\u5d20\u8640, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), getstatic:\u6198\uc246\ua068\u8640\u718f\u4975(\u6198\uc246\ua068\u8640\u718f\u4975::\u0a06\u6435\u3711\ubded\ucef1\ubf56))) {
                        return:int(and:int(ldc:int(14648), ldc:int(-14651)))
                    }
                }
                
                Label_0268:
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-2099886040))
                    goto(Label_0695)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1746288355))
                    goto(Label_0541)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0436)
                }
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1722437898))
                    
                    if (logicalnot:boolean(getfield:boolean(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u1187\ud4fe\ufcaf\ud7e8\u92ee\ud4fe, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56))) {
                        if (invokespecial:boolean(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\uc910\u34df\ufe34\uae5d\ub19c\u3d4b, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5)) {
                            goto(Label_0695)
                        }
                        
                        return:int(and:int(ldc:int(28852), ldc:int(-29109)))
                    }
                }
                
                Label_0342:
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1747238657))
                    goto(Label_0695)
                }
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-810698921))
                    goto(Label_0541)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(512)), ldc:int(0))) {
                        var_4_25E = and:int(var_4_25E:int, ldc:int(544467585))
                        goto(Label_0268)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_4_25E = and:int(var_4_25E:int, ldc:int(-1852253318))
                        loopcontinue()
                    }
                    
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-87044169))
                    
                    if (cmpgt:boolean(getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ubcb0\u99f7\uf995\u8aa5\u5bc4\u3bd6, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), ldc:int(0))) {
                        putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ubcb0\u99f7\uf995\u8aa5\u5bc4\u3bd6, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, sub:int(getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ubcb0\u99f7\uf995\u8aa5\u5bc4\u3bd6, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), and:int(ldc:int(7425), ldc:int(125))))
                        return:int(and:int(ldc:int(-2039), ldc:int(884)))
                    }
                }
                
                Label_0436:
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(1146819879))
                    goto(Label_0695)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(32)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-328713001))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0342)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_4_25E = and:int(var_4_25E:int, ldc:int(-932865821))
                        goto(Label_0268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(32768)), ldc:int(0))) {
                        var_4_25E = and:int(var_4_25E:int, ldc:int(-311532661))
                        loopcontinue()
                    }
                    
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1076367689))
                    putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ubcb0\u99f7\uf995\u8aa5\u5bc4\u3bd6, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, xor:int(ldc:int(609), ldc:int(611)))
                    
                    if (cmpgt:boolean(getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5245\ua3b4\u97e6\ubded\u97b7\ud36e, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), ldc:int(0))) {
                        invokespecial:void(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u4179\u64ab\ud217\u3e75\u7e3f\ubff1, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
                        putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5245\ua3b4\u97e6\ubded\u97b7\ud36e, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, sub:int(getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5245\ua3b4\u97e6\ubded\u97b7\ud36e, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), and:int(ldc:int(10329), ldc:int(21025))))
                        looporswitchbreak()
                    }
                }
                
                Label_0541:
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(734888262))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0436)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(1)), ldc:int(0))) {
                        var_4_25E = and:int(var_4_25E:int, ldc:int(-301721396))
                        goto(Label_0342)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0268)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(32)), ldc:int(0))) {
                        var_4_25E = and:int(var_4_25E:int, ldc:int(-907048010))
                        putfield:\u6198\uc246\ua068\u8640\u718f\u4975(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u47c2\ub70c\uf94d\u8753\u5d20\u8640, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, getstatic:\u6198\uc246\ua068\u8640\u718f\u4975(\u6198\uc246\ua068\u8640\u718f\u4975::\u0a06\u6435\u3711\ubded\ucef1\ubf56))
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0695:
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(16)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(1037960221))
                    goto(Label_0541)
                }
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(4)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(1513986104))
                    goto(Label_0436)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0342)
                }
                
                if (cmpeq:boolean(and:int(var_4_25E:int, ldc:int(2)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(2091588352))
                    goto(Label_0268)
                }
                
                if (cmpne:boolean(and:int(var_4_25E:int, ldc:int(2)), ldc:int(0))) {
                    var_4_25E = and:int(var_4_25E:int, ldc:int(-1186100610))
                    putfield:boolean(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u1187\ud4fe\ufcaf\ud7e8\u92ee\ud4fe, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, xor:int[expected:boolean](ldc:int(514), ldc:int(515)))
                    goto(Label_0342)
                }
            }
            
            return:int(and:int(ldc:int(16407), ldc:int(8745)))
        }
        
        putfield:\u6198\uc246\ua068\u8640\u718f\u4975(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u47c2\ub70c\uf94d\u8753\u5d20\u8640, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, getstatic:\u6198\uc246\ua068\u8640\u718f\u4975(\u6198\uc246\ua068\u8640\u718f\u4975::\u0a06\u6435\u3711\ubded\ucef1\ubf56))
        putfield:boolean(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u1187\ud4fe\ufcaf\ud7e8\u92ee\ud4fe, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, and:int[expected:boolean](ldc:int(-28735), ldc:int(28690)))
        return:int(and:int(ldc:int(-17433), ldc:int(17432)))
    }
    
    private boolean \uc910\u34df\ufe34\uae5d\ub19c\u3d4b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
        var_2_5F : int
        var_4_69 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_2_125 : int
        var_5_B3 : \u51fa\u6c52\u7330\u7330\u960f
        var_6_CE : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_FD : int
        var_2_10A : int
        var_8_144 : float
        
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
        var_2_5F = and:int(ldc:int(628274319), ldc:int(-1343246074))
        var_4_69 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, p0:\ube23\uc238\u5140\u4cd9\u8aa5))
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_125 = and:int(var_2_5F:int, ldc:int(-2102366062))
            }
            else {
                var_2_125 = and:int(var_2_5F:int, ldc:int(787674492))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_4_69:Iterator)) {
                    var_5_B3 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_4_69:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, var_5_B3:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]))) {
                        var_6_CE = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, var_5_B3:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                        
                        if (invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_6_CE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                            if (cmpne:boolean(invokevirtual:\uf995\u7049\u8258\u5654\u718f(\uc2e8\u9255\u647c\ud171\ubf56::\u7af6\u156b\ub7dc\ua3b4\u7ce1\u7049, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_6_CE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u6c52\u4c04\ucfaf\u8258\uf995\u759a))) {
                                var_7_FD = and:int(ldc:int(-1908), ldc:int(1379))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(32768)), ldc:int(0))) {
                                        var_2_10A = and:int(var_2_125:int, ldc:int(391981444))
                                    }
                                    else {
                                        var_2_10A = and:int(var_2_125:int, ldc:int(1861802236))
                                        
                                        if (cmplt:boolean(var_7_FD:int, ldc:int(10))) {
                                            var_8_144 = mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5)), ldc:float(6.2831855f))
                                            putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5fe1\u7c6b\u7bad\ua068\ud523\u92ff, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_6_CE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_8_144:float), ldc:float(32.0f)))))
                                            putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\uc238\u8aa5\u385b\u67d0\ucfaf\ufe34, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_CE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                                            putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ud523\uc87f\uae87\u5bc4\ubefe\u516c, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_6_CE:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_8_144:float), ldc:float(32.0f)))))
                                            
                                            if (cmpeq:boolean(invokespecial:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u92ee\u8df4\uae87\u9a18\u4f4a\uff55, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5fe1\u7c6b\u7bad\ua068\ud523\u92ff, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\uc238\u8aa5\u385b\u67d0\ucfaf\ufe34, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ud523\uc87f\uae87\u5bc4\ubefe\u516c, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56))), aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())) {
                                                var_2_125 = and:int(var_2_10A:int, ldc:int(1689834206))
                                                inc:int(var_7_FD, ldc:int(1))
                                                loopcontinue()
                                            }
                                            
                                            putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ubcb0\u99f7\uf995\u8aa5\u5bc4\u3bd6, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, and:int(ldc:int(-4955), ldc:int(4946)))
                                            putfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5245\ua3b4\u97e6\ubded\u97b7\ud36e, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, ldc:int(20))
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_10A:int, ldc:int(262144)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                    
                                    var_2_125 = and:int(var_2_10A:int, ldc:int(-101291367))
                                }
                                
                                return:boolean(and:int[expected:boolean](ldc:int(16581), ldc:int(2081)))
                            }
                        }
                    }
                    
                    var_2_5F = and:int(var_2_125:int, ldc:int(610319717))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(262144)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(9112), ldc:int(-9113)))
            }
            
            var_2_5F = and:int(var_2_125:int, ldc:int(776337730))
        }
    }
    
    private void \u4179\u64ab\ud217\u3e75\u7e3f\ubff1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
        var_2_1A3 : int
        var_4_80 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_5_E0 : \u3504\uafe7\ucb79\u0c95\ubff1
        var_6_137 : Exception
        
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
            var_2_1A3 = and:int(and:int(ldc:int(1527211738), ldc:int(-161501445)), ldc:int(-1036015649))
            var_4_80 = invokespecial:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u92ee\u8df4\uae87\u9a18\u4f4a\uff55, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u5fe1\u7c6b\u7bad\ua068\ud523\u92ff, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\uc238\u8aa5\u385b\u67d0\ucfaf\ufe34, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56), getfield:int(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ud523\uc87f\uae87\u5bc4\ubefe\u516c, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56)))
            
            loop {
                Label_0130:
                
                if (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_1A3 = and:int(var_2_1A3:int, ldc:int(-1375360595))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    var_2_1A3 = and:int(var_2_1A3:int, ldc:int(1196371867))
                    
                    if (cmpne:boolean(var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())) {
                        goto(Label_0165)
                    }
                    
                    looporswitchbreak()
                }
                
                loop {
                    Block_7:
                    
                    try {
                        Label_0187:
                        
                        if (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0165)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(2)), ldc:int(0))) {
                            var_2_1A3 = and:int(var_2_1A3:int, ldc:int(-545707631))
                            loopcontinue(Label_0130)
                        }
                        
                        var_2_1A3 = and:int(var_2_1A3:int, ldc:int(-1817811234))
                        var_5_E0 = initobject:\u3504\uafe7\ucb79\u0c95\ubff1(\u3504\uafe7\ucb79\u0c95\ubff1::<init>, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
                        Label_0226:
                        
                        while (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(2147483647)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(128)), ldc:int(0))) {
                                var_2_1A3 = and:int(var_2_1A3:int, ldc:int(992378554))
                                invokevirtual:\u120d\u98a4\uceb8\u8cae\u47c2(\u3504\uafe7\ucb79\u0c95\ubff1::\uc3e3\u183a\u8640\ud171\uafe7\u1833, var_5_E0:\u3504\uafe7\ucb79\u0c95\ubff1, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], invokevirtual:\u6d99\u6b0d\ubff1\uc246\u946b(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7af6\u8350\u4179\ufe34\ub18d\ucfaf, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, var_5_E0:\u3504\uafe7\ucb79\u0c95\ubff1[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), getstatic:\u5f50\u3e75\u51fa\u983f\u67e9(\u5f50\u3e75\u51fa\u983f\u67e9::\u88c5\ud12e\u74b1\u4c04\ud4fe\u34df), checkcast:\u120d\u98a4\uceb8\u8cae\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u120d\u98a4\uceb8\u8cae\u47c2.class, aconstnull:\u120d\u98a4\uceb8\u8cae\u47c2()), checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()))
                            }
                            
                            Label_0283:
                            
                            if (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_0399)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_1A3 = and:int(var_2_1A3:int, ldc:int(-1495292006))
                                goto(Label_0367)
                            }
                        }
                        
                        var_2_1A3 = and:int(var_2_1A3:int, ldc:int(203387839))
                        goto(Label_0399)
                    }
                    catch (java.lang.Exception var_6_137) {
                        do {
                            if (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_1A3 = and:int(var_2_1A3:int, ldc:int(174008219))
                                invokeinterface:void(Logger::warn, getstatic:Logger(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ub7dc\ub18d\u5fe1\uae87\u88c5\ufcaf), loadelement:String(getstatic:String[](\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u40a9\uf9c5\u8df4\u8bb0\uc246\ud51e), and:int(ldc:int(2252), ldc:int(-23758))), var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[expected:Object], var_6_137:Exception[expected:Object])
                            }
                        } while (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(16)), ldc:int(0)))
                        
                        return:void()
                    }
                    
                    Label_0367:
                    invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u392e\u4179\ud51e\u12b2\ub83f\u960f, var_5_E0:\u3504\uafe7\ucb79\u0c95\ubff1[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_4_80:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5)), ldc:float(360.0f)), ldc:float(0.0f))
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0283)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(8)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    goto(Label_0226)
                }
                
                var_2_1A3 = and:int(var_2_1A3:int, ldc:int(1659809791))
                invokevirtual:void(\ua6bd\u8d98\u6ec6\uc246\uc238::\u624e\ub113\u3a62\u93a2\u6cfe\u6fb0, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], var_5_E0:\u3504\uafe7\ucb79\u0c95\ubff1[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                looporswitchbreak()
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_2_1A3:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0187)
                }
                
                if (cmpne:boolean(and:int(var_2_1A3:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_1A3 = and:int(var_2_1A3:int, ldc:int(-619757922))
                    goto(Block_7)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 \u92ee\u8df4\uae87\u9a18\u4f4a\uff55(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_3_61 : int
        var_5_69 : int
        var_3_77 : int
        var_6_B5 : int
        var_7_C8 : int
        var_9_E4 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_3_61 = and:int(ldc:int(771612192), ldc:int(-1099711558))
        var_5_69 = and:int(ldc:int(-12790), ldc:int(12773))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                var_3_77 = and:int(var_3_61:int, ldc:int(-2138048318))
            }
            else {
                var_3_77 = and:int(var_3_61:int, ldc:int(-1083581467))
                
                if (cmplt:boolean(var_5_69:int, ldc:int(10))) {
                    var_6_B5 = sub:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(16))), ldc:int(8))
                    var_7_C8 = sub:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(16))), ldc:int(8))
                    var_9_E4 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, var_6_B5:int, invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u47c2\u8308\u7330\u93a2\u5bc4\u839e), var_6_B5:int, var_7_C8:int), var_7_C8:int)
                    
                    if (logicaland:boolean(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_9_E4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokestatic:boolean(\u3711\u7ce1\u76bc\u7049\u16f6::\u2dcc\u97e6\uc31c\uae87\u3c25\ub70c, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u3504\uafe7\ucb79\u0c95\ubff1>(\u9255\u0c95\u4cd9\ube23\u760c::\u0b8e\u8258\ub1b9\u8cae\uc229\u8640), p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], getstatic:\u5f50\u3e75\u51fa\u983f\u67e9(\u5f50\u3e75\u51fa\u983f\u67e9::\u88c5\ud12e\u74b1\u4c04\ud4fe\u34df), var_9_E4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p0:\ube23\uc238\u5140\u4cd9\u8aa5)))) {
                        return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, var_9_E4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                    }
                    
                    var_3_61 = and:int(var_3_77:int, ldc:int(-1376392408))
                    inc:int(var_5_69, ldc:int(1))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_3_77:int, ldc:int(4194304)), ldc:int(0))) {
                return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())
            }
            
            var_3_61 = and:int(var_3_77:int, ldc:int(1317717770))
        }
    }
    
    static {
        var_0_7F : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D2_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_13A_0 : byte[] [generated]
        stack_1A4_0 : byte[] [generated]
        stack_220_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        var_4_186 : int
        var_3_18B : byte[]
        var_5_18C : int
        var_0_19A : int
        expr_1A4 : byte [generated]
        stack_1E3_2 : byte [generated]
        stack_1C0_0 : byte [generated]
        expr_A5 : int [generated]
        var_2_D2 : byte[]
        expr_D6 : int [generated]
        var_3_249 : byte[]
        var_5_24A : int
        expr_10E : int [generated]
        var_3_29F : byte[]
        var_5_2A0 : int
        expr_2B1 : byte [generated]
        var_3_146 : String
        stack_179_0 : String[] [generated]
        expr_158 : String[] [generated]
        
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
        var_0_7F = and:int(ldc:int(-1029703332), ldc:int(-770875828))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D2_0 = stack_D4_0 = stack_10C_0 = stack_10E_0 = stack_13A_0 = stack_1A4_0 = stack_220_0 = stack_25B_0 = stack_2B1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tzVBAgEw+VH3AIuARDsB87lPR0H/QjC9Uf+v/s6DQ8I/AbF6z4WAAbH/DC89zqUi")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_186 = expr_6E:int
        var_3_18B = newarray:byte[](byte.class, expr_6E:int)
        var_5_18C = expr_6E:int
        Label_0398:
        
        while (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(32)), ldc:int(0))) {
            var_0_19A = and:int(var_0_7F:int, ldc:int(-877691684))
            var_5_18C = add:int(var_5_18C:int, ldc:int(-1))
            expr_1A4 = stack_1E3_2 = loadelement(stack_1A4_0, var_5_18C)
            
            if (cmplt:boolean(add:int(add:int(var_5_18C:int, ldc:int(2)), neg:int(var_4_186:int)), ldc:int(0))) {
                stack_1E3_2 = stack_1C0_0 = add:byte(expr_1A4:byte, loadelement:byte(var_3_18B:byte[], add:int(var_5_18C:int, ldc:int(2))))
                goto(Label_0464)
            }
            
            Label_0433:
            
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(1919769262))
                stack_1E3_2 = stack_1C0_0 = add:byte(expr_1A4:byte, ldc:byte(2))
            }
            
            Label_0464:
            
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0433)
            }
            
            var_0_7F = and:int(var_0_19A:int, ldc:int(-150111122))
            storeelement:byte(var_3_18B:byte[], var_5_18C:int, stack_1E3_2:byte)
            
            if (cmpne:boolean(var_5_18C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10C_0 = stack_10E_0 = stack_13A_0 = stack_1A4_0 = stack_220_0 = stack_25B_0 = stack_2B1_0 = var_3_18B:byte[]
            goto(Label_0115)
        }
        
        Label_0521:
        
        while (cmpne:boolean(and:int(var_0_7F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-404923571))
            var_5_18C = add:int(var_5_18C:int, ldc:int(-1))
            storeelement:byte(var_3_18B:byte[], var_5_18C:int, add:byte(loadelement:byte(stack_220_0:byte[], var_5_18C:int), ldc:byte(40)))
            
            if (cmpne:boolean(var_5_18C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10C_0 = stack_10E_0 = stack_13A_0 = stack_1A4_0 = stack_220_0 = stack_25B_0 = stack_2B1_0 = var_3_18B:byte[]
            goto(Label_0170)
        }
        
        goto(Label_0398)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(65536)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-1406832830))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-1901192847))
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(1337686974))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_186 = expr_A5:int
                var_3_18B = newarray:byte[](byte.class, expr_A5:int)
                var_5_18C = expr_A5:int
                goto(Label_0521)
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_7F = and:int(var_0_7F:int, ldc:int(538841839))
                goto(Label_0115)
            }
            
            var_0_7F = and:int(var_0_7F:int, ldc:int(1387002141))
            var_2_D2 = stack_D2_0:byte[]
            expr_D6 = add:int(arraylength:int(stack_D4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D6:int, ldc:int(0))) {
                var_3_249 = newarray:byte[](byte.class, expr_D6:int)
                var_5_24A = expr_D6:int
                
                loop {
                    var_0_7F = and:int(var_0_7F:int, ldc:int(-623026227))
                    var_5_24A = add:int(var_5_24A:int, ldc:int(-1))
                    storeelement:byte(var_3_249:byte[], var_5_24A:int, add:int(shl:int(loadelement:byte(stack_25B_0:byte[], var_5_24A:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_D2:byte[], add:int(var_5_24A:int, and:int(ldc:int(16387), ldc:int(4701)))), ldc:int(2)), xor:int(ldc:int(-32738), ldc:int(-32735)))))
                    
                    if (cmpne:boolean(var_5_24A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10C_0 = stack_10E_0 = stack_13A_0 = stack_1A4_0 = stack_220_0 = stack_25B_0 = stack_2B1_0 = var_3_249:byte[]
            }
        }
        
        Label_0219:
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-1772996324))
        }
        else {
            if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(8)), ldc:int(0))) {
                var_0_7F = and:int(var_0_7F:int, ldc:int(-839583735))
                goto(Label_0115)
            }
            
            var_0_7F = and:int(var_0_7F:int, ldc:int(1403869852))
            expr_10E = arraylength:int(stack_10E_0:byte[])
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_29F = newarray:byte[](byte.class, expr_10E:int)
                var_5_2A0 = expr_10E:int
                
                loop {
                    var_0_7F = and:int(var_0_7F:int, ldc:int(-301376209))
                    var_5_2A0 = add:int(var_5_2A0:int, ldc:int(-1))
                    expr_2B1 = loadelement:byte(stack_2B1_0:byte[], var_5_2A0:int)
                    storeelement:byte(var_3_29F:byte[], var_5_2A0:int, xor:int(or:int(and:int(shl:int(expr_2B1:byte, xor:int(ldc:int(1057), ldc:int(1061))), ldc:int(-16)), and:int(shr:int(expr_2B1:byte[expected:int], and:int(ldc:int(30), ldc:int(10533))), ldc:int(15))), ldc:int(64)))
                    
                    if (cmpne:boolean(var_5_2A0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10C_0 = stack_10E_0 = stack_13A_0 = stack_1A4_0 = stack_220_0 = stack_25B_0 = stack_2B1_0 = var_3_29F:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-741459814))
            goto(Label_0115)
        }
        
        var_3_146 = initobject:String(String::<init>, stack_13A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_179_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18), ldc:int(19)))
        expr_158 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16896), ldc:int(16897)))
        storeelement:String(expr_158:String[], and:int(ldc:int(-9992), ldc:int(9223)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(9519), ldc:int(-9520)), and:int(ldc:int(2351), ldc:int(1215))))
        putstatic:String[](\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\u40a9\uf9c5\u8df4\u8bb0\uc246\ud51e, expr_158:String[])
        putstatic:Logger(\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56::\ub7dc\ub18d\u5fe1\uae87\u88c5\ufcaf, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \u5bc4\ud36e\u600f\u873d\uc4d2\u071d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_69D : int
        
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
        var_3_692 = and:int(ldc:int(811826427), ldc:int(-314892580))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(553364982))
            var_5_80 = and:int(ldc:int(16716), ldc:int(-17741))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17973), ldc:int(17956)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_692:int, ldc:int(1706786545))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(1028), ldc:int(1029)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(-32704), ldc:int(-32703)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_CF:int, ldc:int(1698078107))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(25611), ldc:int(4133)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-496852370))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-17192650))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1869533884))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-228706181))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1320452421))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1955774204))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1649973758))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1184766079))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1185123933))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-463926701))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(567516369))
                            var_11_E0 = and:int(ldc:int(-3022), ldc:int(2509))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1070118682))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(146252527))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1798939799))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(476655077))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1427188852))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-7615010))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1697071501))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1704879401))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-442209811))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(940379587))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(774747995))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-361845513))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1612501988))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2008208741))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1842115114))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-492983133))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1063077976))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(2050023797))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1523903603))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-224486251))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(516), ldc:int(517))
                                goto(Label_1142)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1811252912))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(489654696))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-64699455))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-867165600))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-136220633))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-528322569))
                        var_11_E0 = and:int(ldc:int(-32057), ldc:int(7480))
                    }
                    
                    Label_1142:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(956160340))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-129998470))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1275626162))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1181935636))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(625382217))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-2104696208))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1116000872))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1419)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1853258733))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-957138106))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1142)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-127806963))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-18266870))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1900073872))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(1903668639))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                        goto(Label_1562)
                    }
                    
                    Label_1419:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-565740902))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(983908599))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-546324176))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2037790952))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(180487799))
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(1753173494))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-538703543))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(76298828))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1751707208))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(158563936))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(728198878))
                        var_17_69D = add:int(var_16_10E:int, and:int(ldc:int(16649), ldc:int(8353)))
                        looporswitchbreak()
                    }
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(-75576068))
                
                if (cmple:boolean(var_5_80 = var_17_69D:int, sub:int(var_6_87:int, and:int(ldc:int(197), ldc:int(8505))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
