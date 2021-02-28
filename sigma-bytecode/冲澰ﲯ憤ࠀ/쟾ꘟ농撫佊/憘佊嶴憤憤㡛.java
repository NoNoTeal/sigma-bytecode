public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u6198\u4f4a\u5db4\u61a4\u61a4\u385b {
    public void \u6198\u4f4a\u5db4\u61a4\u61a4\u385b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\ube23\u3711\u8d98\u3776\u156b\u61a4 p0) {
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
            putfield:\ube23\u3711\u8d98\u3776\u156b\u61a4(\u6198\u4f4a\u5db4\u61a4\u61a4\u385b::\u156b\u9af2\u759a\u7af6\u9a18\ud4fe, this:\u6198\u4f4a\u5db4\u61a4\u61a4\u385b, p0:\ube23\u3711\u8d98\u3776\u156b\u61a4)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u6198\u4f4a\u5db4\u61a4\u61a4\u385b)
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
    
    private static void lambda$\u4c04\u8cae\u183a\ua3b4\u5db4\u3a62$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_3_6D : int
        var_4_8B : int
        var_5_94 : \uf94d\u4c04\u120d\uae5d\u8aa5\u416d
        var_6_C4 : int
        var_7_CE : Object
        var_8_118 : \u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6
        var_9_154 : Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>
        var_10_18E : \u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>
        
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
        var_3_6D = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
        invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd))
        invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ua6bd\ubf56\u1187\ubefe\u183a))
        var_4_8B = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
        var_5_94 = invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        invokevirtual:void(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\uafe7\u9af2\u7043\ub70c\ub1b9\u92ff, var_5_94:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d, var_3_6D:int)
        
        if (cmpne:boolean(invokevirtual:\u52d3\ua61f\ubff1\u8258\u3711\u8308(\u8350\uff55\u88c5\u9937\u8d90\uc4d2::\u3e75\ufcaf\u516c\u88c5\u92ee\u4cd9, invokevirtual:\u8350\uff55\u88c5\u9937\u8d90\uc4d2(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\u5bc4\u3a62\uceb8\u156b\ubb2b\u36d3, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56)), ldc:Class<\u52d3\ua61f\ubff1\u8258\u3711\u8308>(\u494c\u4975\ua068\u0c95\uc84e.\u52d3\ua61f\ubff1\u8258\u3711\u8308.class)), aconstnull:\u52d3\ua61f\ubff1\u8258\u3711\u8308())) {
            var_6_C4 = invokevirtual:int(\u52d3\ua61f\ubff1\u8258\u3711\u8308::\u5654\u3c25\ua6bd\u8d98\u3dd3\u99f7, checkcast:\u52d3\ua61f\ubff1\u8258\u3711\u8308(\u494c\u4975\ua068\u0c95\uc84e.\u52d3\ua61f\ubff1\u8258\u3711\u8308.class, invokevirtual:\u52d3\ua61f\ubff1\u8258\u3711\u8308(\u8350\uff55\u88c5\u9937\u8d90\uc4d2::\u3e75\ufcaf\u516c\u88c5\u92ee\u4cd9, invokevirtual:\u8350\uff55\u88c5\u9937\u8d90\uc4d2(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\u5bc4\u3a62\uceb8\u156b\ubb2b\u36d3, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56)), ldc:Class<\u52d3\ua61f\ubff1\u8258\u3711\u8308>(\u494c\u4975\ua068\u0c95\uc84e.\u52d3\ua61f\ubff1\u8258\u3711\u8308.class))), invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            invokevirtual:void(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u3d4b\ua068\uf995\u983f\uae5d\u7af6, var_5_94:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d, var_6_C4:int)
            var_7_CE = aconstnull:Object()
            
            if (logicalor:boolean(cmpge:boolean(invokevirtual:int(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u5245\ucef1\u93a2\u983f\ud158\u9a18, var_5_94:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d), var_6_C4:int), invokeinterface:boolean(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u72f1\u4f4a\u8d90\u8aa5\u647c\u7ce1, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)))) {
                var_7_CE = invokestatic:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<Integer, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>[expected:Object](\u34df\u3776\ub70c\u6cfe\u9a18\u416d::\u6c52\uc910\ua61f\uc9f6\ud158\u71ae, invokevirtual:int(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u5245\ucef1\u93a2\u983f\ud158\u9a18, var_5_94:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d), var_6_C4:int)
            }
            
            var_8_118 = invokevirtual:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u34df\u8d90\ub19c\ua6bd\u7e3f\u6cfe, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            
            if (cmpne:boolean(var_7_CE:Object, aconstnull:Object())) {
                var_9_154 = invokeinterface:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>::iterator, var_7_CE:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>)
                
                while (invokeinterface:boolean(Iterator::hasNext, var_9_154:Iterator)) {
                    var_10_18E = checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>.class, invokeinterface:\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>(Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>::next, var_9_154:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>>))
                    invokevirtual:void(\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6::\u98a4\uc910\u8cae\u156b\u4f52\ub171, var_8_118:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6, checkcast:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd.class, invokevirtual:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>::\u7bad\u071d\u2dcc\u69d9\u3504\u36d3, var_10_18E:\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>)))
                    invokestatic:void(\u34df\u3776\ub70c\u6cfe\u9a18\u416d::\u6b5f\u8258\u4bc8\u3d4b\u7043\ub1b9, invokevirtual:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<?, ?, ?, ?>::getClass, checkcast:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<?, ?, ?, ?>(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<?, ?, ?, ?>.class, invokevirtual:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<?, ?, ?, ?>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<?, ?, ?, ?>>::\u7bad\u071d\u2dcc\u69d9\u3504\u36d3, var_10_18E:\u0a06\u527a\u4c04\uae5d\u3776\uc238<X, \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<?, ?, ?, ?>>))))
                }
                
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-3420), ldc:int(1371)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u873d\u416d\u9255\ua61f\u7330\u8640, invokestatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uc246\ub102\u5fe1\ubf56\u183a\u836c::\uc2e8\u8d98\u6fb0\u839e\u3e2a\u647c, var_6_C4:int))))
            }
            
            invokevirtual:void(\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6::\u98a4\uc910\u8cae\u156b\u4f52\ub171, var_8_118:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u34df\u3776\ub70c\u6cfe\u9a18\u416d::\ub1b9\u9af2\u6c56\u69d9\ub171\u3c25, var_6_C4:int))
            
            if (cmpeq:boolean(var_4_8B:int, xor:int(ldc:int(144), ldc:int(145)))) {
                invokevirtual:void(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\ufe34\uf995\ubcb0\u0800\u4cd9\u8bb0, var_5_94:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d, getstatic:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4(\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4::\u927d\u9a18\uc246\u7049\ub7dc\u6d69))
            }
            
            if (cmpeq:boolean(var_4_8B:int, and:int(ldc:int(7171), ldc:int(17078)))) {
                invokevirtual:void(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\ufe34\uf995\ubcb0\u0800\u4cd9\u8bb0, var_5_94:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d, getstatic:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4(\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4::\uff55\u7d52\u4c2b\u88c5\u3d64\ub7dc))
            }
            
            return:void()
        }
        
        invokevirtual:void(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u67e9\ub83f\u6c52\u4c2b\uc229\uc29a, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), and:int[expected:boolean](ldc:int(4255), ldc:int(-4832)))
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
        var_3_6AF : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_6BA : int
        
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
        var_3_6AF = and:int(ldc:int(-1978483582), ldc:int(-620253505))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6198\u4f4a\u5db4\u61a4\u61a4\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(2014106434))
        }
        else {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-549716318))
            var_5_88 = and:int(ldc:int(-21585), ldc:int(21584))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3034), ldc:int(729)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_6AF:int, ldc:int(-1440022908))
                    var_9_C6 = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_8F:int, and:int(ldc:int(18657), ldc:int(1029)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(7424), ldc:int(7425)))), var_7_9E:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_6AF = and:int(var_3_D8:int, ldc:int(-1371230219))
                    var_14_113 = var_7_9E:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), xor:int(ldc:int(6288), ldc:int(6289)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_8F:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(733612527))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-911958042))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1412502285))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1838008855))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1146975861))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1551034873))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(340822))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1438909025))
                            var_11_E9 = and:int(ldc:int(16629), ldc:int(-16886))
                            goto(Label_1560)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1641244691))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1286610786))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1110114780))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-147170977))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1881621306))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0682:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1231993532))
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2040396460))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-23987839))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1674983122))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1469538977))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1630339642))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1966564420))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-137318673))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(40628932))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1984112968))
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(2011225141))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-288182861))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_E9 = xor:int(ldc:int(14352), ldc:int(14353))
                                goto(Label_1126)
                            }
                        }
                    }
                    
                    Label_0957:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-667405562))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(917527900))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-791369349))
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1127303862))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(504558769))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-636555786))
                        var_11_E9 = and:int(ldc:int(31816), ldc:int(-32201))
                    }
                    
                    Label_1126:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(961170417))
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-671869472))
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(834828872))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1081356165))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1086668904))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1423)
                            }
                        }
                    }
                    
                    Label_1251:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1242039468))
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(131401531))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1443014433))
                            goto(Label_1126)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1278415066))
                            goto(Label_0957)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1297112235))
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1825037855))
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1636556245))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(12959882))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-818937890))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_88:int, var_16_117:int)
                        goto(Label_1560)
                    }
                    
                    Label_1423:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-922445768))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(466187209))
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-864226561))
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1100790681))
                        loopcontinue()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(-635064898))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1560:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BA = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1571:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(471734411))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1252264065))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(749013482))
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-788385951))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1382456283))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-908395250))
                        goto(Label_0391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1362755661))
                        var_17_6BA = add:int(var_16_117:int, xor:int(ldc:int(4128), ldc:int(4129)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(1273031407))
                }
                
                var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1893077045))
                
                if (cmple:boolean(var_5_88 = var_17_6BA:int, sub:int(var_6_8F:int, xor:int(ldc:int(-28636), ldc:int(-28635))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
