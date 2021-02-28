public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\ubcb0\u5db4\u9937\u1833\uc3e3\u8709 {
    public void \ubcb0\u5db4\u9937\u1833\uc3e3\u8709() {
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
            invokespecial:Object(Object::<init>, this:\ubcb0\u5db4\u9937\u1833\uc3e3\u8709)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3711\u12b2\u4e72\u718f\uae5d\uc238() {
        var_0_5F : int
        var_2_69 : \uc238\u92ff\u8c8a\u59ec\uae5d[]
        var_3_6C : int
        var_4_74 : int
        var_5_93 : \uc238\u92ff\u8c8a\u59ec\uae5d
        
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
            var_0_5F = and:int(ldc:int(1340193917), ldc:int(-805571311))
            putstatic:List<\uc238\u92ff\u8c8a\u59ec\uae5d>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d, invokestatic:ArrayList[expected:List<\uc238\u92ff\u8c8a\u59ec\uae5d>](Lists::newArrayList))
            var_2_69 = getstatic:\uc238\u92ff\u8c8a\u59ec\uae5d[](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucb79\ub113\u12b2\ub113\u6b0d\u1187)
            var_3_6C = arraylength:int(var_2_69:\uc238\u92ff\u8c8a\u59ec\uae5d[])
            var_4_74 = and:int(ldc:int(-940), ldc:int(939))
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(1207287291))
                
                if (cmpge:boolean(var_4_74:int, var_3_6C:int)) {
                    looporswitchbreak()
                }
                
                var_5_93 = loadelement:\uc238\u92ff\u8c8a\u59ec\uae5d(var_2_69:\uc238\u92ff\u8c8a\u59ec\uae5d[], var_4_74:int)
                putfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\u0c95\u392e\u7c6b\u3dd3\u983f\u759a, var_5_93:\uc238\u92ff\u8c8a\u59ec\uae5d, and:int(ldc:int(3346), ldc:int(-7448)))
                invokeinterface:boolean(List<\uc238\u92ff\u8c8a\u59ec\uae5d>::add, getstatic:List<\uc238\u92ff\u8c8a\u59ec\uae5d>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d), var_5_93:\uc238\u92ff\u8c8a\u59ec\uae5d)
                inc:int(var_4_74, ldc:int(1))
            }
            
            putstatic:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ua61f\ub7dc\u8df4\ucef1\ub113\u7043, aconstnull:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \uc84e\ufcaf\u59ec\uc2bd\u7af6\u7006() {
        var_0_5F : int
        var_2_67 : int
        var_3_7A : Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>
        var_4_B3 : \uc238\u92ff\u8c8a\u59ec\uae5d
        
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
            var_0_5F = and:int(ldc:int(-559638986), ldc:int(-1125318917))
            var_2_67 = and:int(ldc:int(-20260), ldc:int(18179))
            putstatic:int(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u3d64\u4492\u3e75\ub6ab\u527a\u51fa, and:int(ldc:int(5513), ldc:int(-5546)))
            var_3_7A = invokeinterface:Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>(List<\uc238\u92ff\u8c8a\u59ec\uae5d>::iterator, getstatic:List<\uc238\u92ff\u8c8a\u59ec\uae5d>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-691037110))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-555106569))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_3_7A:Iterator)) {
                        var_4_B3 = checkcast:\uc238\u92ff\u8c8a\u59ec\uae5d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc238\u92ff\u8c8a\u59ec\uae5d.class, invokeinterface:\uc238\u92ff\u8c8a\u59ec\uae5d(Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>::next, var_3_7A:Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>))
                        
                        if (cmpgt:boolean(getfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\uc2bd\u0a06\u6cfe\u6b5f\u59ec\ud36e, var_4_B3:\uc238\u92ff\u8c8a\u59ec\uae5d), ldc:int(0))) {
                            if (cmplt:boolean(getfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\u0c95\u392e\u7c6b\u3dd3\u983f\u759a, var_4_B3:\uc238\u92ff\u8c8a\u59ec\uae5d), getfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\uc2bd\u0a06\u6cfe\u6b5f\u59ec\ud36e, var_4_B3:\uc238\u92ff\u8c8a\u59ec\uae5d))) {
                                var_2_67 = xor:int(ldc:int(165), ldc:int(164))
                            }
                        }
                        
                        var_0_5F = and:int(var_0_5F:int, ldc:int(-1128868301))
                        putstatic:int(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u3d64\u4492\u3e75\ub6ab\u527a\u51fa, add:int(getstatic:int(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u3d64\u4492\u3e75\ub6ab\u527a\u51fa), getfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\u8389\ud4fe\u12cb\u4492\u2dcc\ubded, var_4_B3:\uc238\u92ff\u8c8a\u59ec\uae5d)))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(var_2_67:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u1833\u8aa5\u6198\u416d\u8753 \u1187\u71f1\u59ec\ubcb0\u5d20\uc31c(java.lang.Class<? extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u1833\u8aa5\u6198\u416d\u8753> p0, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p1, java.util.Random p2, int p3, int p4, int p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p6, int p7) {
        var_10_64 : \u1833\u8aa5\u6198\u416d\u8753
        
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
            var_10_64 = aconstnull:\u1833\u8aa5\u6198\u416d\u8753()
            
            if (cmpne:boolean(p0:Class<\u446c\ua6bd\u51b2\u494c\u6d69>, ldc:Class<\u446c\ua6bd\u51b2\u494c\u6d69>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u446c\ua6bd\u51b2\u494c\u6d69.class))) {
                if (cmpne:boolean(p0:Class<\u36d3\uc229\u8cae\u61a4\u071d>, ldc:Class<\u36d3\uc229\u8cae\u61a4\u071d>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u36d3\uc229\u8cae\u61a4\u071d.class))) {
                    if (cmpne:boolean(p0:Class<\ud7e8\u6198\ub83f\u983f\u6198>, ldc:Class<\ud7e8\u6198\ub83f\u983f\u6198>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ud7e8\u6198\ub83f\u983f\u6198.class))) {
                        if (cmpne:boolean(p0:Class<\u4f52\u5654\ud36e\ubb2b\u446c>, ldc:Class<\u4f52\u5654\ud36e\ubb2b\u446c>(\u36d3\u9033\u6b0d\u983f\u8d90.\u4f52\u5654\ud36e\ubb2b\u446c.class))) {
                            if (cmpne:boolean(p0:Class<\ucef1\ubf56\u927d\u88c5\ub6ab>, ldc:Class<\ucef1\ubf56\u927d\u88c5\ub6ab>(\ud36e\u6bb9\u960f\u4c04\u64ab.\ucef1\ubf56\u927d\u88c5\ub6ab.class))) {
                                if (cmpne:boolean(p0:Class<\u760c\u8df4\u960f\u3bc9\ud158>, ldc:Class<\u760c\u8df4\u960f\u3bc9\ud158>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u760c\u8df4\u960f\u3bc9\ud158.class))) {
                                    if (cmpne:boolean(p0:Class<\u183a\u4f52\ufe34\u6b0d\uc246>, ldc:Class<\u183a\u4f52\ufe34\u6b0d\uc246>(\u5d20\u97b7\u8753\u873d\u16f6.\u183a\u4f52\ufe34\u6b0d\uc246.class))) {
                                        if (cmpne:boolean(p0:Class<\ub32d\u3a62\ua61f\u6bb9\u624e>, ldc:Class<\ub32d\u3a62\ua61f\u6bb9\u624e>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\ub32d\u3a62\ua61f\u6bb9\u624e.class))) {
                                            if (cmpne:boolean(p0:Class<\u7006\ub7dc\u7043\ud36e\u12cb>, ldc:Class<\u7006\ub7dc\u7043\ud36e\u12cb>(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u7006\ub7dc\u7043\ud36e\u12cb.class))) {
                                                if (cmpne:boolean(p0:Class<\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4>, ldc:Class<\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4.class))) {
                                                    if (cmpeq:boolean(p0:Class<\uc3e3\u183a\u8350\u6fb0\ud7e8>, ldc:Class<\uc3e3\u183a\u8350\u6fb0\ud7e8>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc3e3\u183a\u8350\u6fb0\ud7e8.class))) {
                                                        var_10_64 = invokestatic:\uc3e3\u183a\u8350\u6fb0\ud7e8[expected:\u1833\u8aa5\u6198\u416d\u8753](\uc3e3\u183a\u8350\u6fb0\ud7e8::\u7049\u6d99\u97e6\u56bd\ubff1\u8c8a, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                                    }
                                                }
                                                else {
                                                    var_10_64 = invokestatic:\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4[expected:\u1833\u8aa5\u6198\u416d\u8753](\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4::\ub7dc\uc31c\u7873\u3bd6\u385b\u3bd6, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                                }
                                            }
                                            else {
                                                var_10_64 = invokestatic:\u7006\ub7dc\u7043\ud36e\u12cb[expected:\u1833\u8aa5\u6198\u416d\u8753](\u7006\ub7dc\u7043\ud36e\u12cb::\u759a\u7ce1\u7006\ub83f\u983f\ufcaf, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                            }
                                        }
                                        else {
                                            var_10_64 = invokestatic:\ub32d\u3a62\ua61f\u6bb9\u624e[expected:\u1833\u8aa5\u6198\u416d\u8753](\ub32d\u3a62\ua61f\u6bb9\u624e::\u7e3f\ub32d\ud36e\ud51e\u8640\ube23, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                        }
                                    }
                                    else {
                                        var_10_64 = invokestatic:\u183a\u4f52\ufe34\u6b0d\uc246[expected:\u1833\u8aa5\u6198\u416d\u8753](\u183a\u4f52\ufe34\u6b0d\uc246::\u56bd\ud523\u1187\u6b5f\u59ec\u960f, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                    }
                                }
                                else {
                                    var_10_64 = invokestatic:\u760c\u8df4\u960f\u3bc9\ud158[expected:\u1833\u8aa5\u6198\u416d\u8753](\u760c\u8df4\u960f\u3bc9\ud158::\ub8be\u7873\ub102\u4f52\u385b\u64ab, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                }
                            }
                            else {
                                var_10_64 = invokestatic:\ucef1\ubf56\u927d\u88c5\ub6ab[expected:\u1833\u8aa5\u6198\u416d\u8753](\ucef1\ubf56\u927d\u88c5\ub6ab::\u3711\ufcaf\u3711\u98a4\uc910\ud51e, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                            }
                        }
                        else {
                            var_10_64 = invokestatic:\u4f52\u5654\ud36e\ubb2b\u446c[expected:\u1833\u8aa5\u6198\u416d\u8753](\u4f52\u5654\ud36e\ubb2b\u446c::\u7c6b\u494c\u93a2\u6c52\u92ee\ua068, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                        }
                    }
                    else {
                        var_10_64 = invokestatic:\ud7e8\u6198\ub83f\u983f\u6198[expected:\u1833\u8aa5\u6198\u416d\u8753](\ud7e8\u6198\ub83f\u983f\u6198::\u7049\ub102\u56bd\u4f4a\u7af6\ub32d, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                    }
                }
                else {
                    var_10_64 = invokestatic:\u36d3\uc229\u8cae\u61a4\u071d[expected:\u1833\u8aa5\u6198\u416d\u8753](\u36d3\uc229\u8cae\u61a4\u071d::\u71ae\uc9f6\u8709\uae87\u760c\ub70c, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                }
            }
            else {
                var_10_64 = invokestatic:\u446c\ua6bd\u51b2\u494c\u6d69[expected:\u1833\u8aa5\u6198\u416d\u8753](\u446c\ua6bd\u51b2\u494c\u6d69::\u99f7\u4daf\u647c\u5d20\u7af6\ud523, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
            }
            
            return:\u1833\u8aa5\u6198\u416d\u8753(var_10_64:\u1833\u8aa5\u6198\u416d\u8753)
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u1833\u8aa5\u6198\u416d\u8753 \ud171\u6bb9\u8350\ud158\u4f4a\u3e2a(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330 p0, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p1, java.util.Random p2, int p3, int p4, int p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p6, int p7) {
        var_8_61 : int
        var_10_C1 : \u1833\u8aa5\u6198\u416d\u8753
        var_8_1B9 : int
        var_10_9E : int
        var_11_11C : int
        var_12_126 : Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>
        var_13_16B : \uc238\u92ff\u8c8a\u59ec\uae5d
        var_14_1D8 : \u1833\u8aa5\u6198\u416d\u8753
        expr_1ED : \uc238\u92ff\u8c8a\u59ec\uae5d [generated]
        var_11_FC : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        
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
        var_8_61 = and:int(ldc:int(-1173542476), ldc:int(-813697089))
        
        if (logicalnot:boolean(invokestatic:boolean(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\uc84e\ufcaf\u59ec\uc2bd\u7af6\u7006))) {
            return:\u1833\u8aa5\u6198\u416d\u8753(aconstnull:\u1833\u8aa5\u6198\u416d\u8753())
        }
        
        loop {
            if (cmpne:boolean(and:int(var_8_61:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_61 = and:int(var_8_61:int, ldc:int(-1790649509))
            }
            else {
                var_8_61 = and:int(var_8_61:int, ldc:int(773662647))
                
                if (cmpne:boolean(getstatic:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ua61f\ub7dc\u8df4\ucef1\ub113\u7043), aconstnull:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>())) {
                    var_10_C1 = invokestatic:\u1833\u8aa5\u6198\u416d\u8753(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u1187\u71f1\u59ec\ubcb0\u5d20\uc31c, getstatic:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ua61f\ub7dc\u8df4\ucef1\ub113\u7043), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                    putstatic:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ua61f\ub7dc\u8df4\ucef1\ub113\u7043, aconstnull:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>())
                    
                    if (cmpne:boolean(var_10_C1:\u1833\u8aa5\u6198\u416d\u8753, aconstnull:\u1833\u8aa5\u6198\u416d\u8753())) {
                        return:\u1833\u8aa5\u6198\u416d\u8753(var_10_C1:\u1833\u8aa5\u6198\u416d\u8753)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_8_61:int, ldc:int(16)), ldc:int(0))) {
                var_8_1B9 = and:int(var_8_61:int, ldc:int(-624958474))
                var_10_9E = and:int(ldc:int(-2971), ldc:int(410))
                
                while (cmplt:boolean(var_10_9E:int, xor:int(ldc:int(724), ldc:int(721)))) {
                    inc:int(var_10_9E, ldc:int(1))
                    var_11_11C = invokevirtual:int(Random::nextInt, p2:Random, getstatic:int(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u3d64\u4492\u3e75\ub6ab\u527a\u51fa))
                    var_12_126 = invokeinterface:Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>(List<\uc238\u92ff\u8c8a\u59ec\uae5d>::iterator, getstatic:List<\uc238\u92ff\u8c8a\u59ec\uae5d>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_8_1B9:int, ldc:int(32)), ldc:int(0))) {
                            var_8_1B9 = and:int(var_8_1B9:int, ldc:int(-1161468425))
                            
                            if (invokeinterface:boolean(Iterator::hasNext, var_12_126:Iterator)) {
                                var_13_16B = checkcast:\uc238\u92ff\u8c8a\u59ec\uae5d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc238\u92ff\u8c8a\u59ec\uae5d.class, invokeinterface:\uc238\u92ff\u8c8a\u59ec\uae5d(Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>::next, var_12_126:Iterator<\uc238\u92ff\u8c8a\u59ec\uae5d>))
                                var_11_11C = sub:int(var_11_11C:int, getfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\u8389\ud4fe\u12cb\u4492\u2dcc\ubded, var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d))
                                
                                if (cmplt:boolean(var_11_11C:int, ldc:int(0))) {
                                    if (logicalnot:boolean(invokevirtual:boolean(\uc238\u92ff\u8c8a\u59ec\uae5d::\u3e2a\u69d9\u8350\u4f4a\u759a\ua3b4, var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d, p7:int))) {
                                        goto(Label_0321)
                                    }
                                    
                                    if (cmpne:boolean(var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d, getfield:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc2bd\u6cfe\u8aa5\u3bd6\u7330::\u6b0d\u8df4\u4179\u51fa\u8350\u7e3f, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330))) {
                                        goto(Label_0428)
                                    }
                                    
                                    goto(Label_0321)
                                }
                                
                                Label_0380:
                                
                                if (cmpne:boolean(and:int(var_8_1B9:int, ldc:int(16)), ldc:int(0))) {
                                    var_8_1B9 = and:int(var_8_1B9:int, ldc:int(-1700286977))
                                    loopcontinue()
                                }
                                
                                Label_0428:
                                
                                if (cmpne:boolean(and:int(var_8_1B9:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_8_1B9 = and:int(var_8_1B9:int, ldc:int(-174046950))
                                    goto(Label_0380)
                                }
                                
                                var_8_1B9 = and:int(var_8_1B9:int, ldc:int(-72040970))
                                var_14_1D8 = invokestatic:\u1833\u8aa5\u6198\u416d\u8753(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u1187\u71f1\u59ec\ubcb0\u5d20\uc31c, getfield:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>(\uc238\u92ff\u8c8a\u59ec\uae5d::\u156b\u4cd9\u5fe1\u7873\u946b\u51b2, var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d), p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int)
                                
                                if (cmpeq:boolean(var_14_1D8:\u1833\u8aa5\u6198\u416d\u8753, aconstnull:\u1833\u8aa5\u6198\u416d\u8753())) {
                                    goto(Label_0380)
                                }
                                
                                expr_1ED = var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d
                                putfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\u0c95\u392e\u7c6b\u3dd3\u983f\u759a, expr_1ED:\uc238\u92ff\u8c8a\u59ec\uae5d, add:int(getfield:int(\uc238\u92ff\u8c8a\u59ec\uae5d::\u0c95\u392e\u7c6b\u3dd3\u983f\u759a, expr_1ED:\uc238\u92ff\u8c8a\u59ec\uae5d), xor:int(ldc:boolean(0), ldc:boolean(1))))
                                putfield:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc2bd\u6cfe\u8aa5\u3bd6\u7330::\u6b0d\u8df4\u4179\u51fa\u8350\u7e3f, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330, var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d)
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\uc238\u92ff\u8c8a\u59ec\uae5d::\u4f52\ua61f\u3bd6\u64ab\u8c8a\u36d3, var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d))) {
                                    invokeinterface:boolean(List<E>::remove, getstatic:List<\uc238\u92ff\u8c8a\u59ec\uae5d>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d), var_13_16B:\uc238\u92ff\u8c8a\u59ec\uae5d[expected:Object])
                                }
                                
                                return:\u1833\u8aa5\u6198\u416d\u8753(var_14_1D8:\u1833\u8aa5\u6198\u416d\u8753)
                            }
                        }
                        
                        Label_0321:
                        
                        if (cmpeq:boolean(and:int(var_8_1B9:int, ldc:int(1024)), ldc:int(0))) {
                            var_8_1B9 = and:int(var_8_1B9:int, ldc:int(-1625921602))
                            looporswitchbreak()
                        }
                        
                        var_8_1B9 = and:int(var_8_1B9:int, ldc:int(1234402829))
                    }
                }
                
                var_11_FC = invokestatic:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u2dcc\ud7e8\u4179\ub18d\u8cae::\u3504\u6b5f\u0c95\u624e\u647c\u8709, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2)
                return:\u1833\u8aa5\u6198\u416d\u8753(ternaryop:\u2dcc\ud7e8\u4179\ub18d\u8cae(logicaland:boolean(cmpne:boolean(var_11_FC:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, aconstnull:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6()), cmpgt:boolean(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_11_FC:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), xor:int(ldc:int(8466), ldc:int(8467)))), initobject:\u2dcc\ud7e8\u4179\ub18d\u8cae(\u2dcc\ud7e8\u4179\ub18d\u8cae::<init>, p7:int, var_11_FC:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p6:\u760c\u4975\u4179\uc246\u8640\u64f2), aconstnull:\u2dcc\ud7e8\u4179\ub18d\u8cae()))
            }
        }
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff \u5245\u416d\u965f\u946b\u6198\u3c25(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330 p0, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff> p1, java.util.Random p2, int p3, int p4, int p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p6, int p7) {
        var_8_63 : int
        var_10_DC : \u1833\u8aa5\u6198\u416d\u8753
        
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
        var_8_63 = and:int(ldc:int(733065881), ldc:int(-390751107))
        
        if (cmpgt:boolean(p7:int, ldc:int(50))) {
            return:\uc7fe\u12cb\u1833\u67e9\u92ff(aconstnull:\uc7fe\u12cb\u1833\u67e9\u92ff())
        }
        
        loop {
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(16)), ldc:int(0))) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1392795655))
                
                if (cmple:boolean(invokestatic:int(Math::abs, sub:int(p3:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u8bb0\u3dd3\u0800\u416d\u3e75\uc2e8, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330[expected:\uc7fe\u12cb\u1833\u67e9\u92ff])))), ldc:int(112))) {
                    if (cmple:boolean(invokestatic:int(Math::abs, sub:int(p5:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\uc7fe\u12cb\u1833\u67e9\u92ff::\u8bb0\u3dd3\u0800\u416d\u3e75\uc2e8, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330[expected:\uc7fe\u12cb\u1833\u67e9\u92ff])))), ldc:int(112))) {
                        var_10_DC = invokestatic:\u1833\u8aa5\u6198\u416d\u8753(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ud171\u6bb9\u8350\ud158\u4f4a\u3e2a, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, add:int(p7:int, xor:int(ldc:int(16448), ldc:int(16449))))
                        
                        if (cmpne:boolean(var_10_DC:\u1833\u8aa5\u6198\u416d\u8753, aconstnull:\u1833\u8aa5\u6198\u416d\u8753())) {
                            invokeinterface:boolean(List<\u1833\u8aa5\u6198\u416d\u8753>::add, p1:List<\u1833\u8aa5\u6198\u416d\u8753>, var_10_DC:\u1833\u8aa5\u6198\u416d\u8753)
                            invokeinterface:boolean(List<\u1833\u8aa5\u6198\u416d\u8753>::add, getfield:List<\uc7fe\u12cb\u1833\u67e9\u92ff>(\uc2bd\u6cfe\u8aa5\u3bd6\u7330::\u120d\u8308\u74b1\ud7e8\u385b\ub19c, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330), var_10_DC:\u1833\u8aa5\u6198\u416d\u8753)
                        }
                        
                        return:\uc7fe\u12cb\u1833\u67e9\u92ff(var_10_DC:\u1833\u8aa5\u6198\u416d\u8753[expected:\uc7fe\u12cb\u1833\u67e9\u92ff])
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_8_63:int, ldc:int(1024)), ldc:int(0))) {
                return:\uc7fe\u12cb\u1833\u67e9\u92ff(aconstnull:\uc7fe\u12cb\u1833\u67e9\u92ff())
            }
        }
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\ud217\u416d\u67e9\u16f6\ua61f\u3d4b \u7af6\u8350\u5db4\u836c\u4c04\uc3e3() {
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
            return:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b(getstatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\uceb8\u4ab3\u9af2\u4daf\ua61f\ucfaf))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Class \ub7dc\ud523\u6c56\ub171\u7873\u3a62(java.lang.Class p0) {
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
            return:Class(putstatic:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ua61f\ub7dc\u8df4\ucef1\ub113\u7043, p0:Class<? extends \u1833\u8aa5\u6198\u416d\u8753>))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u12cb\u1833\u67e9\u92ff \u4e72\uf94d\u8aa5\ubefe\ub1b9\ubff1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\uc2bd\u6cfe\u8aa5\u3bd6\u7330 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p6, int p7) {
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
            return:\uc7fe\u12cb\u1833\u67e9\u92ff(invokestatic:\uc7fe\u12cb\u1833\u67e9\u92ff(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\u5245\u416d\u965f\u946b\u6198\u3c25, p0:\uc2bd\u6cfe\u8aa5\u3bd6\u7330, p1:List<\uc7fe\u12cb\u1833\u67e9\u92ff>, p2:Random, p3:int, p4:int, p5:int, p6:\u760c\u4975\u4179\uc246\u8640\u64f2, p7:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_64 : \uc238\u92ff\u8c8a\u59ec\uae5d[] [generated]
        
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
            expr_64 = newarray:\uc238\u92ff\u8c8a\u59ec\uae5d[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc238\u92ff\u8c8a\u59ec\uae5d.class, ldc:int(11))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], and:int(ldc:int(-28189), ldc:int(28188)), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\u446c\ua6bd\u51b2\u494c\u6d69>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u446c\ua6bd\u51b2\u494c\u6d69.class), ldc:int(40), and:int(ldc:int(-20150), ldc:int(18981))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], xor:int(ldc:int(-32640), ldc:int(-32639)), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\u36d3\uc229\u8cae\u61a4\u071d>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u36d3\uc229\u8cae\u61a4\u071d.class), xor:int(ldc:int(8492), ldc:int(8489)), and:int(ldc:int(8293), ldc:int(149))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], and:int(ldc:int(4898), ldc:int(27)), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\ud7e8\u6198\ub83f\u983f\u6198>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ud7e8\u6198\ub83f\u983f\u6198.class), ldc:int(20), and:int(ldc:int(1486), ldc:int(-21967))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], xor:int(ldc:int(12832), ldc:int(12835)), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\u4f52\u5654\ud36e\ubb2b\u446c>(\u36d3\u9033\u6b0d\u983f\u8d90.\u4f52\u5654\ud36e\ubb2b\u446c.class), ldc:int(20), and:int(ldc:int(4898), ldc:int(-4899))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], and:int(ldc:int(23172), ldc:int(262)), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\ucef1\ubf56\u927d\u88c5\ub6ab>(\ud36e\u6bb9\u960f\u4c04\u64ab.\ucef1\ubf56\u927d\u88c5\ub6ab.class), ldc:int(10), ldc:int(6)))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], and:int(ldc:int(5127), ldc:int(10325)), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\u760c\u8df4\u960f\u3bc9\ud158>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u760c\u8df4\u960f\u3bc9\ud158.class), xor:int(ldc:int(4481), ldc:int(4484)), and:int(ldc:int(12293), ldc:int(527))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], ldc:int(6), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\u183a\u4f52\ufe34\u6b0d\uc246>(\u5d20\u97b7\u8753\u873d\u16f6.\u183a\u4f52\ufe34\u6b0d\uc246.class), xor:int(ldc:int(-31104), ldc:int(-31099)), xor:int(ldc:int(21536), ldc:int(21541))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], ldc:int(7), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\ub32d\u3a62\ua61f\u6bb9\u624e>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\ub32d\u3a62\ua61f\u6bb9\u624e.class), and:int(ldc:int(2629), ldc:int(20637)), xor:int(ldc:int(207), ldc:int(203))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], ldc:int(8), initobject:\uc238\u92ff\u8c8a\u59ec\uae5d(\uc238\u92ff\u8c8a\u59ec\uae5d::<init>, ldc:Class<\u7006\ub7dc\u7043\ud36e\u12cb>(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u7006\ub7dc\u7043\ud36e\u12cb.class), xor:int(ldc:int(16384), ldc:int(16389)), xor:int(ldc:int(2199), ldc:int(2195))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], ldc:int(9), initobject:\ufcaf\u64f2\uc84e\ua3b4\u64f2[expected:\uc238\u92ff\u8c8a\u59ec\uae5d](\ufcaf\u64f2\uc84e\ua3b4\u64f2::<init>, ldc:Class<\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5140\u51b2\ubefe\uc84e\uc9f6\u5bc4.class), ldc:int(10), xor:int(ldc:int(8197), ldc:int(8199))))
            storeelement:\uc238\u92ff\u8c8a\u59ec\uae5d(expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[], ldc:int(10), initobject:\uf995\u4975\u9033\ua3b4\ucb79[expected:\uc238\u92ff\u8c8a\u59ec\uae5d](\uf995\u4975\u9033\ua3b4\ucb79::<init>, ldc:Class<\uc3e3\u183a\u8350\u6fb0\ud7e8>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc3e3\u183a\u8350\u6fb0\ud7e8.class), ldc:int(20), xor:int(ldc:int(130), ldc:int(131))))
            putstatic:\uc238\u92ff\u8c8a\u59ec\uae5d[](\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\ucb79\ub113\u12b2\ub113\u6b0d\u1187, expr_64:\uc238\u92ff\u8c8a\u59ec\uae5d[])
            putstatic:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b(\ubcb0\u5db4\u9937\u1833\uc3e3\u8709::\uceb8\u4ab3\u9af2\u4daf\ua61f\ucfaf, initobject:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::<init>, aconstnull:\ufcaf\u64f2\uc84e\ua3b4\u64f2()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\ucfaf\u1833\ua61f\u6d99\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AD : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6B8 : int
        
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
        var_3_6AD = and:int(ldc:int(1249841343), ldc:int(677336219))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubcb0\u5db4\u9937\u1833\uc3e3\u8709[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
            var_3_6AD = and:int(var_3_6AD:int, ldc:int(989705145))
            var_5_81 = and:int(ldc:int(-1330), ldc:int(1329))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14497), ldc:int(14496)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6AD:int, ldc:int(-1352829526))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(16524), ldc:int(16525)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(18445), ldc:int(12355)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6AD = and:int(var_3_D1:int, ldc:int(-19031077))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(833), ldc:int(12455)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(2063576379))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(1822169950))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1513695243))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(60535304))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(1901805543))
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(608223738))
                    }
                    else {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1629506903))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0602)
                            }
                            
                            goto(Label_0853)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(1847246363))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-459650862))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-856596596))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(1821163801))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1146645219))
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(484982542))
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-597696596))
                        var_11_E2 = and:int(ldc:int(-7988), ldc:int(7986))
                        goto(Label_1577)
                    }
                    
                    Label_0602:
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(565850515))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(788773874))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-894059700))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-841353735))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0853)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-2031654496))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1575680864))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1624428669))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(133113664))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(873624262))
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(199212716))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0853:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-592941171))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1527902857))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-164987930))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1424468737))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1144466932))
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(679443884))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(2647), ldc:int(24713))
                                goto(Label_1142)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1842720363))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(1424195468))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(281897470))
                            goto(Label_0853)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(1306595288))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(2088492713))
                        var_11_E2 = and:int(ldc:int(13508), ldc:int(-14021))
                    }
                    
                    Label_1142:
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1262564547))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(2094425098))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(-237913637))
                            goto(Label_0853)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1059465277))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(2073685768))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(8033428))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(761232542))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1282:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(502519840))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(516782478))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(-468416994))
                            goto(Label_1142)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(899226006))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1123419423))
                            goto(Label_0853)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(87095523))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AD = and:int(var_3_6AD:int, ldc:int(1897787559))
                            loopcontinue()
                        }
                        
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1076004440))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1577)
                    }
                    
                    Label_1443:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1974710495))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(18870411))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(1807502009))
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1463468304))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1940316695))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1577:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B8 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1588:
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(305499932))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-880824739))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-441840056))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-1576035735))
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AD = and:int(var_3_6AD:int, ldc:int(-312494631))
                        var_17_6B8 = add:int(var_16_110:int, xor:int(ldc:int(2244), ldc:int(2245)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AD = and:int(var_3_6AD:int, ldc:int(-835804703))
                }
                
                var_3_6AD = and:int(var_3_6AD:int, ldc:int(1501166331))
                
                if (cmple:boolean(var_5_81 = var_17_6B8:int, sub:int(var_6_88:int, xor:int(ldc:int(-28400), ldc:int(-28399))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6AD:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
