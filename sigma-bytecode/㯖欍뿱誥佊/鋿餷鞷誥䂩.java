public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u92ff\u9937\u97b7\u8aa5\u40a9 {
    public void \u92ff\u9937\u97b7\u8aa5\u40a9() {
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
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, ldc:float(0.0f), ldc:float(0.0f), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u3a62\u8d98\u1187\ub6ab\u156b::\u8d90\ub6ab\ub19c\u34df\ubefe))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, ldc:float(0.0f), ldc:float(0.0f), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\uc7fe\u624e\u8d90\ub8be\u960f)), ldc:float(0.1f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, ldc:float(0.0f), ldc:float(0.0f), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), ldc:float(0.95f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\ub102\u4ab3\uc246\u527a\u62da[expected:\u6fb0\u1187\u12b2\ua068\u5245\u67e9](\u3a62\uc910\u1187\u718f\u9255::\ub70c\u0800\u983f\u4492\u4c04), i2f:float(div:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), and:int(ldc:int(1298), ldc:int(4110)))), ldc:float(38.0f), loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(2382), ldc:int(16559))), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u760c\ucfaf\u7006\u7bad\ud158))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\ub102\u4ab3\uc246\u527a\u62da[expected:\u6fb0\u1187\u12b2\ua068\u5245\u67e9](\u3a62\uc910\u1187\u718f\u9255::\ub70c\u0800\u983f\u4492\u4c04), i2f:float(div:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), and:int(ldc:int(13382), ldc:int(546)))), ldc:float(58.0f), getfield:String(\u92ff\u9937\u97b7\u8aa5\u40a9::\ud12e\u6fb0\ub19c\u0c95\u7c6b, this:\u92ff\u9937\u97b7\u8aa5\u40a9), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u760c\ucfaf\u7006\u7bad\ud158), xor:int[expected:boolean](ldc:int(-16372), ldc:int(-16371)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
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
            invokespecial:void(\ua068\u7af6\u3e75\u3bc9\ua562::\ua068\u5140\u9a18\u8d98\ufe34\uc2e8, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:\ua068\u7af6\u3e75\u3bc9\ua562], p0:int)
            
            if (cmpeq:boolean(p0:int, and:int(ldc:int(4386), ldc:int(2944)))) {
                invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\u64ab\ubf56\u67e9\u8aa5\u1187\u4bc8, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u385b\ubefe\ucb79\uc87f\u8df4[expected:\ua068\u7af6\u3e75\u3bc9\ua562](\u385b\ubefe\ucb79\uc87f\u8df4::<init>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5bc4\u4f4a\uc3e3\u3dd3\uae5d\ubcb0$3(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            var_5_70 = loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(18624), ldc:int(18627)))
            
            try {
                var_5_70 = invokestatic:String(GLFW::glfwGetClipboardString, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            }
            catch (java.lang.Exception stack_8D_0) {
            }
            
            if (logicaland:boolean(cmpne:boolean(var_5_70:String, loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(18528), ldc:int(18531)))), invokevirtual:boolean(String::contains, var_5_70:String, loadelement:String[expected:CharSequence](getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(527), ldc:int(7311)))))) {
                var_6_C2 = invokevirtual:String[](String::split, var_5_70:String, loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(2821), ldc:int(2826))))
                
                if (cmpeq:boolean(arraylength:int(var_6_C2:String[]), and:int(ldc:int(362), ldc:int(8707)))) {
                    invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u7ce1\uc238\u56bd\ua068, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u92ff\u9937\u97b7\u8aa5\u40a9::\u6c56\uc9f6\u97b7\u600f\uc238, this:\u92ff\u9937\u97b7\u8aa5\u40a9), invokevirtual:String(String::replace, loadelement:String(var_6_C2:String[], and:int(ldc:int(-1566), ldc:int(1557))), loadelement:String[expected:CharSequence](getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(4440), ldc:int(1168))), loadelement:String[expected:CharSequence](getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(17412), ldc:int(17415)))))
                    invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u7ce1\uc238\u56bd\ua068, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u92ff\u9937\u97b7\u8aa5\u40a9::\u9033\u34df\ub70c\uf94d\ud158, this:\u92ff\u9937\u97b7\u8aa5\u40a9), invokevirtual:String(String::replace, loadelement:String(var_6_C2:String[], and:int(ldc:int(12289), ldc:int(521))), loadelement:String[expected:CharSequence](getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(-32256), ldc:int(-32240))), loadelement:String[expected:CharSequence](getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(19523), ldc:int(3)))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub8be\u494c\ucb79\u6c52\u6fb0\u839e$2(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
    
    private void lambda$\uf9c5\u7bad\ufcaf\u3e75\ub102\u61a4$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
    
    private void lambda$\u7006\ube23\ucef1\u61a4\u600f\u4bc8$0() {
        var_1_61 : int
        var_3_77 : \ud217\u624e\u34df\u0b8e\u416d
        stack_E6_0 : StringBuilder [generated]
        stack_E6_1 : String [generated]
        
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
            var_1_61 = and:int(ldc:int(1548191295), ldc:int(-4258817))
            var_3_77 = initobject:\ud217\u624e\u34df\u0b8e\u416d(\ud217\u624e\u34df\u0b8e\u416d::<init>, invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u92ff\u9937\u97b7\u8aa5\u40a9::\u6c56\uc9f6\u97b7\u600f\uc238, this:\u92ff\u9937\u97b7\u8aa5\u40a9)), invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, getfield:\u59ec\u4bc8\ud217\u516c\uceb8[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u92ff\u9937\u97b7\u8aa5\u40a9::\u9033\u34df\ub70c\uf94d\ud158, this:\u92ff\u9937\u97b7\u8aa5\u40a9)))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u3d64\u3a62\u624e\u8df4\ubb2b::\u494c\u4f52\u6c56\u4c04\u8c8a, getfield:\u3d64\u3a62\u624e\u8df4\ubb2b(\u92ff\u9937\u97b7\u8aa5\u40a9::\u8413\u759a\u3c25\ud7e8\ucef1, this:\u92ff\u9937\u97b7\u8aa5\u40a9), var_3_77:\ud217\u624e\u34df\u0b8e\u416d))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2131582907))
                putfield:String(\u92ff\u9937\u97b7\u8aa5\u40a9::\ud12e\u6fb0\ub19c\u0c95\u7c6b, this:\u92ff\u9937\u97b7\u8aa5\u40a9, loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(8269), ldc:int(8280))))
            }
            else {
                stack_E6_0 = invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(649), ldc:int(667)))), invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, var_3_77:\ud217\u624e\u34df\u0b8e\u416d))
                
                if (logicalnot:boolean(invokevirtual:boolean(\ud217\u624e\u34df\u0b8e\u416d::\u93a2\ud12e\u71ae\uafe7\uc84e, var_3_77:\ud217\u624e\u34df\u0b8e\u416d))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1582244851))
                    stack_E6_1 = loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(19043), ldc:int(7)))
                }
                else {
                    stack_E6_1 = loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(8211), ldc:int(1043)))
                }
                
                putfield:String(\u92ff\u9937\u97b7\u8aa5\u40a9::\ud12e\u6fb0\ub19c\u0c95\u7c6b, this:\u92ff\u9937\u97b7\u8aa5\u40a9, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_E6_0:StringBuilder, stack_E6_1:String), loadelement:String(getstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(6421), ldc:int(9302))))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_FB : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_3DB_0 : byte[] [generated]
        stack_424_0 : byte[] [generated]
        stack_49F_0 : byte[] [generated]
        stack_4F5_0 : byte[] [generated]
        var_4_3BC : int
        var_3_3C1 : byte[]
        var_5_3C2 : int
        var_0_41A : int
        expr_424 : byte [generated]
        stack_46D_2 : byte [generated]
        stack_44A_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C3 : byte[]
        expr_C7 : int [generated]
        var_3_48D : byte[]
        var_5_48E : int
        expr_100 : int [generated]
        var_3_4E3 : byte[]
        var_5_4E4 : int
        expr_4F5 : byte [generated]
        var_3_14B : String
        stack_3B5_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_FB = and:int(ldc:int(-167868816), ldc:int(-714542003))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_13F_0 = stack_3DB_0 = stack_424_0 = stack_49F_0 = stack_4F5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("v9LcmKvY39z27CXds972GR3b1K/WGgO31NvqEN++JQ2d0vXe9+ET7cTY/Ous3OngLd+iA9kg66/c1RYHyvDx9xngmSw05ru31Nvr/9+8zuYH6d8T4uPl8wPe7yQy6MHa7rbH9end5Njc68zc6dT3B/Tb69/f3M7mB+nf8+ID5fMD3ul8mWxRr73cJTLuVXI5QffK3Nvw7BzgmTIy7lVdOUb31NvrKt2f5/bq9jY9/A==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_3BC = expr_6E:int
        var_3_3C1 = newarray:byte[](byte.class, expr_6E:int)
        var_5_3C2 = expr_6E:int
        Label_0964:
        
        while (cmpne:boolean(and:int(var_0_FB:int, ldc:int(64)), ldc:int(0))) {
            var_0_FB = and:int(var_0_FB:int, ldc:int(-537457546))
            var_5_3C2 = add:int(var_5_3C2:int, ldc:int(-1))
            storeelement:byte(var_3_3C1:byte[], var_5_3C2:int, xor:byte(add:byte(loadelement:byte(stack_3DB_0:byte[], var_5_3C2:int), ldc:byte(24)), ldc:byte(10)))
            
            if (cmpne:boolean(var_5_3C2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_13F_0 = stack_3DB_0 = stack_424_0 = stack_49F_0 = stack_4F5_0 = var_3_3C1:byte[]
            goto(Label_0115)
        }
        
        Label_1037:
        
        while (cmpne:boolean(and:int(var_0_FB:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_41A = and:int(var_0_FB:int, ldc:int(-134972352))
            var_5_3C2 = add:int(var_5_3C2:int, ldc:int(-1))
            expr_424 = stack_46D_2 = loadelement(stack_424_0, var_5_3C2)
            
            if (cmplt:boolean(add:int(add:int(var_5_3C2:int, ldc:int(2)), neg:int(var_4_3BC:int)), ldc:int(0))) {
                stack_46D_2 = stack_44A_0 = add:byte(expr_424:byte, loadelement:byte(var_3_3C1:byte[], add:int(var_5_3C2:int, ldc:int(2))))
                goto(Label_1114)
            }
            
            Label_1073:
            
            if (cmpeq:boolean(and:int(var_0_41A:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_41A = and:int(var_0_41A:int, ldc:int(1042513634))
            }
            else {
                var_0_41A = and:int(var_0_41A:int, ldc:int(-538870826))
                stack_46D_2 = stack_44A_0 = add:byte(expr_424:byte, ldc:byte(2))
            }
            
            Label_1114:
            
            if (cmpne:boolean(and:int(var_0_41A:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_1073)
            }
            
            var_0_FB = and:int(var_0_41A:int, ldc:int(-973244418))
            storeelement:byte(var_3_3C1:byte[], var_5_3C2:int, stack_46D_2:byte)
            
            if (cmpne:boolean(var_5_3C2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_13F_0 = stack_3DB_0 = stack_424_0 = stack_49F_0 = stack_4F5_0 = var_3_3C1:byte[]
            goto(Label_0163)
        }
        
        goto(Label_0964)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_FB = and:int(var_0_FB:int, ldc:int(-1415395040))
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_FB:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_FB = and:int(var_0_FB:int, ldc:int(-814166940))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_3BC = expr_9E:int
                var_3_3C1 = newarray:byte[](byte.class, expr_9E:int)
                var_5_3C2 = expr_9E:int
                goto(Label_1037)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_FB:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_FB:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_FB = and:int(var_0_FB:int, ldc:int(-302242326))
            var_2_C3 = stack_C3_0:byte[]
            expr_C7 = add:int(arraylength:int(stack_C5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_3_48D = newarray:byte[](byte.class, expr_C7:int)
                var_5_48E = expr_C7:int
                
                loop {
                    var_0_FB = and:int(var_0_FB:int, ldc:int(-303706651))
                    var_5_48E = add:int(var_5_48E:int, ldc:int(-1))
                    storeelement:byte(var_3_48D:byte[], var_5_48E:int, add:int(shl:int(loadelement:byte(stack_49F_0:byte[], var_5_48E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C3:byte[], add:int(var_5_48E:int, xor:int(ldc:int(-15359), ldc:int(-15360)))), ldc:int(4)), and:int(ldc:int(8207), ldc:int(7695)))))
                    
                    if (cmpne:boolean(var_5_48E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_13F_0 = stack_3DB_0 = stack_424_0 = stack_49F_0 = stack_4F5_0 = var_3_48D:byte[]
            }
        }
        
        Label_0204:
        
        if (cmpne:boolean(and:int(var_0_FB:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_FB:int, ldc:int(8192)), ldc:int(0))) {
                var_0_FB = and:int(var_0_FB:int, ldc:int(925389736))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_FB = and:int(var_0_FB:int, ldc:int(-1344126541))
                goto(Label_0115)
            }
            
            var_0_FB = and:int(var_0_FB:int, ldc:int(-948868648))
            expr_100 = arraylength:int(stack_100_0:byte[])
            
            if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                var_3_4E3 = newarray:byte[](byte.class, expr_100:int)
                var_5_4E4 = expr_100:int
                
                loop {
                    var_0_FB = and:int(var_0_FB:int, ldc:int(-537281570))
                    var_5_4E4 = add:int(var_5_4E4:int, ldc:int(-1))
                    expr_4F5 = loadelement:byte(stack_4F5_0:byte[], var_5_4E4:int)
                    storeelement:byte(var_3_4E3:byte[], var_5_4E4:int, or:int(and:int(shl:int(expr_4F5:byte, and:int(ldc:int(17412), ldc:int(548))), ldc:int(-16)), and:int(shr:int(expr_4F5:byte[expected:int], xor:int(ldc:int(16518), ldc:int(16514))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_4E4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_13F_0 = stack_3DB_0 = stack_424_0 = stack_49F_0 = stack_4F5_0 = var_3_4E3:byte[]
            }
        }
        
        Label_0261:
        
        if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_FB = and:int(var_0_FB:int, ldc:int(1222816984))
            goto(Label_0204)
        }
        
        if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_FB = and:int(var_0_FB:int, ldc:int(973528769))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_FB:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_FB = and:int(var_0_FB:int, ldc:int(-1712960125))
            goto(Label_0115)
        }
        
        var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_3B5_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18527), ldc:int(13110)))
        expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18710), ldc:int(30)))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(-32186), ldc:int(-32187)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-8641), ldc:int(8640)), and:int(ldc:int(10709), ldc:int(-28126))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(8215), ldc:int(2072)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-27220), ldc:int(27203)), and:int(ldc:int(16397), ldc:int(2947))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(4123), ldc:int(26899)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(21667), ldc:int(2073)), and:int(ldc:int(4766), ldc:int(17))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(2132), ldc:int(918)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32187), ldc:int(-32171)), and:int(ldc:int(539), ldc:int(1333))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(9261), ldc:int(351)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(5135), ldc:int(5150)), and:int(ldc:int(16402), ldc:int(7990))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(31), ldc:int(13135)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(18995), ldc:int(8594)), and:int(ldc:int(2099), ldc:int(12503))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(-15870), ldc:int(-15860)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(8234), ldc:int(8249)), and:int(ldc:int(28), ldc:int(16604))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(-6643), ldc:int(6610)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(19932), ldc:int(541)), and:int(ldc:int(951), ldc:int(39))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(17154), ldc:int(17160)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32233), ldc:int(-32208)), and:int(ldc:int(8239), ldc:int(2171))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(4227), ldc:int(4239)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(12803), ldc:int(12840)), xor:int(ldc:int(-30045), ldc:int(-30056))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(16658), ldc:int(83)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(9071), ldc:int(9044)), xor:int(ldc:int(10260), ldc:int(10323))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(5124), ldc:int(5132)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16967), ldc:int(5247)), xor:int(ldc:int(9036), ldc:int(8960))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(24586), ldc:int(24588)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(2579), ldc:int(2655)), and:int(ldc:int(17757), ldc:int(14548))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(41), ldc:int(45)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(8208), ldc:int(8260)), and:int(ldc:int(117), ldc:int(16869))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(10284), ldc:int(10277)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32701), ldc:int(-32730)), xor:int(ldc:int(9335), ldc:int(9246))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(-28607), ldc:int(-28598)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(12395), ldc:int(1401)), xor:int(ldc:int(8314), ldc:int(8213))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(805), ldc:int(802)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(111), ldc:int(8431)), xor:int(ldc:int(20605), ldc:int(20489))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(4365), ldc:int(8199)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(3171), ldc:int(3095)), and:int(ldc:int(4222), ldc:int(19581))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(18953), ldc:int(18955)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(125), ldc:int(4222)), and:int(ldc:int(398), ldc:int(17572))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(1412), ldc:int(1413)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(1156), ldc:int(8645)), and:int(ldc:int(12431), ldc:int(2957))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(6931), ldc:int(1105)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(5773), ldc:int(16541)), and:int(ldc:int(8925), ldc:int(1436))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(1170), ldc:int(1159)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(924), ldc:int(2301)), and:int(ldc:int(2751), ldc:int(12715))))
        putstatic:String[](\u92ff\u9937\u97b7\u8aa5\u40a9::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_15D:String[])
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(-1887382323), ldc:int(-1986115314))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ff\u9937\u97b7\u8aa5\u40a9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-269660786))
            var_5_81 = and:int(ldc:int(3010), ldc:int(-3011))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15339), ldc:int(6922)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6BA:int, ldc:int(-1124547924))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(10264), ldc:int(10265)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(5280), ldc:int(5281)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_DA:int, ldc:int(-1446326913))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(576), ldc:int(577)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1271792406))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(773126379))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1675264146))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-987454751))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1490527474))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(704746898))
                    }
                    else {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1465879588))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-405547378))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1616519217))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-178331052))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1984360515))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1081350993))
                            var_11_EB = and:int(ldc:int(5301), ldc:int(-13560))
                            goto(Label_1598)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1531150890))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1803158300))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2123490862))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-25838372))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-304711379))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1911967398))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1708698384))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(477324127))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1855235123))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-796985962))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-63263221))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1362135727))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-575415540))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1122717774))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1647157436))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1572818999))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1580739154))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1448319835))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1994617141))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-86903122))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(19493), ldc:int(4425))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1359327178))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-598521349))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1975894377))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-73577745))
                        var_11_EB = and:int(ldc:int(26336), ldc:int(-28409))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-946848407))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(305122381))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1077777047))
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-984333771))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(244868435))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1613544066))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1606072183))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1079490029))
                            goto(Label_1173)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-212322090))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-394915174))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1783680775))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1708882755))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-913645761))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1598)
                    }
                    
                    Label_1461:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(474417999))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(354915787))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-368348033))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1778180110))
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-877730385))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1598:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1609:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1479154191))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-235695316))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1546198820))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(969042645))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1935780884))
                        var_17_6C5 = add:int(var_16_119:int, and:int(ldc:int(529), ldc:int(1253)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(-39360866))
                
                if (cmple:boolean(var_5_81 = var_17_6C5:int, sub:int(var_6_88:int, and:int(ldc:int(1027), ldc:int(2517))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1696225845))
            goto(Label_0108)
        }
    }
}
