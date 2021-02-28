public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u600f\u92ee\u5245\ud7e8\u6b5f\u6d69 {
    public void \u600f\u92ee\u5245\ud7e8\u6b5f\u6d69() {
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
            invokespecial:Object(Object::<init>, this:\u600f\u92ee\u5245\ud7e8\u6b5f\u6d69)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
        var_1_75 : int
        var_3_70 : \ub7dc\u8d98\u960f\u385b\u64ab\u8aa5
        var_4_80 : InputStreamReader
        var_5_90 : BufferedReader
        var_6_9C : String
        var_7_102 : \u6198\u56bd\u12cb\ub18d\u5f50\ubf56
        var_8_1E6 : \u927d\u7ce1\u3776\u3e75\u946b\u67e9
        var_9_1F4 : float
        var_8_2F0 : \u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20
        var_9_2FE : boolean
        var_1_374 : int
        var_4_36E : Exception
        
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
        var_1_75 = and:int(and:int(ldc:int(243720041), ldc:int(-1133275799)), ldc:int(-123552519))
        var_3_70 = initobject:\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5(\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5::<init>, checkcast:\u4975\u8308\uf995\u760c\u5d20\u965f(\u59ec\u8413\u97e6\uc229\u3776.\u4975\u8308\uf995\u760c\u5d20\u965f.class, aconstnull:\u4975\u8308\uf995\u760c\u5d20\u965f()))
        
        loop {
            try {
                loop {
                    Label_0113:
                    var_1_75 = and:int(var_1_75:int, ldc:int(-881877585))
                    var_4_80 = initobject:InputStreamReader(InputStreamReader::<init>, getstatic:InputStream(System::in))
                    var_1_75 = and:int(var_1_75:int, ldc:int(173987053))
                    var_5_90 = initobject:BufferedReader(BufferedReader::<init>, var_4_80:InputStreamReader[expected:Reader])
                    var_1_75 = and:int(var_1_75:int, ldc:int(-852574291))
                    var_6_9C = invokevirtual:String(BufferedReader::readLine, var_5_90:BufferedReader)
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_75 = and:int(var_1_75:int, ldc:int(1186434384))
                            goto(Label_0220)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(2097152)), ldc:int(0))) {
                            var_1_75 = and:int(var_1_75:int, ldc:int(1319083581))
                            
                            if (cmpgt:boolean(invokevirtual:int(String::length, var_6_9C:String), ldc:int(0))) {
                                var_7_102 = invokevirtual:\u6198\u56bd\u12cb\ub18d\u5f50\ubf56(\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5::\uc84e\u3504\u4c2b\u416d\u7330\u624e, var_3_70:\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5, var_6_9C:String)
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-1818967292))
                                        goto(Label_0808)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-1345907045))
                                        goto(Label_0660)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-1604467214))
                                        goto(Label_0597)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                        goto(Label_0542)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_0410)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-383543811))
                                        
                                        if (logicalnot:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u927d\u7ce1\u3776\u3e75\u946b\u67e9.class, var_7_102:\u6198\u56bd\u12cb\ub18d\u5f50\ubf56))) {
                                            goto(Label_0542)
                                        }
                                    }
                                    
                                    Label_0339:
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(134217728)), ldc:int(0))) {
                                        goto(Label_0808)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(131072)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-718892579))
                                        goto(Label_0660)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(1178236590))
                                        goto(Label_0597)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(204301555))
                                        goto(Label_0542)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(4096)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(2)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-104341527))
                                    }
                                    
                                    Label_0410:
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_0808)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(428600717))
                                        goto(Label_0660)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(4)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(810066278))
                                        goto(Label_0597)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(8192)), ldc:int(0))) {
                                            goto(Label_0339)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                            var_1_75 = and:int(var_1_75:int, ldc:int(-119217208))
                                            loopcontinue()
                                        }
                                        
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-1183662981))
                                        var_8_1E6 = checkcast:\u927d\u7ce1\u3776\u3e75\u946b\u67e9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u927d\u7ce1\u3776\u3e75\u946b\u67e9.class, var_7_102:\u927d\u7ce1\u3776\u3e75\u946b\u67e9)
                                        var_1_75 = and:int(var_1_75:int, ldc:int(1764202153))
                                        var_9_1F4 = invokeinterface:float(\u927d\u7ce1\u3776\u3e75\u946b\u67e9::\u5f50\ub102\ud217\u385b\ua61f\u52d3, var_8_1E6:\u927d\u7ce1\u3776\u3e75\u946b\u67e9)
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-391708881))
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u600f\u92ee\u5245\ud7e8\u6b5f\u6d69::\u7043\ubff1\ud171\u61a4\u600f\u8308), and:int(ldc:int(17682), ldc:int(-17715)))), var_9_1F4:float)))
                                    }
                                    
                                    Label_0542:
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_0808)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_0660)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                            goto(Label_0410)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                            goto(Label_0339)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(128)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_1_75 = and:int(var_1_75:int, ldc:int(459003117))
                                        
                                        if (logicalnot:boolean(instanceof:boolean(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20.class, var_7_102:\u927d\u7ce1\u3776\u3e75\u946b\u67e9[expected:\u6198\u56bd\u12cb\ub18d\u5f50\ubf56]))) {
                                            goto(Label_0808)
                                        }
                                    }
                                    
                                    Label_0597:
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-2000129708))
                                        goto(Label_0808)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(268435456)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(128)), ldc:int(0))) {
                                            goto(Label_0542)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                                            goto(Label_0410)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(131072)), ldc:int(0))) {
                                            goto(Label_0339)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(4194304)), ldc:int(0))) {
                                            var_1_75 = and:int(var_1_75:int, ldc:int(-1410456885))
                                            loopcontinue()
                                        }
                                        
                                        var_1_75 = and:int(var_1_75:int, ldc:int(485163007))
                                    }
                                    
                                    Label_0660:
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(32768)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(1068181083))
                                    }
                                    else {
                                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(32768)), ldc:int(0))) {
                                            goto(Label_0597)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(4194304)), ldc:int(0))) {
                                            var_1_75 = and:int(var_1_75:int, ldc:int(870821008))
                                            goto(Label_0542)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                                            var_1_75 = and:int(var_1_75:int, ldc:int(796215733))
                                            goto(Label_0410)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(65536)), ldc:int(0))) {
                                            var_1_75 = and:int(var_1_75:int, ldc:int(1963766413))
                                            goto(Label_0339)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(4096)), ldc:int(0))) {
                                            var_1_75 = and:int(var_1_75:int, ldc:int(-1506997824))
                                            loopcontinue()
                                        }
                                        
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-808534023))
                                        var_8_2F0 = checkcast:\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20.class, var_7_102:\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20)
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-896541571))
                                        var_9_2FE = invokeinterface:boolean(\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20::\u7c6b\u0b8e\u6d99\u446c\u8bb0\u8cae, var_8_2F0:\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20)
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-117465297))
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u600f\u92ee\u5245\ud7e8\u6b5f\u6d69::\u7043\ubff1\ud171\u61a4\u600f\u8308), and:int(ldc:int(9622), ldc:int(-9656)))), var_9_2FE:boolean)))
                                    }
                                    
                                    Label_0808:
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(2097152)), ldc:int(0))) {
                                        goto(Label_0660)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(2097152)), ldc:int(0))) {
                                        goto(Label_0597)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(4096)), ldc:int(0))) {
                                        var_1_75 = and:int(var_1_75:int, ldc:int(-1991321206))
                                        goto(Label_0542)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(536870912)), ldc:int(0))) {
                                        goto(Label_0410)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_75:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_0339)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(2)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                    
                                    var_1_75 = and:int(var_1_75:int, ldc:int(-283259675))
                                }
                                
                                var_1_75 = and:int(var_1_75:int, ldc:int(-1715208855))
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0193:
                        
                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_75 = and:int(var_1_75:int, ldc:int(1275276508))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_75:int, ldc:int(8192)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_75 = and:int(var_1_75:int, ldc:int(-1433488147))
                        }
                        
                        Label_0220:
                        
                        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0193)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(32)), ldc:int(0))) {
                            looporswitchbreak(Label_0242)
                        }
                        
                        var_1_75 = and:int(var_1_75:int, ldc:int(1853948083))
                    }
                }
                
                Label_0242:
                var_1_75 = and:int(var_1_75:int, ldc:int(-343174039))
                return:void()
            }
            catch (java.lang.Exception var_4_36E) {
                var_1_374 = and:int(var_1_75:int, ldc:int(1846001147))
                invokevirtual:void(Throwable::printStackTrace, var_4_36E:Exception[expected:Throwable])
                var_1_75 = and:int(var_1_374:int, ldc:int(-1362387267))
                loopcontinue()
            }
            
            goto(Label_0113)
        }
    }
    
    static {
        var_0_17F : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_191_0 : byte[] [generated]
        stack_1E1_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_191 : byte [generated]
        var_0_255 : int
        expr_23D : byte [generated]
        stack_281_2 : byte [generated]
        stack_258_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1D0 : byte[]
        var_5_1D1 : int
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_2A4 : byte[]
        var_5_2A5 : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
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
        var_0_17F = and:int(ldc:int(-668678377), ldc:int(-398155882))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpne:boolean(and:int(var_0_17F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1030465601))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_191 = loadelement:byte(stack_191_0:byte[], var_5_172:int)
            storeelement:byte(var_3_171:byte[], var_5_172:int, or:int(and:int(shl:int(expr_191:byte, and:int(ldc:int(24972), ldc:int(5124))), ldc:int(-16)), and:int(shr:int(expr_191:byte[expected:int], xor:int(ldc:int(-32109), ldc:int(-32105))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        var_0_17F = and:int(var_0_17F:int, ldc:int(1390816682))
        Label_0552:
        
        while (cmpne:boolean(and:int(var_0_17F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_255 = and:int(var_0_17F:int, ldc:int(-638599350))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_23D = stack_281_2 = loadelement(stack_23D_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(5)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_281_2 = stack_258_0 = add:byte(expr_23D:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(5))))
                goto(Label_0616)
            }
            
            Label_0586:
            
            if (cmpeq:boolean(and:int(var_0_255:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_255 = and:int(var_0_255:int, ldc:int(-846297133))
                stack_281_2 = stack_258_0 = add:byte(expr_23D:byte, ldc:byte(5))
            }
            
            Label_0616:
            
            if (cmpeq:boolean(and:int(var_0_255:int, ldc:int(262144)), ldc:int(0))) {
                var_0_255 = and:int(var_0_255:int, ldc:int(224558792))
                goto(Label_0586)
            }
            
            var_0_17F = and:int(var_0_255:int, ldc:int(-787683538))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_281_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_171:byte[]
            goto(Label_0216)
        }
        
        goto(Label_0372)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(512)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1787444659))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(866195228))
        }
        else {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-390776841))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1D0 = newarray:byte[](byte.class, expr_A0:int)
                var_5_1D1 = expr_A0:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(-724707433))
                    var_5_1D1 = add:int(var_5_1D1:int, ldc:int(-1))
                    storeelement:byte(var_3_1D0:byte[], var_5_1D1:int, add:int(shl:int(loadelement:byte(stack_1E1_0:byte[], var_5_1D1:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1D1:int, and:int(ldc:int(17), ldc:int(195)))), ldc:int(3)), xor:int(ldc:int(2958), ldc:int(2961)))))
                    
                    if (cmpne:boolean(var_5_1D1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_1D0:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(32)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1977624779))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(1024)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(1573938712))
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(-357259442))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_16C = expr_D3:int
                var_3_171 = newarray:byte[](byte.class, expr_D3:int)
                var_5_172 = expr_D3:int
                goto(Label_0552)
            }
        }
        
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(32)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(-1682876645))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(348623684))
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(-24739862))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2A4 = newarray:byte[](byte.class, expr_106:int)
                var_5_2A5 = expr_106:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(-343071134))
                    var_5_2A5 = add:int(var_5_2A5:int, ldc:int(-1))
                    storeelement:byte(var_3_2A4:byte[], var_5_2A5:int, add:byte(xor:byte(loadelement:byte(stack_2B5_0:byte[], var_5_2A5:int), ldc:byte(105)), ldc:byte(97)))
                    
                    if (cmpne:boolean(var_5_2A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_191_0 = stack_1E1_0 = stack_23D_0 = stack_2B5_0 = var_3_2A4:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_165_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(25947), ldc:int(165)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8101), ldc:int(65)))
            storeelement:String(expr_144:String[], and:int(ldc:int(-26256), ldc:int(25099)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(9556), ldc:int(-10078)), and:int(ldc:int(1357), ldc:int(-5486))))
            putstatic:String[](\u600f\u92ee\u5245\ud7e8\u6b5f\u6d69::\u7043\ubff1\ud171\u61a4\u600f\u8308, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u8389\ud171\u3e75\u69d9\u1833\u92ee(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_658 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BA : double
        var_3_CC : int
        var_11_DD : int
        var_14_107 : double
        var_16_10B : int
        var_12_103 : double
        var_17_663 : int
        
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
        var_3_658 = and:int(ldc:int(-996872790), ldc:int(1099296710))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\u92ee\u5245\ud7e8\u6b5f\u6d69[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_658 = and:int(var_3_658:int, ldc:int(199286718))
            var_5_7D = and:int(ldc:int(-11761), ldc:int(11600))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10818), ldc:int(-10819)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BA = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CC = and:int(var_3_658:int, ldc:int(1842015687))
                    var_9_BA = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DD = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DD:int, sub:int(var_6_84:int, xor:int(ldc:int(-12284), ldc:int(-12283)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DD:int, and:int(ldc:int(11), ldc:int(12353)))), var_7_93:double))) {
                        inc:int(var_11_DD, ldc:int(1))
                    }
                    
                    var_3_658 = and:int(var_3_CC:int, ldc:int(1755696974))
                    var_14_107 = var_7_93:double
                    var_16_10B = var_11_DD:int
                }
                else {
                    var_11_DD = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(14341), ldc:int(16683)))
                    var_12_103 = var_14_107 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10B = var_11_DD:int, var_6_84:int)) {
                        var_9_BA = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DD:int)
                        var_16_10B = var_11_DD:int
                        var_14_107 = var_12_103:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1122163551))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1296072398))
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-326204405))
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(726782611))
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(926043011))
                    }
                    else {
                        var_3_658 = and:int(var_3_658:int, ldc:int(768404966))
                        
                        if (cmplt:boolean(var_16_10B:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1144364351))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(298980778))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1573081687))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(1891491142))
                        var_11_DD = and:int(ldc:int(-10160), ldc:int(9770))
                        goto(Label_1502)
                    }
                    
                    Label_0553:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1737937407))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(322240434))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1379134011))
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(849796026))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-794689622))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_107 = var_9_BA:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0672:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1389274957))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2022989943))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1389585752))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(536969754))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2052391454))
                        var_14_107 = mul:double(ldc:double(0.5), add:double(var_9_BA:double, var_14_107:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2014444478))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1703663724))
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1545368981))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1543872671))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(229957542))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DD = xor:int(ldc:int(1280), ldc:int(1281))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0919:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1018088787))
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2036373906))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(742340076))
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(318778083))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-1634178395))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2021331565))
                        var_11_DD = and:int(ldc:int(1633), ldc:int(-1762))
                    }
                    
                    Label_1085:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(904767118))
                        goto(Label_1513)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-909443000))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0919)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1923612204))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1617593045))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-1766801326))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1361064118))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                                goto(Label_1343)
                            }
                        }
                    }
                    
                    Label_1215:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1050095095))
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1656257487))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1826133219))
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0919)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-1484522921))
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1620967275))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_107:double, var_5_7D:int, var_16_10B:int)
                            goto(Label_1502)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1343:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1114149344))
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1058321072))
                        goto(Label_0919)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1632098176))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1640598779))
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1312900926))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(2042444910))
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(558411528))
                        loopcontinue()
                    }
                    
                    var_3_658 = and:int(var_3_658:int, ldc:int(231595330))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_107:double, ldc:double(0.0))
                    Label_1502:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_663 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1513:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1018658249))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(1)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1456972326))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-220043164))
                        goto(Label_0919)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1058219718))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1489100743))
                        var_17_663 = add:int(var_16_10B:int, xor:int(ldc:int(3), ldc:int(2)))
                        looporswitchbreak()
                    }
                }
                
                var_3_658 = and:int(var_3_658:int, ldc:int(-1045303513))
                
                if (cmple:boolean(var_5_7D = var_17_663:int, sub:int(var_6_84:int, xor:int(ldc:int(1040), ldc:int(1041))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
