public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u71f1\ud7e8\u8389\u34df\u385b\uc3e3 {
    public void \u71f1\ud7e8\u8389\u34df\u385b\uc3e3(java.lang.String p0) {
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
            invokespecial:Object(Object::<init>, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3)
            putfield:String(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u1833\u7d52\uc7fe\u759a\u1833\u7873, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, aconstnull:String())
            putfield:String(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u1833\u7d52\uc7fe\u759a\u1833\u7873, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3dd3\ub32d\uc2bd\u6b5f\u64f2\u8d90(java.lang.String p0) {
        var_4_B4 : String
        var_5_69 : int
        var_6_7C : int
        
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
            var_4_B4 = p0:String
            var_5_69 = invokevirtual:int(String::lastIndexOf, p0:String, ldc:int(47))
            
            if (cmpge:boolean(var_5_69:int, ldc:int(0))) {
                var_4_B4 = invokevirtual:String(String::substring, p0:String, add:int(var_5_69:int, and:int(ldc:int(5767), ldc:int(2049))))
            }
            
            var_6_7C = invokevirtual:int(String::lastIndexOf, var_4_B4:String, ldc:int(46))
            
            if (cmpge:boolean(var_6_7C:int, ldc:int(0))) {
                var_4_B4 = invokevirtual:String(String::substring, var_4_B4:String, and:int(ldc:int(-28025), ldc:int(27960)), var_6_7C:int)
            }
            
            return:String(var_4_B4:String)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u5bc4\u4975\ud171\u8308\u392e\u56bd(java.lang.String p0) {
        var_4_66 : int
        
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
            var_4_66 = invokevirtual:int(String::lastIndexOf, p0:String, ldc:int(47))
            return:String(ternaryop:String(cmpge:boolean(var_4_66:int, ldc:int(0)), invokevirtual:String(String::substring, p0:String, and:int(ldc:int(-15742), ldc:int(11557)), var_4_66:int), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(20525), ldc:int(-21038)))))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[] \u7e3f\u4c04\u71ae\u494c\ubb2b\u76bc(java.lang.String p0) {
        var_4_70 : ArrayList
        var_5_81 : String[]
        var_6_8A : int
        var_8_D2 : \u40a9\u600f\ud171\u52d3\uc238\u34df[]
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_4_70 = initobject:ArrayList(ArrayList<E>::<init>)
            var_5_81 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(22560), ldc:int(22561))))
            var_6_8A = and:int(ldc:int(-15143), ldc:int(14594))
            
            while (cmplt:boolean(var_6_8A:int, arraylength:int(var_5_81:String[]))) {
                var_8_D2 = invokevirtual:\u40a9\u600f\ud171\u52d3\uc238\u34df[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ua068\u5db4\u8d90\ube23\u7af6\ub8be, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, loadelement:String(var_5_81:String[], var_6_8A:int))
                
                if (cmpne:boolean(var_8_D2:\u40a9\u600f\ud171\u52d3\uc238\u34df[], aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())) {
                    invokeinterface:boolean(List::addAll, var_4_70:ArrayList[expected:List], invokestatic:List<\u40a9\u600f\ud171\u52d3\uc238\u34df>(Arrays::asList, var_8_D2:\u40a9\u600f\ud171\u52d3\uc238\u34df[]))
                }
                
                inc:int(var_6_8A, ldc:int(1))
            }
            
            return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](checkcast:\u40a9\u600f\ud171\u52d3\uc238\u34df[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[].class, checkcast:\u40a9\u600f\ud171\u52d3\uc238\u34df[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[].class, invokeinterface:Object[](List::toArray, var_4_70:ArrayList[expected:List], newarray:\u40a9\u600f\ud171\u52d3\uc238\u34df[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df.class, invokeinterface:int(List::size, var_4_70:ArrayList[expected:List]))))))
        }
        
        return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u6b0d\uc2bd\u5d20\ub1b9\u3bc9\ua61f(java.lang.String p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
        var_5_65 : \u40a9\u600f\ud171\u52d3\uc238\u34df[]
        
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
        var_5_65 = invokevirtual:\u40a9\u600f\ud171\u52d3\uc238\u34df[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ua068\u5db4\u8d90\ube23\u7af6\ub8be, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, p0:String)
        
        if (cmpeq:boolean(var_5_65:\u40a9\u600f\ud171\u52d3\uc238\u34df[], aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())) {
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        if (cmpeq:boolean(arraylength:int(var_5_65:\u40a9\u600f\ud171\u52d3\uc238\u34df[]), and:int(ldc:int(7329), ldc:int(16657)))) {
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:int(\u40a9\u600f\ud171\u52d3\uc238\u34df::\u8cae\u6c52\u8413\u9af2\ubb2b\u5140, loadelement:\u40a9\u600f\ud171\u52d3\uc238\u34df(var_5_65:\u40a9\u600f\ud171\u52d3\uc238\u34df[], and:int(ldc:int(13548), ldc:int(-15597))))))))
        }
        
        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df[] \ua068\u5db4\u8d90\ube23\u7af6\ub8be(java.lang.String p0) {
        var_4_89 : String[]
        var_5_96 : String
        var_5_B9 : String
        var_6_C2 : int
        var_7_107 : String
        var_8_11E : String[]
        var_9_128 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[]
        var_10_135 : \u40a9\u600f\ud171\u52d3\uc238\u34df[]
        var_11_13E : int
        var_12_164 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_13_16E : int
        var_14_171 : int[]
        
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
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())
        }
        
        p0 = invokevirtual:String(String::trim, p0:String)
        
        if (cmple:boolean(invokevirtual:int(String::length, p0:String), ldc:int(0))) {
            return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())
        }
        
        var_4_89 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(2064), ldc:int(2066))))
        var_5_96 = loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(227), ldc:int(2067)))
        
        if (logicaland:boolean(cmpgt:boolean(arraylength:int(var_4_89:String[]), xor:int(ldc:int(-30703), ldc:int(-30704))), invokevirtual:boolean(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6cfe\u6fb0\uc238\u5d20\u516c\u8709, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_4_89:String[]))) {
            var_5_B9 = loadelement:String(var_4_89:String[], and:int(ldc:int(-22473), ldc:int(18248)))
            var_6_C2 = and:int(ldc:int(6985), ldc:int(17))
        }
        else {
            var_5_B9 = loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(9547), ldc:int(515)))
            var_6_C2 = and:int(ldc:int(-20632), ldc:int(20629))
        }
        
        var_7_107 = loadelement:String(var_4_89:String[], var_6_C2:int)
        var_8_11E = checkcast:String[](java.lang.String[].class, invokestatic:String[](Arrays::copyOfRange, var_4_89:String[], add:int(var_6_C2:int, xor:int(ldc:int(-26496), ldc:int(-26495))), arraylength:int(var_4_89:String[])))
        var_9_128 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u4c2b\ucb79\u97e6\uc229\u97e6\u7330, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_5_B9:String, var_7_107:String)
        
        if (cmpne:boolean(var_9_128:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[], aconstnull:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[]())) {
            var_10_135 = newarray:\u40a9\u600f\ud171\u52d3\uc238\u34df[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u40a9\u600f\ud171\u52d3\uc238\u34df.class, arraylength:int(var_9_128:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[]))
            var_11_13E = and:int(ldc:int(-4985), ldc:int(4728))
            
            while (cmplt:boolean(var_11_13E:int, arraylength:int(var_9_128:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[]))) {
                var_12_164 = loadelement:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(var_9_128:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[], var_11_13E:int)
                var_13_16E = invokevirtual:int(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), var_12_164:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
                var_14_171 = aconstnull:int[]()
                
                if (cmpgt:boolean(arraylength:int(var_8_11E:String[]), ldc:int(0))) {
                    var_14_171 = invokevirtual:int[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6b0d\u8c8a\u6198\u494c\ub18d\u3a62, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_12_164:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, var_8_11E:String[])
                    
                    if (cmpeq:boolean(var_14_171:int[], aconstnull:int[]())) {
                        return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())
                    }
                }
                
                storeelement:\u40a9\u600f\ud171\u52d3\uc238\u34df(var_10_135:\u40a9\u600f\ud171\u52d3\uc238\u34df[], var_11_13E:int, initobject:\u40a9\u600f\ud171\u52d3\uc238\u34df(\u40a9\u600f\ud171\u52d3\uc238\u34df::<init>, var_13_16E:int, var_14_171:int[]))
                inc:int(var_11_13E, ldc:int(1))
            }
            
            return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](var_10_135:\u40a9\u600f\ud171\u52d3\uc238\u34df[])
        }
        
        return:\u40a9\u600f\ud171\u52d3\uc238\u34df[](aconstnull:\u40a9\u600f\ud171\u52d3\uc238\u34df[]())
    }
    
    public boolean \u6cfe\u6fb0\uc238\u5d20\u516c\u8709(java.lang.String[] p0) {
        var_4_7A : String
        
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
        
        if (cmple:boolean(arraylength:int(p0:String[]), and:int(ldc:int(23811), ldc:int(8337)))) {
            return:boolean(and:int[expected:boolean](ldc:int(2828), ldc:int(-2829)))
        }
        
        var_4_7A = loadelement:String(p0:String[], and:int(ldc:int(33), ldc:int(20741)))
        
        if (cmpge:boolean(invokevirtual:int(String::length, var_4_7A:String), xor:int(ldc:int(10306), ldc:int(10307)))) {
            return:boolean(ternaryop:int(invokevirtual:boolean(String::contains, var_4_7A:String, loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(276), ldc:int(272)))), and:int(ldc:int(-8792), ldc:int(8791)), and:int(ldc:int(8193), ldc:int(20633))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-12433), ldc:int(12432)))
    }
    
    public boolean \uc229\u12cb\u516c\u3dd3\u9a18\ub8be(java.lang.String p0) {
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
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            return:boolean(and:int[expected:boolean](ldc:int(-27195), ldc:int(25130)))
        }
        
        if (cmpge:boolean(invokevirtual:int(String::length, p0:String), and:int(ldc:int(16393), ldc:int(1045)))) {
            return:boolean(invokestatic:boolean(Character::isDigit, invokevirtual:char(String::charAt, p0:String, and:int(ldc:int(-20734), ldc:int(20585)))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-10967), ldc:int(10902)))
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[] \u4c2b\ucb79\u97e6\uc229\u97e6\u7330(java.lang.String p0, java.lang.String p1) {
        var_5_80 : String
        var_7_92 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        expr_A5 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[] [generated]
        
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
        var_5_80 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(4389), ldc:int(4391)))), p1:String))
        var_7_92 = invokestatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u52d3\ud4fe\u6c52\u71f1\u3d64\ud4fe::\u6fb0\u92ff\u4f52\u69d9\uf9c5\ub7dc, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_5_80:String))
        
        if (cmpne:boolean(var_7_92:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, aconstnull:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a())) {
            expr_A5 = newarray:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[](\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, xor:int(ldc:int(-31224), ldc:int(-31223)))
            storeelement:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(expr_A5:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[], and:int(ldc:int(1912), ldc:int(-1917)), var_7_92:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
            return:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[](expr_A5:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[])
        }
        
        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(4901), ldc:int(31)))), var_5_80:String)))
        return:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[](aconstnull:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[]())
    }
    
    public int[] \u6b0d\u8c8a\u6198\u494c\ub18d\u3a62(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0, java.lang.String[] p1) {
        var_3_5F : int
        var_5_CB : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_3_D2 : int
        var_6_D8 : Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>
        var_3_DF : int
        var_7_E7 : HashMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, List<Comparable>>
        var_3_126 : int
        var_8_F6 : int
        var_8_3B1 : ArrayList<Integer>
        var_3_3B8 : int
        var_9_3BD : int
        var_3_5D4 : int
        var_10_3CC : int
        var_10_5FE : int[]
        var_3_605 : int
        var_11_60D : int
        var_3_669 : int
        var_11_493 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_9_1BB : String
        var_10_1D5 : String[]
        var_11_215 : String
        var_12_221 : String
        var_13_22A : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d
        var_14_276 : List<Comparable>
        var_15_2A2 : String[]
        var_16_2AB : int
        var_17_2BA : String
        var_18_2C3 : Comparable
        
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
        var_3_5F = and:int(ldc:int(-191592489), ldc:int(-717303855))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(423394903))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-294434260))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-6959146))
                
                if (cmpgt:boolean(arraylength:int(p1:String[]), ldc:int(0))) {
                    var_5_CB = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
                    var_3_D2 = and:int(var_3_5F:int, ldc:int(-541786154))
                    var_6_D8 = invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\uc246\u3711\uc31c\u516c\ud171\uc84e, var_5_CB:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>])
                    var_3_DF = and:int(var_3_D2:int, ldc:int(1584875487))
                    var_7_E7 = initobject:HashMap<Object, List<Comparable>>[expected:Map<Object, List<Comparable>>](HashMap<K, V>::<init>)
                    var_3_126 = and:int(var_3_DF:int, ldc:int(-868432903))
                    var_8_F6 = and:int(ldc:int(-22487), ldc:int(22292))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(8)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(-1806953578))
                            goto(Label_0867)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(1633696278))
                        }
                        else {
                            var_3_126 = and:int(var_3_126:int, ldc:int(-323678256))
                            
                            if (cmpge:boolean(var_8_F6:int, arraylength:int(p1:String[]))) {
                                if (invokeinterface:boolean(Map::isEmpty, var_7_E7:Map<Object, List<Comparable>>)) {
                                    goto(Label_0830)
                                }
                                
                                var_8_3B1 = initobject:ArrayList<Integer>(ArrayList<E>::<init>)
                                var_3_3B8 = and:int(var_3_126:int, ldc:int(-333521967))
                                var_9_3BD = invokestatic:int(\u52d3\ud4fe\u6c52\u71f1\u3d64\ud4fe::\uc29a\u983f\u47c2\u3a62\ub8be\u3d4b, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
                                var_3_5D4 = and:int(var_3_3B8:int, ldc:int(-539656193))
                                var_10_3CC = and:int(ldc:int(9293), ldc:int(-15566))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(64)), ldc:int(0))) {
                                        goto(Label_1455)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2048)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1481800537))
                                        goto(Label_1400)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                                        goto(Label_1101)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-62940204))
                                        
                                        if (cmpge:boolean(var_10_3CC:int, var_9_3BD:int)) {
                                            if (cmpeq:boolean(invokeinterface:int(List<E>::size, var_8_3B1:ArrayList<Integer>[expected:List<Integer>]), var_9_3BD:int)) {
                                                goto(Label_1400)
                                            }
                                            
                                            var_10_5FE = newarray:int[](int.class, invokeinterface:int(List<E>::size, var_8_3B1:ArrayList<Integer>[expected:List<Integer>]))
                                            var_3_605 = and:int(var_3_5D4:int, ldc:int(2117427193))
                                            var_11_60D = and:int(ldc:int(29700), ldc:int(-29701))
                                            
                                            loop {
                                                if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                                                    var_3_605 = and:int(var_3_605:int, ldc:int(1606803197))
                                                    goto(Label_1620)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                                                    var_3_605 = and:int(var_3_605:int, ldc:int(-84921798))
                                                }
                                                else {
                                                    var_3_605 = and:int(var_3_605:int, ldc:int(-1003156514))
                                                    
                                                    if (cmpge:boolean(var_11_60D:int, arraylength:int(var_10_5FE:int[]))) {
                                                        looporswitchbreak()
                                                    }
                                                }
                                                
                                                Label_1599:
                                                
                                                if (cmpne:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                                                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                                                        loopcontinue()
                                                    }
                                                    
                                                    var_3_605 = and:int(var_3_605:int, ldc:int(1299647486))
                                                }
                                                
                                                Label_1620:
                                                
                                                if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                                                    goto(Label_1599)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_3_669 = and:int(var_3_605:int, ldc:int(1425874933))
                                                storeelement:int(var_10_5FE:int[], var_11_60D:int, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Object(List<Object>::get, var_8_3B1:List<Object>, var_11_60D:int))))
                                                var_3_605 = and:int(var_3_669:int, ldc:int(1609937882))
                                                inc:int(var_11_60D, ldc:int(1))
                                            }
                                            
                                            return:int[](var_10_5FE:int[])
                                        }
                                    }
                                    
                                    Label_1027:
                                    
                                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(874839272))
                                        goto(Label_1455)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(32)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1733894766))
                                        goto(Label_1400)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-64358003))
                                    }
                                    else {
                                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-269413957))
                                            loopcontinue()
                                        }
                                        
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-709473326))
                                    }
                                    
                                    try {
                                        Label_1101:
                                        
                                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2048)), ldc:int(0))) {
                                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-2104492835))
                                            goto(Label_1455)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16777216)), ldc:int(0))) {
                                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1234563072))
                                            goto(Label_1400)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(591913736))
                                            goto(Label_1027)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-418051108))
                                        var_11_493 = invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u52d3\ud4fe\u6c52\u71f1\u3d64\ud4fe::\u2dcc\u5bc4\u59ec\u64f2\u960f\uafe7, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, var_10_3CC:int)
                                        
                                        loop {
                                            if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                                                goto(Label_1331)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(4096)), ldc:int(0))) {
                                                goto(Label_1261)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16777216)), ldc:int(0))) {
                                                var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1914658008))
                                            }
                                            else {
                                                var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-537056304))
                                                
                                                if (logicalnot:boolean(invokevirtual:boolean(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ubefe\u52d3\u5f50\u4975\u62da\u4f4a, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_11_493:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_7_E7:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, List<Comparable>>))) {
                                                    goto(Label_1331)
                                                }
                                            }
                                            
                                            Label_1223:
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(4096)), ldc:int(0))) {
                                                goto(Label_1331)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(512)), ldc:int(0))) {
                                                if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                                                    var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1379173435))
                                                    loopcontinue()
                                                }
                                                
                                                var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1979098064))
                                            }
                                            
                                            Label_1261:
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(8)), ldc:int(0))) {
                                                var_3_5D4 = and:int(var_3_5D4:int, ldc:int(825063581))
                                            }
                                            else {
                                                if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                                                    var_3_5D4 = and:int(var_3_5D4:int, ldc:int(355885091))
                                                    goto(Label_1223)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                                                    var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-133238395))
                                                    loopcontinue()
                                                }
                                                
                                                var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1566363638))
                                                invokeinterface:boolean(List<Integer>::add, var_8_3B1:ArrayList<Integer>[expected:List<Integer>], invokestatic:Integer(Integer::valueOf, var_10_3CC:int))
                                            }
                                            
                                            Label_1331:
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(8)), ldc:int(0))) {
                                                goto(Label_1261)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(64)), ldc:int(0))) {
                                                goto(Label_1223)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1073741824)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-631967919))
                                        }
                                        
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-725654574))
                                    }
                                    catch (java.lang.IllegalArgumentException stack_560_0) {
                                    }
                                    
                                    inc:int(var_10_3CC, ldc:int(1))
                                    loopcontinue()
                                    Label_1400:
                                    
                                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-89970507))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(728892977))
                                            goto(Label_1101)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(64)), ldc:int(0))) {
                                            goto(Label_1027)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(262144)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-940104742))
                                    }
                                    
                                    Label_1455:
                                    
                                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                                        goto(Label_1400)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(128)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1760072538))
                                        goto(Label_1101)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1210960568))
                                        goto(Label_1027)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                                        return:int[](aconstnull:int[]())
                                    }
                                    
                                    var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1204110501))
                                }
                            }
                        }
                        
                        Label_0311:
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(-1872080265))
                            goto(Label_0867)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(146602208))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(1712620532))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_3_126:int, ldc:int(64)), ldc:int(0))) {
                                var_3_126 = and:int(var_3_126:int, ldc:int(890481961))
                                loopcontinue()
                            }
                            
                            var_3_126 = and:int(var_3_126:int, ldc:int(2092778493))
                        }
                        
                        Label_0383:
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0867)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_126:int, ldc:int(131072)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_126:int, ldc:int(131072)), ldc:int(0))) {
                                var_3_126 = and:int(var_3_126:int, ldc:int(595988447))
                                goto(Label_0311)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_126:int, ldc:int(4096)), ldc:int(0))) {
                                var_3_126 = and:int(var_3_126:int, ldc:int(1111667954))
                                loopcontinue()
                            }
                            
                            var_3_126 = and:int(var_3_126:int, ldc:int(1301610457))
                            var_9_1BB = loadelement:String(p1:String[], var_8_F6:int)
                            
                            if (cmpgt:boolean(invokevirtual:int(String::length, var_9_1BB:String), ldc:int(0))) {
                                var_10_1D5 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, var_9_1BB:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(5), ldc:int(3078))))
                                
                                if (cmpne:boolean(arraylength:int(var_10_1D5:String[]), and:int(ldc:int(28774), ldc:int(667)))) {
                                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(24966), ldc:int(3670)))), var_9_1BB:String)))
                                    return:int[](aconstnull:int[]())
                                }
                                
                                var_11_215 = loadelement:String(var_10_1D5:String[], and:int(ldc:int(6384), ldc:int(-6905)))
                                var_12_221 = loadelement:String(var_10_1D5:String[], xor:int(ldc:int(165), ldc:int(164)))
                                var_13_22A = invokestatic:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(\u56bd\u0a06\u836c\ud36e\ua068\u6bb9::\u0b8e\u4daf\u3dd3\u946b\u8753\u59ec, var_11_215:String, var_6_D8:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d>)
                                
                                if (cmpeq:boolean(var_13_22A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, aconstnull:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d())) {
                                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(6199), ldc:int(17615)))), var_11_215:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(20480), ldc:int(20488)))), p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:Object])))
                                    return:int[](aconstnull:int[]())
                                }
                                
                                var_14_276 = checkcast:List<Comparable>(java.util.List<java.lang.Comparable>.class, invokeinterface:List<Comparable>(Map<Object, List<Comparable>>::get, var_7_E7:Map<Object, List<Comparable>>, var_11_215:String[expected:Object]))
                                
                                if (cmpeq:boolean(var_14_276:List<Comparable>, aconstnull:List<Comparable>())) {
                                    var_14_276 = initobject:ArrayList<Comparable>[expected:List<Comparable>](ArrayList<E>::<init>)
                                    invokeinterface:List<Comparable>(Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, List<Comparable>>::put, var_7_E7:HashMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, List<Comparable>>[expected:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, List<Comparable>>], var_13_22A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, var_14_276:List<Comparable>)
                                }
                                
                                var_15_2A2 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, var_12_221:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(17505), ldc:int(17512))))
                                var_16_2AB = and:int(ldc:int(25996), ldc:int(-32703))
                                
                                while (cmplt:boolean(var_16_2AB:int, arraylength:int(var_15_2A2:String[]))) {
                                    var_17_2BA = loadelement:String(var_15_2A2:String[], var_16_2AB:int)
                                    var_18_2C3 = invokestatic:Comparable(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6b5f\ud171\ud51e\u4c04\u527a\u8aa5, var_13_22A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, var_17_2BA:String)
                                    
                                    if (cmpeq:boolean(var_18_2C3:Comparable, aconstnull:Comparable())) {
                                        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(1775), ldc:int(26650)))), var_17_2BA:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(21515), ldc:int(75)))), var_11_215:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(5647), ldc:int(5639)))), p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:Object])))
                                        return:int[](aconstnull:int[]())
                                    }
                                    
                                    invokeinterface:boolean(List<?>::add, var_14_276:List<Comparable>, var_18_2C3:Object[expected:?])
                                    inc:int(var_16_2AB, ldc:int(1))
                                }
                            }
                            
                            inc:int(var_8_F6, ldc:int(1))
                            loopcontinue()
                        }
                        
                        Label_0830:
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(256)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_126:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_0383)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_126:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_0311)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_126:int, ldc:int(131072)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_126 = and:int(var_3_126:int, ldc:int(1605820383))
                        }
                        
                        Label_0867:
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(-773063483))
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_126:int, ldc:int(16)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(-423186748))
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_126:int, ldc:int(128)), ldc:int(0))) {
                            var_3_126 = and:int(var_3_126:int, ldc:int(-571993178))
                            goto(Label_0311)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_126:int, ldc:int(512)), ldc:int(0))) {
                            return:int[](aconstnull:int[]())
                        }
                    }
                }
            }
            
            Label_0136:
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2048)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1796655601))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_5F = and:int(var_3_5F:int, ldc:int(-21534730))
            }
            
            Label_0163:
            
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0136)
            }
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                return:int[](aconstnull:int[]())
            }
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(696597955))
        }
    }
    
    public static java.lang.Comparable \u6b5f\ud171\ud51e\u4c04\u527a\u8aa5(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0, java.lang.String p1) {
        var_5_6E : Comparable
        
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
            var_5_6E = invokestatic:Comparable(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u7049\u446c\ubcb0\uceb8\uc31c\u8389, p1:String, invokevirtual:Class(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u8aa5\uc910\u3e2a\u72f1\u6ec6\ud171, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d))
            
            if (cmpeq:boolean(var_5_6E:Comparable, aconstnull:Comparable())) {
                var_5_6E = invokestatic:Comparable(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ub7dc\u3504\u97b7\u67e9\u4f4a\uae87, p1:String, invokevirtual:Collection(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d))
            }
            
            return:Comparable(var_5_6E:Comparable)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Comparable \ub7dc\u3504\u97b7\u67e9\u4f4a\uae87(java.lang.String p0, java.util.Collection<java.lang.Comparable> p1) {
        var_2_61 : int
        var_4_68 : Iterator<Comparable>
        var_5_A8 : Comparable
        
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
        var_2_61 = and:int(ldc:int(1817500551), ldc:int(2145122951))
        var_4_68 = invokeinterface:Iterator<Comparable>(Collection<Comparable>::iterator, p1:Collection<Comparable>)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(626188987))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(1852955343))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_68:Iterator<Comparable>)) {
                    var_5_A8 = checkcast:Comparable(java.lang.Comparable.class, invokeinterface:Comparable(Iterator<Comparable>::next, var_4_68:Iterator<Comparable>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokestatic:Object(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u52d3\uf9c5\u836c\u8d98\u4bc8\u3e2a, var_5_A8:Comparable), p0:String[expected:Object]))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-53355545))
                        loopcontinue()
                    }
                    
                    return:Comparable(var_5_A8:Comparable)
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                return:Comparable(aconstnull:Comparable())
            }
        }
    }
    
    private static java.lang.Object \u52d3\uf9c5\u836c\u8d98\u4bc8\u3e2a(java.lang.Comparable p0) {
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
        
        if (logicalnot:boolean(instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006.class, p0:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006))) {
            return:Object(invokevirtual:String(Object::toString, p0:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[expected:Object]))
        }
        
        return:Object(invokeinterface:String[expected:Object](\u8cae\u392e\u5fe1\u5140\u3dd3\u7006::\u99f7\u4e72\u624e\u527a\u624e\ubefe, checkcast:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006.class, p0:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006)))
    }
    
    public static java.lang.Comparable \u7049\u446c\ubcb0\uceb8\uc31c\u8389(java.lang.String p0, java.lang.Class p1) {
        var_2_61 : int
        
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
        var_2_61 = and:int(ldc:int(-1727268829), ldc:int(-1959482425))
        
        if (cmpeq:boolean(p1:Class<String>, ldc:Class<String>(java.lang.String.class))) {
            return:Comparable(p0:String[expected:Comparable])
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2131172133))
                goto(Label_0341)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0279)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0227)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2021169876))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-813701103))
                
                if (cmpeq:boolean(p1:Class<Boolean>, ldc:Class<Boolean>(java.lang.Boolean.class))) {
                    return:Comparable(invokestatic:Boolean[expected:Comparable](Boolean::valueOf, p0:String))
                }
            }
            
            Label_0166:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0341)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(71247562))
                goto(Label_0279)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-23143758))
            }
            else {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1750078239))
                
                if (cmpeq:boolean(p1:Class<Float>, ldc:Class<Float>(java.lang.Float.class))) {
                    return:Comparable(invokestatic:Float[expected:Comparable](Float::valueOf, p0:String))
                }
            }
            
            Label_0227:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0341)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1252450170))
            }
            else {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0166)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1484476807))
                
                if (cmpeq:boolean(p1:Class<Double>, ldc:Class<Double>(java.lang.Double.class))) {
                    return:Comparable(invokestatic:Double[expected:Comparable](Double::valueOf, p0:String))
                }
            }
            
            Label_0279:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1448684193))
            }
            else {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0227)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(385188359))
                    goto(Label_0166)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1381388523))
                
                if (cmpeq:boolean(p1:Class<Integer>, ldc:Class<Integer>(java.lang.Integer.class))) {
                    return:Comparable(invokestatic:Integer[expected:Comparable](Integer::valueOf, p0:String))
                }
            }
            
            Label_0341:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0279)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0227)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1425041059))
                goto(Label_0166)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                return:Comparable(ternaryop:Long[expected:Comparable](cmpne:boolean(p1:Class<Long>, ldc:Class<Long>(java.lang.Long.class)), aconstnull:Long(), invokestatic:Long(Long::valueOf, p0:String)))
            }
        }
    }
    
    public boolean \ubefe\u52d3\u5f50\u4975\u62da\u4f4a(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, java.util.Map<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, java.util.List<java.lang.Comparable>> p1) {
        var_3_61 : int
        var_5_6D : Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>>
        var_3_7C : int
        var_6_BD : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>
        var_7_CA : List<Comparable>
        var_8_D2 : Comparable
        var_3_DE : int
        
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
        var_3_61 = and:int(ldc:int(556227011), ldc:int(-1032588417))
        var_5_6D = invokeinterface:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>>(Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>>::iterator, invokeinterface:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>>(Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, List<Comparable>>::keySet, p1:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, List<Comparable>>))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                var_3_7C = and:int(var_3_61:int, ldc:int(1457324362))
            }
            else {
                var_3_7C = and:int(var_3_61:int, ldc:int(-63217809))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_5_6D:Iterator)) {
                    var_6_BD = checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>>::next, var_5_6D:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>>))
                    var_7_CA = checkcast:List<Comparable>(java.util.List<java.lang.Comparable>.class, invokeinterface:List<Comparable>(Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, List<Comparable>>::get, p1:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, List<Comparable>>, var_6_BD:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>[expected:Object]))
                    var_8_D2 = invokevirtual:Comparable(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], var_6_BD:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>)
                    
                    if (cmpeq:boolean(var_8_D2:Comparable, aconstnull:Comparable())) {
                        return:boolean(and:int[expected:boolean](ldc:int(-4139), ldc:int(4138)))
                    }
                    
                    var_3_DE = and:int(var_3_7C:int, ldc:int(-1082531973))
                    
                    if (invokeinterface:boolean(List<E>::contains, var_7_CA:List<Comparable>, var_8_D2:Comparable[expected:Object])) {
                        var_3_61 = and:int(var_3_DE:int, ldc:int(595195347))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-13644), ldc:int(13642)))
                }
            }
            
            if (cmpne:boolean(and:int(var_3_7C:int, ldc:int(2)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(4177), ldc:int(26789)))
            }
            
            var_3_61 = and:int(var_3_7C:int, ldc:int(-327524266))
        }
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[] \uc4d2\ubff1\u983f\u6bb9\uc29a\u3711(java.lang.String p0) {
        var_2_61 : int
        var_2_6B : int
        var_4_78 : int
        var_2_91 : int
        var_5_A1 : String[]
        var_6_AA : List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>
        var_7_B3 : int
        var_8_112 : String
        var_9_11A : \u3e75\u92ff\ub83f\u4ab3\u8350\u446c
        var_2_EE : int
        var_7_167 : HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>
        var_8_170 : Iterator<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>
        
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
        var_2_61 = and:int(ldc:int(-727457184), ldc:int(1103815670))
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_2_6B = and:int(var_2_61:int, ldc:int(1788526567))
            p0 = invokevirtual:String(String::trim, p0:String)
            var_4_78 = and:int(ldc:int(16928), ldc:int(-16929))
            
            if (invokevirtual:boolean(String::startsWith, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(268), ldc:int(2110))))) {
                var_4_78 = xor:int(ldc:int(130), ldc:int(131))
                p0 = invokevirtual:String(String::substring, p0:String, and:int(ldc:int(2665), ldc:int(1043)))
            }
            
            var_2_91 = and:int(var_2_6B:int, ldc:int(1724576494))
            var_5_A1 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(4160), ldc:int(4161))))
            var_6_AA = initobject:ArrayList[expected:List](ArrayList::<init>)
            var_7_B3 = and:int(ldc:int(-14822), ldc:int(6533))
            
            while (cmplt:boolean(var_7_B3:int, arraylength:int(var_5_A1:String[]))) {
                var_8_112 = loadelement:String(var_5_A1:String[], var_7_B3:int)
                var_9_11A = invokevirtual:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ub83f\u6c52\u8aa5\u9255\ud36e\u4ab3, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_8_112:String)
                
                if (cmpne:boolean(var_9_11A:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c, aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c())) {
                    invokeinterface:boolean(List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>::add, var_6_AA:List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>, var_9_11A:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c)
                }
                else {
                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(16397), ldc:int(14861)))), var_8_112:String)))
                }
                
                inc:int(var_7_B3, ldc:int(1))
            }
            
            var_2_EE = and:int(var_2_91:int, ldc:int(168749029))
            
            if (cmpne:boolean(var_4_78:int, ldc:int(0))) {
                var_7_167 = initobject:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::<init>, invokestatic:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<? extends \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u516c\u9a18\u600f\ud171\u946b\ubf56::\u8389\u183a\u71ae\u6d99\uc87f\u4975))
                var_8_170 = invokeinterface:Iterator<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>::iterator, var_6_AA:List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>)
                
                loop {
                    var_2_EE = and:int(var_2_EE:int, ldc:int(-1809931666))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_170:Iterator))) {
                        looporswitchbreak()
                    }
                    
                    invokeinterface:boolean(Set<E>::remove, var_7_167:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3e75\u92ff\ub83f\u4ab3\u8350\u446c::\u983f\u3711\ua6bd\ubff1\uc87f\u4e72, checkcast:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(\u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c.class, invokeinterface:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(Iterator<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>::next, var_8_170:Iterator<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>))))
                }
                
                var_6_AA = invokestatic:List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(\u516c\u9a18\u600f\ud171\u946b\ubf56::\u5f50\u51fa\u183a\u5fe1\uafe7\u36d3, var_7_167:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>])
            }
            
            return:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[](checkcast:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[](\u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[].class, invokeinterface:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[](List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>::toArray, var_6_AA:List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>, newarray:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[](\u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c.class, invokeinterface:int(List<E>::size, var_6_AA:List<\u3e75\u92ff\ub83f\u4ab3\u8350\u446c>)))))
        }
        
        return:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[](aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c[]())
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c \ub83f\u6c52\u8aa5\u9255\ud36e\u4ab3(java.lang.String p0) {
        var_2_61 : int
        var_5_76 : \u3e75\u92ff\ub83f\u4ab3\u8350\u446c
        var_2_164 : int
        var_7_C1 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_8_12E : Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>
        var_9_151 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_10_158 : \u3e75\u92ff\ub83f\u4ab3\u8350\u446c
        var_2_D5 : int
        var_5_EC : \u3e75\u92ff\ub83f\u4ab3\u8350\u446c
        stack_1CE_0 : \u3e75\u92ff\ub83f\u4ab3\u8350\u446c [generated]
        
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
        var_2_61 = and:int(ldc:int(1720834674), ldc:int(1067707519))
        p0 = invokevirtual:String(String::toLowerCase, p0:String)
        var_5_76 = invokestatic:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(\u516c\u9a18\u600f\ud171\u946b\ubf56::\uc9f6\ubff1\u718f\u494c\u4492\u8389, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String))
        
        if (cmpeq:boolean(var_5_76:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c, aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c())) {
            var_2_164 = and:int(var_2_61:int, ldc:int(1874460146))
            var_7_C1 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(String::replace, invokevirtual:String(String::replace, p0:String, loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(4128), ldc:int(4129))), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(7255), ldc:int(-7256)))), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(3166), ldc:int(20494))), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(-27811), ldc:int(27680)))))
            
            if (cmpeq:boolean(getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6d99\u527a\u839e\u8709\u9937\u647c), aconstnull:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>())) {
                putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6d99\u527a\u839e\u8709\u9937\u647c, initobject:HashMap<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>](HashMap<K, V>::<init>))
                var_8_12E = invokeinterface:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::iterator, invokestatic:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u516c\u9a18\u600f\ud171\u946b\ubf56::\u8389\u183a\u71ae\u6d99\uc87f\u4975))
                
                loop {
                    var_2_164 = and:int(var_2_164:int, ldc:int(-1481123971))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_12E:Iterator))) {
                        looporswitchbreak()
                    }
                    
                    var_9_151 = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::next, var_8_12E:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))
                    var_10_158 = invokestatic:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(\u516c\u9a18\u600f\ud171\u946b\ubf56::\uc9f6\ubff1\u718f\u494c\u4492\u8389, var_9_151:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                    
                    if (cmpne:boolean(var_10_158:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c, aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c())) {
                        invokeinterface:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>::put, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6d99\u527a\u839e\u8709\u9937\u647c), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_9_151:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(String::toLowerCase, invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_9_151:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(1983), ldc:int(2049))), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(-25999), ldc:int(25990)))), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(4097), ldc:int(4111))), loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(-23401), ldc:int(21096)))))), var_10_158:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c)
                    }
                    
                    var_2_164 = and:int(var_2_164:int, ldc:int(1064424702))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_164:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_D5 = and:int(var_2_164:int, ldc:int(-1473810394))
                }
                else {
                    var_2_D5 = and:int(var_2_164:int, ldc:int(1060887672))
                    var_5_EC = checkcast:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(\u494c\u4975\ua068\u0c95\uc84e.\u3e75\u92ff\ub83f\u4ab3\u8350\u446c.class, invokeinterface:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>::get, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6d99\u527a\u839e\u8709\u9937\u647c), var_7_C1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
                    
                    if (cmpne:boolean(var_5_EC:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c, aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c())) {
                        stack_1CE_0 = var_5_EC:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_D5:int, ldc:int(16777216)), ldc:int(0))) {
                    stack_1CE_0 = aconstnull:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c()
                    looporswitchbreak()
                }
                
                var_2_164 = and:int(var_2_D5:int, ldc:int(-1603237891))
            }
            
            return:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(stack_1CE_0:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c)
        }
        
        return:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c(var_5_76:\u3e75\u92ff\ub83f\u4ab3\u8350\u446c)
    }
    
    public int \u4e72\uf94d\uc4d2\u56bd\u7006\u3d4b(java.lang.String p0, int p1) {
        var_5_76 : int
        
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
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            return:int(p1:int)
        }
        
        p0 = invokevirtual:String(String::trim, p0:String)
        var_5_76 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, p0:String, ldc:int(-1))
        
        if (cmpge:boolean(var_5_76:int, ldc:int(0))) {
            return:int(var_5_76:int)
        }
        
        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(4527), ldc:int(9231)))), p0:String)))
        return:int(p1:int)
    }
    
    public int[] \u6c52\u88c5\u6b5f\u8c8a\ub8be\u8258(java.lang.String p0) {
        var_4_73 : ArrayList<Integer>
        var_5_84 : String[]
        var_6_8D : int
        var_7_CD : String
        var_8_E8 : int
        var_8_113 : String[]
        var_9_130 : int
        var_10_140 : int
        var_11_1D7 : int
        var_6_B6 : int[]
        var_7_BF : int
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_4_73 = initobject:ArrayList<Integer>(ArrayList<E>::<init>)
            var_5_84 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(82), ldc:int(66))))
            var_6_8D = and:int(ldc:int(1669), ldc:int(-1678))
            
            while (cmplt:boolean(var_6_8D:int, arraylength:int(var_5_84:String[]))) {
                var_7_CD = loadelement:String(var_5_84:String[], var_6_8D:int)
                
                if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_7_CD:String, loadelement:String[expected:CharSequence](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(24898), ldc:int(24915)))))) {
                    var_8_E8 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, var_7_CD:String, ldc:int(-1))
                    
                    if (cmpge:boolean(var_8_E8:int, ldc:int(0))) {
                        invokeinterface:boolean(List<Integer>::add, var_4_73:ArrayList<Integer>[expected:List<Integer>], invokestatic:Integer(Integer::valueOf, var_8_E8:int))
                    }
                    else {
                        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-16127), ldc:int(-16114)))), var_7_CD:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(1107), ldc:int(23)))), p0:String)))
                    }
                }
                else {
                    var_8_113 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, var_7_CD:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(433), ldc:int(8209))))
                    
                    if (cmpeq:boolean(arraylength:int(var_8_113:String[]), xor:int(ldc:int(-31711), ldc:int(-31709)))) {
                        var_9_130 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, loadelement:String(var_8_113:String[], and:int(ldc:int(31938), ldc:int(-31939))), ldc:int(-1))
                        var_10_140 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, loadelement:String(var_8_113:String[], xor:int(ldc:int(8707), ldc:int(8706))), ldc:int(-1))
                        
                        if (cmpge:boolean(var_9_130:int, ldc:int(0))) {
                            if (cmpge:boolean(var_10_140:int, ldc:int(0))) {
                                if (cmple:boolean(var_9_130:int, var_10_140:int)) {
                                    var_11_1D7 = var_9_130:int
                                    
                                    while (cmple:boolean(var_11_1D7:int, var_10_140:int)) {
                                        invokeinterface:boolean(List<Integer>::add, var_4_73:ArrayList<Integer>[expected:List<Integer>], invokestatic:Integer(Integer::valueOf, var_11_1D7:int))
                                        inc:int(var_11_1D7, ldc:int(1))
                                    }
                                    
                                    goto(Label_0510)
                                }
                            }
                        }
                        
                        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(342), ldc:int(21554)))), var_7_CD:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(776), ldc:int(795)))), p0:String)))
                    }
                    else {
                        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(660), ldc:int(646)))), var_7_CD:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(9993), ldc:int(10010)))), p0:String)))
                    }
                    
                    Label_0510:
                }
                
                inc:int(var_6_8D, ldc:int(1))
            }
            
            var_6_B6 = newarray:int[](int.class, invokeinterface:int(List<E>::size, var_4_73:ArrayList<Integer>[expected:List<Integer>]))
            var_7_BF = and:int(ldc:int(17720), ldc:int(-17725))
            
            while (cmplt:boolean(var_7_BF:int, arraylength:int(var_6_B6:int[]))) {
                storeelement:int(var_6_B6:int[], var_7_BF:int, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Object(List<Object>::get, var_4_73:List<Object>, var_7_BF:int))))
                inc:int(var_7_BF, ldc:int(1))
            }
            
            return:int[](var_6_B6:int[])
        }
        
        return:int[](aconstnull:int[]())
    }
    
    public boolean[] \u3c25\u8c8a\u8c8a\ub1b9\uc84e\uc246(java.lang.String p0, boolean[] p1) {
        var_5_72 : EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>
        var_6_83 : String[]
        var_7_8C : int
        var_8_C9 : String
        var_9_F7 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_7_B2 : boolean[]
        var_8_BB : int
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_5_72 = invokestatic:EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>(EnumSet<E>::allOf, ldc:Class<\u760c\u4975\u4179\uc246\u8640\u64f2>(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class))
            var_6_83 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(18959), ldc:int(18975))))
            var_7_8C = and:int(ldc:int(-13488), ldc:int(5166))
            
            while (cmplt:boolean(var_7_8C:int, arraylength:int(var_6_83:String[]))) {
                var_8_C9 = loadelement:String(var_6_83:String[], var_7_8C:int)
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_8_C9:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(21), ldc:int(148)))))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_8_C9:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(18621), ldc:int(1045)))))) {
                        var_9_F7 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6bb9\ud51e\u4bc8\u76bc\u12cb\ubff1, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_8_C9:String)
                        
                        if (cmpne:boolean(var_9_F7:\u760c\u4975\u4179\uc246\u8640\u64f2, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2())) {
                            invokevirtual:boolean(AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>::add, var_5_72:EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>], var_9_F7:\u760c\u4975\u4179\uc246\u8640\u64f2)
                        }
                    }
                    else {
                        invokevirtual:boolean(AbstractCollection<Object>::addAll, var_5_72:AbstractCollection<Object>, invokestatic:List<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:Collection<?>](Arrays::asList, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)))
                    }
                }
                else {
                    invokevirtual:boolean(AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>::add, var_5_72:EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>], getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))
                    invokevirtual:boolean(AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>::add, var_5_72:EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>], getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))
                    invokevirtual:boolean(AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>::add, var_5_72:EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>], getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))
                    invokevirtual:boolean(AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>::add, var_5_72:EnumSet<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:AbstractCollection<\u760c\u4975\u4179\uc246\u8640\u64f2>], getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))
                }
                
                inc:int(var_7_8C, ldc:int(1))
            }
            
            var_7_B2 = newarray:boolean[](boolean.class, arraylength:int(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)))
            var_8_BB = and:int(ldc:int(-15399), ldc:int(15398))
            
            while (cmplt:boolean(var_8_BB:int, arraylength:int(var_7_B2:boolean[]))) {
                storeelement:boolean(var_7_B2:boolean[], var_8_BB:int, invokevirtual:boolean(AbstractCollection::contains, var_5_72:EnumSet[expected:AbstractCollection], loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7), var_8_BB:int)))
                inc:int(var_8_BB, ldc:int(1))
            }
            
            return:boolean[](var_7_B2:boolean[])
        }
        
        return:boolean[](p1:boolean[])
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 \u6bb9\ud51e\u4bc8\u76bc\u12cb\ubff1(java.lang.String p0) {
        var_2_61 : int
        
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
        var_2_61 = and:int(ldc:int(-1630327193), ldc:int(182054502))
        p0 = invokevirtual:String(String::toLowerCase, p0:String)
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(9622), ldc:int(2134)))))) {
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(10967), ldc:int(279)))))) {
                if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(6169), ldc:int(24604))))) {
                    goto(Label_0228)
                }
                
                if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-32766), ldc:int(-32741))))) {
                    goto(Label_0228)
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-32736), ldc:int(-32710)))))) {
                    goto(Label_0326)
                }
                
                return:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))
            }
        }
        
        Label_0121:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1444960109))
            goto(Label_0482)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-2145566690))
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0326)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            return:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f))
        }
        
        Label_0228:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0482)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1061935436))
                goto(Label_0121)
            }
            
            return:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))
        }
        
        Label_0326:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1403358392))
            goto(Label_0482)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(386362670))
                goto(Label_0228)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0121)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(2127898495))
            
            if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(16659), ldc:int(16648))))) {
                return:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))
            }
        }
        
        Label_0399:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1589268448))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0326)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1906890675))
                goto(Label_0228)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1967282213))
                goto(Label_0121)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(533949031))
            
            if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(158), ldc:int(5149))))) {
                return:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))
            }
        }
        
        Label_0482:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1449027464))
            goto(Label_0399)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0326)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(64)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(692698168))
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0121)
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-25590), ldc:int(-25577)))))) {
            invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(9247), ldc:int(318)))), p0:String)))
            return:\u760c\u4975\u4179\uc246\u8640\u64f2(aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2())
        }
        
        return:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))
    }
    
    public void \u1833\u92ee\u71ae\u3c25\u416d\u7bad(java.lang.String p0) {
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
            invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(19648), ldc:int(-27841)))), getfield:String(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u1833\u7d52\uc7fe\u759a\u1833\u7873, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3)), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(2527), ldc:int(4639)))), p0:String)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56(java.lang.String p0) {
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
            invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(-6814), ldc:int(6797)))), getfield:String(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u1833\u7d52\uc7fe\u759a\u1833\u7873, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3)), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(9489), ldc:int(9486)))), p0:String)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ub8be\u92ff\uafe7\ud51e\u0c95\u4492 \u8bb0\u61a4\u74b1\u61a4\uae5d\ud158(java.lang.String p0) {
        var_4_73 : \ub8be\u92ff\uafe7\ud51e\u0c95\u4492
        var_5_84 : String[]
        var_6_8D : int
        var_8_C1 : \uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_4_73 = initobject:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492(\ub8be\u92ff\uafe7\ud51e\u0c95\u4492::<init>)
            var_5_84 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(28), ldc:int(12))))
            var_6_8D = and:int(ldc:int(-9401), ldc:int(9272))
            
            while (cmplt:boolean(var_6_8D:int, arraylength:int(var_5_84:String[]))) {
                var_8_C1 = invokespecial:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6cfe\uc87f\u5654\u97b7\u7ce1\u7006, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, loadelement:String(var_5_84:String[], var_6_8D:int))
                
                if (cmpeq:boolean(var_8_C1:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9, aconstnull:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9())) {
                    return:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492(aconstnull:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492())
                }
                
                invokevirtual:void(\ub8be\u92ff\uafe7\ud51e\u0c95\u4492::\u446c\u99f7\u36d3\u6ec6\u7bad\u6bb9, var_4_73:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492, var_8_C1:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9)
                inc:int(var_6_8D, ldc:int(1))
            }
            
            return:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492(var_4_73:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492)
        }
        
        return:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492(aconstnull:\ub8be\u92ff\uafe7\ud51e\u0c95\u4492())
    }
    
    private \u6435\ub8be\u718f\u6b0d\u67e9.\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9 \u6cfe\uc87f\u5654\u97b7\u7ce1\u7006(java.lang.String p0) {
        var_2_61 : int
        var_4_CE : String[]
        var_5_F1 : int
        var_6_101 : int
        var_4_99 : int
        
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
        var_2_61 = and:int(ldc:int(2127430743), ldc:int(-674253197))
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            return:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(aconstnull:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9())
        }
        
        do {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(971305201))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-739330341))
                
                if (cmplt:boolean(invokevirtual:int(String::indexOf, p0:String, ldc:int(45)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_CE = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(156), ldc:int(141))))
                
                if (cmpne:boolean(arraylength:int(var_4_CE:String[]), and:int(ldc:int(2214), ldc:int(258)))) {
                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(10419), ldc:int(804)))), p0:String)))
                    return:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(aconstnull:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9())
                }
                
                var_5_F1 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, loadelement:String(var_4_CE:String[], and:int(ldc:int(5219), ldc:int(-5220))), ldc:int(-1))
                var_6_101 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, loadelement:String(var_4_CE:String[], and:int(ldc:int(4609), ldc:int(13))), ldc:int(-1))
                
                if (logicaland:boolean(cmpge:boolean(var_5_F1:int, ldc:int(0)), cmpge:boolean(var_6_101:int, ldc:int(0)))) {
                    return:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(initobject:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::<init>, var_5_F1:int, var_6_101:int))
                }
                
                invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(32), ldc:int(16416)))), p0:String)))
                return:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(aconstnull:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9())
            }
        } while (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0)))
        
        var_4_99 = invokestatic:int(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u759a\u5db4\u839e\ubf56\ubcb0, p0:String, ldc:int(-1))
        
        if (cmpge:boolean(var_4_99:int, ldc:int(0))) {
            return:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(initobject:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9::<init>, var_4_99:int, var_4_99:int))
        }
        
        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(14373), ldc:int(16739)))), p0:String)))
        return:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9(aconstnull:\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9())
    }
    
    public boolean \u7ce1\ud36e\ud12e\u71f1\u4bc8\u8aa5(java.lang.String p0, boolean p1) {
        var_5_73 : String
        
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
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            return:boolean(p1:boolean)
        }
        
        var_5_73 = invokevirtual:String(String::trim, invokevirtual:String(String::toLowerCase, p0:String))
        
        if (invokevirtual:boolean(String::equals, var_5_73:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(170), ldc:int(10098))))) {
            return:boolean(and:int[expected:boolean](ldc:int(257), ldc:int(3767)))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_5_73:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(31), ldc:int(60)))))) {
            invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(12340), ldc:int(748)))), p0:String)))
            return:boolean(p1:boolean)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(29968), ldc:int(-29973)))
    }
    
    public java.lang.Boolean \u494c\uc2bd\u99f7\u4bc8\u4179\u0c95(java.lang.String p0) {
        var_4_73 : String
        
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
        
        if (cmpeq:boolean(p0:String, aconstnull:String())) {
            return:Boolean(aconstnull:Boolean())
        }
        
        var_4_73 = invokevirtual:String(String::trim, invokevirtual:String(String::toLowerCase, p0:String))
        
        if (invokevirtual:boolean(String::equals, var_4_73:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-31693), ldc:int(-31727))))) {
            return:Boolean(getstatic:Boolean(Boolean::TRUE))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_4_73:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(199), ldc:int(228)))))) {
            invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(320), ldc:int(356)))), p0:String)))
            return:Boolean(aconstnull:Boolean())
        }
        
        return:Boolean(getstatic:Boolean(Boolean::FALSE))
    }
    
    public static int \u12b2\ud171\uafe7\u52d3\ud4fe\u718f(java.lang.String p0, int p1) {
        var_2_11C : int
        stack_12D_0 : int [generated]
        
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
            var_2_11C = and:int(ldc:int(1671270505), ldc:int(-97173318))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_11C = and:int(var_2_11C:int, ldc:int(-44376463))
                    goto(Label_0246)
                }
                
                if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_11C = and:int(var_2_11C:int, ldc:int(1764225824))
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_11C = and:int(var_2_11C:int, ldc:int(1741537213))
                    
                    if (cmpne:boolean(p0:String, aconstnull:String())) {
                        p0 = invokevirtual:String(String::trim, p0:String)
                        goto(Block_12)
                    }
                }
                
                Label_0149:
                
                if (cmpne:boolean(and:int(var_2_11C:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_11C = and:int(var_2_11C:int, ldc:int(1616427338))
                    goto(Label_0246)
                }
                
                if (cmpne:boolean(and:int(var_2_11C:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_11C = and:int(var_2_11C:int, ldc:int(-2089109423))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_11C = and:int(var_2_11C:int, ldc:int(-337644785))
                }
                
                Label_0196:
                
                if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_11C = and:int(var_2_11C:int, ldc:int(1526228494))
                        goto(Label_0149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(8192)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Block_12:
                
                try {
                    Label_0246:
                    
                    if (cmpeq:boolean(and:int(var_2_11C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_11C = and:int(var_2_11C:int, ldc:int(-982453141))
                        goto(Label_0196)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0149)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_11C:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_11C = and:int(var_2_11C:int, ldc:int(-207761512))
                        stack_12D_0 = and:int(invokestatic:int(Integer::parseInt, p0:String, ldc:int(16)), ldc:int(16777215))
                        var_2_11C = and:int(var_2_11C:int, ldc:int(-267405825))
                        return:int(stack_12D_0:int)
                    }
                    
                    loopcontinue()
                }
                catch (java.lang.NumberFormatException var_4_132) {
                    return:int(p1:int)
                }
            }
            
            return:int(p1:int)
        }
        
        goto(Label_0006)
    }
    
    public static int \u5f50\u836c\u494c\u7330\u3711\u416d(java.lang.String p0, int p1) {
        var_2_12F : int
        stack_141_0 : int [generated]
        
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
            var_2_12F = and:int(ldc:int(-625561659), ldc:int(-71489594))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0257)
                }
                
                if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-374280987))
                    goto(Label_0189)
                }
                
                if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-1455742716))
                }
                else {
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-428065))
                    
                    if (cmpne:boolean(p0:String, aconstnull:String())) {
                        p0 = invokevirtual:String(String::trim, p0:String)
                        goto(Block_12)
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-1845840142))
                    goto(Label_0257)
                }
                
                if (cmpne:boolean(and:int(var_2_12F:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-1627406380))
                }
                
                Label_0189:
                
                if (cmpne:boolean(and:int(var_2_12F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-708767501))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_12F = and:int(var_2_12F:int, ldc:int(942526682))
                        goto(Label_0150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_12F = and:int(var_2_12F:int, ldc:int(-296564504))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Block_12:
                
                try {
                    Label_0257:
                    
                    if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_12F:int, ldc:int(256)), ldc:int(0))) {
                        var_2_12F = and:int(var_2_12F:int, ldc:int(-2007667621))
                        goto(Label_0150)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_12F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_12F = and:int(var_2_12F:int, ldc:int(-1627576347))
                        stack_141_0 = l2i:int(and:long(invokestatic:long(Long::parseLong, p0:String, ldc:int(16)), ldc:long(-1L)))
                        var_2_12F = and:int(var_2_12F:int, ldc:int(-542232610))
                        return:int(stack_141_0:int)
                    }
                    
                    var_2_12F = and:int(var_2_12F:int, ldc:int(-1412101647))
                }
                catch (java.lang.NumberFormatException var_4_146) {
                    return:int(p1:int)
                }
            }
            
            return:int(p1:int)
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 \u4d85\u839e\u7e3f\u183a\u1187\u8350(java.lang.String p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1) {
        var_5_77 : \uf995\u4975\u1187\ubff1\u839e\u8389[]
        var_6_80 : int
        var_7_AB : \uf995\u4975\u1187\ubff1\u839e\u8389
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            p0 = invokevirtual:String(String::trim, invokevirtual:String(String::toLowerCase, p0:String))
            var_5_77 = getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389[](\uf995\u4975\u1187\ubff1\u839e\u8389::\u6198\u392e\uc246\u718f\u3e2a\u52d3)
            var_6_80 = and:int(ldc:int(-12438), ldc:int(12437))
            
            while (cmplt:boolean(var_6_80:int, arraylength:int(var_5_77:\uf995\u4975\u1187\ubff1\u839e\u8389[]))) {
                var_7_AB = loadelement:\uf995\u4975\u1187\ubff1\u839e\u8389(var_5_77:\uf995\u4975\u1187\ubff1\u839e\u8389[], var_6_80:int)
                
                if (invokevirtual:boolean(String::equals, p0:String, invokevirtual:String(String::toLowerCase, invokevirtual:String(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::\u9255\u494c\uc9f6\u0c95\u4179\uf94d, var_7_AB:\uf995\u4975\u1187\ubff1\u839e\u8389[expected:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4])))) {
                    return:\uf995\u4975\u1187\ubff1\u839e\u8389(var_7_AB:\uf995\u4975\u1187\ubff1\u839e\u8389)
                }
                
                inc:int(var_6_80, ldc:int(1))
            }
            
            return:\uf995\u4975\u1187\ubff1\u839e\u8389(p1:\uf995\u4975\u1187\ubff1\u839e\u8389)
        }
        
        return:\uf995\u4975\u1187\ubff1\u839e\u8389(p1:\uf995\u4975\u1187\ubff1\u839e\u8389)
    }
    
    public T \u9255\ud7e8\u99f7\uc87f\u7006\u0c95(java.lang.String p0, T[] p1, \u56bd\u8413\u647c\u5bc4\ud158.\u071d\u0a06\u385b\u4f4a\u760c\uc246 p2, java.lang.String p3) {
        var_7_78 : String
        var_8_81 : int
        var_9_DF : T
        var_10_E9 : String
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_7_78 = invokevirtual:String(String::trim, invokevirtual:String(String::toLowerCase, p0:String))
            var_8_81 = and:int(ldc:int(-19247), ldc:int(19214))
            
            while (cmplt:boolean(var_8_81:int, arraylength:int(p1:T[]))) {
                var_9_DF = loadelement:T(p1:T[], var_8_81:int)
                var_10_E9 = invokeinterface:String(\u071d\u0a06\u385b\u4f4a\u760c\uc246<T>::\u4f52\u59ec\u71ae\ufe34\uae87\ud171, p2:\u071d\u0a06\u385b\u4f4a\u760c\uc246<T>, var_9_DF:T)
                
                if (logicaland:boolean(cmpne:boolean(var_10_E9:String, aconstnull:String()), invokevirtual:boolean(String::equals, invokevirtual:String(String::toLowerCase, var_10_E9:String), var_7_78:String[expected:Object]))) {
                    return:T(var_9_DF:T)
                }
                
                inc:int(var_8_81, ldc:int(1))
            }
            
            invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(12303), ldc:int(12330)))), p3:String), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(1375), ldc:int(15007)))), p0:String)))
            return:T(aconstnull:T())
        }
        
        return:T(aconstnull:T())
    }
    
    public T[] \u7ce1\u7043\u34df\u6b5f\u385b\u8753(java.lang.String p0, T[] p1, \u56bd\u8413\u647c\u5bc4\ud158.\u071d\u0a06\u385b\u4f4a\u760c\uc246 p2, java.lang.String p3, T[] p4) {
        var_8_88 : String[]
        var_9_A0 : Object[]
        var_10_A9 : int
        var_12_E3 : T
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            p0 = invokevirtual:String(String::trim, invokevirtual:String(String::toLowerCase, p0:String))
            var_8_88 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(60), ldc:int(61))))
            var_9_A0 = checkcast:Object[](java.lang.Object[].class, checkcast:Object[](java.lang.Object[].class, checkcast:Object[](java.lang.Object[].class, invokestatic:Object[expected:Object[]](Array::newInstance, invokevirtual:Class<?>(Class<T>::getComponentType, invokevirtual:Class<? extends Object[]>(T[]::getClass, p1:T[])), arraylength:int(var_8_88:String[])))))
            var_10_A9 = and:int(ldc:int(21848), ldc:int(-21849))
            
            while (cmplt:boolean(var_10_A9:int, arraylength:int(var_8_88:String[]))) {
                var_12_E3 = invokevirtual:T(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u9255\ud7e8\u99f7\uc87f\u7006\u0c95, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, loadelement:String(var_8_88:String[], var_10_A9:int), p1:T[], p2:\u071d\u0a06\u385b\u4f4a\u760c\uc246, p3:String)
                
                if (cmpeq:boolean(var_12_E3:T, aconstnull:T())) {
                    return:T[](p4:T[])
                }
                
                storeelement:Object(var_9_A0:Object[], var_10_A9:int, var_12_E3:T[expected:Object])
                inc:int(var_10_A9, ldc:int(1))
            }
            
            return:T[](var_9_A0:Object[])
        }
        
        return:T[](aconstnull:T[]())
    }
    
    public java.lang.Enum \ub102\ub6ab\ud51e\u7006\uafe7\u183a(java.lang.String p0, java.lang.Enum[] p1, java.lang.String p2) {
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
            return:Enum(checkcast:Enum(java.lang.Enum.class, invokevirtual:Enum(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u9255\ud7e8\u99f7\uc87f\u7006\u0c95, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, p0:String, p1:Enum[], getstatic:\u071d\u0a06\u385b\u4f4a\u760c\uc246<Enum>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u3c25\u71ae\uc31c\u7049\u120d\u9a18), p2:String)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Enum[] \u5654\u9a18\u446c\u759a\u61a4\u0c95(java.lang.String p0, java.lang.Enum[] p1, java.lang.String p2, java.lang.Enum[] p3) {
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
            return:Enum[](checkcast:Enum[](java.lang.Enum[].class, invokevirtual:Enum[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u7ce1\u7043\u34df\u6b5f\u385b\u8753, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, p0:String, p1:Enum[], getstatic:\u071d\u0a06\u385b\u4f4a\u760c\uc246<Enum>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u3c25\u71ae\uc31c\u7049\u120d\u9a18), p2:String, p3:Enum[])))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8413\u92ee\u3504\u3a62\ud36e\ud36e[] \u71ae\u946b\u718f\u9937\u6198\uc246(java.lang.String p0, java.lang.String p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8413\u92ee\u3504\u3a62\ud36e\ud36e[] p2) {
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
            return:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[](checkcast:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[](\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8413\u92ee\u3504\u3a62\ud36e\ud36e[].class, invokevirtual:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u7ce1\u7043\u34df\u6b5f\u385b\u8753, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, p0:String, invokestatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[](\u8413\u92ee\u3504\u3a62\ud36e\ud36e::values), getstatic:\u071d\u0a06\u385b\u4f4a\u760c\uc246<\u8413\u92ee\u3504\u3a62\ud36e\ud36e>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ua3b4\uff55\u4ab3\ucef1\u4975\u12b2), p1:String, p2:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[])))
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[] \u5140\u12b2\u8413\ud36e\u6b0d\u0800(java.lang.String p0, java.lang.String p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[] p2) {
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
            return:\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[](checkcast:\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[](\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[].class, invokevirtual:\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u7ce1\u7043\u34df\u6b5f\u385b\u8753, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, p0:String, invokestatic:\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[](\u0a06\u7e3f\uc29a\u873d\u494c\u5d20::values), getstatic:\u071d\u0a06\u385b\u4f4a\u760c\uc246<Enum>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u3c25\u71ae\uc31c\u7049\u120d\u9a18), p1:String, p2:\u0a06\u7e3f\uc29a\u873d\u494c\u5d20[])))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u3711\ud51e\uc29a\u983f\u93a2\u8cae \ub19c\ud7e8\u9af2\u494c\u40a9\u62da(java.lang.String p0, java.lang.String p1) {
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
            return:\u3711\ud51e\uc29a\u983f\u93a2\u8cae(ternaryop:\u3711\ud51e\uc29a\u983f\u93a2\u8cae(logicaland:boolean(cmpne:boolean(p0:String, aconstnull:String()), cmpne:boolean(p1:String, aconstnull:String())), initobject:\u3711\ud51e\uc29a\u983f\u93a2\u8cae(\u3711\ud51e\uc29a\u983f\u93a2\u8cae::<init>, p0:String, p1:String), aconstnull:\u3711\ud51e\uc29a\u983f\u93a2\u8cae()))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[] \u3dd3\u1833\u6cfe\ucef1\u6bb9\u718f(java.lang.String p0) {
        var_4_73 : ArrayList<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>
        var_5_84 : String[]
        var_6_8D : int
        var_7_DD : String
        var_8_E5 : \ubf56\ucb79\u64ab\u8cae\u4c2b\ubded
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_4_73 = initobject:ArrayList<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>(ArrayList<E>::<init>)
            var_5_84 = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-22016), ldc:int(-22015))))
            var_6_8D = and:int(ldc:int(15120), ldc:int(-16145))
            
            while (cmplt:boolean(var_6_8D:int, arraylength:int(var_5_84:String[]))) {
                var_7_DD = loadelement:String(var_5_84:String[], var_6_8D:int)
                var_8_E5 = invokespecial:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u8df4\u61a4\u120d\u8258\ub32d\u4cd9, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_7_DD:String)
                
                if (cmpeq:boolean(var_8_E5:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded, aconstnull:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded())) {
                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(4670), ldc:int(1319)))), var_7_DD:String)))
                    return:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](getstatic:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u5654\ub70c\u9af2\u67e9\u8308\uf995))
                }
                
                invokeinterface:boolean(List<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>::add, var_4_73:ArrayList<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>[expected:List<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>], var_8_E5:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded)
                inc:int(var_6_8D, ldc:int(1))
            }
            
            return:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](ternaryop:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](invokeinterface:boolean(List<E>::isEmpty, var_4_73:ArrayList<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>[expected:List<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>]), aconstnull:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](), checkcast:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](\u51fa\u12cb\u7330\u74b1\u6c52.\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[].class, invokeinterface:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](List<E>::toArray, var_4_73:ArrayList<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>[expected:List<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>], newarray:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](\u51fa\u12cb\u7330\u74b1\u6c52.\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded.class, invokeinterface:int(List<E>::size, var_4_73:ArrayList<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>[expected:List<\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded>]))))))
        }
        
        return:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](aconstnull:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[]())
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded \u8df4\u61a4\u120d\u8258\ub32d\u4cd9(java.lang.String p0) {
        var_4_63 : String
        var_5_66 : String
        var_6_6E : int
        var_7_A7 : String
        var_8_B7 : String
        var_7_7B : \u4975\ubff1\u965f\u416d\ua068
        
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
        var_4_63 = p0:String
        var_5_66 = aconstnull:String()
        var_6_6E = invokevirtual:int(String::lastIndexOf, p0:String, ldc:int(58))
        
        if (cmpge:boolean(var_6_6E:int, ldc:int(0))) {
            var_7_A7 = invokevirtual:String(String::substring, p0:String, and:int(ldc:int(14343), ldc:int(-14408)), var_6_6E:int)
            var_8_B7 = invokevirtual:String(String::substring, p0:String, add:int(var_6_6E:int, and:int(ldc:int(65), ldc:int(4133))))
            
            if (logicalor:boolean(invokevirtual:boolean(String::isEmpty, var_8_B7:String), invokevirtual:boolean(String::matches, var_8_B7:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(551), ldc:int(14631)))))) {
                var_4_63 = var_7_A7:String
                var_5_66 = var_8_B7:String
            }
        }
        
        var_7_7B = invokespecial:\u4975\ubff1\u965f\u416d\ua068(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u9255\ud217\uae5d\u64ab\u76bc\u12b2, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_4_63:String)
        
        if (cmpne:boolean(var_7_7B:\u4975\ubff1\u965f\u416d\ua068, aconstnull:\u4975\ubff1\u965f\u416d\ua068())) {
            return:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded(initobject:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded(\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded::<init>, var_7_7B:\u4975\ubff1\u965f\u416d\ua068, invokevirtual:int[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6c52\u88c5\u6b5f\u8c8a\ub8be\u8258, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, var_5_66:String)))
        }
        
        return:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded(aconstnull:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded())
    }
    
    private \u6b0d\u12cb\u156b\u4179\u8bb0.\u4975\ubff1\u965f\u416d\ua068 \u9255\ud217\uae5d\u64ab\u76bc\u12b2(java.lang.String p0) {
        var_4_79 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_5_7E : \uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u4975\ubff1\u965f\u416d\ua068>
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            p0 = invokevirtual:String(String::toLowerCase, p0:String)
            var_4_79 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String)
            var_5_7E = getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u4975\ubff1\u965f\u416d\ua068>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uf995\u3504\u836c\u759a\u8640\ub113)
            return:\u4975\ubff1\u965f\u416d\ua068(ternaryop:\u4975\ubff1\u965f\u416d\ua068(invokevirtual:boolean(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u1187\u97b7\u839e\ub8be\u40a9\u7330, var_5_7E:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u4975\ubff1\u965f\u416d\ua068>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4975\ubff1\u965f\u416d\ua068>], var_4_79:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), checkcast:\u4975\ubff1\u965f\u416d\ua068(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4975\ubff1\u965f\u416d\ua068.class, invokevirtual:Object(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, var_5_7E:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>, var_4_79:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), aconstnull:\u4975\ubff1\u965f\u416d\ua068()))
        }
        
        return:\u4975\ubff1\u965f\u416d\ua068(aconstnull:\u4975\ubff1\u965f\u416d\ua068())
    }
    
    public int[] \u3c25\ub171\u9255\u8389\u6b5f\u16f6(java.lang.String p0) {
        var_2_61 : int
        var_4_6E : TreeSet<Integer>
        var_5_7F : String[]
        var_6_88 : int
        var_7_C3 : String
        var_9_D5 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        var_10_E1 : int
        
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
            var_2_61 = and:int(ldc:int(485030099), ldc:int(1827397075))
            p0 = invokevirtual:String(String::trim, p0:String)
            var_4_6E = initobject:TreeSet<Integer>(TreeSet<E>::<init>)
            var_5_7F = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(4880), ldc:int(4881))))
            var_6_88 = and:int(ldc:int(4321), ldc:int(-4322))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(2095951305))
                
                if (cmpge:boolean(var_6_88:int, arraylength:int(var_5_7F:String[]))) {
                    looporswitchbreak()
                }
                
                var_7_C3 = loadelement:String(var_5_7F:String[], var_6_88:int)
                var_9_D5 = invokestatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u52d3\u74b1\u647c\uc910\ucfaf\u99f7::\ub171\u6cfe\ud51e\u4daf\ub70c\ubded, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_7_C3:String))
                
                if (cmpne:boolean(var_9_D5:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, aconstnull:\u9af2\u1833\u156b\u12cb\u7d52\u6c52())) {
                    var_10_E1 = invokestatic:int(\u52d3\u74b1\u647c\uc910\ucfaf\u99f7::\u8d98\ub6ab\ucb79\u34df\u4ab3\uc87f, var_9_D5:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)
                    
                    if (cmpge:boolean(var_10_E1:int, ldc:int(0))) {
                        invokeinterface:boolean(Set<Integer>::add, var_4_6E:TreeSet<Integer>[expected:Set<Integer>], initobject:Integer(Integer::<init>, var_10_E1:int))
                    }
                    else {
                        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(21022), ldc:int(21047)))), var_9_D5:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object]), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(22058), ldc:int(174)))), var_7_C3:String)))
                    }
                }
                else {
                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(4392), ldc:int(9256)))), var_7_C3:String)))
                }
                
                inc:int(var_6_88, ldc:int(1))
            }
            
            return:int[](invokestatic:int[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u4bc8\u97b7\ufe34\ud12e\u40a9\ud217, checkcast:Integer[](java.lang.Integer[].class, invokeinterface:Integer[](Set<E>::toArray, var_4_6E:TreeSet<Integer>[expected:Set<Integer>], newarray:Integer[](java.lang.Integer.class, invokeinterface:int(Set<E>::size, var_4_6E:TreeSet<Integer>[expected:Set<Integer>]))))))
        }
        
        goto(Label_0006)
    }
    
    public int[] \ub19c\u59ec\u416d\u1187\u6b0d\u156b(java.lang.String p0) {
        var_2_61 : int
        var_4_6E : TreeSet<Integer>
        var_5_7F : String[]
        var_6_88 : int
        var_7_C3 : String
        var_9_D5 : \u9255\u0c95\u4cd9\ube23\u760c
        var_10_E4 : int
        
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
            var_2_61 = and:int(ldc:int(1250463451), ldc:int(-808735873))
            p0 = invokevirtual:String(String::trim, p0:String)
            var_4_6E = initobject:TreeSet<Integer>(TreeSet<E>::<init>)
            var_5_7F = invokestatic:String[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u9937\u6ec6\u8df4\u4f4a\u7e3f\u76bc, p0:String, loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), and:int(ldc:int(1155), ldc:int(4637))))
            var_6_88 = and:int(ldc:int(-27705), ldc:int(27704))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(2058159991))
                
                if (cmpge:boolean(var_6_88:int, arraylength:int(var_5_7F:String[]))) {
                    looporswitchbreak()
                }
                
                var_7_C3 = loadelement:String(var_5_7F:String[], var_6_88:int)
                var_9_D5 = invokestatic:\u9255\u0c95\u4cd9\ube23\u760c(\u8cae\u98a4\u12cb\u8308\uc3e3\u9a18::\u4c04\ufe34\ub83f\u5654\u2dcc\u3711, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_7_C3:String))
                
                if (cmpne:boolean(var_9_D5:\u9255\u0c95\u4cd9\ube23\u760c, aconstnull:\u9255\u0c95\u4cd9\ube23\u760c())) {
                    var_10_E4 = invokevirtual:int(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), var_9_D5:\u9255\u0c95\u4cd9\ube23\u760c<?>)
                    
                    if (cmpge:boolean(var_10_E4:int, ldc:int(0))) {
                        invokeinterface:boolean(Set<Integer>::add, var_4_6E:TreeSet<Integer>[expected:Set<Integer>], initobject:Integer(Integer::<init>, var_10_E4:int))
                    }
                    else {
                        invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(544), ldc:int(524)))), var_9_D5:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object]), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(-8132), ldc:int(-8170)))), var_7_C3:String)))
                    }
                }
                else {
                    invokevirtual:void(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\uc29a\u5140\uc4d2\uc2e8\u7d52\u6c56, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f), xor:int(ldc:int(1143), ldc:int(1116)))), var_7_C3:String)))
                }
                
                inc:int(var_6_88, ldc:int(1))
            }
            
            return:int[](invokestatic:int[](\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u4bc8\u97b7\ufe34\ud12e\u40a9\ud217, checkcast:Integer[](java.lang.Integer[].class, invokeinterface:Integer[](Set<E>::toArray, var_4_6E:TreeSet<Integer>[expected:Set<Integer>], newarray:Integer[](java.lang.Integer.class, invokeinterface:int(Set<E>::size, var_4_6E:TreeSet<Integer>[expected:Set<Integer>]))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_68A_0 : byte[] [generated]
        stack_6E0_0 : byte[] [generated]
        expr_6E : int [generated]
        var_4_5F8 : int
        var_3_5FD : byte[]
        var_5_5FE : int
        var_0_629 : int
        expr_60F : byte [generated]
        stack_658_2 : byte [generated]
        stack_62C_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_678 : byte[]
        var_5_679 : int
        expr_C0 : int [generated]
        var_3_6CE : byte[]
        var_5_6CF : int
        expr_6E3 : byte [generated]
        var_3_E8 : String
        stack_5BF_0 : String[] [generated]
        expr_FA : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(1173685216), ldc:int(1706456003))
            expr_68 = stack_94_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_68A_0 = stack_6E0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NBQM70A9PUcSz7fLrC8/O0TRwcW6Lk1AS/D7BxviuLmjSEcyR5gE/P1XAxsJybG90AAACAExUC0Zsf4BEPjw/wJSBdWs2AstRyyxBAcA+PD/AlL/r+8CEAgO9ftE0bjXBjdRNRSxA+bw+gITtyrV0PT2JjdRNRSrBfXw+PD/AlIF1bXmBC89JQLxw9v+Dz0lAvG67QUNRwyvAQwAS/D7Bxviu9vkLz0lAvG66gUUTf7xAtXI8PQvPSUC8cP7AAtC+fIL17z09C89JQLxw/sACzf4A/kY1rju9C89JQLxvvQHDjnzA9LM9PQvPSUC8bz3BQo77/wNFhUJybbg9C89JQLxuvj2GU333q7hBSNJ3AT6APoCE7cq1dAAACUjSdYGCQD48P8CUgXVruILMEsQ+wcVxAX18Pjw/wJSBdWu4gswSxD7BxW8A+3rUfG+BgEQ+PD/AlIF1anmDzJWJw3+qebb60zhyAXN9x4CA/ocAj49Agj4AxIA9QgP//7k6v8ABwEBBBMFAPrn/e//FAIUEAb8CQDj8PYFEA8L+wYE9AL6++8CDhAC/AB6mIl8"))
            expr_6E = arraylength:int(expr_68:byte[])
            
            if (cmpne:boolean(expr_6E:int, ldc:int(0))) {
                var_4_5F8 = expr_6E:int
                var_3_5FD = newarray:byte[](byte.class, expr_6E:int)
                var_5_5FE = expr_6E:int
                
                loop {
                    var_0_629 = and:int(var_0_61:int, ldc:int(1241176032))
                    var_5_5FE = add:int(var_5_5FE:int, ldc:int(-1))
                    expr_60F = stack_658_2 = loadelement(expr_68, var_5_5FE)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_5FE:int, ldc:int(4)), neg:int(var_4_5F8:int)), ldc:int(0))) {
                        stack_658_2 = stack_62C_0 = add:byte(expr_60F:byte, loadelement:byte(var_3_5FD:byte[], add:int(var_5_5FE:int, ldc:int(4))))
                        goto(Label_1596)
                    }
                    
                    Label_1564:
                    
                    if (cmpne:boolean(and:int(var_0_629:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_629 = and:int(var_0_629:int, ldc:int(-1951337640))
                        stack_658_2 = stack_62C_0 = add:byte(expr_60F:byte, ldc:byte(4))
                    }
                    
                    Label_1596:
                    
                    if (cmpeq:boolean(and:int(var_0_629:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_629 = and:int(var_0_629:int, ldc:int(-2087145759))
                        goto(Label_1564)
                    }
                    
                    var_0_61 = and:int(var_0_629:int, ldc:int(1878239158))
                    storeelement:byte(var_3_5FD:byte[], var_5_5FE:int, stack_658_2:byte)
                    
                    if (cmpne:boolean(var_5_5FE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_68A_0 = stack_6E0_0 = var_3_5FD:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0197)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(115780368))
                }
                else {
                    var_0_61 = and:int(var_0_61:int, ldc:int(167388053))
                    var_2_94 = stack_94_0:byte[]
                    expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                        var_3_678 = newarray:byte[](byte.class, expr_98:int)
                        var_5_679 = expr_98:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(234238776))
                            var_5_679 = add:int(var_5_679:int, ldc:int(-1))
                            storeelement:byte(var_3_678:byte[], var_5_679:int, add:int(shl:int(loadelement:byte(stack_68A_0:byte[], var_5_679:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_679:int, xor:int(ldc:int(16515), ldc:int(16514)))), ldc:int(4)), and:int(ldc:int(4431), ldc:int(2079)))))
                            
                            if (cmpne:boolean(var_5_679:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_68A_0 = stack_6E0_0 = var_3_678:byte[]
                    }
                }
                
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_61:int, ldc:int(796564410))
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(-503558199))
                    expr_C0 = arraylength:int(stack_C0_0:byte[])
                    
                    if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                        var_3_6CE = newarray:byte[](byte.class, expr_C0:int)
                        var_5_6CF = expr_C0:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(1945489402))
                            var_5_6CF = add:int(var_5_6CF:int, ldc:int(-1))
                            expr_6E3 = xor:byte(loadelement:byte(stack_6E0_0:byte[], var_5_6CF:int), ldc:byte(7))
                            storeelement:byte(var_3_6CE:byte[], var_5_6CF:int, add:int(or:int(and:int(shl:int(expr_6E3:byte, and:int(ldc:int(134), ldc:int(24661))), ldc:int(-16)), and:int(shr:int(expr_6E3:byte[expected:int], xor:int(ldc:int(-7934), ldc:int(-7930))), ldc:int(15))), ldc:int(119)))
                            
                            if (cmpne:boolean(var_5_6CF:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_68A_0 = stack_6E0_0 = var_3_6CE:byte[]
                    }
                }
                
                Label_0197:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E8 = initobject:String(String::<init>, stack_DC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_5BF_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8621), ldc:int(2157)))
            expr_FA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(14893), ldc:int(16637)))
            storeelement:String(expr_FA:String[], and:int(ldc:int(-19057), ldc:int(18992)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(-20336), ldc:int(2915)), and:int(ldc:int(2733), ldc:int(-19118))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(-26608), ldc:int(-26607)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(-32233), ldc:int(26080)), and:int(ldc:int(16453), ldc:int(8619))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(6172), ldc:int(656)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(1025), ldc:int(1024)), and:int(ldc:int(2067), ldc:int(1027))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(8236), ldc:int(31)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(259), ldc:int(4611)), xor:int(ldc:int(-32117), ldc:int(-32113))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(9), ldc:int(23209)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(17409), ldc:int(17413)), and:int(ldc:int(25349), ldc:int(5255))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(18698), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(133), ldc:int(12037)), and:int(ldc:int(1038), ldc:int(12814))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(22687), ldc:int(22709)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-32508), ldc:int(-32502)), xor:int(ldc:int(4163), ldc:int(4181))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(18762), ldc:int(18753)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(411), ldc:int(397)), xor:int(ldc:int(2080), ldc:int(2050))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(215), ldc:int(196)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(20519), ldc:int(20485)), xor:int(ldc:int(-31102), ldc:int(-31056))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(8469), ldc:int(3097)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(4662), ldc:int(242)), and:int(ldc:int(1015), ldc:int(4155))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(18946), ldc:int(9619)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(4111), ldc:int(4156)), and:int(ldc:int(28212), ldc:int(52))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(133), ldc:int(154)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(21574), ldc:int(21618)), xor:int(ldc:int(1191), ldc:int(1169))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(12932), ldc:int(18525)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(54), ldc:int(15166)), and:int(ldc:int(18999), ldc:int(503))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(10348), ldc:int(10337)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(1079), ldc:int(14391)), xor:int(ldc:int(292), ldc:int(364))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(14543), ldc:int(773)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(4169), ldc:int(3678)), xor:int(ldc:int(2655), ldc:int(2621))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(74), ldc:int(102)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(2274), ldc:int(367)), and:int(ldc:int(4733), ldc:int(8436))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(519), ldc:int(556)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-32018), ldc:int(-32102)), and:int(ldc:int(390), ldc:int(14055))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(1573), ldc:int(16813)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(11943), ldc:int(390)), and:int(ldc:int(5310), ldc:int(18639))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(9750), ldc:int(4559)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(1470), ldc:int(30927)), xor:int(ldc:int(16530), ldc:int(16436))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(25092), ldc:int(25120)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(6054), ldc:int(182)), xor:int(ldc:int(-30530), ldc:int(-30711))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(1057), ldc:int(8481)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(18615), ldc:int(8895)), xor:int(ldc:int(16493), ldc:int(16549))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(449), ldc:int(467)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(6345), ldc:int(8424)), and:int(ldc:int(986), ldc:int(4319))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(10245), ldc:int(10250)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(6367), ldc:int(26074)), xor:int(ldc:int(10894), ldc:int(10852))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(1086), ldc:int(2342)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(21743), ldc:int(8442)), xor:int(ldc:int(543), ldc:int(737))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(-31694), ldc:int(-31726)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(1022), ldc:int(9470)), and:int(ldc:int(349), ldc:int(22959))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(1193), ldc:int(26681)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(781), ldc:int(8541)), and:int(ldc:int(21277), ldc:int(413))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(1285), ldc:int(1325)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(24666), ldc:int(24903)), xor:int(ldc:int(4304), ldc:int(4605))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(16391), ldc:int(14223)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(1204), ldc:int(1433)), xor:int(ldc:int(4217), ldc:int(4408))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(3082), ldc:int(3072)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(8555), ldc:int(8234)), and:int(ldc:int(22363), ldc:int(475))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(8286), ldc:int(16415)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(24988), ldc:int(24775)), and:int(ldc:int(381), ldc:int(8553))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(17433), ldc:int(17470)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(20841), ldc:int(8553)), xor:int(ldc:int(-24520), ldc:int(-24248))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(30), ldc:int(22926)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(371), ldc:int(25584)), xor:int(ldc:int(12288), ldc:int(12657))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(22549), ldc:int(23)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(19825), ldc:int(887)), xor:int(ldc:int(10336), ldc:int(10516))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(9238), ldc:int(6231)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(13300), ldc:int(375)), and:int(ldc:int(2554), ldc:int(8575))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(20489), ldc:int(20510)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(16890), ldc:int(2426)), xor:int(ldc:int(4195), ldc:int(4381))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(649), ldc:int(661)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(17407), ldc:int(3454)), and:int(ldc:int(8682), ldc:int(1431))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(18447), ldc:int(18476)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(102), ldc:int(484)), and:int(ldc:int(5591), ldc:int(18863))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(-32698), ldc:int(-32699)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(4194), ldc:int(4581)), and:int(ldc:int(17308), ldc:int(6610))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(4286), ldc:int(11547)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(5232), ldc:int(5600)), xor:int(ldc:int(685), ldc:int(824))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(20548), ldc:int(20560)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(405), ldc:int(3991)), xor:int(ldc:int(-32175), ldc:int(-31797))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(27), ldc:int(4251)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(24784), ldc:int(24906)), xor:int(ldc:int(18779), ldc:int(18628))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(18456), ldc:int(4220)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(927), ldc:int(7615)), xor:int(ldc:int(-31570), ldc:int(-31476))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(153), ldc:int(187)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(6066), ldc:int(10662)), xor:int(ldc:int(16764), ldc:int(16602))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(24584), ldc:int(24593)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(8377), ldc:int(8479)), xor:int(ldc:int(-22469), ldc:int(-22125))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(-16357), ldc:int(-16378)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-14926), ldc:int(-15334)), and:int(ldc:int(2478), ldc:int(4524))))
            putstatic:String[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u385b\u7873\u5d20\u4c04\ud523\u960f, expr_FA:String[])
            putstatic:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u5654\ub70c\u9af2\u67e9\u8308\uf995, newarray:\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded[](\u51fa\u12cb\u7330\u74b1\u6c52.\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded.class, and:int(ldc:int(-23481), ldc:int(23224))))
            putstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[](\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u2dcc\u61a4\u8c8a\u52d3\u4c2b\u40a9, newarray:\u8413\u92ee\u3504\u3a62\ud36e\ud36e[](\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8413\u92ee\u3504\u3a62\ud36e\ud36e.class, and:int(ldc:int(459), ldc:int(-13260))))
            putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u6d99\u527a\u839e\u8709\u9937\u647c, aconstnull:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3e75\u92ff\ub83f\u4ab3\u8350\u446c>())
            putstatic:\u071d\u0a06\u385b\u4f4a\u760c\uc246<Enum>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\u3c25\u71ae\uc31c\u7049\u120d\u9a18, initobject:\ub113\u8389\u99f7\u6c56\u983f\uceb8[expected:\u071d\u0a06\u385b\u4f4a\u760c\uc246<Enum>](\ub113\u8389\u99f7\u6c56\u983f\uceb8::<init>))
            putstatic:\u071d\u0a06\u385b\u4f4a\u760c\uc246<\u8413\u92ee\u3504\u3a62\ud36e\ud36e>(\u71f1\ud7e8\u8389\u34df\u385b\uc3e3::\ua3b4\uff55\u4ab3\ucef1\u4975\u12b2, initobject:\ubb2b\ub8be\u8d90\u647c\u4975\uc7fe[expected:\u071d\u0a06\u385b\u4f4a\u760c\uc246<\u8413\u92ee\u3504\u3a62\ud36e\ud36e>](\ubb2b\ub8be\u8d90\u647c\u4975\uc7fe::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\uc31c\u965f\u52d3\u92ee\ud4fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67A : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_685 : int
        
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
        var_3_67A = and:int(ldc:int(-1691103453), ldc:int(400412453))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71f1\ud7e8\u8389\u34df\u385b\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(-1691822601))
        }
        else {
            var_3_67A = and:int(var_3_67A:int, ldc:int(1668661181))
            var_5_8A = and:int(ldc:int(19220), ldc:int(-19221))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1617), ldc:int(1616)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67A:int, ldc:int(-1078231263))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(53), ldc:int(9929)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(1122), ldc:int(1123)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67A = and:int(var_3_E3:int, ldc:int(387841845))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(20547), ldc:int(1685)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-17538684))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1080130973))
                        goto(Label_1373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2070687172))
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1890276437))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(2003053677))
                    }
                    else {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-281035929))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1892336843))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1078485275))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-722458758))
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(97071699))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1692672219))
                        var_11_F4 = and:int(ldc:int(28712), ldc:int(-28992))
                        goto(Label_1544)
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1896495359))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1492154407))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-84825945))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(438537851))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(61956077))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1760636183))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-493221730))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1024535274))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(597290865))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1439661012))
                        goto(Label_1373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-729210476))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1669714282))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-423450390))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1602862713))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(397753257))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(1027), ldc:int(20513))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0972:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-670788952))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(375261615))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(777319106))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-224233017))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1678516229))
                        var_11_F4 = and:int(ldc:int(-24441), ldc:int(22136))
                    }
                    
                    Label_1132:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1987162555))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1980173908))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1595379565))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1373)
                            }
                        }
                    }
                    
                    Label_1238:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1132)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1148181804))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(185674864))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-139938199))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(2089924314))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1331277603))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1544)
                    }
                    
                    Label_1373:
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-8922718))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1342660690))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-177326822))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1361228364))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-972056331))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2051975004))
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-705024011))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1210320423))
                        loopcontinue()
                    }
                    
                    var_3_67A = and:int(var_3_67A:int, ldc:int(-1894540505))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_685 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-644865896))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1731680387))
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1638489507))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(322912063))
                        var_17_685 = add:int(var_16_122:int, and:int(ldc:int(17473), ldc:int(8219)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67A = and:int(var_3_67A:int, ldc:int(-1558986841))
                
                if (cmple:boolean(var_5_8A = var_17_685:int, sub:int(var_6_91:int, and:int(ldc:int(13351), ldc:int(2689))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(643978662))
            goto(Label_0108)
        }
    }
}
