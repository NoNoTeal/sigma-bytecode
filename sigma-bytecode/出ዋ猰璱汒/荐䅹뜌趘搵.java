public class \u51fa\u12cb\u7330\u74b1\u6c52.\u8350\u4179\ub70c\u8d98\u6435 {
    public void \u8350\u4179\ub70c\u8d98\u6435() {
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
            invokespecial:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::<init>, this:\u8350\u4179\ub70c\u8d98\u6435, initobject:\u6fb0\u3711\u99f7\u16f6\u76bc\u8258[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6fb0\u3711\u99f7\u16f6\u76bc\u8258::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8350\u4179\ub70c\u8d98\u6435(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokespecial:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::<init>, this:\u8350\u4179\ub70c\u8d98\u6435, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            invokespecial:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u8350\u4179\ub70c\u8d98\u6435[expected:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\uc31c\u74b1\u8389\u494c\u88c5\u446c, and:int(ldc:int(581), ldc:int(-582)), and:int(ldc:int(-6295), ldc:int(6294)), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc910\u0c95\u5d20\u6435\ucfaf\u836c, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))), d2i:int(div:double(mul:double(ldc:double(30.0), invokevirtual:double(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u600f\u6b0d\u8389\u8cae\u4179\u7049, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))), f2d:double(getstatic:float(\ucfaf\ud217\u8df4\u52d3\u446c::\u0b8e\u74b1\ud36e\u9a18\ud36e)))))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u8350\u4179\ub70c\u8d98\u6435[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7)
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u8350\u4179\ub70c\u8d98\u6435::\u7c6b\u4cd9\uc3e3\u16f6\u6bb9, this:\u8350\u4179\ub70c\u8d98\u6435), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8350\u4179\ub70c\u8d98\u6435::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8350\u4179\ub70c\u8d98\u6435), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u4c2b\u51fa\u983f\u4e72\uafe7\u92ff, this:\u8350\u4179\ub70c\u8d98\u6435[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])), sub:int(div:int(getfield:int(\u8350\u4179\ub70c\u8d98\u6435::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u8350\u4179\ub70c\u8d98\u6435), xor:int(ldc:int(13824), ldc:int(13826))), xor:int(ldc:int(2190), ldc:int(2076))), ldc:int(13), ldc:int(16777215))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8350\u4179\ub70c\u8d98\u6435::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8350\u4179\ub70c\u8d98\u6435), loadelement:String(getstatic:String[](\u8350\u4179\ub70c\u8d98\u6435::\u1187\ub70c\u74b1\u6198\u7e3f), xor:int(ldc:int(-24256), ldc:int(-24255))), sub:int(div:int(getfield:int(\u8350\u4179\ub70c\u8d98\u6435::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u8350\u4179\ub70c\u8d98\u6435), and:int(ldc:int(8206), ldc:int(22787))), ldc:int(30)), ldc:int(13), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), ldc:float(0.5f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u4975\u6198\u647c\u74b1\u8c8a() {
        var_1_5F : int
        var_3_73 : Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>
        var_1_7F : int
        var_4_B6 : \uc246\ub102\u5fe1\ubf56\u183a\u836c
        
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
            var_1_5F = and:int(ldc:int(131173527), ldc:int(1189075533))
            putstatic:int(\u8350\u4179\ub70c\u8d98\u6435::\u8308\u12cb\u61a4\uc2e8\u92ee, and:int(ldc:int(8933), ldc:int(-13038)))
            var_3_73 = invokeinterface:Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>::iterator, invokespecial:List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(\u8350\u4179\ub70c\u8d98\u6435::\u4daf\u69d9\u74b1\ucb79\u6435, this:\u8350\u4179\ub70c\u8d98\u6435))
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_7F = and:int(var_1_5F:int, ldc:int(1537731301))
                }
                else {
                    var_1_7F = and:int(var_1_5F:int, ldc:int(1461786669))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_73:Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>)) {
                        var_4_B6 = checkcast:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\ua562\ucb79\uc87f\u3dd3\ubcb0.\uc246\ub102\u5fe1\ubf56\u183a\u836c.class, invokeinterface:\uc246\ub102\u5fe1\ubf56\u183a\u836c(Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>::next, var_3_73:Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\uc246\ub102\u5fe1\ubf56\u183a\u836c::equals, invokespecial:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\u8350\u4179\ub70c\u8d98\u6435::\u72f1\u873d\u965f\u9033\uc7fe, this:\u8350\u4179\ub70c\u8d98\u6435, getstatic:int(\u8350\u4179\ub70c\u8d98\u6435::\u8308\u12cb\u61a4\uc2e8\u92ee)), invokestatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c[expected:Object](\uff55\u7006\u8cae\u51fa\u7330\u873d::\u3e2a\u6b5f\u4daf\u6d99\u873d\ub113)))) {
                            var_1_5F = and:int(var_1_7F:int, ldc:int(40705239))
                            putstatic:int(\u8350\u4179\ub70c\u8d98\u6435::\u8308\u12cb\u61a4\uc2e8\u92ee, add:int(getstatic:int(\u8350\u4179\ub70c\u8d98\u6435::\u8308\u12cb\u61a4\uc2e8\u92ee), and:int(ldc:int(8201), ldc:int(23825))))
                            loopcontinue()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_7F:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_7F:int, ldc:int(102021543))
            }
            
            return:int(getstatic:int(\u8350\u4179\ub70c\u8d98\u6435::\u8308\u12cb\u61a4\uc2e8\u92ee))
        }
        
        goto(Label_0006)
    }
    
    private java.util.List<\ua562\ucb79\uc87f\u3dd3\ubcb0.\uc246\ub102\u5fe1\ubf56\u183a\u836c> \u4daf\u69d9\u74b1\ucb79\u6435() {
        var_1_61 : int
        var_3_69 : ArrayList<\uc246\ub102\u5fe1\ubf56\u183a\u836c>
        var_4_72 : Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>
        var_5_AA : \uc246\ub102\u5fe1\ubf56\u183a\u836c
        
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
            var_1_61 = and:int(ldc:int(-61316403), ldc:int(2133849694))
            var_3_69 = initobject:ArrayList<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(ArrayList<E>::<init>)
            var_4_72 = invokeinterface:Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>::iterator, getstatic:List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\uc84e\ud7e8\u8308\u6bb9\u7873\u759a))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-287346962))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_72:Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>)) {
                        var_5_AA = checkcast:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\ua562\ucb79\uc87f\u3dd3\ubcb0.\uc246\ub102\u5fe1\ubf56\u183a\u836c.class, invokeinterface:\uc246\ub102\u5fe1\ubf56\u183a\u836c(Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>::next, var_4_72:Iterator<\uc246\ub102\u5fe1\ubf56\u183a\u836c>))
                        
                        if (cmpge:boolean(invokevirtual:int(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u5bc4\u36d3\uf9c5\u7af6\uf9c5\u446c, var_5_AA:\uc246\ub102\u5fe1\ubf56\u183a\u836c), invokevirtual:int(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u5bc4\u36d3\uf9c5\u7af6\uf9c5\u446c, getstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u516c\ua6bd\u6b5f\u51b2\ubded\u4f4a)))) {
                            invokeinterface:boolean(List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>::add, var_3_69:ArrayList<\uc246\ub102\u5fe1\ubf56\u183a\u836c>[expected:List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>], var_5_AA:\uc246\ub102\u5fe1\ubf56\u183a\u836c)
                        }
                        
                        var_1_61 = and:int(var_1_61:int, ldc:int(-306513155))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(var_3_69:ArrayList<\uc246\ub102\u5fe1\ubf56\u183a\u836c>[expected:List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>])
        }
        
        goto(Label_0006)
    }
    
    private \ua562\ucb79\uc87f\u3dd3\ubcb0.\uc246\ub102\u5fe1\ubf56\u183a\u836c \u72f1\u873d\u965f\u9033\uc7fe(int p0) {
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
            return:\uc246\ub102\u5fe1\ubf56\u183a\u836c(checkcast:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\ua562\ucb79\uc87f\u3dd3\ubcb0.\uc246\ub102\u5fe1\ubf56\u183a\u836c.class, invokeinterface:\uc246\ub102\u5fe1\ubf56\u183a\u836c(List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>::get, invokespecial:List<\uc246\ub102\u5fe1\ubf56\u183a\u836c>(\u8350\u4179\ub70c\u8d98\u6435::\u4daf\u69d9\u74b1\ucb79\u6435, this:\u8350\u4179\ub70c\u8d98\u6435), p0:int)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc7fe\ud523\u873d\ua6bd\ubff1\u4f4a() {
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
            return:boolean(and:int[expected:boolean](ldc:int(-19327), ldc:int(19244)))
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.ITextComponent lambda$\u4c2b\u3711\u34df\u8df4\ucef1\u7006$2(\u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p0, \ub113\ufcaf\u3c25\u071d\u97b7.\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc p1) {
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
            return:ITextComponent(initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokevirtual:String(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u16f6\u59ec\ub102\u385b\u92ee\uc3e3, invokespecial:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\u8350\u4179\ub70c\u8d98\u6435::\u72f1\u873d\u965f\u9033\uc7fe, this:\u8350\u4179\ub70c\u8d98\u6435, d2i:int(invokevirtual:double(\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, p1:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc, p0:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3))))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uafe7\ub1b9\u6c52\ub171\ua6bd\u9033$1(\u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p0, java.lang.Double p1) {
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
            putstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uff55\u7006\u8cae\u51fa\u7330\u873d::\u6b0d\u836c\u385b\u527a\uae87\u7c6b, invokespecial:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\u8350\u4179\ub70c\u8d98\u6435::\u72f1\u873d\u965f\u9033\uc7fe, this:\u8350\u4179\ub70c\u8d98\u6435, invokevirtual:int(Double::intValue, p1:Double)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Double lambda$\u9af2\u74b1\uc7fe\uc31c\uc87f\u8bb0$0(\u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p0) {
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
            return:Double(invokestatic:Double(Double::valueOf, i2d:double(invokespecial:int(\u8350\u4179\ub70c\u8d98\u6435::\u4975\u6198\u647c\u74b1\u8c8a, this:\u8350\u4179\ub70c\u8d98\u6435))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_21B : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_22E_0 : byte[] [generated]
        stack_277_0 : byte[] [generated]
        stack_2FE_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_1B5 : byte[]
        var_4_1B6 : int
        expr_A0 : int [generated]
        var_5_206 : int
        var_3_20B : byte[]
        var_4_20C : int
        var_0_291 : int
        expr_277 : byte [generated]
        stack_2C9_2 : byte [generated]
        stack_29D_0 : byte [generated]
        expr_D0 : int [generated]
        expr_112 : int [generated]
        var_3_2EC : byte[]
        var_4_2ED : int
        expr_2FE : byte [generated]
        var_3_154 : String
        stack_1A2_0 : String[] [generated]
        expr_166 : String[] [generated]
        
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
            var_0_21B = and:int(ldc:int(409742394), ldc:int(1852127039))
            expr_68 = var_2_6C = stack_9E_0 = stack_A0_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_22E_0 = stack_277_0 = stack_2FE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GrN7ffdE+rCDVUcBbNlze3n4mPlwg1VBbpCHS093+eA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_1B5 = newarray:byte[](byte.class, expr_70:int)
                var_4_1B6 = expr_70:int
                
                loop {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(2028925305))
                    var_4_1B6 = add:int(var_4_1B6:int, ldc:int(-1))
                    storeelement:byte(var_3_1B5:byte[], var_4_1B6:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_1B6:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_1B6:int, and:int(ldc:int(4737), ldc:int(18805)))), ldc:int(5)), and:int(ldc:int(24591), ldc:int(4567)))))
                    
                    if (cmpne:boolean(var_4_1B6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_22E_0 = stack_277_0 = stack_2FE_0 = var_3_1B5:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0279)
                }
                
                if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-524303500))
                    goto(Label_0213)
                }
                
                if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_0_21B = and:int(var_0_21B:int, ldc:int(-1171452041))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_206 = expr_A0:int
                var_3_20B = newarray:byte[](byte.class, expr_A0:int)
                var_4_20C = expr_A0:int
                Label_0526:
                
                while (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-1887585124))
                    var_4_20C = add:int(var_4_20C:int, ldc:int(-1))
                    storeelement:byte(var_3_20B:byte[], var_4_20C:int, xor:byte(add:byte(loadelement:byte(stack_22E_0:byte[], var_4_20C:int), ldc:byte(16)), ldc:byte(59)))
                    
                    if (cmpne:boolean(var_4_20C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_22E_0 = stack_277_0 = stack_2FE_0 = var_3_20B:byte[]
                    goto(Label_0165)
                }
                
                var_0_21B = and:int(var_0_21B:int, ldc:int(-964941272))
                Label_0608:
                
                while (cmpne:boolean(and:int(var_0_21B:int, ldc:int(16)), ldc:int(0))) {
                    var_0_291 = and:int(var_0_21B:int, ldc:int(2075650012))
                    var_4_20C = add:int(var_4_20C:int, ldc:int(-1))
                    expr_277 = stack_2C9_2 = loadelement(stack_277_0, var_4_20C)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_20C:int, ldc:int(2)), neg:int(var_5_206:int)), ldc:int(0))) {
                        stack_2C9_2 = stack_29D_0 = add:byte(expr_277:byte, loadelement:byte(var_3_20B:byte[], add:int(var_4_20C:int, ldc:int(2))))
                        goto(Label_0685)
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_291 = and:int(var_0_291:int, ldc:int(-1886859932))
                    }
                    else {
                        var_0_291 = and:int(var_0_291:int, ldc:int(1310996761))
                        stack_2C9_2 = stack_29D_0 = add:byte(expr_277:byte, ldc:byte(2))
                    }
                    
                    Label_0685:
                    
                    if (cmpne:boolean(and:int(var_0_291:int, ldc:int(8388608)), ldc:int(0))) {
                        var_0_291 = and:int(var_0_291:int, ldc:int(-213756867))
                        goto(Label_0644)
                    }
                    
                    var_0_21B = and:int(var_0_291:int, ldc:int(-1095240426))
                    storeelement:byte(var_3_20B:byte[], var_4_20C:int, stack_2C9_2:byte)
                    
                    if (cmpne:boolean(var_4_20C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_22E_0 = stack_277_0 = stack_2FE_0 = var_3_20B:byte[]
                    goto(Label_0213)
                }
                
                goto(Label_0526)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(128)), ldc:int(0))) {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(1220855394))
                    goto(Label_0279)
                }
                
                if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_21B = and:int(var_0_21B:int, ldc:int(2036651796))
                    expr_D0 = arraylength:int(stack_D0_0:byte[])
                    
                    if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                        var_5_206 = expr_D0:int
                        var_3_20B = newarray:byte[](byte.class, expr_D0:int)
                        var_4_20C = expr_D0:int
                        goto(Label_0608)
                    }
                }
                
                Label_0213:
                
                if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-1164833387))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_21B = and:int(var_0_21B:int, ldc:int(-722413936))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_21B = and:int(var_0_21B:int, ldc:int(-1335531944))
                        loopcontinue()
                    }
                    
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-1662637484))
                    expr_112 = arraylength:int(stack_112_0:byte[])
                    
                    if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                        var_3_2EC = newarray:byte[](byte.class, expr_112:int)
                        var_4_2ED = expr_112:int
                        
                        loop {
                            var_0_21B = and:int(var_0_21B:int, ldc:int(1222949470))
                            var_4_2ED = add:int(var_4_2ED:int, ldc:int(-1))
                            expr_2FE = loadelement:byte(stack_2FE_0:byte[], var_4_2ED:int)
                            storeelement:byte(var_3_2EC:byte[], var_4_2ED:int, or:int(and:int(shl:int(expr_2FE:byte, and:int(ldc:int(3373), ldc:int(532))), ldc:int(-16)), and:int(shr:int(expr_2FE:byte[expected:int], xor:int(ldc:int(16513), ldc:int(16517))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_2ED:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_22E_0 = stack_277_0 = stack_2FE_0 = var_3_2EC:byte[]
                    }
                }
                
                Label_0279:
                
                if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-1682399280))
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_21B = and:int(var_0_21B:int, ldc:int(-467367852))
            }
            
            var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1A2_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16449), ldc:int(16451)))
            expr_166 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1536), ldc:int(1538)))
            storeelement:String(expr_166:String[], xor:int(ldc:int(-32126), ldc:int(-32125)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-2939), ldc:int(2650)), and:int(ldc:int(12333), ldc:int(3423))))
            storeelement:String(expr_166:String[], and:int(ldc:int(2731), ldc:int(-3756)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(25098), ldc:int(25095)), and:int(ldc:int(2079), ldc:int(1087))))
            putstatic:String[](\u8350\u4179\ub70c\u8d98\u6435::\u1187\ub70c\u74b1\u6198\u7e3f, expr_166:String[])
            putstatic:int(\u8350\u4179\ub70c\u8d98\u6435::\u8308\u12cb\u61a4\uc2e8\u92ee, and:int(ldc:int(4261), ldc:int(-4262)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-1733286653), ldc:int(1335274786))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\u4179\ub70c\u8d98\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-125350761))
            var_5_81 = and:int(ldc:int(-217), ldc:int(216))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24417), ldc:int(7008)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_684:int, ldc:int(417087274))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(24871), ldc:int(5137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(132), ldc:int(133)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_D1:int, ldc:int(-642886645))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(48), ldc:int(49)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1212302668))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2034687479))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(865483227))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1454746997))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1572490911))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1178657766))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-755669192))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1838503801))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(44053873))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(382581206))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1803595394))
                            var_11_E2 = and:int(ldc:int(17059), ldc:int(-17060))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-665549277))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2039114756))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-567444949))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-524243824))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(881055890))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1159943030))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(749615694))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1682141280))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-8531640))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1516936678))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1405704622))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-88138449))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1821872010))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(882553994))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1650167860))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1814235440))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2053588602))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(277382111))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1449990606))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(24673), ldc:int(4993))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1533568211))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-200844388))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(639335684))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(740282))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1152094970))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2008372415))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1160264234))
                        var_11_E2 = and:int(ldc:int(22224), ldc:int(-22236))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2067960829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2142842612))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-301237381))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1671134772))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1367089670))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-931167353))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2002310822))
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-343880973))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1751430116))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-641854414))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1294973512))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(734301245))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1369311442))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-811428069))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2015319184))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-12860713))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(949526090))
                        var_17_68F = add:int(var_16_110:int, and:int(ldc:int(35), ldc:int(17553)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(-1384114906))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, and:int(ldc:int(14913), ldc:int(297))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
