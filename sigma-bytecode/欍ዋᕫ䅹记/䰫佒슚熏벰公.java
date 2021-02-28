public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c {
    public void \u4c2b\u4f52\uc29a\u718f\ubcb0\u516c(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), and:int(ldc:int(-8378), ldc:int(8377)))))
            putfield:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\u9937\u6d99\u392e\ube23\u3dd3, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, initobject:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::<init>))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u12cb\u7bad\u7e3f\u392e\u9255\u446c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
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
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
        var_3_89 : List<\u76bc\u3d4b\u12b2\u3776\u183a\u416d>
        
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
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            
            if (invokevirtual:boolean(\u62da\u5f50\u7330\u4492\u51fa\u6d69::\u446c\uc246\ubefe\u92ee\u6d99\u0c95, getfield:\u62da\u5f50\u7330\u4492\u51fa\u6d69(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u624e\u8aa5\u9255\u836c\u960f\u67d0, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))) {
                var_3_89 = invokevirtual:List<\u76bc\u3d4b\u12b2\u3776\u183a\u416d>(\u62da\u5f50\u7330\u4492\u51fa\u6d69::\u4c2b\u983f\u51b2\ua562\uc246\u5654, getfield:\u62da\u5f50\u7330\u4492\u51fa\u6d69(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u624e\u8aa5\u9255\u836c\u960f\u67d0, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                invokevirtual:void(\u62da\u5f50\u7330\u4492\u51fa\u6d69::\u873d\u946b\ub7dc\u446c\u47c2\u4bc8, getfield:\u62da\u5f50\u7330\u4492\u51fa\u6d69(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u624e\u8aa5\u9255\u836c\u960f\u67d0, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u7873\u647c\ubf56\u7d52\u8aa5\u6198, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), var_3_89:List<\u76bc\u3d4b\u12b2\u3776\u183a\u416d>)
            }
            
            invokevirtual:void(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u64f2\u8709\u5bc4\u62da\u6435\u120d, getfield:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\u9937\u6d99\u392e\ube23\u3dd3, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)), and:int[expected:boolean](ldc:int(-14405), ldc:int(14404)))
            
            if (cmpne:boolean(getfield:\u12b2\u1833\ua3b4\u624e\u3e75\u0800(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u3504\u0b8e\u93a2\u0800\u3a62\u69d9, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), aconstnull:\u12b2\u1833\ua3b4\u624e\u3e75\u0800())) {
                invokevirtual:void(Thread::interrupt, getfield:\u12b2\u1833\ua3b4\u624e\u3e75\u0800[expected:Thread](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u3504\u0b8e\u93a2\u0800\u3a62\u69d9, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                putfield:\u12b2\u1833\ua3b4\u624e\u3e75\u0800(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u3504\u0b8e\u93a2\u0800\u3a62\u69d9, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, aconstnull:\u12b2\u1833\ua3b4\u624e\u3e75\u0800())
            }
            
            invokevirtual:void(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u52d3\u8308\u760c\u61a4\u8753\u59ec, getfield:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\u9937\u6d99\u392e\ube23\u3dd3, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ubded\ubb2b\u446c\uc2bd\uf94d\uc3e3() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), initobject:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u12cb\u7bad\u7e3f\u392e\u9255\u446c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5245\u8389\u5db4\u3776\ud7e8\u5140(boolean p0) {
        var_4_6C : \u51fa\u97b7\u960f\ub171\ub19c\u0a06
        
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
            var_4_6C = checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            
            if (p0:boolean) {
                if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)) {
                    invokevirtual:void(\u4ab3\u36d3\u3711\ua6bd\uc910\ub102::\u6c52\uc238\u5d20\uc87f\uc9f6\u92ee, getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e::\uf94d\uc7fe\u5140\u99f7\u927d\u4f52, checkcast:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e[expected:\u51fa\u97b7\u960f\ub171\ub19c\u0a06])))
                    invokevirtual:void(\u4ab3\u36d3\u3711\ua6bd\uc910\ub102::\u9033\u6198\u0800\u7e3f\u7043\u0800, getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                    invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, aconstnull:\u51fa\u97b7\u960f\ub171\ub19c\u0a06()))
                    invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u74b1\u0800\u7af6\uafe7\u4daf\ub6ab, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                }
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4492\ub70c\u71ae\u3c25\u5fe1\uf9c5(boolean p0) {
        var_4_6C : \u51fa\u97b7\u960f\ub171\ub19c\u0a06
        var_5_9C : \ub8be\u071d\u527a\u3711\ubff1\u759a
        
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
            var_4_6C = checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            
            if (p0:boolean) {
                if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)) {
                    var_5_9C = invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e::\uf94d\uc7fe\u5140\u99f7\u927d\u4f52, checkcast:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e))
                    putfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u71ae\u3e2a\u4d85\u8bb0\u6d99\u3d64, var_5_9C:\ub8be\u071d\u527a\u3711\ubff1\u759a, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u71ae\u3e2a\u4d85\u8bb0\u6d99\u3d64, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
                    putfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, var_5_9C:\ub8be\u071d\u527a\u3711\ubff1\u759a, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
                    invokevirtual:void(\ub8be\u071d\u527a\u3711\ubff1\u759a::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, var_5_9C:\ub8be\u071d\u527a\u3711\ubff1\u759a, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                    invokevirtual:void(\u4ab3\u36d3\u3711\ua6bd\uc910\ub102::\u9033\u6198\u0800\u7e3f\u7043\u0800, getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                    invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u74b1\u0800\u7af6\uafe7\u4daf\ub6ab, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                }
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uceb8\u8d98\u5d20\ubb2b\u69d9\u873d(boolean p0) {
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
            
            if (p0:boolean) {
                invokevirtual:void(\u4ab3\u36d3\u3711\ua6bd\uc910\ub102::\u873d\u3776\u7d52\u4cd9\u99f7\u494c, getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                invokevirtual:void(\u4ab3\u36d3\u3711\ua6bd\uc910\ub102::\u9033\u6198\u0800\u7e3f\u7043\u0800, getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
                invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, aconstnull:\u51fa\u97b7\u960f\ub171\ub19c\u0a06()))
                invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u74b1\u0800\u7af6\uafe7\u4daf\ub6ab, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u836c\u0b8e\u156b\u3a62\u3504\u5d20(boolean p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(-637159101), ldc:int(-248654005))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-607922193))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            }
            else {
                invokespecial:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u34df\u760c\ud217\uc229\u1187\u71f1, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_63 : int
        
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
        var_4_63 = and:int(ldc:int(892592532), ldc:int(-4987804))
        
        if (invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int)) {
            return:boolean(and:int[expected:boolean](ldc:int(801), ldc:int(19589)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0193)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1463025426))
                
                if (cmpeq:boolean(p0:int, and:int(ldc:int(4462), ldc:int(1831)))) {
                    invokespecial:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\ubb2b\u446c\uc2bd\uf94d\uc3e3, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)
                    return:boolean(xor:boolean(ldc:boolean(0), ldc:boolean(1)))
                }
            }
            
            Label_0147:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(524288)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(920590985))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(268435456)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(909863324))
                
                if (cmpne:boolean(invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)), aconstnull:\u51fa\u97b7\u960f\ub171\ub19c\u0a06())) {
                    if (logicaland:boolean(cmpne:boolean(p0:int, xor:int(ldc:int(-31524), ldc:int(-31267))), cmpne:boolean(p0:int, and:int(ldc:int(18767), ldc:int(9551))))) {
                        return:boolean(invokevirtual:boolean(\u8753\u927d\u4492\u36d3\u8308\ubded::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), p0:int, p1:int, p2:int))
                    }
                    
                    invokevirtual:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\uae87\uae87\u16f6\u71ae\ucef1\u839e, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)
                    return:boolean(xor:int[expected:boolean](ldc:int(18562), ldc:int(18563)))
                }
            }
            
            Label_0193:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1336542643))
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(131072)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-3453), ldc:int(3420)))
            }
        }
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
            putfield:List<ITextComponent>(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u0a06\uc2e8\ua068\ubded\u74b1\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, aconstnull:List<ITextComponent>())
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:ITextComponent(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), div:int(getfield:int(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), xor:int(ldc:int(-30463), ldc:int(-30461))), ldc:int(20), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (cmpne:boolean(getfield:List<ITextComponent>(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u0a06\uc2e8\ua068\ubded\u74b1\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), aconstnull:List<ITextComponent>())) {
                invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\ucb79\ucfaf\uf9c5\uc229\ub18d\u4e72, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:List<ITextComponent>(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u0a06\uc2e8\ua068\ubded\u74b1\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), p1:int, p2:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\uae87\u16f6\u71ae\ucef1\u839e() {
        var_1_61 : int
        var_3_6C : \u51fa\u97b7\u960f\ub171\ub19c\u0a06
        var_4_A5 : \u76bc\u3d4b\u12b2\u3776\u183a\u416d
        
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
            var_1_61 = and:int(ldc:int(1612494600), ldc:int(-377542808))
            var_3_6C = checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            
            if (logicalnot:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_3_6C:\u51fa\u97b7\u960f\ub171\ub19c\u0a06))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1541656645))
                
                if (instanceof:boolean(\u6435\ub8be\u718f\u6b0d\u67e9.\u4daf\ub70c\u8df4\ub102\ucfaf\u51fa.class, var_3_6C:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)) {
                    var_4_A5 = invokevirtual:\u76bc\u3d4b\u12b2\u3776\u183a\u416d(\u4daf\ub70c\u8df4\ub102\ucfaf\u51fa::\u7d52\ucb79\u9033\ud12e\u7af6\u5db4, checkcast:\u4daf\ub70c\u8df4\ub102\ucfaf\u51fa(\u6435\ub8be\u718f\u6b0d\u67e9.\u4daf\ub70c\u8df4\ub102\ucfaf\u51fa.class, var_3_6C:\u4daf\ub70c\u8df4\ub102\ucfaf\u51fa))
                    invokespecial:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u34df\u760c\ud217\uc229\u1187\u71f1, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, initobject:\ub8be\u071d\u527a\u3711\ubff1\u759a(\ub8be\u071d\u527a\u3711\ubff1\u759a::<init>, invokevirtual:String(\u76bc\u3d4b\u12b2\u3776\u183a\u416d::\ud523\u62da\u5654\u2dcc\u99f7\u5f50, var_4_A5:\u76bc\u3d4b\u12b2\u3776\u183a\u416d), invokevirtual:String(\u76bc\u3d4b\u12b2\u3776\u183a\u416d::\uc3e3\u8709\ub18d\uc84e\u0800\u7af6, var_4_A5:\u76bc\u3d4b\u12b2\u3776\u183a\u416d), and:int[expected:boolean](ldc:int(1921), ldc:int(10289))))
                }
            }
            else {
                invokespecial:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u34df\u760c\ud217\uc229\u1187\u71f1, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e::\uf94d\uc7fe\u5140\u99f7\u927d\u4f52, checkcast:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_3_6C:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e[expected:\u51fa\u97b7\u960f\ub171\ub19c\u0a06])))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u34df\u760c\ud217\uc229\u1187\u71f1(\u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p0) {
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
            
            if (cmpne:boolean(getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a), aconstnull:String())) {
                if (invokevirtual:boolean(String::contains, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a), loadelement:String[expected:CharSequence](getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), and:int(ldc:int(1116), ldc:int(17160))))) {
                    if (cmplt:boolean(invokevirtual:int(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u5bc4\u36d3\uf9c5\u7af6\uf9c5\u446c, invokestatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uff55\u7006\u8cae\u51fa\u7330\u873d::\u3e2a\u6b5f\u4daf\u6d99\u873d\ub113)), invokevirtual:int(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u5bc4\u36d3\uf9c5\u7af6\uf9c5\u446c, getstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u62da\u3e75\u3504\u97b7\u6ec6\u4179)))) {
                        putstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uff55\u7006\u8cae\u51fa\u7330\u873d::\u6b0d\u836c\u385b\u527a\uae87\u7c6b, getstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u62da\u3e75\u3504\u97b7\u6ec6\u4179))
                    }
                }
            }
            
            invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\u983f\uc229\u873d\u4d85\uf94d, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a)
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), initobject:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::<init>, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), p0:\ub8be\u071d\u527a\u3711\ubff1\u759a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\u6b5f\uc29a\uc238\uf995\u8aa5(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06 p0) {
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
            invokevirtual:void(\u8753\u927d\u4492\u36d3\u8308\ubded::\u8c8a\ubcb0\ud36e\u67d0\uceb8\u7873, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), p0:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)
            invokevirtual:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u64f2\u960f\u3d64\ub32d\u4492\ud12e, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64f2\u960f\u3d64\ub32d\u4492\ud12e() {
        var_3_96 : \u51fa\u97b7\u960f\ub171\ub19c\u0a06
        
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u5654\u61a4\u2dcc\u8350\uc2bd\ua068, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), and:int[expected:boolean](ldc:int(-23654), ldc:int(19524)))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7bad\u4d85\u7d52\u93a2\u516c\u8258, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), and:int[expected:boolean](ldc:int(-27224), ldc:int(18965)))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\u9937\ua562\ub19c\ub6ab\u3d4b, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), and:int[expected:boolean](ldc:int(-9719), ldc:int(1526)))
            var_3_96 = checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            
            if (cmpne:boolean(var_3_96:\u51fa\u97b7\u960f\ub171\ub19c\u0a06, aconstnull:\u51fa\u97b7\u960f\ub171\ub19c\u0a06())) {
                if (logicalnot:boolean(instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\uc29a\ub83f\ua3b4\u6435\u5654\u3504.class, var_3_96:\u51fa\u97b7\u960f\ub171\ub19c\u0a06))) {
                    putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u5654\u61a4\u2dcc\u8350\uc2bd\ua068, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), and:int[expected:boolean](ldc:int(273), ldc:int(22593)))
                    
                    if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_3_96:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)) {
                        putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7bad\u4d85\u7d52\u93a2\u516c\u8258, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), xor:int[expected:boolean](ldc:int(16936), ldc:int(16937)))
                        putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\u9937\ua562\ub19c\ub6ab\u3d4b, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), and:int[expected:boolean](ldc:int(8801), ldc:int(20609)))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u8389\ub18d\u6b5f\u67e9\uc229\ua61f \u4492\u7330\ubcb0\u8cae\u8308\u4179() {
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
            return:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(getfield:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\u9937\u6d99\u392e\ube23\u3dd3, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u156b\ud171\u4ab3\uc31c\u59ec(java.util.List<net.minecraft.util.text.ITextComponent> p0) {
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
            putfield:List<ITextComponent>(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u0a06\uc2e8\ua068\ubded\u74b1\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, p0:List<ITextComponent>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3d64\u7af6\uae87\uc238\u7d52.\u4ab3\u36d3\u3711\ua6bd\uc910\ub102 \uae5d\ub113\ub171\ud171\ub1b9\ub8be() {
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
            return:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(getfield:\u4ab3\u36d3\u3711\ua6bd\uc910\ub102(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub171\u9255\u6d69\u61a4\ub6ab\u183a, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uceb8\ud7e8\u51fa\ube23\u8cae\u5bc4$6(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u12cb\u7bad\u7e3f\u392e\u9255\u446c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8709\u647c\u3e2a\u759a\u51b2\u8413$5(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ubded\ubb2b\u446c\uc2bd\uf94d\uc3e3, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c2b\u7873\u47c2\u52d3\u8753\u6198$4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_4_6C : \u51fa\u97b7\u960f\ub171\ub19c\u0a06
        var_5_8C : String
        var_6_AC : TranslationTextComponent
        stack_D2_1 : String [generated]
        expr_C4 : Object[] [generated]
        
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
            var_4_6C = checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            
            if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)) {
                var_5_8C = getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u71ae\u3e2a\u4d85\u8bb0\u6d99\u3d64, invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e::\uf94d\uc7fe\u5140\u99f7\u927d\u4f52, checkcast:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e)))
                
                if (cmpne:boolean(var_5_8C:String, aconstnull:String())) {
                    var_6_AC = initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), xor:int(ldc:int(8209), ldc:int(8216))))
                    stack_D2_1 = loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), and:int(ldc:int(20622), ldc:int(3082)))
                    expr_C4 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1), ldc:int(9649)))
                    storeelement:Object(expr_C4:Object[], and:int(ldc:int(8812), ldc:int(-8813)), var_5_8C:String[expected:Object])
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), initobject:\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c(\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c::<init>, invokedynamic:BooleanConsumer(accept:(L\u6b0d\u12cb\u156b\u4179\u8bb0/\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), var_6_AC:TranslationTextComponent[expected:ITextComponent], initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_D2_1:String, expr_C4:Object[]), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), xor:int(ldc:int(-32693), ldc:int(-32704)))), getstatic:ITextComponent(\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\ua562\u8350\u97b7\u494c\u8cae\ud171)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5bc4\uc87f\u6b5f\u5fe1\ub113\ub7dc$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_4_6C : \u51fa\u97b7\u960f\ub171\ub19c\u0a06
        var_5_89 : \ub8be\u071d\u527a\u3711\ubff1\u759a
        
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
            var_4_6C = checkcast:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u97b7\u960f\ub171\ub19c\u0a06.class, invokevirtual:\u51fa\u97b7\u960f\ub171\ub19c\u0a06(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>::\ub102\ud51e\u4cd9\ub18d\u7ce1\u3504, getfield:\u8753\u927d\u4492\u36d3\u8308\ubded[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u51fa\u97b7\u960f\ub171\ub19c\u0a06>](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ud7e8\u8709\u1187\u71f1\uc31c\u3a62, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            
            if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\u51fa\u97b7\u960f\ub171\ub19c\u0a06)) {
                var_5_89 = invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e::\uf94d\uc7fe\u5140\u99f7\u927d\u4f52, checkcast:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e.class, var_4_6C:\uc3e3\u7c6b\u40a9\u3e2a\u6b0d\u0b8e))
                invokevirtual:void(\ub8be\u071d\u527a\u3711\ubff1\u759a::\ud36e\u72f1\u59ec\u97e6\u99f7\u3dd3, putfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, initobject:\ub8be\u071d\u527a\u3711\ubff1\u759a(\ub8be\u071d\u527a\u3711\ubff1\u759a::<init>, getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u71ae\u3e2a\u4d85\u8bb0\u6d99\u3d64, var_5_89:\ub8be\u071d\u527a\u3711\ubff1\u759a), getfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, var_5_89:\ub8be\u071d\u527a\u3711\ubff1\u759a), and:int[expected:boolean](ldc:int(-25702), ldc:int(25701)))), var_5_89:\ub8be\u071d\u527a\u3711\ubff1\u759a)
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), initobject:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::<init>, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], invokedynamic:BooleanConsumer(accept:(L\u6b0d\u12cb\u156b\u4179\u8bb0/\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c2b\u3711\u34df\u8df4\ucef1\u7006$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, initobject:\ub8be\u071d\u527a\u3711\ubff1\u759a(\ub8be\u071d\u527a\u3711\ubff1\u759a::<init>, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), xor:int(ldc:int(17056), ldc:int(17068))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(17056), ldc:int(-17057)))), loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), and:int(ldc:int(9389), ldc:int(781))), and:int[expected:boolean](ldc:int(1485), ldc:int(-3534))))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), initobject:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::<init>, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], invokedynamic:BooleanConsumer(accept:(L\u6b0d\u12cb\u156b\u4179\u8bb0/\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uafe7\ub1b9\u6c52\ub171\ua6bd\u9033$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, initobject:\ub8be\u071d\u527a\u3711\ubff1\u759a(\ub8be\u071d\u527a\u3711\ubff1\u759a::<init>, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), and:int(ldc:int(5340), ldc:int(2062))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-16156), ldc:int(16152)))), loadelement:String(getstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e), xor:int(ldc:int(2), ldc:int(15))), and:int[expected:boolean](ldc:int(21510), ldc:int(-21511))))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), initobject:\ud4fe\uceb8\u965f\u64f2\uc2bd\u1187[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\ud4fe\uceb8\u965f\u64f2\uc2bd\u1187::<init>, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], invokedynamic:BooleanConsumer(accept:(L\u6b0d\u12cb\u156b\u4179\u8bb0/\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c), getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\ub7dc\u9255\u8709\u8308\u718f\u760c, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u9af2\u74b1\uc7fe\uc31c\uc87f\u8bb0$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\uae87\uae87\u16f6\u71ae\ucef1\u839e, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2DB : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D2_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_F9_0 : byte[] [generated]
        stack_11C_0 : byte[] [generated]
        stack_2F5_0 : byte[] [generated]
        stack_34B_0 : byte[] [generated]
        stack_3EB_0 : byte[] [generated]
        stack_43F_0 : byte[] [generated]
        var_4_2C7 : int
        var_3_2CC : byte[]
        var_5_2CD : int
        var_0_365 : int
        expr_34B : byte [generated]
        stack_39D_2 : byte [generated]
        stack_371_0 : byte [generated]
        expr_3EE : byte [generated]
        expr_A6 : int [generated]
        expr_D4 : int [generated]
        var_2_F7 : byte[]
        expr_FB : int [generated]
        var_3_42D : byte[]
        var_5_42E : int
        var_3_128 : String
        stack_2BA_0 : String[] [generated]
        expr_13A : String[] [generated]
        
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
        var_0_2DB = and:int(ldc:int(916709003), ldc:int(937311364))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D2_0 = stack_D4_0 = stack_F7_0 = stack_F9_0 = stack_11C_0 = stack_2F5_0 = stack_34B_0 = stack_3EB_0 = stack_43F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tKhSoKkY6lNq4KJQrKARu6tUTOFSsVxTrgydo7BOoK1QpKVuS+WqUaqgRrhOXGbhX6ZOuEe2R7RGq6RXqwz7RbRKp6hNoaZYrUCusVxTrgzrUqKvTqGmWK1ArrFcU64M61WgoKpTtmeJUqunTaGmWK1ArrFcU64M61WgpqhOsE2hplitQK6xXFOuDOtVoKaoTkCMol5Pqq5EoaZYrUCusVxTrgzrVaCmqE5Qu1OvXVCkpa5EoaZYrUCusVxTrgzrVaCmqE5QsalQq1qkqEuhplitQK6xXFOuDOtVtEiiraBOoaZYrUCusVxTrgzrVl60Wk6hplitQK6xXFOuDPtDorBLsk20SqGmWK1ArrFcU64M+0ShplitMMo=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2C7 = expr_6E:int
        var_3_2CC = newarray:byte[](byte.class, expr_6E:int)
        var_5_2CD = expr_6E:int
        Label_0719:
        
        while (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0804)
            }
            
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-89964635))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, xor:byte(loadelement:byte(stack_2F5_0:byte[], var_5_2CD:int), ldc:byte(95)))
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D2_0 = stack_D4_0 = stack_F7_0 = stack_F9_0 = stack_11C_0 = stack_2F5_0 = stack_34B_0 = stack_3EB_0 = stack_43F_0 = var_3_2CC:byte[]
            goto(Label_0115)
        }
        
        var_0_2DB = and:int(var_0_2DB:int, ldc:int(1431392748))
        goto(Label_0963)
        Label_0804:
        
        while (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0719)
            }
            
            var_0_365 = and:int(var_0_2DB:int, ldc:int(-1970028935))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            expr_34B = stack_39D_2 = loadelement(stack_34B_0, var_5_2CD)
            
            if (cmplt:boolean(add:int(add:int(var_5_2CD:int, ldc:int(1)), neg:int(var_4_2C7:int)), ldc:int(0))) {
                stack_39D_2 = stack_371_0 = add:byte(expr_34B:byte, loadelement:byte(var_3_2CC:byte[], add:int(var_5_2CD:int, ldc:int(1))))
                goto(Label_0897)
            }
            
            Label_0856:
            
            if (cmpne:boolean(and:int(var_0_365:int, ldc:int(524288)), ldc:int(0))) {
                var_0_365 = and:int(var_0_365:int, ldc:int(-1932491683))
            }
            else {
                var_0_365 = and:int(var_0_365:int, ldc:int(2127813769))
                stack_39D_2 = stack_371_0 = add:byte(expr_34B:byte, ldc:byte(1))
            }
            
            Label_0897:
            
            if (cmpeq:boolean(and:int(var_0_365:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_365 = and:int(var_0_365:int, ldc:int(-1877533595))
                goto(Label_0856)
            }
            
            var_0_2DB = and:int(var_0_365:int, ldc:int(385776892))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, stack_39D_2:byte)
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D2_0 = stack_D4_0 = stack_F7_0 = stack_F9_0 = stack_11C_0 = stack_2F5_0 = stack_34B_0 = stack_3EB_0 = stack_43F_0 = var_3_2CC:byte[]
            goto(Label_0171)
        }
        
        var_0_2DB = and:int(var_0_2DB:int, ldc:int(-1158436970))
        Label_0963:
        
        while (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0719)
            }
            
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-745653138))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            expr_3EE = add:byte(loadelement:byte(stack_3EB_0:byte[], var_5_2CD:int), ldc:byte(110))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, or:int(and:int(shl:int(expr_3EE:byte, xor:int(ldc:int(-20413), ldc:int(-20409))), ldc:int(-16)), and:int(shr:int(expr_3EE:byte[expected:int], xor:int(ldc:int(134), ldc:int(130))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D2_0 = stack_D4_0 = stack_F7_0 = stack_F9_0 = stack_11C_0 = stack_2F5_0 = stack_34B_0 = stack_3EB_0 = stack_43F_0 = var_3_2CC:byte[]
            goto(Label_0217)
        }
        
        var_0_2DB = and:int(var_0_2DB:int, ldc:int(1983139900))
        goto(Label_0804)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(4)), ldc:int(0))) {
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-1433248723))
            goto(Label_0256)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0217)
        }
        
        if (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(1294012056))
        }
        else {
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-1296835090))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_2C7 = expr_A6:int
                var_3_2CC = newarray:byte[](byte.class, expr_A6:int)
                var_5_2CD = expr_A6:int
                goto(Label_0804)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0256)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-1464364904))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-487613022))
            expr_D4 = arraylength:int(stack_D4_0:byte[])
            
            if (cmpne:boolean(expr_D4:int, ldc:int(0))) {
                var_4_2C7 = expr_D4:int
                var_3_2CC = newarray:byte[](byte.class, expr_D4:int)
                var_5_2CD = expr_D4:int
                goto(Label_0963)
            }
        }
        
        Label_0217:
        
        if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2DB = and:int(var_0_2DB:int, ldc:int(-962355484))
            var_2_F7 = stack_F7_0:byte[]
            expr_FB = add:int(arraylength:int(stack_F9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FB:int, ldc:int(0))) {
                var_3_42D = newarray:byte[](byte.class, expr_FB:int)
                var_5_42E = expr_FB:int
                
                loop {
                    var_0_2DB = and:int(var_0_2DB:int, ldc:int(1471045168))
                    var_5_42E = add:int(var_5_42E:int, ldc:int(-1))
                    storeelement:byte(var_3_42D:byte[], var_5_42E:int, add:int(shl:int(loadelement:byte(stack_43F_0:byte[], var_5_42E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_F7:byte[], add:int(var_5_42E:int, xor:int(ldc:int(3072), ldc:int(3073)))), ldc:int(4)), xor:int(ldc:int(1030), ldc:int(1033)))))
                    
                    if (cmpne:boolean(var_5_42E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D2_0 = stack_D4_0 = stack_F7_0 = stack_F9_0 = stack_11C_0 = stack_2F5_0 = stack_34B_0 = stack_3EB_0 = stack_43F_0 = var_3_42D:byte[]
            }
        }
        
        Label_0256:
        
        if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0217)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DB:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_2DB:int, ldc:int(1024)), ldc:int(0))) {
            var_3_128 = initobject:String(String::<init>, stack_11C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2BA_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4430), ldc:int(31)))
            expr_13A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30708), ldc:int(-30718)))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(4104), ldc:int(4101)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(22033), ldc:int(-22038)), and:int(ldc:int(-9294), ldc:int(8269))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(9736), ldc:int(9737)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(20785), ldc:int(-20792)), xor:int(ldc:int(24616), ldc:int(24576))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(1062), ldc:int(1070)), invokevirtual:String[expected:String](String::substring, var_3_128:String, xor:int(ldc:int(20499), ldc:int(20539)), xor:int(ldc:int(8708), ldc:int(8759))))
            storeelement:String(expr_13A:String[], and:int(ldc:int(1167), ldc:int(-9440)), invokevirtual:String[expected:String](String::substring, var_3_128:String, xor:int(ldc:int(16424), ldc:int(16411)), xor:int(ldc:int(1098), ldc:int(1038))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(8259), ldc:int(8263)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(18767), ldc:int(8260)), xor:int(ldc:int(4731), ldc:int(4655))))
            storeelement:String(expr_13A:String[], and:int(ldc:int(16924), ldc:int(2061)), invokevirtual:String[expected:String](String::substring, var_3_128:String, xor:int(ldc:int(4885), ldc:int(4929)), and:int(ldc:int(4204), ldc:int(20220))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(-28155), ldc:int(-28157)), invokevirtual:String[expected:String](String::substring, var_3_128:String, xor:int(ldc:int(2583), ldc:int(2683)), xor:int(ldc:int(6), ldc:int(121))))
            storeelement:String(expr_13A:String[], and:int(ldc:int(11), ldc:int(17531)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(4735), ldc:int(10367)), and:int(ldc:int(5342), ldc:int(9112))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(-30432), ldc:int(-30423)), invokevirtual:String[expected:String](String::substring, var_3_128:String, xor:int(ldc:int(20), ldc:int(140)), and:int(ldc:int(179), ldc:int(951))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(1024), ldc:int(1034)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(1267), ldc:int(12735)), and:int(ldc:int(1485), ldc:int(29389))))
            storeelement:String(expr_13A:String[], and:int(ldc:int(25731), ldc:int(47)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(8687), ldc:int(205)), and:int(ldc:int(3296), ldc:int(492))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(1156), ldc:int(1153)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(3042), ldc:int(12520)), xor:int(ldc:int(-12079), ldc:int(-12256))))
            storeelement:String(expr_13A:String[], and:int(ldc:int(6167), ldc:int(1287)), invokevirtual:String[expected:String](String::substring, var_3_128:String, and:int(ldc:int(1269), ldc:int(241)), and:int(ldc:int(269), ldc:int(4359))))
            storeelement:String(expr_13A:String[], xor:int(ldc:int(13), ldc:int(15)), invokevirtual:String[expected:String](String::substring, var_3_128:String, xor:int(ldc:int(-23862), ldc:int(-23601)), xor:int(ldc:int(446), ldc:int(166))))
            putstatic:String[](\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7e3f\ud158\u8753\u9937\uc4d2\ud51e, expr_13A:String[])
            putstatic:Logger(\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c::\u7d52\ua068\u8258\uc2e8\u4e72\u983f, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(1422161979), ldc:int(1504935472))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-839582727))
            var_5_80 = and:int(ldc:int(-11150), ldc:int(2956))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6648), ldc:int(6609)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_641:int, ldc:int(898949114))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, and:int(ldc:int(771), ldc:int(20485)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(3081), ldc:int(16389)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D9:int, ldc:int(-5747329))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(-28414), ldc:int(-28413)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1380498297))
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1967959669))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-926689704))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2028833911))
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1807379005))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0406:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1357360394))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(414136401))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-266037634))
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-23830123))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-241302101))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-186519622))
                        var_11_EA = and:int(ldc:int(5228), ldc:int(-5229))
                        goto(Label_1490)
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1380298902))
                            goto(Label_0406)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-163180255))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1259026126))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-552736359))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(145124993))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1249704454))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-380069492))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-244960740))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1134971642))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1381133691))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(863079416))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2094662447))
                            goto(Label_0406)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(312737400))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(2176), ldc:int(2177))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0930:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1032267068))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1251909725))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1007593423))
                        var_11_EA = and:int(ldc:int(26124), ldc:int(-26126))
                    }
                    
                    Label_1068:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(652530465))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-524152934))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0930)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(273482285))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1412577478))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0406)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1771680598))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1293194055))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1199:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1937116606))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-856095118))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1068)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0930)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(59980832))
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1640694052))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2053198546))
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(547805245))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1341:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-381985572))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1445951946))
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-156162675))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(724926792))
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1002974193))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(721197493))
                        goto(Label_0406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(-744170316))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1288361625))
                        goto(Label_1199)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1079015800))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-155587452))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1603663999))
                        var_17_64C = add:int(var_16_118:int, and:int(ldc:int(7), ldc:int(25217)))
                        looporswitchbreak()
                    }
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(-2033071172))
                
                if (cmple:boolean(var_5_80 = var_17_64C:int, sub:int(var_6_87:int, xor:int(ldc:int(12545), ldc:int(12544))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1620525484))
            goto(Label_0108)
        }
    }
}
