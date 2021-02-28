public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u71f1\uc910\ud12e\u516c\uf995\u8aa5 {
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
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
    
    public boolean \ucb79\ua61f\ub18d\u416d\u416d\uc246(double p0, double p1, int p2) {
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
            return:boolean(invokespecial:boolean(\u836c\uc229\u8d98\u3d64\u8bb0\ube23::\ucb79\ua61f\ub18d\u416d\u416d\uc246, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\u836c\uc229\u8d98\u3d64\u8bb0\ube23], p0:double, p1:double, p2:int))
        }
        
        goto(Label_0006)
    }
    
    public void \u71f1\uc910\ud12e\u516c\uf995\u8aa5(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p1) {
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
            invokespecial:\u836c\uc229\u8d98\u3d64\u8bb0\ube23(\u836c\uc229\u8d98\u3d64\u8bb0\ube23::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(16), ldc:int(19)))))
            putfield:\u59ec\u647c\u6c52\u600f\u34df\uc29a(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u7043\u40a9\u6cfe\u8413\u494c\u62da, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, initobject:\u59ec\u647c\u6c52\u600f\u34df\uc29a(\u59ec\u647c\u6c52\u600f\u34df\uc29a::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\u8753\u8df4\u624e\u6b5f\u6c56\u5d20[expected:\uc2e8\ub32d\u836c\ubff1\uf9c5\uc87f](\u8753\u8df4\u624e\u6b5f\u6c56\u5d20::<init>)))
            putfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u7330\u5db4\uc9f6\u718f\ube23\u6b5f, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, getfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u0b8e\ub113\u59ec\ub7dc\u4179\u67d0, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            putfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8258\uc3e3\ube23\u527a\uc9f6\u5140, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ff\ud51e\u760c\u64f2\u62da\u4975, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, p1:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)
            invokevirtual:void(\u6c56\uc238\u12cb\u873d\u67e9\ud158::\u6d69\u760c\ufe34\u3c25\u494c\ub171, putfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u3c25\u67e9\u624e\ua068\u8258\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, invokevirtual:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u9255\u7e3f\u69d9\u6c56\u34df, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u647c\u8709\u7c6b\uc246\u9033\u5245, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ff\ud51e\u760c\u64f2\u62da\u4975, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))))
            
            if (cmpeq:boolean(getfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u0c95\ub83f\u64ab\u8350\uc31c\u3bd6))) {
                invokevirtual:void(\u6c56\uc238\u12cb\u873d\u67e9\ud158::\u74b1\u385b\uc229\uf995\u3bc9\ubff1, getfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u3c25\u67e9\u624e\ua068\u8258\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
        var_1_61 : int
        var_3_72 : int
        var_4_29C : \ub7dc\u34df\u071d\u494c\u0b8e\u97e6
        var_7_309 : \u5654\u3e75\u92ff\u97e6\u8c8a\uf995
        var_3_A1 : int
        var_3_133 : int
        var_3_1BC : int
        
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
            var_1_61 = and:int(ldc:int(-4950444), ldc:int(-21039396))
            invokeinterface:void(List<E>::clear, getfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u7330\u5db4\uc9f6\u718f\ube23\u6b5f, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            var_3_72 = and:int(ldc:int(20705), ldc:int(-20706))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(1321140212))
                
                if (cmpge:boolean(var_3_72:int, arraylength:int(getstatic:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ee\u8cae\u4975\u9255\uafe7\u6c52)))) {
                    looporswitchbreak()
                }
                
                var_4_29C = loadelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(getstatic:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ee\u8cae\u4975\u9255\uafe7\u6c52), var_3_72:int)
                
                if (cmpne:boolean(var_4_29C:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6, aconstnull:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6())) {
                    var_7_309 = invokevirtual:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], invokevirtual:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u88c5\uc910\u97e6\u8308\ua3b4\u62da, var_4_29C:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), and:int(ldc:int(6182), ldc:int(16387))), xor:int(ldc:int(5123), ldc:int(5272))), mul:int(rem:int(var_3_72:int, xor:int(ldc:int(20480), ldc:int(20482))), and:int(ldc:int(25008), ldc:int(4779)))), sub:int(add:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), ldc:int(6)), mul:int(ldc:int(21), div:int(var_3_72:int, xor:int(ldc:int(8208), ldc:int(8210))))), ldc:int(12)), and:int(ldc:int(21662), ldc:int(8342))))
                    
                    if (cmpeq:boolean(var_4_29C:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9, getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u6fb0\u8df4\u40a9\u760c\u759a\u59ec))) {
                        putfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, var_7_309:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)
                    }
                }
                
                inc:int(var_3_72, ldc:int(1))
            }
            
            var_3_A1 = sub:int(add:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), ldc:int(6)), mul:int(ldc:int(21), div:int(arraylength:int(getstatic:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ee\u8cae\u4975\u9255\uafe7\u6c52)), xor:int(ldc:int(136), ldc:int(138))))), ldc:int(12))
            invokevirtual:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ucef1\u51fa\ud217\u1833\u93a2\u61a4::<init>, xor:int(ldc:int(6250), ldc:int(6285)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), xor:int(ldc:int(4113), ldc:int(4115))), and:int(ldc:int(4315), ldc:int(8859))), and:int(ldc:int(1606), ldc:int(-3655))), var_3_A1:int, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(524), ldc:int(292))))))
            invokevirtual:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ucef1\u51fa\ud217\u1833\u93a2\u61a4::<init>, and:int(ldc:int(8431), ldc:int(17114)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), xor:int(ldc:int(-32764), ldc:int(-32762))), xor:int(ldc:int(8491), ldc:int(8624))), xor:int(ldc:int(17494), ldc:int(17654))), var_3_A1:int, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(6469), ldc:int(8213))))))
            var_3_133 = add:int(var_3_A1:int, ldc:int(21))
            invokevirtual:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ucef1\u51fa\ud217\u1833\u93a2\u61a4::<init>, xor:int(ldc:int(16448), ldc:int(16521)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), and:int(ldc:int(546), ldc:int(1347))), xor:int(ldc:int(8384), ldc:int(8283))), and:int(ldc:int(16485), ldc:int(-20838))), var_3_133:int, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(16548), ldc:int(16546))))))
            invokevirtual:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ucef1\u51fa\ud217\u1833\u93a2\u61a4::<init>, xor:int(ldc:int(8480), ldc:int(8692)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), xor:int(ldc:int(19465), ldc:int(19467))), and:int(ldc:int(16603), ldc:int(15519))), xor:int(ldc:int(10284), ldc:int(10380))), var_3_133:int, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(5255), ldc:int(5248))))))
            var_3_1BC = add:int(var_3_133:int, ldc:int(21))
            invokevirtual:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ucef1\u51fa\ud217\u1833\u93a2\u61a4::<init>, and:int(ldc:int(16603), ldc:int(9459)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), and:int(ldc:int(135), ldc:int(31306))), xor:int(ldc:int(351), ldc:int(452))), and:int(ldc:int(-27760), ldc:int(27717))), var_3_1BC:int, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(8269), ldc:int(8261))))))
            invokevirtual:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\ucef1\u51fa\ud217\u1833\u93a2\u61a4(\ucef1\u51fa\ud217\u1833\u93a2\u61a4::<init>, xor:int(ldc:int(6557), ldc:int(6467)), add:int(sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), xor:int(ldc:int(1348), ldc:int(1350))), xor:int(ldc:int(332), ldc:int(471))), and:int(ldc:int(8616), ldc:int(22704))), var_3_1BC:int, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(281), ldc:int(29197))))))
            invokevirtual:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::<init>, xor:int(ldc:int(12400), ldc:int(12472)), sub:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), and:int(ldc:int(3594), ldc:int(28834))), ldc:int(100)), add:int(add:int(div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), ldc:int(6)), xor:int(ldc:int(527), ldc:int(679))), ldc:int(11)), invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(11294), ldc:int(715))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-32302), ldc:int(30733))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5d20\u16f6\uc9f6\ucef1\u8308\u4f4a(\u6435\ub8be\u718f\u6b0d\u67e9.\u5654\u3e75\u92ff\u97e6\u8c8a\uf995 p0) {
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
            
            if (cmpeq:boolean(p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))) {
                invokespecial:void(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u62da\u6b5f\u3e2a\ucfaf\u8cae\uc3e3, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)
            }
            
            invokespecial:void(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\uc31c\u52d3\u071d\uf9c5\u8258\u8bb0, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)) {
                invokespecial:void(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5d20\u16f6\uc9f6\ucef1\u8308\u4f4a, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5, checkcast:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995[expected:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56]), and:int(ldc:int(9281), ldc:int(281)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc31c\u52d3\u071d\uf9c5\u8258\u8bb0() {
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
    
    public void \u36d3\uc238\ud12e\u836c\ube23\ua562(\u6435\ub8be\u718f\u6b0d\u67e9.\u5654\u3e75\u92ff\u97e6\u8c8a\uf995 p0) {
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
            
            if (cmpeq:boolean(p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))) {
                invokevirtual:void(\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9::\uc910\uc238\u759a\u839e\ua6bd\u0800, getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u6fb0\u8df4\u40a9\u760c\u759a\u59ec), getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), ldc:int(-1))
                invokespecial:void(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u62da\u6b5f\u3e2a\ucfaf\u8cae\uc3e3, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u62da\u6b5f\u3e2a\ucfaf\u8cae\uc3e3() {
        var_3_70 : \u4c04\u839e\u7049\ua3b4\ub18d\uc2bd
        var_4_78 : int
        var_5_81 : int
        
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ua6bd\u9a18\u88c5\u67d0\uc238\u0a06, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            var_3_70 = invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            var_4_78 = invokestatic:int(\u6c56\ubcb0\u183a\uae5d\ub7dc\u600f::\uc29a\uc238\ub171\u7006\u7c6b\u5fe1, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            var_5_81 = invokestatic:int(\u6c56\ubcb0\u183a\uae5d\ub7dc\u600f::\u5140\ud158\u983f\u6c56\u3e2a\u8cae, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            invokestatic:void(GLFW::glfwSetCursorPos, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, var_3_70:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), mul:double(i2d:double(add:int(getfield:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), sub:int(var_4_78:int, var_5_81:int))), invokevirtual:double(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u600f\u6b0d\u8389\u8cae\u4179\u7049, var_3_70:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)), mul:double(i2d:double(add:int(getfield:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6198\ud36e\u3776\u527a\u4492\u3a62, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), div:int(var_5_81:int, and:int(ldc:int(18442), ldc:int(18))))), invokevirtual:double(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u600f\u6b0d\u8389\u8cae\u4179\u7049, var_3_70:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5d20\u16f6\uc9f6\ucef1\u8308\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56 p0, int p1) {
        var_3_61 : int
        var_3_661 : int
        
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
        var_3_61 = and:int(ldc:int(-1265591812), ldc:int(-213246236))
        
        if (getfield:boolean(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56)) {
            if (cmpne:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), xor:int(ldc:int(8906), ldc:int(8706)))) {
                goto(Label_0236)
            }
            
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ff\ud51e\u760c\u64f2\u62da\u4975, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            goto(Label_0236)
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1547)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_1427)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(868304071))
            goto(Label_1259)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0909)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(965015259))
            goto(Label_0772)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0636)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(429175480))
            goto(Label_0519)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(753863217))
            goto(Label_0382)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        Label_0236:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_1547)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-931909907))
            goto(Label_1427)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_1259)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0909)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(1868802351))
            goto(Label_0772)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(1662549946))
            goto(Label_0636)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(263333874))
            goto(Label_0519)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-1793747306))
        }
        else {
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(367561365))
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(1457659335))
            
            if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), xor:int(ldc:int(1414), ldc:int(1359)))) {
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), initobject:\ufcaf\u960f\u3504\u40a9\u960f\ud7e8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\ufcaf\u960f\u3504\u40a9\u960f\ud7e8::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            }
        }
        
        Label_0382:
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_1547)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1427)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(219095099))
            goto(Label_1259)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(1956000950))
            goto(Label_0909)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0772)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(731087360))
            goto(Label_0636)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(1435252149))
        }
        else {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0236)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-2095386707))
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(1060347468))
            
            if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), and:int(ldc:int(2251), ldc:int(750)))) {
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), initobject:\u120d\u52d3\u9255\ubded\ub70c\u6ec6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u120d\u52d3\u9255\ubded\ub70c\u6ec6::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            }
        }
        
        Label_0519:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_1547)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_1427)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_1259)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0909)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-1495241454))
            goto(Label_0772)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(1253611132))
        }
        else {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0382)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0236)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1065354453))
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(-639197217))
            
            if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), and:int(ldc:int(8439), ldc:int(6355)))) {
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), initobject:\u98a4\ub18d\ud51e\u7049\ub7dc\u34df[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u98a4\ub18d\ud51e\u7049\ub7dc\u34df::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            }
        }
        
        Label_0636:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-1380759124))
            goto(Label_1547)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-286296003))
            goto(Label_1427)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1259)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-439536676))
            goto(Label_0909)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0519)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1211811665))
                goto(Label_0382)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0236)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1862394337))
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(875900237))
            
            if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), xor:int(ldc:int(4751), ldc:int(4699)))) {
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), initobject:\u56bd\u4c04\u4ab3\u7330\u7c6b\ub70c[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u56bd\u4c04\u4ab3\u7330\u7c6b\ub70c::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            }
        }
        
        Label_0772:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(291391099))
            goto(Label_1547)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-1241284166))
            goto(Label_1427)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-992802529))
            goto(Label_1259)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-482708344))
        }
        else {
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0636)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0519)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1164219233))
                goto(Label_0382)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0236)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(1425378759))
            
            if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), and:int(ldc:int(510), ldc:int(14046)))) {
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), initobject:\u51b2\ud171\uf995\u6c56\ud51e\u6198[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u51b2\ud171\uf995\u6c56\ud51e\u6198::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            }
        }
        
        Label_0909:
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1547)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_1427)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(993677758))
        }
        else {
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0772)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0636)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0519)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0382)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(245734400))
                goto(Label_0236)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(2101603821))
            
            if (cmpne:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, p0:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), xor:int(ldc:int(26686), ldc:int(26841)))) {
                goto(Label_0105)
            }
            
            if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ub83f\u7d52\u12cb\u7e3f\u76bc\u6d69))) {
                if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u51b2\u3bd6\u51b2\u7d52\u51fa\u67d0))) {
                    goto(Label_1427)
                }
            }
        }
        
        Label_1259:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-1261711992))
            goto(Label_1547)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(885975691))
        }
        else {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1730200388))
                goto(Label_0909)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0772)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-405114866))
                goto(Label_0636)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0519)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0382)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-2071675699))
                goto(Label_0236)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6bb9\u836c\ubefe\u64ab\u72f1\u71ae, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(8449), ldc:int(8458)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(26753), ldc:int(26765)))))
                return:void()
            }
            
            goto(Label_0105)
        }
        
        Label_1427:
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1493074536))
                goto(Label_1259)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0909)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0772)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-308870221))
                goto(Label_0636)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1713035620))
                goto(Label_0519)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(38063319))
                goto(Label_0382)
            }
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0236)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(1488629061))
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u0b8e\uc84e\ud158\ud51e\uc229\uae5d)) {
                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6bb9\u836c\ubefe\u64ab\u72f1\u71ae, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(28677), ldc:int(28680)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(-31354), ldc:int(-31352)))))
                return:void()
            }
        }
        
        Label_1547:
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_1427)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_1259)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0909)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0772)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0636)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0519)
        }
        
        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0382)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0236)
        }
        
        if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_61 = and:int(var_3_61:int, ldc:int(57318367))
            goto(Label_0105)
        }
        
        var_3_661 = and:int(var_3_61:int, ldc:int(-113242513))
        
        if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u99f7\u4c04\ub70c\u64f2\u3c25\uff55))) {
            var_3_61 = and:int(var_3_661:int, ldc:int(2080460516))
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), initobject:\u156b\uc29a\u6ec6\ub83f\u4c2b\uc246[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u156b\uc29a\u6ec6\ub83f\u4c2b\uc246::<init>, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            goto(Label_0105)
        }
        
        invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6bb9\u836c\ubefe\u64ab\u72f1\u71ae, invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(8546), ldc:int(8557)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\ud523\u4ab3\u93a2\u67d0\u7d52\u93a2, loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(13464), ldc:int(18454)))))
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
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u760c\ud51e\u3e2a\uc910\uc7fe\u71ae, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_7_8D : String
        var_8_9A : String
        var_9_FE : String
        
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), getfield:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), div:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), xor:int(ldc:int(368), ldc:int(370))), ldc:int(15), ldc:int(16777215))
            var_7_8D = invokestatic:String(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u8d90\ucfaf\u71f1\u527a\uc87f\u6ec6)
            var_8_9A = loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(-32576), ldc:int(-32559)))
            
            if (invokevirtual:boolean(String::equals, var_8_9A:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(271), ldc:int(285))))) {
                var_7_8D = loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(-8177), ldc:int(-8164)))
            }
            
            if (invokevirtual:boolean(String::equals, var_8_9A:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(18452), ldc:int(18437))))) {
                var_7_8D = loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(12884), ldc:int(412)))
            }
            
            if (invokevirtual:boolean(String::equals, var_8_9A:String, loadelement:String[expected:Object](getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), xor:int(ldc:int(-16355), ldc:int(-16376))))) {
                var_7_8D = loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(20510), ldc:int(566)))
            }
            
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), var_7_8D:String, xor:int(ldc:int(16394), ldc:int(16392)), sub:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), ldc:int(10)), ldc:int(8421504))
            var_9_FE = loadelement:String(getstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c), and:int(ldc:int(8631), ldc:int(20511)))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), var_9_FE:String, sub:int(sub:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5)), var_9_FE:String)), and:int(ldc:int(17666), ldc:int(3))), sub:int(getfield:int(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), ldc:int(10)), ldc:int(8421504))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u59ec\u647c\u6c52\u600f\u34df\uc29a::\ua068\uc7fe\u839e\u5140\uafe7\u8aa5, getfield:\u59ec\u647c\u6c52\u600f\u34df\uc29a(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u7043\u40a9\u6cfe\u8413\u494c\u62da, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, getfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u7330\u5db4\uc9f6\u718f\ube23\u6b5f, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u3711\u3e75\uc87f\ub6ab\u7bad\u3776(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u36d3\u8753\u4f4a\u0a06\u72f1\uc910 p0) {
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
            return:String(invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u36d3\u8753\u4f4a\u0a06\u72f1\uc910::\u7006\u071d\ub19c\u92ff\u120d\u946b, p0:\u36d3\u8753\u4f4a\u0a06\u72f1\uc910)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc4d2\u5654\ub70c\u9937\uceb8\u8d98$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u6c56\uc238\u12cb\u873d\u67e9\ud158::\u8bb0\u4e72\u64ab\u5245\uf9c5\uc29a, getfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u3c25\u67e9\u624e\ua068\u8258\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5245\u9af2\u7bad\u99f7\u3dd3\u5245$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8cae\u965f\ufcaf\u3e75\u7330\u7bad, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u0c95\ub83f\u64ab\u8350\uc31c\u3bd6))
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\ub83f\u8bb0\u69d9\u7049\u97e6, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
            invokevirtual:void(\u6c56\uc238\u12cb\u873d\u67e9\ud158::\u74b1\u385b\uc229\uf995\u3bc9\ubff1, getfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u3c25\u67e9\u624e\ua068\u8258\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5d20\u8c8a\u12b2\u8aa5\ua562\ub113$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u6c56\uc238\u12cb\u873d\u67e9\ud158::\u8bb0\u4e72\u64ab\u5245\uf9c5\uc29a, getfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u3c25\u67e9\u624e\ua068\u8258\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ubcb0\u67d0\u3504\u56bd\ufe34\u0800$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u8258\uc3e3\ube23\u527a\uc9f6\u5140, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u0c95\ub83f\u64ab\u8350\uc31c\u3bd6))
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\ub83f\u8bb0\u69d9\u7049\u97e6, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
            invokevirtual:void(\u6c56\uc238\u12cb\u873d\u67e9\ud158::\u74b1\u385b\uc229\uf995\u3bc9\ubff1, getfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u3c25\u67e9\u624e\ua068\u8258\u97b7, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5), this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_575_0 : byte[] [generated]
        stack_604_0 : byte[] [generated]
        stack_65B_0 : byte[] [generated]
        var_4_556 : int
        var_3_55B : byte[]
        var_5_55C : int
        var_0_58F : int
        expr_575 : byte [generated]
        stack_5C7_2 : byte [generated]
        stack_59B_0 : byte [generated]
        expr_607 : byte [generated]
        expr_95 : int [generated]
        var_2_BB : byte[]
        expr_BF : int [generated]
        var_3_649 : byte[]
        var_5_64A : int
        var_3_E7 : String
        expr_EF : String[] [generated]
        expr_F9 : String[] [generated]
        var_3_435 : String[]
        expr_438 : \ub7dc\u34df\u071d\u494c\u0b8e\u97e6[] [generated]
        stack_4F8_1 : String [generated]
        expr_4DD : Object[] [generated]
        
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
        var_0_61 = and:int(ldc:int(-835000045), ldc:int(2108620679))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_DB_0 = stack_575_0 = stack_604_0 = stack_65B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bwboyqr85KTUCPpzXpRoYJDtyHR8jsaQwiahWCSNRuR5roKnrvjuTBTCJqFIBoNWWrGuoHH6lrgmoUgGg1ZaAPCyYZieeb4Akizs9CYAlHAMFN7k+IYKcAIQCgD6cPiABABiCCIO8AiI7PiGCnACEAoA+nD4gAQAYgoiDvAIiOr4hgpwAhAKAPpw+IAEAGwIIg7wCH7s+IYKcAIQCgD6cPiABABsCiIO8Ah+6viGCnACEAoA+nD4gAQEbAgiDvAEfuz4hgpwAhAKAPpw+IAEBGwKIg7w4Hz87HrwiCQCCvwedOQA+vrkJIwK8PwC7HrwiCQQ+AoGhNTuHHwK9AgC7HrwiBT2/hL+hgqWDN7+/Ox68IgEGPgOEHgIAggIAhQScgra6vbsevCIBPIY/AR05BD8igwEGP7sevCIBP4WDBR8+ADe5vAIEv6IJPYS7AyK9vhqKhQK4hyC2t7sAu4ADAz+iCT2EuwMivb4agoO6vIehCBwKg4CDN5y5OTq8ggO/Igk9hLsDIr2+GoKDuryHoQgcCoK9hryhOTo9uT0/PyIJPYS7AyK9vhqCg7q8h6EIHAaFu7s8owK8PwK8vDw8ogk9hLsDIr2+GoKDuryHoQgcAoQ/hr0dBjm+troBu4M+Igk9hLsDIr2+GoKDuryHoQgcAr85v70hPr4DgL28ogk9hLsDIr2+GoKDuryHoQgcAoY/hrkcAja7uQCEPiIJPYS7AyK9vhqCg7q8h6EIHAKGO7y4nwK8PwEAgAA8IgEDBAKDrgE5u4Az1CGlIZ2rQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_556 = expr_6E:int
        var_3_55B = newarray:byte[](byte.class, expr_6E:int)
        var_5_55C = expr_6E:int
        Label_1374:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4)), ldc:int(0))) {
            var_0_58F = and:int(var_0_61:int, ldc:int(-1897137065))
            var_5_55C = add:int(var_5_55C:int, ldc:int(-1))
            expr_575 = stack_5C7_2 = loadelement(stack_575_0, var_5_55C)
            
            if (cmplt:boolean(add:int(add:int(var_5_55C:int, ldc:int(6)), neg:int(var_4_556:int)), ldc:int(0))) {
                stack_5C7_2 = stack_59B_0 = add:byte(expr_575:byte, loadelement:byte(var_3_55B:byte[], add:int(var_5_55C:int, ldc:int(6))))
                goto(Label_1451)
            }
            
            Label_1410:
            
            if (cmpne:boolean(and:int(var_0_58F:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_58F = and:int(var_0_58F:int, ldc:int(17576662))
            }
            else {
                var_0_58F = and:int(var_0_58F:int, ldc:int(774667762))
                stack_5C7_2 = stack_59B_0 = add:byte(expr_575:byte, ldc:byte(6))
            }
            
            Label_1451:
            
            if (cmpne:boolean(and:int(var_0_58F:int, ldc:int(4)), ldc:int(0))) {
                var_0_58F = and:int(var_0_58F:int, ldc:int(-1647386681))
                goto(Label_1410)
            }
            
            var_0_61 = and:int(var_0_58F:int, ldc:int(222055480))
            storeelement:byte(var_3_55B:byte[], var_5_55C:int, stack_5C7_2:byte)
            
            if (cmpne:boolean(var_5_55C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_BB_0 = stack_BD_0 = stack_DB_0 = stack_575_0 = stack_604_0 = stack_65B_0 = var_3_55B:byte[]
            goto(Label_0115)
        }
        
        Label_1517:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(2048)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-823202583))
            var_5_55C = add:int(var_5_55C:int, ldc:int(-1))
            expr_607 = xor:byte(loadelement:byte(stack_604_0:byte[], var_5_55C:int), ldc:byte(11))
            storeelement:byte(var_3_55B:byte[], var_5_55C:int, add:int(or:int(and:int(shl:int(expr_607:byte, xor:int(ldc:int(-32767), ldc:int(-32763))), ldc:int(-16)), and:int(shr:int(expr_607:byte[expected:int], xor:int(ldc:int(277), ldc:int(273))), ldc:int(15))), ldc:int(21)))
            
            if (cmpne:boolean(var_5_55C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_BB_0 = stack_BD_0 = stack_DB_0 = stack_575_0 = stack_604_0 = stack_65B_0 = var_3_55B:byte[]
            goto(Label_0154)
        }
        
        goto(Label_1374)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0196)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4096)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1831335167))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(229526959))
            expr_95 = arraylength:int(stack_95_0:byte[])
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_4_556 = expr_95:int
                var_3_55B = newarray:byte[](byte.class, expr_95:int)
                var_5_55C = expr_95:int
                goto(Label_1517)
            }
        }
        
        Label_0154:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(282953276))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-834806194))
            var_2_BB = stack_BB_0:byte[]
            expr_BF = add:int(arraylength:int(stack_BD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BF:int, ldc:int(0))) {
                var_3_649 = newarray:byte[](byte.class, expr_BF:int)
                var_5_64A = expr_BF:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1908675289))
                    var_5_64A = add:int(var_5_64A:int, ldc:int(-1))
                    storeelement:byte(var_3_649:byte[], var_5_64A:int, add:int(shl:int(loadelement:byte(stack_65B_0:byte[], var_5_64A:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_BB:byte[], add:int(var_5_64A:int, and:int(ldc:int(9225), ldc:int(16785)))), ldc:int(5)), xor:int(ldc:int(18434), ldc:int(18437)))))
                    
                    if (cmpne:boolean(var_5_64A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_BB_0 = stack_BD_0 = stack_DB_0 = stack_575_0 = stack_604_0 = stack_65B_0 = var_3_649:byte[]
            }
        }
        
        Label_0196:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0154)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_E7 = initobject:String(String::<init>, stack_DB_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_EF = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(133), ldc:int(155)))
            expr_F9 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5183), ldc:int(26718)))
            storeelement:String(expr_EF:String[], xor:int(ldc:int(16535), ldc:int(16522)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(-23456), ldc:int(20755)), xor:int(ldc:int(-32754), ldc:int(-32753))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(328), ldc:int(346)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(4626), ldc:int(4627)), xor:int(ldc:int(24580), ldc:int(24583))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(8211), ldc:int(8194)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(8784), ldc:int(8787)), xor:int(ldc:int(265), ldc:int(270))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(16398), ldc:int(16411)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(2247), ldc:int(4151)), and:int(ldc:int(8218), ldc:int(2252))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(2647), ldc:int(24639)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(540), ldc:int(16456)), xor:int(ldc:int(1054), ldc:int(1030))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(12831), ldc:int(19926)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(16907), ldc:int(16915)), xor:int(ldc:int(-24545), ldc:int(-24522))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(1047), ldc:int(4115)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(41), ldc:int(24623)), and:int(ldc:int(6335), ldc:int(567))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(2497), ldc:int(2517)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(220), ldc:int(235)), xor:int(ldc:int(-24440), ldc:int(-24381))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(-32491), ldc:int(-32481)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(79), ldc:int(6235)), and:int(ldc:int(5203), ldc:int(863))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(19), ldc:int(24)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(8539), ldc:int(22227)), xor:int(ldc:int(-32737), ldc:int(-32650))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(21292), ldc:int(2060)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(27753), ldc:int(4713)), and:int(ldc:int(18047), ldc:int(12415))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(12288), ldc:int(12301)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(9855), ldc:int(2303)), and:int(ldc:int(151), ldc:int(8885))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(127), ldc:int(270)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(2199), ldc:int(29917)), xor:int(ldc:int(2575), ldc:int(2724))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(8195), ldc:int(8204)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(16559), ldc:int(187)), and:int(ldc:int(12481), ldc:int(193))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(2616), ldc:int(16660)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(128), ldc:int(65)), xor:int(ldc:int(20559), ldc:int(20632))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(2444), ldc:int(24600)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(18655), ldc:int(1239)), xor:int(ldc:int(101), ldc:int(137))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(18447), ldc:int(13366)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(1516), ldc:int(4349)), xor:int(ldc:int(8253), ldc:int(8387))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(20527), ldc:int(20518)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(2191), ldc:int(2161)), xor:int(ldc:int(21014), ldc:int(21272))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(21031), ldc:int(143)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(79), ldc:int(321)), and:int(ldc:int(3364), ldc:int(25588))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(-13820), ldc:int(-13823)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(8375), ldc:int(8595)), and:int(ldc:int(3382), ldc:int(894))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(2323), ldc:int(2327)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(7406), ldc:int(7640)), xor:int(ldc:int(8505), ldc:int(8305))))
            storeelement:String(expr_EF:String[], and:int(ldc:int(156), ldc:int(18232)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(21357), ldc:int(344)), xor:int(ldc:int(10302), ldc:int(10591))))
            storeelement:String(expr_EF:String[], xor:int(ldc:int(-29620), ldc:int(-29609)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(976), ldc:int(689)), xor:int(ldc:int(1117), ldc:int(1501))))
            storeelement:String(expr_EF:String[], and:int(ldc:int(3134), ldc:int(8604)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(902), ldc:int(4544)), and:int(ldc:int(8671), ldc:int(3519))))
            storeelement:String(expr_EF:String[], and:int(ldc:int(16539), ldc:int(1049)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(8339), ldc:int(8460)), and:int(ldc:int(3519), ldc:int(13247))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(-21765), ldc:int(21764)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(12735), ldc:int(959)), and:int(ldc:int(16872), ldc:int(1504))))
            storeelement:String(expr_EF:String[], and:int(ldc:int(17210), ldc:int(13406)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(-32764), ldc:int(-32284)), and:int(ldc:int(8702), ldc:int(17406))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(545), ldc:int(24833)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(3368), ldc:int(3286)), and:int(ldc:int(2781), ldc:int(9759))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(16390), ldc:int(6691)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(2845), ldc:int(1567)), xor:int(ldc:int(16792), ldc:int(17317))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(2048), ldc:int(2051)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(325), ldc:int(888)), and:int(ldc:int(18031), ldc:int(4703))))
            putstatic:String[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u5fe1\u64f2\ub83f\u759a\u946b\ub70c, expr_F9:String[])
            var_3_435 = expr_EF:String[]
            expr_438 = newarray:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\u51fa\u12cb\u7330\u74b1\u6c52.\ub7dc\u34df\u071d\u494c\u0b8e\u97e6.class, ldc:int(12))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], and:int(ldc:int(491), ldc:int(-492)), getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u3504\uc4d2\u98a4\u64f2\ube23\ub8be))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], xor:int(ldc:int(30), ldc:int(31)), getstatic:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u92ff\u8350\u71ae\ud158\u7af6\u760c))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], and:int(ldc:int(26754), ldc:int(4458)), getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u8df4\u9937\ua6bd\u4ab3\u47c2\u4daf))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], xor:int(ldc:int(16513), ldc:int(16514)), getstatic:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u64ab\u6d69\u9a18\u5d20\u99f7\ubcb0))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], xor:int(ldc:int(-31229), ldc:int(-31225)), getstatic:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u69d9\ud171\ubf56\u6c52\u8cae\ucb79))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], and:int(ldc:int(4503), ldc:int(5)), getstatic:\u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u3bc9\u3711\u8308\ud217\u3e2a\u0800))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], ldc:int(6), getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u6fb0\u8df4\u40a9\u760c\u759a\u59ec))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], ldc:int(7), getstatic:\u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\uf94d\u7049\u156b\u61a4\ub1b9\ub8be))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], ldc:int(8), getstatic:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u4f4a\u965f\u93a2\u56bd\u7006\uc910))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], ldc:int(9), getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\uc84e\uc4d2\u718f\u7ce1\ub32d\uc31c))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], ldc:int(10), getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\ubefe\u40a9\u183a\u7ce1\ubff1\uc3e3))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], ldc:int(11), getstatic:\u8aa5\u34df\ub171\u4f4a\u4f4a\u69d9[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u7043\u3776\u64f2\u12b2\ud4fe\u3bc9))
            putstatic:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ee\u8cae\u4975\u9255\uafe7\u6c52, expr_438:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[])
            putstatic:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\ubb2b\u494c\ucb79\u946b\u718f\ud158, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_435:String[], and:int(ldc:int(20696), ldc:int(568)))), getstatic:TextFormatting(TextFormatting::ITALIC)))
            stack_4F8_1 = loadelement:String(var_3_435:String[], xor:int(ldc:int(4670), ldc:int(4647)))
            expr_4DD = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1346), ldc:int(2566)))
            storeelement:Object(expr_4DD:Object[], and:int(ldc:int(-6977), ldc:int(6976)), getstatic:ITextComponent[expected:Object](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\ubb2b\u494c\ucb79\u946b\u718f\ud158))
            storeelement:Object(expr_4DD:Object[], and:int(ldc:int(4609), ldc:int(2125)), getstatic:ITextComponent[expected:Object](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\ubb2b\u494c\ucb79\u946b\u718f\ud158))
            putstatic:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6bb9\u516c\uae5d\u8cae\ud36e\u3776, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_4F8_1:String, expr_4DD:Object[]))
            putstatic:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u92ee\u76bc\ub171\ucef1\u4e72\u4179, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_435:String[], and:int(ldc:int(8218), ldc:int(5402)))), getstatic:TextFormatting(TextFormatting::RED)))
            putstatic:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u7043\uc7fe\u3bc9\u983f\u3d4b\u5d20, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_435:String[], and:int(ldc:int(6171), ldc:int(1183)))))
            putstatic:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u93a2\uc9f6\u3a62\u3bd6\u3504\u7873, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_435:String[], xor:int(ldc:int(16909), ldc:int(16913)))))
            putstatic:ITextComponent(\u71f1\uc910\ud12e\u516c\uf995\u8aa5::\u6c56\u8d98\u8308\u527a\u92ee\u6435, initobject:StringTextComponent(StringTextComponent::<init>, loadelement:String(var_3_435:String[], and:int(ldc:int(5789), ldc:int(2397)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C7 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6D2 : int
        
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
        var_3_6C7 = and:int(ldc:int(-1083830692), ldc:int(-1359537515))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2)), ldc:int(0))) {
            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-290033833))
            var_5_81 = and:int(ldc:int(8851), ldc:int(-8888))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11738), ldc:int(9625)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C7:int, ldc:int(790871798))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(4177), ldc:int(11907)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(11905), ldc:int(4165)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C7 = and:int(var_3_DA:int, ldc:int(1049784159))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(16393), ldc:int(3139)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1774679546))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(375885968))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1988498343))
                        goto(Label_0755)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1915412639))
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1219502584))
                    }
                    else {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1857801013))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0612)
                            }
                            
                            goto(Label_0904)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-2067480824))
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(770483276))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-600916581))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1084003150))
                        goto(Label_1038)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1066546515))
                        goto(Label_0755)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1984665859))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1526870515))
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-544756163))
                        var_11_EB = and:int(ldc:int(-897), ldc:int(896))
                        goto(Label_1602)
                    }
                    
                    Label_0612:
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1691412844))
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-779343226))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1175271041))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(2118293614))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1674557866))
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(638278279))
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1309118238))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0904)
                        }
                    }
                    
                    Label_0755:
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1740376912))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-2055656434))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(247093387))
                        goto(Label_1038)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-805816780))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(625054249))
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(42316715))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(2115739413))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0904:
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(706086085))
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1131309738))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1127966541))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0755)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(2081807560))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1224703593))
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(242900830))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(8209), ldc:int(4225))
                                goto(Label_1180)
                            }
                        }
                    }
                    
                    Label_1038:
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-902592322))
                            goto(Label_0755)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1272907476))
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(2129594933))
                        var_11_EB = and:int(ldc:int(-15747), ldc:int(15746))
                    }
                    
                    Label_1180:
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1432868840))
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(412063813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(664805600))
                            goto(Label_1038)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(2123806468))
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0755)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1502058230))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-9270466))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1466)
                            }
                        }
                    }
                    
                    Label_1313:
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(201714446))
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1496757194))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-531764313))
                            goto(Label_1180)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1105470752))
                            goto(Label_1038)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0755)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-644919529))
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-46363121))
                            loopcontinue()
                        }
                        
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1339165662))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1602)
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1235140575))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0755)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(823757435))
                        goto(Label_0612)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1430271823))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-266715076))
                        loopcontinue()
                    }
                    
                    var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1041419094))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1602:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D2 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1613:
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1780421082))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-2126696311))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1021773088))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(1109337587))
                        goto(Label_0755)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-1708219887))
                        goto(Label_0612)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C7 = and:int(var_3_6C7:int, ldc:int(251345791))
                        var_17_6D2 = add:int(var_16_119:int, xor:int(ldc:int(4100), ldc:int(4101)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C7 = and:int(var_3_6C7:int, ldc:int(268168085))
                
                if (cmple:boolean(var_5_81 = var_17_6D2:int, sub:int(var_6_88:int, and:int(ldc:int(12361), ldc:int(16433))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6C7:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_6C7 = and:int(var_3_6C7:int, ldc:int(-2055452108))
            goto(Label_0108)
        }
    }
}
