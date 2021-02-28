public class \u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8 {
    private void \u92ee\u8d90\u5f50\uf94d\ud7e8(\u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c[] p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\u120d\uc229\uc2e8\u7043 p3, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u6bb9\ubefe\u183a\u92ee\uc3e3 p4) {
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
            invokespecial:Object(Object::<init>, this:\u92ee\u8d90\u5f50\uf94d\ud7e8)
            putfield:\uf94d\ub18d\u34df\u59ec\u446c[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, p0:\uf94d\ub18d\u34df\u59ec\u446c[])
            putfield:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, p1:\u67d0\u36d3\uae5d\u99f7\u9a18[])
            putfield:Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>(\u92ee\u8d90\u5f50\uf94d\ud7e8::\uae87\u759a\u5d20\u7ce1\u92ee\ud36e, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, invokestatic:Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>(\u9af2\uc246\uc229\u8bb0\ua61f::\u7c6b\u34df\ud158\u5140\u8389\u1187, p1:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>[]]))
            putfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f52\u3c25\u8350\u7c6b\ud51e\u7d52, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, p2:\uf9c5\u7d52\u839e\u16f6\u4492[])
            putfield:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u624e\u71f1\u0c95\u120d\u0800\u4cd9, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, invokestatic:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u16f6\ub102\u6435\u0800\u3d4b::\u5bc4\u965f\u965f\u3d4b\u392e\uff55, p2:\uf9c5\u7d52\u839e\u16f6\u4492[][expected:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[]]))
            putfield:\u7d52\u120d\uc229\uc2e8\u7043(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u0b8e\u927d\u7006\u4ab3\u647c\u7873, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, p3:\u7d52\u120d\uc229\uc2e8\u7043)
            putfield:\u6bb9\ubefe\u183a\u92ee\uc3e3(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, p4:\u6bb9\ubefe\u183a\u92ee\uc3e3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u071d\u8413\u183a\u6c56\ub70c\u8308(java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p1) {
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
    
    public void \u5db4\u6d69\u6d99\u71f1\u3d64\u74b1(java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p1) {
        var_3_5F : int
        var_5_80 : Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_6_86 : Random
        var_7_A5 : int
        var_8_AE : int
        
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
            var_3_5F = and:int(ldc:int(1046643523), ldc:int(-595711066))
            
            if (invokeinterface:boolean(Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>::test, getfield:Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>(\u92ee\u8d90\u5f50\uf94d\ud7e8::\uae87\u759a\u5d20\u7ce1\u92ee\ud36e, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), p1:\uf9c5\u7043\u0c95\u76bc\u8389)) {
                var_5_80 = invokestatic:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\uf9c5\u7d52\u839e\u16f6\u4492::\u8413\u6ec6\u927d\u61a4\u71f1\uc87f, getfield:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u624e\u71f1\u0c95\u120d\u0800\u4cd9, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), p0:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p1:\uf9c5\u7043\u0c95\u76bc\u8389)
                var_6_86 = invokevirtual:Random(\uf9c5\u7043\u0c95\u76bc\u8389::\u647c\u647c\ucb79\ub171\u8bb0\u760c, p1:\uf9c5\u7043\u0c95\u76bc\u8389)
                var_7_A5 = add:int(invokeinterface:int(\u7d52\u120d\uc229\uc2e8\u7043::\ub113\u5fe1\u8bb0\u62da\u67d0\ud217, getfield:\u7d52\u120d\uc229\uc2e8\u7043(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u0b8e\u927d\u7006\u4ab3\u647c\u7873, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), var_6_86:Random), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokevirtual:float(\u6bb9\ubefe\u183a\u92ee\uc3e3::\u120d\ub19c\u183a\u071d\u8413\u516c, getfield:\u6bb9\ubefe\u183a\u92ee\uc3e3(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), var_6_86:Random), invokevirtual:float(\uf9c5\u7043\u0c95\u76bc\u8389::\u3711\u0c95\u1833\u5245\uc29a\u3711, p1:\uf9c5\u7043\u0c95\u76bc\u8389))))
                var_8_AE = and:int(ldc:int(-15612), ldc:int(14546))
                
                loop {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-580245524))
                    
                    if (cmpge:boolean(var_8_AE:int, var_7_A5:int)) {
                        looporswitchbreak()
                    }
                    
                    invokespecial:void(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u071d\u8413\u183a\u6c56\ub70c\u8308, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, var_5_80:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p1:\uf9c5\u7043\u0c95\u76bc\u8389)
                    inc:int(var_8_AE, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\uf9c5\ud4fe\u7043\u8d90\u4f4a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4f4a\uafe7\u64ab\uf995\u99f7 p0) {
        var_2_5F : int
        var_4_67 : int
        var_4_135 : int
        
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
            var_2_5F = and:int(ldc:int(1772705430), ldc:int(-51642658))
            var_4_67 = and:int(ldc:int(11053), ldc:int(-12078))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(884908445))
                    goto(Label_0272)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(2033639781))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(2078824919))
                    
                    if (cmplt:boolean(var_4_67:int, arraylength:int(getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, this:\u92ee\u8d90\u5f50\uf94d\ud7e8)))) {
                        invokeinterface:void(\u6435\u3e2a\u120d\u494c\u5d20::\u6bb9\u6cfe\uc29a\u5f50\u7af6\u61a4, loadelement:\u67d0\u36d3\uae5d\u99f7\u9a18(getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), var_4_67:int), invokevirtual:\u4f4a\uafe7\u64ab\uf995\u99f7(\u4f4a\uafe7\u64ab\uf995\u99f7::\u97e6\u40a9\u71f1\u9255\u51b2\u71ae, p0:\u4f4a\uafe7\u64ab\uf995\u99f7, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562), and:int(ldc:int(11461), ldc:int(-27862)))), var_4_67:int), loadelement:String(getstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562), and:int(ldc:int(103), ldc:int(1433)))))))
                        inc:int(var_4_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(531063262))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-571823722))
                    var_4_67 = and:int(ldc:int(-28842), ldc:int(24617))
                    
                    while (cmplt:boolean(var_4_67:int, arraylength:int(getfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f52\u3c25\u8350\u7c6b\ud51e\u7d52, this:\u92ee\u8d90\u5f50\uf94d\ud7e8)))) {
                        invokeinterface:void(\u6435\u3e2a\u120d\u494c\u5d20::\u6bb9\u6cfe\uc29a\u5f50\u7af6\u61a4, loadelement:\uf9c5\u7d52\u839e\u16f6\u4492(getfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f52\u3c25\u8350\u7c6b\ud51e\u7d52, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), var_4_67:int), invokevirtual:\u4f4a\uafe7\u64ab\uf995\u99f7(\u4f4a\uafe7\u64ab\uf995\u99f7::\u97e6\u40a9\u71f1\u9255\u51b2\u71ae, p0:\u4f4a\uafe7\u64ab\uf995\u99f7, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562), and:int(ldc:int(114), ldc:int(18562)))), var_4_67:int), loadelement:String(getstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562), and:int(ldc:int(20481), ldc:int(8489)))))))
                        inc:int(var_4_67, ldc:int(1))
                    }
                }
                
                Label_0272:
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1340340449))
            }
            
            var_4_135 = and:int(ldc:int(17169), ldc:int(-17170))
            
            while (cmplt:boolean(var_4_135:int, arraylength:int(getfield:\uf94d\ub18d\u34df\u59ec\u446c[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, this:\u92ee\u8d90\u5f50\uf94d\ud7e8)))) {
                invokevirtual:void(\uf94d\ub18d\u34df\u59ec\u446c::\u8413\u3e2a\u2dcc\u52d3\uc29a\u5f50, loadelement:\uf94d\ub18d\u34df\u59ec\u446c(getfield:\uf94d\ub18d\u34df\u59ec\u446c[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, this:\u92ee\u8d90\u5f50\uf94d\ud7e8), var_4_135:int), invokevirtual:\u4f4a\uafe7\u64ab\uf995\u99f7(\u4f4a\uafe7\u64ab\uf995\u99f7::\u97e6\u40a9\u71f1\u9255\u51b2\u71ae, p0:\u4f4a\uafe7\u64ab\uf995\u99f7, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562), and:int(ldc:int(6275), ldc:int(25139)))), var_4_135:int), loadelement:String(getstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562), and:int(ldc:int(1561), ldc:int(24609)))))))
                inc:int(var_4_135, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u6d69\u16f6\u836c\ub70c\u7006 \ud523\ub19c\u1833\u7006\ub83f\u12cb() {
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
            return:\u6d69\u16f6\u836c\ub70c\u7006(initobject:\u6d69\u16f6\u836c\ub70c\u7006(\u6d69\u16f6\u836c\ub70c\u7006::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc238\u9af2\ua6bd\uc84e\u6435\uc84e$0(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p0, java.util.List p1, org.apache.commons.lang3.mutable.MutableInt p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u718f\u69d9\ud7e8\u51fa\u8753 p3) {
        var_6_6F : int
        
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
            var_6_6F = invokeinterface:int(\u718f\u69d9\ud7e8\u51fa\u8753::\uc29a\uf94d\ufe34\u3504\u4ab3\u56bd, p3:\u718f\u69d9\ud7e8\u51fa\u8753, invokevirtual:float(\uf9c5\u7043\u0c95\u76bc\u8389::\u3711\u0c95\u1833\u5245\uc29a\u3711, p0:\uf9c5\u7043\u0c95\u76bc\u8389))
            
            if (cmpgt:boolean(var_6_6F:int, ldc:int(0))) {
                invokeinterface:boolean(List<\u718f\u69d9\ud7e8\u51fa\u8753>::add, p1:List<\u718f\u69d9\ud7e8\u51fa\u8753>, p3:\u718f\u69d9\ud7e8\u51fa\u8753)
                invokevirtual:void(MutableInt::add, p2:MutableInt, var_6_6F:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\u8d90\u5f50\uf94d\ud7e8(\u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c[] p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\u120d\uc229\uc2e8\u7043 p3, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u6bb9\ubefe\u183a\u92ee\uc3e3 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u74b1\u9033\u5d20\u6d69\uc3e3 p5) {
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
            invokespecial:\u92ee\u8d90\u5f50\uf94d\ud7e8(\u92ee\u8d90\u5f50\uf94d\ud7e8::<init>, this:\u92ee\u8d90\u5f50\uf94d\ud7e8, p0:\uf94d\ub18d\u34df\u59ec\u446c[], p1:\u67d0\u36d3\uae5d\u99f7\u9a18[], p2:\uf9c5\u7d52\u839e\u16f6\u4492[], p3:\u7d52\u120d\uc229\uc2e8\u7043, p4:\u6bb9\ubefe\u183a\u92ee\uc3e3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u7d52\u120d\uc229\uc2e8\u7043 \u8753\u6b5f\u6198\u8258\ud523\ub171(\u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8 p0) {
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
            return:\u7d52\u120d\uc229\uc2e8\u7043(getfield:\u7d52\u120d\uc229\uc2e8\u7043(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u0b8e\u927d\u7006\u4ab3\u647c\u7873, p0:\u92ee\u8d90\u5f50\uf94d\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public static \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c[] \u5db4\u6b5f\u6d69\ua61f\u4bc8\u5fe1(\u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8 p0) {
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
            return:\uf94d\ub18d\u34df\u59ec\u446c[](getfield:\uf94d\ub18d\u34df\u59ec\u446c[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:\u92ee\u8d90\u5f50\uf94d\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public static \u47c2\u2dcc\u12cb\ud171\u8c8a.\u6bb9\ubefe\u183a\u92ee\uc3e3 \uc4d2\u6c56\u5db4\u6b5f\u92ee\u0800(\u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8 p0) {
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
            return:\u6bb9\ubefe\u183a\u92ee\uc3e3(getfield:\u6bb9\ubefe\u183a\u92ee\uc3e3(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:\u92ee\u8d90\u5f50\uf94d\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] \u7d52\u946b\u647c\u9af2\u34df\u6b5f(\u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8 p0) {
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
            return:\u67d0\u36d3\uae5d\u99f7\u9a18[](getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:\u92ee\u8d90\u5f50\uf94d\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] \uc3e3\u3e75\uc9f6\u392e\ub1b9\u6ec6(\u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8 p0) {
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
            return:\uf9c5\u7d52\u839e\u16f6\u4492[](getfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\u4f52\u3c25\u8350\u7c6b\ud51e\u7d52, p0:\u92ee\u8d90\u5f50\uf94d\ud7e8))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_264 : int
        expr_6E : int [generated]
        stack_B5_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_14A_0 : byte[] [generated]
        stack_181_0 : byte[] [generated]
        stack_183_0 : byte[] [generated]
        stack_1B8_0 : byte[] [generated]
        stack_288_0 : byte[] [generated]
        stack_2F5_0 : byte[] [generated]
        stack_395_0 : byte[] [generated]
        stack_3D0_0 : byte[] [generated]
        stack_426_0 : byte[] [generated]
        var_4_24F : int
        var_3_254 : byte[]
        var_5_255 : int
        expr_288 : byte [generated]
        var_0_2EB : int
        expr_2F5 : byte [generated]
        stack_33E_2 : byte [generated]
        stack_31B_0 : byte [generated]
        expr_B7 : int [generated]
        expr_100 : int [generated]
        var_2_148 : byte[]
        expr_14C : int [generated]
        var_3_3BE : byte[]
        var_5_3BF : int
        expr_183 : int [generated]
        var_3_414 : byte[]
        var_5_415 : int
        var_3_1C4 : String
        stack_248_0 : String[] [generated]
        expr_1D6 : String[] [generated]
        
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
        var_0_264 = and:int(ldc:int(-1425837405), ldc:int(-55585886))
        expr_6E = arraylength:int(stack_B5_0 = stack_B7_0 = stack_FE_0 = stack_100_0 = stack_148_0 = stack_14A_0 = stack_181_0 = stack_183_0 = stack_1B8_0 = stack_288_0 = stack_2F5_0 = stack_395_0 = stack_3D0_0 = stack_426_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AQAk6RjjJhj2LMvu9zRK1RTmQq0JAAQ8+y65OEALhYXs")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_24F = expr_6E:int
        var_3_254 = newarray:byte[](byte.class, expr_6E:int)
        var_5_255 = expr_6E:int
        Label_0599:
        
        while (cmpne:boolean(and:int(var_0_264:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_264 = and:int(var_0_264:int, ldc:int(1302239871))
                goto(Label_0717)
            }
            
            var_0_264 = and:int(var_0_264:int, ldc:int(-66584833))
            var_5_255 = add:int(var_5_255:int, ldc:int(-1))
            expr_288 = loadelement:byte(stack_288_0:byte[], var_5_255:int)
            storeelement:byte(var_3_254:byte[], var_5_255:int, or:int(and:int(shl:int(expr_288:byte, and:int(ldc:int(132), ldc:int(14374))), ldc:int(-16)), and:int(shr:int(expr_288:byte[expected:int], and:int(ldc:int(140), ldc:int(6))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B7_0 = stack_B5_0 = stack_FE_0 = stack_100_0 = stack_148_0 = stack_14A_0 = stack_181_0 = stack_183_0 = stack_1B8_0 = stack_288_0 = stack_2F5_0 = stack_395_0 = stack_3D0_0 = stack_426_0 = var_3_254:byte[]
            goto(Label_0115)
        }
        
        var_0_264 = and:int(var_0_264:int, ldc:int(-1829217782))
        goto(Label_0868)
        Label_0717:
        
        while (cmpeq:boolean(and:int(var_0_264:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_264 = and:int(var_0_264:int, ldc:int(532748943))
                goto(Label_0599)
            }
            
            var_0_2EB = and:int(var_0_264:int, ldc:int(-1370794141))
            var_5_255 = add:int(var_5_255:int, ldc:int(-1))
            expr_2F5 = stack_33E_2 = loadelement(stack_2F5_0, var_5_255)
            
            if (cmplt:boolean(add:int(add:int(var_5_255:int, ldc:int(3)), neg:int(var_4_24F:int)), ldc:int(0))) {
                stack_33E_2 = stack_31B_0 = add:byte(expr_2F5:byte, loadelement:byte(var_3_254:byte[], add:int(var_5_255:int, ldc:int(3))))
                goto(Label_0811)
            }
            
            Label_0770:
            
            if (cmpeq:boolean(and:int(var_0_2EB:int, ldc:int(131072)), ldc:int(0))) {
                var_0_2EB = and:int(var_0_2EB:int, ldc:int(1952942121))
            }
            else {
                var_0_2EB = and:int(var_0_2EB:int, ldc:int(-1131973917))
                stack_33E_2 = stack_31B_0 = add:byte(expr_2F5:byte, ldc:byte(3))
            }
            
            Label_0811:
            
            if (cmpeq:boolean(and:int(var_0_2EB:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0770)
            }
            
            var_0_264 = and:int(var_0_2EB:int, ldc:int(-1389929878))
            storeelement:byte(var_3_254:byte[], var_5_255:int, stack_33E_2:byte)
            
            if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B7_0 = stack_B5_0 = stack_FE_0 = stack_100_0 = stack_148_0 = stack_14A_0 = stack_181_0 = stack_183_0 = stack_1B8_0 = stack_288_0 = stack_2F5_0 = stack_395_0 = stack_3D0_0 = stack_426_0 = var_3_254:byte[]
            goto(Label_0188)
        }
        
        Label_0868:
        
        while (cmpne:boolean(and:int(var_0_264:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(16)), ldc:int(0))) {
                var_0_264 = and:int(var_0_264:int, ldc:int(-1113693162))
                goto(Label_0599)
            }
            
            var_0_264 = and:int(var_0_264:int, ldc:int(-15239194))
            var_5_255 = add:int(var_5_255:int, ldc:int(-1))
            storeelement:byte(var_3_254:byte[], var_5_255:int, xor:byte(loadelement:byte(stack_395_0:byte[], var_5_255:int), ldc:byte(81)))
            
            if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B7_0 = stack_B5_0 = stack_FE_0 = stack_100_0 = stack_148_0 = stack_14A_0 = stack_181_0 = stack_183_0 = stack_1B8_0 = stack_288_0 = stack_2F5_0 = stack_395_0 = stack_3D0_0 = stack_426_0 = var_3_254:byte[]
            goto(Label_0261)
        }
        
        var_0_264 = and:int(var_0_264:int, ldc:int(1669881381))
        goto(Label_0717)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_0_264:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(1979749229))
            goto(Label_0337)
        }
        
        if (cmpeq:boolean(and:int(var_0_264:int, ldc:int(65536)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(-3908229))
            goto(Label_0261)
        }
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(64)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(-1392956114))
        }
        else {
            var_0_264 = and:int(var_0_264:int, ldc:int(-1142194453))
            expr_B7 = arraylength:int(stack_B7_0:byte[])
            
            if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                var_4_24F = expr_B7:int
                var_3_254 = newarray:byte[](byte.class, expr_B7:int)
                var_5_255 = expr_B7:int
                goto(Label_0717)
            }
        }
        
        Label_0188:
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(-1345835485))
            goto(Label_0392)
        }
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(16)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(273220926))
            goto(Label_0337)
        }
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(524288)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(1675582151))
        }
        else {
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_264 = and:int(var_0_264:int, ldc:int(-1181515977))
            expr_100 = arraylength:int(stack_100_0:byte[])
            
            if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                var_4_24F = expr_100:int
                var_3_254 = newarray:byte[](byte.class, expr_100:int)
                var_5_255 = expr_100:int
                goto(Label_0868)
            }
        }
        
        Label_0261:
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(16)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(1621444959))
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_0_264:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_264:int, ldc:int(512)), ldc:int(0))) {
                var_0_264 = and:int(var_0_264:int, ldc:int(-696996001))
                goto(Label_0188)
            }
            
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(256)), ldc:int(0))) {
                var_0_264 = and:int(var_0_264:int, ldc:int(-1410934781))
                goto(Label_0115)
            }
            
            var_0_264 = and:int(var_0_264:int, ldc:int(-1158186457))
            var_2_148 = stack_148_0:byte[]
            expr_14C = add:int(arraylength:int(stack_14A_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_14C:int, ldc:int(0))) {
                var_3_3BE = newarray:byte[](byte.class, expr_14C:int)
                var_5_3BF = expr_14C:int
                
                loop {
                    var_0_264 = and:int(var_0_264:int, ldc:int(-79438917))
                    var_5_3BF = add:int(var_5_3BF:int, ldc:int(-1))
                    storeelement:byte(var_3_3BE:byte[], var_5_3BF:int, add:int(shl:int(loadelement:byte(stack_3D0_0:byte[], var_5_3BF:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_148:byte[], add:int(var_5_3BF:int, xor:int(ldc:int(-29952), ldc:int(-29951)))), ldc:int(6)), and:int(ldc:int(13331), ldc:int(2531)))))
                    
                    if (cmpne:boolean(var_5_3BF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B7_0 = stack_B5_0 = stack_FE_0 = stack_100_0 = stack_148_0 = stack_14A_0 = stack_181_0 = stack_183_0 = stack_1B8_0 = stack_288_0 = stack_2F5_0 = stack_395_0 = stack_3D0_0 = stack_426_0 = var_3_3BE:byte[]
            }
        }
        
        Label_0337:
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0261)
            }
            
            if (cmpeq:boolean(and:int(var_0_264:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0188)
            }
            
            if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1024)), ldc:int(0))) {
                var_0_264 = and:int(var_0_264:int, ldc:int(-1831650775))
                goto(Label_0115)
            }
            
            var_0_264 = and:int(var_0_264:int, ldc:int(-106957902))
            expr_183 = arraylength:int(stack_183_0:byte[])
            
            if (cmpne:boolean(expr_183:int, ldc:int(0))) {
                var_3_414 = newarray:byte[](byte.class, expr_183:int)
                var_5_415 = expr_183:int
                
                loop {
                    var_0_264 = and:int(var_0_264:int, ldc:int(-72355074))
                    var_5_415 = add:int(var_5_415:int, ldc:int(-1))
                    storeelement:byte(var_3_414:byte[], var_5_415:int, add:byte(loadelement:byte(stack_426_0:byte[], var_5_415:int), ldc:byte(51)))
                    
                    if (cmpne:boolean(var_5_415:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B7_0 = stack_B5_0 = stack_FE_0 = stack_100_0 = stack_148_0 = stack_14A_0 = stack_181_0 = stack_183_0 = stack_1B8_0 = stack_288_0 = stack_2F5_0 = stack_395_0 = stack_3D0_0 = stack_426_0 = var_3_414:byte[]
            }
        }
        
        Label_0392:
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0337)
        }
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_264 = and:int(var_0_264:int, ldc:int(309828490))
            goto(Label_0261)
        }
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0188)
        }
        
        if (cmpne:boolean(and:int(var_0_264:int, ldc:int(131072)), ldc:int(0))) {
            var_3_1C4 = initobject:String(String::<init>, stack_1B8_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_248_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8220), ldc:int(69)))
            expr_1D6 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18531), ldc:int(18535)))
            storeelement:String(expr_1D6:String[], and:int(ldc:int(17551), ldc:int(-17552)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, and:int(ldc:int(-20317), ldc:int(20056)), and:int(ldc:int(43), ldc:int(18319))))
            storeelement:String(expr_1D6:String[], xor:int(ldc:int(-31360), ldc:int(-31357)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, xor:int(ldc:int(84), ldc:int(95)), xor:int(ldc:int(-16205), ldc:int(-16217))))
            storeelement:String(expr_1D6:String[], and:int(ldc:int(20878), ldc:int(578)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, and:int(ldc:int(4116), ldc:int(2324)), and:int(ldc:int(9375), ldc:int(2847))))
            storeelement:String(expr_1D6:String[], xor:int(ldc:int(8194), ldc:int(8195)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, and:int(ldc:int(31), ldc:int(6559)), xor:int(ldc:int(4893), ldc:int(4925))))
            putstatic:String[](\u92ee\u8d90\u5f50\uf94d\ud7e8::\ub19c\uff55\u0c95\u965f\ufcaf\ua562, expr_1D6:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ubff1\u8640\u183a\u6ec6\u4f52\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69A : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A5 : int
        
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
        var_3_69A = and:int(ldc:int(-1306513960), ldc:int(911748909))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ee\u8d90\u5f50\uf94d\ud7e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(65536)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(629152957))
        }
        else {
            var_3_69A = and:int(var_3_69A:int, ldc:int(-84381714))
            var_5_8A = and:int(ldc:int(3847), ldc:int(-3896))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31767), ldc:int(15366)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_69A:int, ldc:int(-19513542))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(3267), ldc:int(16417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(6797), ldc:int(289)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_69A = and:int(var_3_E3:int, ldc:int(-1149735029))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16409), ldc:int(8257)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-253434176))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-735648724))
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(189953728))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(927153944))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0847)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(657764622))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1766647543))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1466139915))
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-602876512))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-352394748))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1171456658))
                        var_11_F4 = and:int(ldc:int(9604), ldc:int(-9605))
                        goto(Label_1559)
                    }
                    
                    Label_0583:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-489147744))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-451121100))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-987001278))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1281589148))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2072604026))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0847)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-931203580))
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(350608476))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-852064653))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(670837484))
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1708421212))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1070313226))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0847:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(956456266))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1555974696))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-537259320))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-711817321))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-560643484))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-455560357))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1201867575))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1921482651))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(229), ldc:int(8961))
                                goto(Label_1147)
                            }
                        }
                    }
                    
                    Label_0996:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1139422208))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0847)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-879287228))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1125438028))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-161927782))
                        var_11_F4 = and:int(ldc:int(10801), ldc:int(-10814))
                    }
                    
                    Label_1147:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1049490960))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1164300105))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0996)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1921513222))
                            goto(Label_0847)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(931607151))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(2026021914))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(846835114))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1423)
                            }
                        }
                    }
                    
                    Label_1278:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-856249290))
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1236728361))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-349151279))
                            goto(Label_1147)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0996)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1019758087))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(2105319953))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2007396205))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1559)
                    }
                    
                    Label_1423:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1041736851))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1250121033))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(770208619))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1669528743))
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69A = and:int(var_3_69A:int, ldc:int(907493134))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1559:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1570:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(496255396))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(944654547))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1207713978))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-511593224))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(415824848))
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1917628239))
                        var_17_6A5 = add:int(var_16_122:int, xor:int(ldc:int(130), ldc:int(131)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69A = and:int(var_3_69A:int, ldc:int(-1154465832))
                
                if (cmple:boolean(var_5_8A = var_17_6A5:int, sub:int(var_6_91:int, xor:int(ldc:int(329), ldc:int(328))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(2095760439))
            goto(Label_0108)
        }
    }
}
