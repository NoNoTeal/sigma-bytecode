public class \u56bd\u8413\u647c\u5bc4\ud158.\uc246\u9af2\u3bc9\u5d20\u759a {
    public void \uc246\u9af2\u3bc9\u5d20\u759a() {
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
    
    public void \ubff1\u93a2\ud171\u7330\u7e3f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u4cd9\ubff1\ub18d\u99f7\u97e6 p0) {
        var_2_5F : int
        var_4_109 : \u8709\u7ce1\ub6ab\ubcb0\u8cae
        var_4_144 : \u9937\u0b8e\u3711\ua068\u4daf
        
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
        var_2_5F = and:int(ldc:int(-2012539214), ldc:int(-1459784302))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-2121917135))
                    goto(Label_0177)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1254645573))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1955848198))
                    
                    if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u8350\u1187\u6c56\ub32d\u927d.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))) {
                        invokevirtual:void(\uc246\u9af2\u3bc9\u5d20\u759a::\ub19c\u56bd\uae5d\u7006\u6435, this:\uc246\u9af2\u3bc9\u5d20\u759a, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8350\u1187\u6c56\ub32d\u927d::\u59ec\uc910\ubcb0\u3776\u965f\u6ec6, checkcast:\u8350\u1187\u6c56\ub32d\u927d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u8350\u1187\u6c56\ub32d\u927d.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u8350\u1187\u6c56\ub32d\u927d](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))))))
                    }
                }
                
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1437904685))
                    
                    if (instanceof:boolean(\u516c\u3d64\u718f\ub171\u6b5f.\u8709\u7ce1\ub6ab\ubcb0\u8cae.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))) {
                        var_4_109 = checkcast:\u8709\u7ce1\ub6ab\ubcb0\u8cae(\u516c\u3d64\u718f\ub171\u6b5f.\u8709\u7ce1\ub6ab\ubcb0\u8cae.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u8709\u7ce1\ub6ab\ubcb0\u8cae](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                        invokevirtual:void(\uc246\u9af2\u3bc9\u5d20\u759a::\ub19c\u56bd\uae5d\u7006\u6435, this:\uc246\u9af2\u3bc9\u5d20\u759a, initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, getfield:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u3d4b\u64ab\ud171\u6d69\u9937\u51b2, getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, var_4_109:\u8709\u7ce1\ub6ab\ubcb0\u8cae)), getfield:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\ucef1\u4179\u67e9\ub1b9\u446c\u12cb, getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, var_4_109:\u8709\u7ce1\ub6ab\ubcb0\u8cae))))
                    }
                }
                
                Label_0177:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (instanceof:boolean(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u9937\u0b8e\u3711\ua068\u4daf.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))) {
                if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                    var_4_144 = checkcast:\u9937\u0b8e\u3711\ua068\u4daf(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u9937\u0b8e\u3711\ua068\u4daf.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u9937\u0b8e\u3711\ua068\u4daf](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                    invokevirtual:void(\uc246\u9af2\u3bc9\u5d20\u759a::\ub19c\u56bd\uae5d\u7006\u6435, this:\uc246\u9af2\u3bc9\u5d20\u759a, initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, invokevirtual:int(\u9937\u0b8e\u3711\ua068\u4daf::\u392e\u4179\u7ce1\u3711\u3c25\u3d64, var_4_144:\u9937\u0b8e\u3711\ua068\u4daf), invokevirtual:int(\u9937\u0b8e\u3711\ua068\u4daf::\u3d4b\u5245\u9a18\u3d64\u183a\u120d, var_4_144:\u9937\u0b8e\u3711\ua068\u4daf)))
                }
            }
        }
    }
    
    public void \ub19c\u56bd\uae5d\u7006\u6435(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_76 : int
        var_4_69 : Iterator<\uc31c\u8753\u4492\u64ab\u4975>
        var_5_A4 : \uc31c\u8753\u4492\u64ab\u4975
        
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
            var_2_76 = and:int(ldc:int(-1506841969), ldc:int(-1476575095))
            var_4_69 = invokeinterface:Iterator<\uc31c\u8753\u4492\u64ab\u4975>(List<\uc31c\u8753\u4492\u64ab\u4975>::iterator, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            
            loop {
                if (cmpne:boolean(and:int(var_2_76:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_76 = and:int(var_2_76:int, ldc:int(-1095407985))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_69:Iterator<\uc31c\u8753\u4492\u64ab\u4975>)) {
                        var_5_A4 = checkcast:\uc31c\u8753\u4492\u64ab\u4975(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc31c\u8753\u4492\u64ab\u4975.class, invokeinterface:\uc31c\u8753\u4492\u64ab\u4975(Iterator<\uc31c\u8753\u4492\u64ab\u4975>::next, var_4_69:Iterator<\uc31c\u8753\u4492\u64ab\u4975>))
                        
                        if (invokevirtual:boolean(\uc31c\u8753\u4492\u64ab\u4975::\ub83f\u3d64\u6b0d\u3d64\u97b7, var_5_A4:\uc31c\u8753\u4492\u64ab\u4975, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)) {
                            invokeinterface:boolean(Set<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>::add, getfield:Set<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\uc246\u9af2\u3bc9\u5d20\u759a::\u6b5f\u56bd\u071d\ub32d\u16f6, this:\uc246\u9af2\u3bc9\u5d20\u759a), invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\uc31c\u8753\u4492\u64ab\u4975::\u527a\u97b7\u8389\u67d0\uafe7, var_5_A4:\uc31c\u8753\u4492\u64ab\u4975))
                        }
                        
                        var_2_76 = and:int(var_2_76:int, ldc:int(-88254403))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_76:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_76 = and:int(var_2_76:int, ldc:int(514354153))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\u7e3f\u5d20\u8389\u4daf(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9937\u416d\ub171\uae87\ub8be p0) {
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
            invokeinterface:void(List<E>::clear, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            invokeinterface:void(Set<E>::clear, getfield:Set<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\uc246\u9af2\u3bc9\u5d20\u759a::\u6b5f\u56bd\u071d\ub32d\u16f6, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u59ec\u8753\u8350\ub171\ub1b9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_61 : int
        var_4_69 : ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_5_72 : int
        var_6_7B : int
        var_7_84 : int
        var_8_8B : int
        var_9_92 : int
        var_10_9B : int
        var_11_A0 : float
        var_2_150 : int
        var_12_11A : float
        var_13_149 : float
        
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
            var_2_61 = and:int(ldc:int(-1397831443), ldc:int(-1360274612))
            var_4_69 = initobject:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(ArrayList<E>::<init>)
            var_5_72 = mul:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(16))
            var_6_7B = mul:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(16))
            var_7_84 = and:int(ldc:int(1857), ldc:int(25))
            var_8_8B = add:int(var_5_72:int, ldc:int(15))
            var_9_92 = add:int(var_6_7B:int, ldc:int(15))
            var_10_9B = and:int(ldc:int(13567), ldc:int(2303))
            var_11_A0 = i2f:float(var_7_84:int)
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1537340267))
                    goto(Label_0257)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-828412732))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-17834186))
                    
                    if (cmple:boolean(var_11_A0:float, i2f:float(var_10_9B:int))) {
                        if (cmple:boolean(var_11_A0:float, ldc:float(100.0f))) {
                            goto(Label_0257)
                        }
                    }
                }
                
                Label_0210:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1439401734))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0257:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0210)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_150 = and:int(var_2_61:int, ldc:int(-436478905))
                var_12_11A = i2f:float(var_5_72:int)
                
                while (cmple:boolean(var_12_11A:float, i2f:float(var_8_8B:int))) {
                    var_13_149 = i2f:float(var_6_7B:int)
                    
                    loop {
                        var_2_150 = and:int(var_2_150:int, ldc:int(-1929720155))
                        
                        if (cmpgt:boolean(var_13_149:float, i2f:float(var_9_92:int))) {
                            looporswitchbreak()
                        }
                        
                        invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_4_69:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, f2d:double(var_12_11A:float), f2d:double(var_11_A0:float), f2d:double(var_13_149:float)))
                        var_13_149 = add:float(var_13_149:float, ldc:float(1.0f))
                    }
                    
                    var_2_150 = and:int(var_2_150:int, ldc:int(-2017734780))
                    var_12_11A = add:float(var_12_11A:float, ldc:float(1.0f))
                }
                
                var_2_61 = and:int(var_2_150:int, ldc:int(-1343496849))
                var_11_A0 = add:float(var_11_A0:float, ldc:float(1.0f))
            }
            
            return:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(var_4_69:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>])
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u836c\ub171\u3a62\u34df\u3dd3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_61 : int
        var_4_69 : ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_2_1F1 : int
        var_5_87 : List
        var_6_93 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_7_116 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_1A9 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_8_1CF : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_9_1D4 : int
        var_10_1DD : int
        var_11_20B : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
        var_2_61 = and:int(ldc:int(1909465529), ldc:int(2111105530))
        var_4_69 = initobject:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(ArrayList<E>::<init>)
        
        if (cmpne:boolean(p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, aconstnull:\u120d\u2dcc\ubff1\uceb8\ube23\u647c())) {
            var_2_1F1 = and:int(var_2_61:int, ldc:int(2044017599))
            var_5_87 = checkcast:List(java.util.List.class, invokevirtual:Object[expected:List](\ud158\u839e\u7006\uc3e3\u446c::\u12b2\u3d4b\u156b\u071d\uc246, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\uc246\u9af2\u3bc9\u5d20\u759a::\ub70c\u7006\u4d85\ub18d\u6b0d), and:int(ldc:int(2572), ldc:int(9642)))))
            var_6_93 = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokevirtual:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\uc246\u9af2\u3bc9\u5d20\u759a::\u59ec\u8753\u8350\ub171\ub1b9, this:\uc246\u9af2\u3bc9\u5d20\u759a, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_93:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                var_7_116 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_6_93:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                
                if (invokeinterface:boolean(List::contains, var_5_87:List, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b)), var_7_116:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))))) {
                    invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_4_69:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_7_116:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                }
                
                var_2_1F1 = and:int(var_2_1F1:int, ldc:int(2079368120))
            }
            
            loop {
                Label_0172:
                
                if (cmpeq:boolean(and:int(var_2_1F1:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_1F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_1F1 = and:int(var_2_1F1:int, ldc:int(1796964741))
                        goto(Label_0221)
                    }
                    
                    var_2_1F1 = and:int(var_2_1F1:int, ldc:int(-202165831))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\uc246\u9af2\u3bc9\u5d20\u759a::\ub70c\u7006\u4d85\ub18d\u6b0d), xor:int(ldc:int(16643), ldc:int(16647)))))) {
                        goto(Label_0221)
                    }
                    
                    var_6_93 = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokevirtual:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\uc246\u9af2\u3bc9\u5d20\u759a::\u59ec\u8753\u8350\ub171\ub1b9, this:\uc246\u9af2\u3bc9\u5d20\u759a, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))
                }
                
                Label_0359:
                
                while (cmpne:boolean(and:int(var_2_1F1:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_1F1:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_1F1 = and:int(var_2_1F1:int, ldc:int(-543114909))
                        loopcontinue(Label_0172)
                    }
                    
                    var_2_1F1 = and:int(var_2_1F1:int, ldc:int(2144811949))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_93:Iterator))) {
                        goto(Label_0221)
                    }
                    
                    var_7_1A9 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_6_93:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                    
                    if (cmpeq:boolean(invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b)), var_7_1A9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd))) {
                        var_8_1CF = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::values)
                        var_9_1D4 = arraylength:int(var_8_1CF:\u760c\u4975\u4179\uc246\u8640\u64f2[])
                        var_10_1DD = and:int(ldc:int(12601), ldc:int(-12734))
                        
                        loop {
                            var_2_1F1 = and:int(var_2_1F1:int, ldc:int(1909827497))
                            
                            if (cmpge:boolean(var_10_1DD:int, var_9_1D4:int)) {
                                var_2_1F1 = and:int(var_2_1F1:int, ldc:int(2145254313))
                                invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_4_69:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, var_7_1A9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                                looporswitchbreak()
                            }
                            
                            var_11_20B = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_8_1CF:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_10_1DD:int)
                            
                            if (cmpne:boolean(var_11_20B:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                                if (cmpne:boolean(invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_7_1A9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\u760c\u4975\u4179\uc246\u8640\u64f2::\u71ae\u927d\u6cfe\u4bc8\u3e75\u839e, var_11_20B:\u760c\u4975\u4179\uc246\u8640\u64f2)))), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\ubb2b\ubefe\u9033\uc246\u5db4))) {
                                    if (cmpne:boolean(invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_7_1A9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\u760c\u4975\u4179\uc246\u8640\u64f2::\u71ae\u927d\u6cfe\u4bc8\u3e75\u839e, var_11_20B:\u760c\u4975\u4179\uc246\u8640\u64f2)))), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u98a4\u92ff\ub83f\uc31c\u64f2\ube23))) {
                                        loopcontinue(Label_0359)
                                    }
                                }
                            }
                            
                            inc:int(var_10_1DD, ldc:int(1))
                        }
                    }
                    
                    var_2_1F1 = and:int(var_2_1F1:int, ldc:int(1912127487))
                }
                
                var_2_1F1 = and:int(var_2_1F1:int, ldc:int(1323011376))
                Label_0221:
                
                if (cmpne:boolean(and:int(var_2_1F1:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_1F1 = and:int(var_2_1F1:int, ldc:int(249244810))
                    goto(Label_0359)
                }
                
                if (cmpne:boolean(and:int(var_2_1F1:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_1F1 = and:int(var_2_1F1:int, ldc:int(1209779619))
            }
            
            return:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(var_4_69:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>])
        }
        
        return:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(aconstnull:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>())
    }
    
    public void \ubf56\u64f2\u392e\u98a4\u120d(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u7ce1\uceb8\ubded\u3a62 p0) {
        var_2_61 : int
        var_2_103 : int
        var_4_A2 : int
        var_5_AB : ArrayList<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>
        var_6_AF : int
        var_7_F4 : int
        var_2_1C7 : int
        var_6_E9 : Iterator<\uc31c\u8753\u4492\u64ab\u4975>
        var_7_195 : \uc31c\u8753\u4492\u64ab\u4975
        var_2_266 : int
        var_7_182 : Iterator<Object>
        var_8_234 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_9_23F : Iterator<\uc31c\u8753\u4492\u64ab\u4975>
        
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
        var_2_61 = and:int(ldc:int(1925948458), ldc:int(1671951974))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            do {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1734851753))
                    
                    if (cmpge:boolean(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))), ldc:int(20))) {
                        loopcontinue()
                    }
                    
                    invokeinterface:void(List<E>::clear, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
                    return:void()
                }
            } while (cmpne:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0)))
            
            var_2_103 = and:int(var_2_61:int, ldc:int(-1020806039))
            var_4_A2 = f2i:int(invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\uc246\u9af2\u3bc9\u5d20\u759a::\ub70c\u7006\u4d85\ub18d\u6b0d), xor:int(ldc:int(8256), ldc:int(8258)))))
            var_5_AB = initobject:ArrayList<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(ArrayList<E>::<init>)
            var_6_AF = ldc:int(-5)
            
            while (cmplt:boolean(var_6_AF:int, xor:int(ldc:int(1032), ldc:int(1037)))) {
                var_7_F4 = ldc:int(-5)
                
                loop {
                    if (cmpne:boolean(and:int(var_2_103:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_103 = and:int(var_2_103:int, ldc:int(-561019809))
                    }
                    else {
                        var_2_103 = and:int(var_2_103:int, ldc:int(-353138967))
                        
                        if (cmplt:boolean(var_7_F4:int, xor:int(ldc:int(17188), ldc:int(17185)))) {
                            invokeinterface:boolean(List<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>::add, var_5_AB:ArrayList<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>[expected:List<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>], initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, add:int(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))), var_6_AF:int), add:int(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))), var_7_F4:int)))
                            inc:int(var_7_F4, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_2_103:int, ldc:int(131072)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_103 = and:int(var_2_103:int, ldc:int(-286822475))
                inc:int(var_6_AF, ldc:int(1))
            }
            
            var_2_1C7 = and:int(var_2_103:int, ldc:int(-287355548))
            var_6_E9 = invokeinterface:Iterator<\uc31c\u8753\u4492\u64ab\u4975>(List<\uc31c\u8753\u4492\u64ab\u4975>::iterator, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_E9:Iterator)) {
                var_7_195 = checkcast:\uc31c\u8753\u4492\u64ab\u4975(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc31c\u8753\u4492\u64ab\u4975.class, invokeinterface:\uc31c\u8753\u4492\u64ab\u4975(Iterator<\uc31c\u8753\u4492\u64ab\u4975>::next, var_6_E9:Iterator<\uc31c\u8753\u4492\u64ab\u4975>))
                
                if (cmple:boolean(invokevirtual:int(\uc31c\u8753\u4492\u64ab\u4975::\u120d\u416d\u71ae\u6d99\ubb2b, var_7_195:\uc31c\u8753\u4492\u64ab\u4975, initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))))), ldc:int(7))) {
                    if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\uc246\u9af2\u3bc9\u5d20\u759a::\u6b5f\u56bd\u071d\ub32d\u16f6, this:\uc246\u9af2\u3bc9\u5d20\u759a), invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\uc31c\u8753\u4492\u64ab\u4975::\u527a\u97b7\u8389\u67d0\uafe7, var_7_195:\uc31c\u8753\u4492\u64ab\u4975)))) {
                        goto(Label_0496)
                    }
                }
                
                Label_0442:
                
                if (cmpne:boolean(and:int(var_2_1C7:int, ldc:int(512)), ldc:int(0))) {
                    var_2_1C7 = and:int(var_2_1C7:int, ldc:int(185226092))
                }
                else {
                    var_2_1C7 = and:int(var_2_1C7:int, ldc:int(-818731542))
                    invokeinterface:void(Iterator::remove, var_6_E9:Iterator)
                }
                
                Label_0496:
                
                if (cmpne:boolean(and:int(var_2_1C7:int, ldc:int(1)), ldc:int(0))) {
                    var_2_1C7 = and:int(var_2_1C7:int, ldc:int(33627030))
                    goto(Label_0442)
                }
                
                var_2_1C7 = and:int(var_2_1C7:int, ldc:int(-880046279))
            }
            
            var_2_266 = and:int(var_2_1C7:int, ldc:int(1249629496))
            invokeinterface:void(Set<E>::clear, getfield:Set<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\uc246\u9af2\u3bc9\u5d20\u759a::\u6b5f\u56bd\u071d\ub32d\u16f6, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            var_7_182 = invokeinterface:Iterator<Object>(List<Object>::iterator, var_5_AB:List<Object>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_182:Iterator<Object>)) {
                var_8_234 = checkcast:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c.class, invokeinterface:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(Iterator<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>::next, var_7_182:Iterator<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>))
                var_9_23F = invokeinterface:Iterator<\uc31c\u8753\u4492\u64ab\u4975>(List<\uc31c\u8753\u4492\u64ab\u4975>::iterator, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_266:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_266 = and:int(var_2_266:int, ldc:int(1876911140))
                        
                        if (invokeinterface:boolean(Iterator<E>::hasNext, var_9_23F:Iterator<\uc31c\u8753\u4492\u64ab\u4975>)) {
                            if (logicalnot:boolean(invokevirtual:boolean(\uc31c\u8753\u4492\u64ab\u4975::\ub83f\u3d64\u6b0d\u3d64\u97b7, checkcast:\uc31c\u8753\u4492\u64ab\u4975(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc31c\u8753\u4492\u64ab\u4975.class, invokeinterface:\uc31c\u8753\u4492\u64ab\u4975(Iterator<\uc31c\u8753\u4492\u64ab\u4975>::next, var_9_23F:Iterator<\uc31c\u8753\u4492\u64ab\u4975>)), var_8_234:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))) {
                                var_2_266 = and:int(var_2_266:int, ldc:int(2116022136))
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_2_266:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_266 = and:int(var_2_266:int, ldc:int(2124668605))
                        invokeinterface:boolean(List<\uc31c\u8753\u4492\u64ab\u4975>::add, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a), initobject:\uc31c\u8753\u4492\u64ab\u4975(\uc31c\u8753\u4492\u64ab\u4975::<init>, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_8_234:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_8_234:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), invokevirtual:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\uc246\u9af2\u3bc9\u5d20\u759a::\u836c\ub171\u3a62\u34df\u3dd3, this:\uc246\u9af2\u3bc9\u5d20\u759a, var_8_234:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)))
                        looporswitchbreak(Label_0543)
                    }
                    
                    var_2_266 = and:int(var_2_266:int, ldc:int(1436359035))
                }
            }
            
            Label_0543:
        }
    }
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
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
            invokeinterface:void(List<E>::clear, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            invokeinterface:void(Set<E>::clear, getfield:Set<\u120d\u2dcc\ubff1\uceb8\ube23\u647c>(\uc246\u9af2\u3bc9\u5d20\u759a::\u6b5f\u56bd\u071d\ub32d\u16f6, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u7c6b\u9af2\u416d\uc31c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            invokevirtual:void(\uc246\u9af2\u3bc9\u5d20\u759a::\u4492\u4179\u416d\uc910\u8d98, this:\uc246\u9af2\u3bc9\u5d20\u759a)
        }
    }
    
    public void \u4492\u4179\u416d\uc910\u8d98() {
        var_1_E5 : int
        var_3_77 : int
        var_4_8E : Iterator<\uc31c\u8753\u4492\u64ab\u4975>
        var_6_DE : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_7_107 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_8_11F : double
        var_10_137 : double
        var_12_14F : double
        
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
            var_1_E5 = and:int(ldc:int(-1755850197), ldc:int(1041628975))
            var_3_77 = invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(\ud158\u839e\u7006\uc3e3\u446c::\u4975\u92ee\u5d20\u120d\u7873, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\uc246\u9af2\u3bc9\u5d20\u759a::\ub70c\u7006\u4d85\ub18d\u6b0d), xor:int(ldc:int(9254), ldc:int(9248)))), ldc:float(0.14f))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glDisable, and:int(ldc:int(2931), ldc:int(28533)))
            var_4_8E = invokeinterface:Iterator<\uc31c\u8753\u4492\u64ab\u4975>(List<\uc31c\u8753\u4492\u64ab\u4975>::iterator, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            
            loop {
                if (cmpne:boolean(and:int(var_1_E5:int, ldc:int(512)), ldc:int(0))) {
                    var_1_E5 = and:int(var_1_E5:int, ldc:int(-692462981))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_4_8E:Iterator)) {
                        var_6_DE = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\uc31c\u8753\u4492\u64ab\u4975::\u7330\u0c95\u5f50\uc229\u8cae, checkcast:\uc31c\u8753\u4492\u64ab\u4975(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uc31c\u8753\u4492\u64ab\u4975.class, invokeinterface:\uc31c\u8753\u4492\u64ab\u4975(Iterator<\uc31c\u8753\u4492\u64ab\u4975>::next, var_4_8E:Iterator<\uc31c\u8753\u4492\u64ab\u4975>))))
                        
                        loop {
                            var_1_E5 = and:int(var_1_E5:int, ldc:int(924311419))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_DE:Iterator))) {
                                looporswitchbreak()
                            }
                            
                            var_7_107 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_6_DE:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                            var_8_11F = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_7_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                            var_10_137 = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_7_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                            var_12_14F = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_7_107:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uc246\u9af2\u3bc9\u5d20\u759a::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7bad\u718f\u4cd9\u5654\u9255\ub1b9, initobject:\u4c2b\u965f\u494c\u8753\u7043(\u4c2b\u965f\u494c\u8753\u7043::<init>, var_8_11F:double, var_10_137:double, var_12_14F:double, add:double(var_8_11F:double, ldc:double(1.0)), add:double(var_10_137:double, ldc:double(1.0)), add:double(var_12_14F:double, ldc:double(1.0))), var_3_77:int)
                        }
                        
                        var_1_E5 = and:int(var_1_E5:int, ldc:int(-4588937))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_E5:int, ldc:int(524288)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(GL11::glEnable, and:int(ldc:int(12275), ldc:int(19321)))
            invokestatic:void(GL11::glPopMatrix)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u12cb\ubded\u527a\u92ff\u8389$2(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokeinterface:void(List<E>::clear, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud523\u4f52\u59ec\u516c\u3e75$1(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokeinterface:void(List<E>::clear, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud523\u7ce1\ubff1\ubefe\u12cb$0(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokeinterface:void(List<E>::clear, getfield:List<\uc31c\u8753\u4492\u64ab\u4975>(\uc246\u9af2\u3bc9\u5d20\u759a::\u183a\u600f\uf9c5\u4bc8\u647c, this:\uc246\u9af2\u3bc9\u5d20\u759a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_298_0 : byte[] [generated]
        stack_30C_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_230 : byte[]
        var_4_231 : int
        var_0_81 : int
        expr_A0 : int [generated]
        var_5_281 : int
        var_3_286 : byte[]
        var_4_287 : int
        var_0_28E : int
        expr_298 : byte [generated]
        stack_2D7_2 : byte [generated]
        stack_2B5_0 : byte [generated]
        expr_D1 : int [generated]
        var_3_2FA : byte[]
        var_4_2FB : int
        expr_30F : byte [generated]
        var_3_101 : String
        stack_227_0 : String[] [generated]
        expr_113 : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(1941999108), ldc:int(-210759875))
            expr_68 = var_2_6C = stack_9E_0 = stack_A0_0 = stack_CF_0 = stack_D1_0 = stack_F5_0 = stack_298_0 = stack_30C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("COwwICBbCOwwICBSsYvCyWwkGAQUI7SUY/QyyPxURBg3kJQsDBeclCQ4W3xURBgKxSyOnYPECDQe7YfPxGQ0Hu2/19RUUokIbDAgIH+IT8RkNAvIT8RkNBQ4UokIbDAgIFKxr+g0OGfEHvGv1Ardn8wIIDv0XCBQEoRdYvv1bF/QLDB32BwmwUg0NEP4BHPYHCbhXBQkOEOwVArJbCQYBBQsPA7JCGwwIDLtUBQsDDAA"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_230 = newarray:byte[](byte.class, expr_70:int)
                var_4_231 = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1394974473))
                    var_4_231 = add:int(var_4_231:int, ldc:int(-1))
                    storeelement:byte(var_3_230:byte[], var_4_231:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_231:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_231:int, xor:int(ldc:int(368), ldc:int(369)))), ldc:int(6)), xor:int(ldc:int(-8159), ldc:int(-8158)))))
                    
                    if (cmpne:boolean(var_4_231:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_F5_0 = stack_298_0 = stack_30C_0 = var_3_230:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_81 = and:int(var_0_61:int, ldc:int(747392542))
                    goto(Label_0214)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_81 = and:int(var_0_61:int, ldc:int(-503928465))
                }
                else {
                    var_0_81 = and:int(var_0_61:int, ldc:int(1531555738))
                    expr_A0 = arraylength:int(stack_A0_0:byte[])
                    
                    if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                        var_5_281 = expr_A0:int
                        var_3_286 = newarray:byte[](byte.class, expr_A0:int)
                        var_4_287 = expr_A0:int
                        
                        loop {
                            var_0_28E = and:int(var_0_81:int, ldc:int(-1692356775))
                            var_4_287 = add:int(var_4_287:int, ldc:int(-1))
                            expr_298 = stack_2D7_2 = loadelement(stack_298_0, var_4_287)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_287:int, ldc:int(1)), neg:int(var_5_281:int)), ldc:int(0))) {
                                stack_2D7_2 = stack_2B5_0 = add:byte(expr_298:byte, loadelement:byte(var_3_286:byte[], add:int(var_4_287:int, ldc:int(1))))
                                goto(Label_0709)
                            }
                            
                            Label_0677:
                            
                            if (cmpeq:boolean(and:int(var_0_28E:int, ldc:int(8)), ldc:int(0))) {
                                var_0_28E = and:int(var_0_28E:int, ldc:int(631414451))
                                stack_2D7_2 = stack_2B5_0 = add:byte(expr_298:byte, ldc:byte(1))
                            }
                            
                            Label_0709:
                            
                            if (cmpne:boolean(and:int(var_0_28E:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_0677)
                            }
                            
                            var_0_81 = and:int(var_0_28E:int, ldc:int(869027523))
                            storeelement:byte(var_3_286:byte[], var_4_287:int, stack_2D7_2:byte)
                            
                            if (cmpne:boolean(var_4_287:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_F5_0 = stack_298_0 = stack_30C_0 = var_3_286:byte[]
                    }
                }
                
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_0_81:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_81 = and:int(var_0_81:int, ldc:int(-326319649))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_81:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_81:int, ldc:int(-974573900))
                        loopcontinue()
                    }
                    
                    var_0_81 = and:int(var_0_81:int, ldc:int(703524726))
                    expr_D1 = arraylength:int(stack_D1_0:byte[])
                    
                    if (cmpne:boolean(expr_D1:int, ldc:int(0))) {
                        var_3_2FA = newarray:byte[](byte.class, expr_D1:int)
                        var_4_2FB = expr_D1:int
                        
                        loop {
                            var_0_81 = and:int(var_0_81:int, ldc:int(1502052175))
                            var_4_2FB = add:int(var_4_2FB:int, ldc:int(-1))
                            expr_30F = xor:byte(loadelement:byte(stack_30C_0:byte[], var_4_2FB:int), ldc:byte(55))
                            storeelement:byte(var_3_2FA:byte[], var_4_2FB:int, add:int(or:int(and:int(shl:int(expr_30F:byte, and:int(ldc:int(25093), ldc:int(4134))), ldc:int(-16)), and:int(shr:int(expr_30F:byte[expected:int], xor:int(ldc:int(25), ldc:int(29))), ldc:int(15))), ldc:int(3)))
                            
                            if (cmpne:boolean(var_4_2FB:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_F5_0 = stack_298_0 = stack_30C_0 = var_3_2FA:byte[]
                    }
                }
                
                Label_0214:
                
                if (cmpeq:boolean(and:int(var_0_81:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_81:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_61 = and:int(var_0_81:int, ldc:int(1227207456))
            }
            
            var_3_101 = initobject:String(String::<init>, stack_F5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_227_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8984), ldc:int(8978)))
            expr_113 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9608), ldc:int(9602)))
            storeelement:String(expr_113:String[], and:int(ldc:int(282), ldc:int(10312)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(23616), ldc:int(-31809)), and:int(ldc:int(8718), ldc:int(4198))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(20486), ldc:int(20495)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(2240), ldc:int(2246)), and:int(ldc:int(8374), ldc:int(2135))))
            storeelement:String(expr_113:String[], and:int(ldc:int(34), ldc:int(9986)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(-31158), ldc:int(-31140)), and:int(ldc:int(1889), ldc:int(2087))))
            storeelement:String(expr_113:String[], and:int(ldc:int(790), ldc:int(26734)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(8291), ldc:int(181)), and:int(ldc:int(102), ldc:int(190))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(1071), ldc:int(1067)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(2184), ldc:int(2222)), xor:int(ldc:int(4636), ldc:int(4663))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(2072), ldc:int(2075)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(2091), ldc:int(25131)), and:int(ldc:int(109), ldc:int(17629))))
            storeelement:String(expr_113:String[], and:int(ldc:int(-2728), ldc:int(2727)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(4287), ldc:int(4338)), xor:int(ldc:int(10055), ldc:int(10004))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(-29440), ldc:int(-29439)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(1032), ldc:int(1115)), xor:int(ldc:int(16466), ldc:int(16422))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(1218), ldc:int(1223)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(21109), ldc:int(11508)), xor:int(ldc:int(8197), ldc:int(8349))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(5204), ldc:int(5203)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(9368), ldc:int(4249)), xor:int(ldc:int(2682), ldc:int(2762))))
            putstatic:String[](\uc246\u9af2\u3bc9\u5d20\u759a::\ub70c\u7006\u4d85\ub18d\u6b0d, expr_113:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A4 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_6AF : int
        
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
        var_3_6A4 = and:int(ldc:int(-1486841557), ldc:int(-428672421))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc246\u9af2\u3bc9\u5d20\u759a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2071690914))
        }
        else {
            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1473193553))
            var_5_89 = and:int(ldc:int(4245), ldc:int(-4246))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31267), ldc:int(23074)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_6A4:int, ldc:int(1906678815))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(-31744), ldc:int(-31743)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(10753), ldc:int(5125)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_6A4 = and:int(var_3_D9:int, ldc:int(913676442))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(11520), ldc:int(11521)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-420270862))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1077744261))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2090631225))
                    }
                    else {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-230827730))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0868)
                        }
                    }
                    
                    Label_0395:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(575296539))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1778198782))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-813834641))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2094820172))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1044599982))
                        goto(Label_0868)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(102495195))
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1573447637))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-30223065))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-39413521))
                        var_11_EA = and:int(ldc:int(-28022), ldc:int(17781))
                        goto(Label_1580)
                    }
                    
                    Label_0592:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-194704947))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1053550830))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1965146964))
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-571722020))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1772395547))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0868)
                        }
                    }
                    
                    Label_0713:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1005109980))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1733098707))
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1127114218))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1462462236))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-117085460))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-294529162))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-377988285))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1222403205))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0868:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-484188027))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1558437240))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-441299864))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(590962749))
                            goto(Label_0713)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1038483115))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(9312), ldc:int(9313))
                                goto(Label_1172)
                            }
                        }
                    }
                    
                    Label_0987:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-601765209))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1540640123))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-685040500))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1724742054))
                            goto(Label_0868)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-53845868))
                            goto(Label_0713)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(21574480))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2094448150))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1865079375))
                        var_11_EA = and:int(ldc:int(-14374), ldc:int(14341))
                    }
                    
                    Label_1172:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(629659594))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-490680503))
                            goto(Label_0868)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-563932640))
                            goto(Label_0713)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(960042397))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(927712028))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1104749573))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1445)
                            }
                        }
                    }
                    
                    Label_1302:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1515014470))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1172)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1118395829))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1124276800))
                            goto(Label_0868)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(766351189))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1220631911))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(740597035))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1580)
                    }
                    
                    Label_1445:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-571295991))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(758775362))
                        goto(Label_0868)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1431820666))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(471161773))
                        goto(Label_0395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1124279394))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AF = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1784592879))
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1613545089))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0868)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(858780708))
                        goto(Label_0713)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(736288299))
                        var_17_6AF = add:int(var_16_118:int, and:int(ldc:int(899), ldc:int(8193)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1346062886))
                }
                
                var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1970208558))
                
                if (cmple:boolean(var_5_89 = var_17_6AF:int, sub:int(var_6_90:int, xor:int(ldc:int(384), ldc:int(385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
