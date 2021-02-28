public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6cfe\ud523\u836c\u8753\u3bc9\u7043 {
    public void \u6cfe\ud523\u836c\u8753\u3bc9\u7043(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd p0) {
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
            putfield:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u6cfe\ud523\u836c\u8753\u3bc9\u7043::\ubf56\u72f1\u5140\uc84e\uc4d2\u51fa, this:\u6cfe\ud523\u836c\u8753\u3bc9\u7043, p0:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u6cfe\ud523\u836c\u8753\u3bc9\u7043)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static void lambda$\uc2bd\u446c\u965f\u6d69\u8308\ua068$0(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_2_5F : int
        var_6_A1 : long
        var_8_A8 : List[]
        var_10_B8 : \u3711\u7873\u12b2\u3e2a\u3711\u927d[]
        var_11_BD : int
        var_12_C6 : int
        var_13_FC : \u3711\u7873\u12b2\u3e2a\u3711\u927d
        var_14_10D : int
        var_15_114 : List
        var_10_EE : int
        var_11_188 : List
        var_12_199 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        
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
            var_2_5F = and:int(ldc:int(-1944765772), ldc:int(1459588533))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4ab3\u7043\ud523\ub1b9\ub83f\u760c, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            var_6_A1 = or:long(or:long(ldc:long(0L), shl:long(and:long(i2l:long(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))))), ldc:long(4194303L)), ldc:int(42))), shl:long(and:long(i2l:long(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))))), ldc:long(4194303L)), ldc:int(20)))
            var_8_A8 = newarray:List[](java.util.List.class, ldc:int(16))
            var_10_B8 = checkcast:\u3711\u7873\u12b2\u3e2a\u3711\u927d[](\u3504\ufe34\u600f\u6b0d\u69d9.\u3711\u7873\u12b2\u3e2a\u3711\u927d[].class, invokevirtual:\u3711\u7873\u12b2\u3e2a\u3711\u927d[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u3711\u7873\u12b2\u3e2a\u3711\u927d[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud12e\u8389\u5fe1\u3711\ubcb0\u392e)))
            var_11_BD = arraylength:int(var_10_B8:\u3711\u7873\u12b2\u3e2a\u3711\u927d[])
            var_12_C6 = and:int(ldc:int(-31635), ldc:int(29074))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1997928635))
                    
                    if (cmplt:boolean(var_12_C6:int, var_11_BD:int)) {
                        var_13_FC = loadelement:\u3711\u7873\u12b2\u3e2a\u3711\u927d(var_10_B8:\u3711\u7873\u12b2\u3e2a\u3711\u927d[], var_12_C6:int)
                        var_14_10D = shr:int(invokeinterface:short[expected:int](\u3711\u7873\u12b2\u3e2a\u3711\u927d::\uf995\u4ab3\ucef1\u4bc8\ub8be\u7043, var_13_FC:\u3711\u7873\u12b2\u3e2a\u3711\u927d), and:int(ldc:int(9350), ldc:int(4917)))
                        var_15_114 = loadelement:List(var_8_A8:List[], var_14_10D:int)
                        
                        if (cmpeq:boolean(var_15_114:List, aconstnull:List())) {
                            var_15_114 = storeelement:List(var_8_A8:List[], var_14_10D:int, initobject:ArrayList[expected:List](ArrayList::<init>))
                        }
                        
                        invokeinterface:boolean(List<\u183a\u6b0d\u3711\uc2e8\u40a9\u5245>::add, var_15_114:List<\u183a\u6b0d\u3711\uc2e8\u40a9\u5245>, initobject:\u183a\u6b0d\u3711\uc2e8\u40a9\u5245(\u183a\u6b0d\u3711\uc2e8\u40a9\u5245::<init>, invokeinterface:byte(\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u5140\ud36e\u836c\ub113\u6ec6\u12cb, var_13_FC:\u3711\u7873\u12b2\u3e2a\u3711\u927d), invokeinterface:byte(\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u5bc4\u718f\u4e72\uf9c5\u4bc8\u1187, var_13_FC:\u3711\u7873\u12b2\u3e2a\u3711\u927d), invokeinterface:byte(\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u51fa\u64f2\uc29a\u718f\u74b1\u64ab, var_13_FC:\u3711\u7873\u12b2\u3e2a\u3711\u927d), invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u647c\u97b7\uf995\u67e9\u873d\u5f50, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, p0:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd), invokeinterface:int(\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u5140\u64ab\u67e9\u8350\u9255\u1833, var_13_FC:\u3711\u7873\u12b2\u3e2a\u3711\u927d))))
                        inc:int(var_12_C6, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_10_EE = and:int(ldc:int(-23774), ldc:int(21704))
            
            while (cmplt:boolean(var_10_EE:int, arraylength:int(var_8_A8:List[]))) {
                var_11_188 = loadelement:List(var_8_A8:List[], var_10_EE:int)
                
                if (cmpne:boolean(var_11_188:List, aconstnull:List())) {
                    var_12_199 = invokevirtual:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\uc29a\u3dd3\uc7fe\u8bb0\uc2e8, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, invokevirtual:int(\ucb79\uc238\u6b5f\u836c\u8389\u6b5f::\uc238\uceb8\u8aa5\uc31c\uafe7\uc7fe, getstatic:\ucb79\uc238\u6b5f\u836c\u8389\u6b5f(\ucb79\uc238\u6b5f\u836c\u8389\u6b5f::\ud12e\u64ab\u51b2\u7c6b\u74b1\u61a4)))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_12_199:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Long>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4bc8\u51b2\u6bb9\u64f2\u4e72\u4975), invokestatic:Long(Long::valueOf, or:long(var_6_A1:long, and:long(i2l:long(var_10_EE:int), ldc:long(1048575L)))))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_12_199:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-6276), ldc:int(6275))))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_12_199:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u3711\u7873\u12b2\u3e2a\u3711\u927d[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc31c\ubff1\ua562\uc246\u56bd\u3d64), invokeinterface:\u3711\u7873\u12b2\u3e2a\u3711\u927d[](List<E>::toArray, var_11_188:List, invokestatic:\u3711\u7873\u12b2\u3e2a\u3711\u927d[](\u6c52\u51b2\ubb2b\u0b8e\u3d4b\u6ec6::\u4975\u6b5f\ubb2b\uf94d\ub8be\ufe34)))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, var_12_199:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:Class<\u8753\u4f4a\ufcaf\uafe7\u5245\u0a06>(\u51fa\u12cb\u7330\u74b1\u6c52.\u8753\u4f4a\ufcaf\uafe7\u5245\u0a06.class), and:int[expected:boolean](ldc:int(16401), ldc:int(13613)), xor:int[expected:boolean](ldc:int(16419), ldc:int(16418)))
                }
                
                inc:int(var_10_EE, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_663 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D3 : int
        var_11_E4 : int
        var_14_10E : double
        var_16_112 : int
        var_12_10A : double
        var_17_66E : int
        
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
        var_3_663 = and:int(ldc:int(107297810), ldc:int(1758445049))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6cfe\ud523\u836c\u8753\u3bc9\u7043[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(-231081846))
        }
        else {
            var_3_663 = and:int(var_3_663:int, ldc:int(-568492772))
            var_5_85 = and:int(ldc:int(-31460), ldc:int(25282))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17796), ldc:int(-17797)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D3 = and:int(var_3_663:int, ldc:int(-1023033744))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E4 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E4:int, sub:int(var_6_8C:int, and:int(ldc:int(521), ldc:int(7191)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E4:int, and:int(ldc:int(10245), ldc:int(17505)))), var_7_9B:double))) {
                        inc:int(var_11_E4, ldc:int(1))
                    }
                    
                    var_3_663 = and:int(var_3_D3:int, ldc:int(-1869218154))
                    var_14_10E = var_7_9B:double
                    var_16_112 = var_11_E4:int
                }
                else {
                    var_11_E4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(5185), ldc:int(19105)))
                    var_12_10A = var_14_10E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_112 = var_11_E4:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E4:int)
                        var_16_112 = var_11_E4:int
                        var_14_10E = var_12_10A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1898411458))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1289886521))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(224346047))
                        
                        if (cmplt:boolean(var_16_112:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0849)
                        }
                    }
                    
                    Label_0384:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1598197580))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(315353032))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1697690767))
                        goto(Label_1134)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1341710888))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1050694394))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(91434551))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1255287322))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(1777286548))
                        var_11_E4 = and:int(ldc:int(12835), ldc:int(-15204))
                        goto(Label_1529)
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-621975181))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(227609678))
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1144692086))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(689174584))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(767016796))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10E = var_9_C1:double
                            goto(Label_0849)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-784236237))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1403798251))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1803589898))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1683931725))
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-199850331))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1214615925))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-815792714))
                        var_14_10E = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10E:double))
                    }
                    
                    Label_0849:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-386303940))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(804189099))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1525622068))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-575789909))
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1579630933))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(782106074))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E4 = xor:int(ldc:int(144), ldc:int(145))
                                goto(Label_1134)
                            }
                        }
                    }
                    
                    Label_0983:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(16)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-710371871))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(467322321))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1860111566))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(59735701))
                        var_11_E4 = and:int(ldc:int(18493), ldc:int(-18558))
                    }
                    
                    Label_1134:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-919634758))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(30334579))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1882339110))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1850917030))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                                goto(Label_1392)
                            }
                        }
                    }
                    
                    Label_1248:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1014853673))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1742988110))
                            goto(Label_1134)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1663645265))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1282905000))
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1522473549))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2002305121))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10E:double, var_5_85:int, var_16_112:int)
                        goto(Label_1529)
                    }
                    
                    Label_1392:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1994358416))
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(12308784))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-356403363))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1950744879))
                        loopcontinue()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(1504705971))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10E:double, ldc:double(0.0))
                    Label_1529:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1540:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1134)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1299395034))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1068631216))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1658355721))
                        var_17_66E = add:int(var_16_112:int, xor:int(ldc:int(-32699), ldc:int(-32700)))
                        looporswitchbreak()
                    }
                }
                
                var_3_663 = and:int(var_3_663:int, ldc:int(1627897297))
                
                if (cmple:boolean(var_5_85 = var_17_66E:int, sub:int(var_6_8C:int, and:int(ldc:int(8385), ldc:int(825))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
