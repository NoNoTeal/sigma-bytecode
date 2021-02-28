public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u516c\u4bc8\u416d\u965f\uc4d2 {
    public void \u516c\u4bc8\u416d\u965f\uc4d2() {
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
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
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
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, ldc:float(0.0f), ldc:float(0.0f), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3a62\u8d98\u1187\ub6ab\u156b::\u8d90\ub6ab\ub19c\u34df\ubefe))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, ldc:float(0.0f), ldc:float(0.0f), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\uc7fe\u624e\u8d90\ub8be\u960f)), ldc:float(0.1f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, ldc:float(0.0f), ldc:float(0.0f), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), ldc:float(0.95f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\ub102\u4ab3\uc246\u527a\u62da[expected:\u6fb0\u1187\u12b2\ua068\u5245\u67e9](\u3a62\uc910\u1187\u718f\u9255::\ub70c\u0800\u983f\u4492\u4c04), i2f:float(div:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), and:int(ldc:int(16562), ldc:int(10759)))), ldc:float(38.0f), loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(574), ldc:int(22670))), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u760c\ucfaf\u7006\u7bad\ud158))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\ub102\u4ab3\uc246\u527a\u62da[expected:\u6fb0\u1187\u12b2\ua068\u5245\u67e9](\u3a62\uc910\u1187\u718f\u9255::\ub70c\u0800\u983f\u4492\u4c04), i2f:float(div:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), and:int(ldc:int(222), ldc:int(290)))), ldc:float(58.0f), getfield:String(\u516c\u4bc8\u416d\u965f\uc4d2::\u624e\u718f\u4492\u8258\u8258, this:\u516c\u4bc8\u416d\u965f\uc4d2), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u760c\ucfaf\u7006\u7bad\ud158), and:int[expected:boolean](ldc:int(37), ldc:int(10625)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u5140\u9a18\u8d98\ufe34\uc2e8(int p0) {
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
            invokespecial:void(\ua068\u7af6\u3e75\u3bc9\ua562::\ua068\u5140\u9a18\u8d98\ufe34\uc2e8, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:\ua068\u7af6\u3e75\u3bc9\ua562], p0:int)
            
            if (cmpeq:boolean(p0:int, xor:int(ldc:int(-12125), ldc:int(-11869)))) {
                invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\u64ab\ubf56\u67e9\u8aa5\u1187\u4bc8, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u385b\ubefe\ucb79\uc87f\u8df4[expected:\ua068\u7af6\u3e75\u3bc9\ua562](\u385b\ubefe\ucb79\uc87f\u8df4::<init>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8cae\ubff1\u93a2\u7049\u516c$3(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
        var_5_70 : String
        var_6_C2 : String[]
        
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
            var_5_70 = loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(4234), ldc:int(4233)))
            
            try {
                var_5_70 = invokestatic:String(GLFW::glfwGetClipboardString, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            }
            catch (java.lang.Exception stack_8D_0) {
            }
            
            if (logicaland:boolean(cmpne:boolean(var_5_70:String, loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(19659), ldc:int(515)))), invokevirtual:boolean(String::contains, var_5_70:String, loadelement:String[expected:CharSequence](getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(341), ldc:int(346)))))) {
                var_6_C2 = invokevirtual:String[](String::split, var_5_70:String, loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(26766), ldc:int(26753))))
                
                if (cmpeq:boolean(arraylength:int(var_6_C2:String[]), xor:int(ldc:int(160), ldc:int(162)))) {
                    invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u7ce1\uc238\u56bd\ua068, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u516c\u4bc8\u416d\u965f\uc4d2::\ud523\u4c2b\u92ff\u1833\ubded, this:\u516c\u4bc8\u416d\u965f\uc4d2), invokevirtual:String(String::replace, loadelement:String(var_6_C2:String[], and:int(ldc:int(31757), ldc:int(-31822))), loadelement:String[expected:CharSequence](getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(4272), ldc:int(1048))), loadelement:String[expected:CharSequence](getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(71), ldc:int(4107)))))
                    invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u7ce1\uc238\u56bd\ua068, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u516c\u4bc8\u416d\u965f\uc4d2::\ua61f\u946b\u9033\u7043\u446c, this:\u516c\u4bc8\u416d\u965f\uc4d2), invokevirtual:String(String::replace, loadelement:String(var_6_C2:String[], and:int(ldc:int(1025), ldc:int(577))), loadelement:String[expected:CharSequence](getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(3727), ldc:int(3743))), loadelement:String[expected:CharSequence](getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(14619), ldc:int(679)))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uf995\u6c52\u6d99\u9a18\u40a9$2(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\u64ab\ubf56\u67e9\u8aa5\u1187\u4bc8, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u385b\ubefe\ucb79\uc87f\u8df4[expected:\ua068\u7af6\u3e75\u3bc9\ua562](\u385b\ubefe\ucb79\uc87f\u8df4::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc229\uceb8\u8389\u7330\u8640$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
    
    private void lambda$\uc246\u34df\u983f\uafe7\u8aa5\ubf56$0() {
        var_1_61 : int
        var_3_77 : \ud217\u624e\u34df\u0b8e\u416d
        stack_EE_0 : StringBuilder [generated]
        stack_EE_1 : String [generated]
        
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
            var_1_61 = and:int(ldc:int(1321939922), ldc:int(-655643050))
            var_3_77 = initobject:\ud217\u624e\u34df\u0b8e\u416d(\ud217\u624e\u34df\u0b8e\u416d::<init>, invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u516c\u4bc8\u416d\u965f\uc4d2::\ud523\u4c2b\u92ff\u1833\ubded, this:\u516c\u4bc8\u416d\u965f\uc4d2)), invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u516c\u4bc8\u416d\u965f\uc4d2::\ua61f\u946b\u9033\u7043\u446c, this:\u516c\u4bc8\u416d\u965f\uc4d2)))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u3d64\u3a62\u624e\u8df4\ubb2b::\u3711\ud12e\ub83f\u12cb\ud36e, getfield:\u3d64\u3a62\u624e\u8df4\ubb2b(\u516c\u4bc8\u416d\u965f\uc4d2::\uc84e\u7c6b\uc4d2\ub18d\u9937, this:\u516c\u4bc8\u416d\u965f\uc4d2), var_3_77:\ud217\u624e\u34df\u0b8e\u416d))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1239131987))
                putfield:String(\u516c\u4bc8\u416d\u965f\uc4d2::\u624e\u718f\u4492\u8258\u8258, this:\u516c\u4bc8\u416d\u965f\uc4d2, loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(1813), ldc:int(16469))))
            }
            else {
                invokevirtual:void(\u3d64\u3a62\u624e\u8df4\ubb2b::\u9af2\ufcaf\u7330\u9255\ub171, getfield:\u3d64\u3a62\u624e\u8df4\ubb2b(\u516c\u4bc8\u416d\u965f\uc4d2::\uc84e\u7c6b\uc4d2\ub18d\u9937, this:\u516c\u4bc8\u416d\u965f\uc4d2), var_3_77:\ud217\u624e\u34df\u0b8e\u416d)
                stack_EE_0 = invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(-32497), ldc:int(-32483)))), invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, var_3_77:\ud217\u624e\u34df\u0b8e\u416d))
                
                if (logicalnot:boolean(invokevirtual:boolean(\ud217\u624e\u34df\u0b8e\u416d::\u93a2\ud12e\u71ae\uafe7\uc84e, var_3_77:\ud217\u624e\u34df\u0b8e\u416d))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1757408856))
                    stack_EE_1 = loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(-32765), ldc:int(-32768)))
                }
                else {
                    stack_EE_1 = loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(12316), ldc:int(12303)))
                }
                
                putfield:String(\u516c\u4bc8\u416d\u965f\uc4d2::\u624e\u718f\u4492\u8258\u8258, this:\u516c\u4bc8\u416d\u965f\uc4d2, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_EE_0:StringBuilder, stack_EE_1:String), loadelement:String(getstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(17581), ldc:int(17593))))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_4B0 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_105_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_3DA_0 : byte[] [generated]
        stack_43D_0 : byte[] [generated]
        stack_4CB_0 : byte[] [generated]
        stack_51C_0 : byte[] [generated]
        var_4_3B3 : int
        var_3_3B8 : byte[]
        var_5_3B9 : int
        var_0_433 : int
        expr_43D : byte [generated]
        stack_47D_2 : byte [generated]
        stack_45A_0 : byte [generated]
        expr_4CB : byte [generated]
        expr_9E : int [generated]
        expr_D7 : int [generated]
        var_2_105 : byte[]
        expr_109 : int [generated]
        var_3_50A : byte[]
        var_5_50B : int
        var_3_142 : String
        stack_3AC_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_4B0 = and:int(ldc:int(2146403985), ldc:int(-77060644))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_136_0 = stack_3DA_0 = stack_43D_0 = stack_4CB_0 = stack_51C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("6IEZoRuLO237U5PpHZ2tHCkR+8uLS8qyg6WrayPJIuvrxPtDrcoLS+nzjSXlLFnh4YOzu+Oag737y1Nh9TMjyxEsu2t72tQTm+uCQ8tTLOtbQxqzi1tdtWU8q8LJ8slywxs7g7O745uDI8trc+PbE5vrg0PLUzPrW0Mbs4tbcPmV5Nb1sfSN1TgHcTqmzesy08MVw8uFs/VgD3FinrUt8mNzsTvzfWYqIsjH")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_3B3 = expr_6E:int
        var_3_3B8 = newarray:byte[](byte.class, expr_6E:int)
        var_5_3B9 = expr_6E:int
        Label_0955:
        
        while (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1036)
            }
            
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-337449539))
            var_5_3B9 = add:int(var_5_3B9:int, ldc:int(-1))
            storeelement:byte(var_3_3B8:byte[], var_5_3B9:int, add:byte(xor:byte(loadelement:byte(stack_3DA_0:byte[], var_5_3B9:int), ldc:byte(60)), ldc:byte(9)))
            
            if (cmpne:boolean(var_5_3B9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_136_0 = stack_3DA_0 = stack_43D_0 = stack_4CB_0 = stack_51C_0 = var_3_3B8:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1187)
        Label_1036:
        
        while (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(128)), ldc:int(0))) {
                var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-1816275601))
                goto(Label_0955)
            }
            
            var_0_433 = and:int(var_0_4B0:int, ldc:int(2003734971))
            var_5_3B9 = add:int(var_5_3B9:int, ldc:int(-1))
            expr_43D = stack_47D_2 = loadelement(stack_43D_0, var_5_3B9)
            
            if (cmplt:boolean(add:int(add:int(var_5_3B9:int, ldc:int(4)), neg:int(var_4_3B3:int)), ldc:int(0))) {
                stack_47D_2 = stack_45A_0 = add:byte(expr_43D:byte, loadelement:byte(var_3_3B8:byte[], add:int(var_5_3B9:int, ldc:int(4))))
                goto(Label_1130)
            }
            
            Label_1098:
            
            if (cmpne:boolean(and:int(var_0_433:int, ldc:int(128)), ldc:int(0))) {
                var_0_433 = and:int(var_0_433:int, ldc:int(-72818979))
                stack_47D_2 = stack_45A_0 = add:byte(expr_43D:byte, ldc:byte(4))
            }
            
            Label_1130:
            
            if (cmpeq:boolean(and:int(var_0_433:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1098)
            }
            
            var_0_4B0 = and:int(var_0_433:int, ldc:int(2133699511))
            storeelement:byte(var_3_3B8:byte[], var_5_3B9:int, stack_47D_2:byte)
            
            if (cmpne:boolean(var_5_3B9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_136_0 = stack_3DA_0 = stack_43D_0 = stack_4CB_0 = stack_51C_0 = var_3_3B8:byte[]
            goto(Label_0163)
        }
        
        var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-1064187509))
        Label_1187:
        
        while (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0955)
            }
            
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(1669244118))
            var_5_3B9 = add:int(var_5_3B9:int, ldc:int(-1))
            expr_4CB = loadelement:byte(stack_4CB_0:byte[], var_5_3B9:int)
            storeelement:byte(var_3_3B8:byte[], var_5_3B9:int, or:int(and:int(shl:int(expr_4CB:byte, xor:int(ldc:int(5648), ldc:int(5652))), ldc:int(-16)), and:int(shr:int(expr_4CB:byte[expected:int], and:int(ldc:int(532), ldc:int(2060))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_3B9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_136_0 = stack_3DA_0 = stack_43D_0 = stack_4CB_0 = stack_51C_0 = var_3_3B8:byte[]
            goto(Label_0220)
        }
        
        var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-1386067130))
        goto(Label_1036)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(32)), ldc:int(0))) {
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(2107787691))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(1807112849))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_3B3 = expr_9E:int
                var_3_3B8 = newarray:byte[](byte.class, expr_9E:int)
                var_5_3B9 = expr_9E:int
                goto(Label_1036)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-1492585431))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(549576152))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-1877285))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_3B3 = expr_D7:int
                var_3_3B8 = newarray:byte[](byte.class, expr_D7:int)
                var_5_3B9 = expr_D7:int
                goto(Label_1187)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(128)), ldc:int(0))) {
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-881451105))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(2066487516))
            var_2_105 = stack_105_0:byte[]
            expr_109 = add:int(arraylength:int(stack_107_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_50A = newarray:byte[](byte.class, expr_109:int)
                var_5_50B = expr_109:int
                
                loop {
                    var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-277436483))
                    var_5_50B = add:int(var_5_50B:int, ldc:int(-1))
                    storeelement:byte(var_3_50A:byte[], var_5_50B:int, add:int(shl:int(loadelement:byte(stack_51C_0:byte[], var_5_50B:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_105:byte[], add:int(var_5_50B:int, and:int(ldc:int(8201), ldc:int(1)))), ldc:int(7)), and:int(ldc:int(21587), ldc:int(8841)))))
                    
                    if (cmpne:boolean(var_5_50B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_136_0 = stack_3DA_0 = stack_43D_0 = stack_4CB_0 = stack_51C_0 = var_3_50A:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(32)), ldc:int(0))) {
            var_0_4B0 = and:int(var_0_4B0:int, ldc:int(-78874056))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_4B0:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_4B0:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_3AC_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(125), ldc:int(107)))
            expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30713), ldc:int(-30703)))
            storeelement:String(expr_154:String[], xor:int(ldc:int(832), ldc:int(835)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-6906), ldc:int(2777)), and:int(ldc:int(3302), ldc:int(-3303))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(4379), ldc:int(4363)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(27912), ldc:int(-27913)), xor:int(ldc:int(-32640), ldc:int(-32639))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(4186), ldc:int(4169)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(9217), ldc:int(771)), xor:int(ldc:int(2056), ldc:int(2072))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(3077), ldc:int(3089)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(20496), ldc:int(8381)), and:int(ldc:int(16721), ldc:int(8245))))
            storeelement:String(expr_154:String[], and:int(ldc:int(18525), ldc:int(8751)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(25607), ldc:int(25622)), and:int(ldc:int(787), ldc:int(9242))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(5123), ldc:int(5132)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-26486), ldc:int(-26472)), xor:int(ldc:int(523), ldc:int(536))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(207), ldc:int(193)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32635), ldc:int(-32618)), xor:int(ldc:int(1331), ldc:int(1321))))
            storeelement:String(expr_154:String[], and:int(ldc:int(-3963), ldc:int(1402)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(16410), ldc:int(8986)), xor:int(ldc:int(2205), ldc:int(2232))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(2096), ldc:int(2082)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(4126), ldc:int(4155)), and:int(ldc:int(24635), ldc:int(817))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(198), ldc:int(204)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4209), ldc:int(2227)), xor:int(ldc:int(18484), ldc:int(18433))))
            storeelement:String(expr_154:String[], and:int(ldc:int(18956), ldc:int(4110)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(16437), ldc:int(5173)), xor:int(ldc:int(65), ldc:int(4))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(1158), ldc:int(1166)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(16440), ldc:int(16509)), and:int(ldc:int(874), ldc:int(6362))))
            storeelement:String(expr_154:String[], and:int(ldc:int(2182), ldc:int(4102)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(874), ldc:int(26719)), and:int(ldc:int(8274), ldc:int(5979))))
            storeelement:String(expr_154:String[], and:int(ldc:int(660), ldc:int(16388)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(219), ldc:int(26194)), and:int(ldc:int(119), ldc:int(8803))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(1039), ldc:int(1030)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(11423), ldc:int(11516)), xor:int(ldc:int(3165), ldc:int(3130))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(4357), ldc:int(4366)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(9575), ldc:int(2279)), xor:int(ldc:int(2113), ldc:int(2092))))
            storeelement:String(expr_154:String[], and:int(ldc:int(4375), ldc:int(1191)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(16414), ldc:int(16499)), xor:int(ldc:int(16452), ldc:int(16438))))
            storeelement:String(expr_154:String[], and:int(ldc:int(17679), ldc:int(4693)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4350), ldc:int(9330)), and:int(ldc:int(4730), ldc:int(2170))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(16468), ldc:int(16470)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(9338), ldc:int(19455)), and:int(ldc:int(8410), ldc:int(4770))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(3232), ldc:int(3233)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(6159), ldc:int(6285)), and:int(ldc:int(4319), ldc:int(11403))))
            storeelement:String(expr_154:String[], and:int(ldc:int(533), ldc:int(29137)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32184), ldc:int(-32061)), xor:int(ldc:int(4337), ldc:int(4203))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(128), ldc:int(149)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-28669), ldc:int(-28519)), and:int(ldc:int(8359), ldc:int(167))))
            putstatic:String[](\u516c\u4bc8\u416d\u965f\uc4d2::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_154:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_659 : int
        
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
        var_3_64E = and:int(ldc:int(-1843640006), ldc:int(-415630577))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u516c\u4bc8\u416d\u965f\uc4d2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(1918135690))
            var_5_81 = and:int(ldc:int(-7532), ldc:int(7498))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6017), ldc:int(-22454)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_64E:int, ldc:int(-1650467857))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(6177), ldc:int(17)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1541), ldc:int(16393)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_64E = and:int(var_3_DA:int, ldc:int(-1080558766))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4392), ldc:int(4393)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1582789207))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-414250848))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1572155168))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1467027055))
                    }
                    else {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-683783749))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1580133663))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(122980030))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1637443649))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1136218071))
                            var_11_EB = and:int(ldc:int(-27385), ldc:int(2168))
                            goto(Label_1472)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-360864676))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-268069145))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-266578580))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1961494653))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1748368655))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1169558013))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-413761103))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(931344950))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-525054842))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(2015212254))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1071639410))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-68944657))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1781995205))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1175440399))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(274587098))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-32766), ldc:int(-32765))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1545497280))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1559836303))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-182650037))
                        var_11_EB = and:int(ldc:int(9707), ldc:int(-26604))
                    }
                    
                    Label_1092:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1267456416))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(616526052))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1095112447))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1244276322))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1326)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1883553092))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1092)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1625656362))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-629538818))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1472)
                    }
                    
                    Label_1326:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(411786462))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1418450597))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(129601244))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1564030935))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(363741006))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(1161821167))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_659 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1964762812))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1119015350))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-372063574))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1365994523))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1650875717))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1200267809))
                        var_17_659 = add:int(var_16_119:int, xor:int(ldc:int(1088), ldc:int(1089)))
                        looporswitchbreak()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(-553050091))
                }
                
                var_3_64E = and:int(var_3_64E:int, ldc:int(2111765254))
                
                if (cmple:boolean(var_5_81 = var_17_659:int, sub:int(var_6_88:int, and:int(ldc:int(1213), ldc:int(3))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(1340195266))
            goto(Label_0108)
        }
    }
}
