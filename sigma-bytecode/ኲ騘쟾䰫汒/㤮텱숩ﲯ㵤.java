public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u392e\ud171\uc229\ufcaf\u3d64 {
    public void \u392e\ud171\uc229\ufcaf\u3d64(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.util.List<java.lang.String> p6, int p7) {
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
            invokespecial:\u3bd6\u156b\u8258\u0b8e\u4492(\u3bd6\u156b\u8258\u0b8e\u4492::<init>, this:\u392e\ud171\uc229\ufcaf\u3d64, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String, p2:int, p3:int, p4:int, p5:int, getstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\u392e\ud171\uc229\ufcaf\u3d64::\u5245\u5bc4\u6198\uf9c5\uff55), and:int[expected:boolean](ldc:int(2645), ldc:int(-24408)))
            putfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64, initobject:ArrayList<String>[expected:List<String>](ArrayList<E>::<init>))
            putfield:int(\u392e\ud171\uc229\ufcaf\u3d64::\u4c04\u416d\u8aa5\u52d3\u7af6, this:\u392e\ud171\uc229\ufcaf\u3d64, and:int(ldc:int(53), ldc:int(-54)))
            putfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64, p6:List<String>)
            putfield:int(\u392e\ud171\uc229\ufcaf\u3d64::\u4c04\u416d\u8aa5\u52d3\u7af6, this:\u392e\ud171\uc229\ufcaf\u3d64, p7:int)
            invokespecial:void(\u392e\ud171\uc229\ufcaf\u3d64::\u3d4b\u8d98\u760c\u36d3\u1833, this:\u392e\ud171\uc229\ufcaf\u3d64)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3d4b\u8d98\u760c\u36d3\u1833() {
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
    
    private int \u6b5f\ua562\ud158\u8d98\ub7dc() {
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
            return:int(mul:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), sub:int(invokeinterface:int(List<E>::size, getfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64)), xor:int(ldc:int(-28032), ldc:int(-28031)))))
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
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
            invokespecial:void(\uafe7\u72f1\u7e3f\uc238\u34df::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\uafe7\u72f1\u7e3f\uc238\u34df], p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
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
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), i2f:float(add:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokespecial:int(\u392e\ud171\uc229\ufcaf\u3d64::\u6b5f\ua562\ud158\u8d98\ub7dc, this:\u392e\ud171\uc229\ufcaf\u3d64))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), p0:float))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7330\uf995\u7af6\uc29a\u960f\u3bc9, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(sub:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokespecial:int(\u392e\ud171\uc229\ufcaf\u3d64::\u6b5f\ua562\ud158\u8d98\ub7dc, this:\u392e\ud171\uc229\ufcaf\u3d64)), xor:int(ldc:int(18497), ldc:int(18496)))), ldc:float(6.0f), mul:float(p0:float, ldc:float(0.1f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7330\uf995\u7af6\uc29a\u960f\u3bc9, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(sub:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokespecial:int(\u392e\ud171\uc229\ufcaf\u3d64::\u6b5f\ua562\ud158\u8d98\ub7dc, this:\u392e\ud171\uc229\ufcaf\u3d64)), xor:int(ldc:int(10258), ldc:int(10259)))), ldc:float(20.0f), mul:float(p0:float, ldc:float(0.2f)))
            invokestatic:void(GL11::glPushMatrix)
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            invokestatic:void(GL11::glPopMatrix)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.lang.String> \u3bc9\u72f1\u5db4\u0800\ub6ab() {
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
            return:List<String>(getfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u6fb0\ub102\u8413\u8350(java.lang.String p0, int p1) {
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
            invokeinterface:void(List<String>::add, invokevirtual:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\u3bc9\u72f1\u5db4\u0800\ub6ab, this:\u392e\ud171\uc229\ufcaf\u3d64), p1:int, p0:String)
            invokespecial:void(\u392e\ud171\uc229\ufcaf\u3d64::\u3d4b\u8d98\u760c\u36d3\u1833, this:\u392e\ud171\uc229\ufcaf\u3d64)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u6fb0\ub102\u8413\u8350(java.lang.String p0) {
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
            invokevirtual:void(\u392e\ud171\uc229\ufcaf\u3d64::\u6d99\u6fb0\ub102\u8413\u8350, this:\u392e\ud171\uc229\ufcaf\u3d64, p0:String, invokeinterface:int(List<E>::size, getfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8d98\u6c52\u8389\u99f7\u0800(java.lang.Class<E> p0) {
        var_2_61 : int
        var_4_72 : E[]
        var_5_77 : int
        var_6_80 : int
        var_7_9F : Enum<E>
        
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
            var_2_61 = and:int(ldc:int(1932458401), ldc:int(-437633105))
            invokeinterface:void(List<E>::clear, getfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64))
            var_4_72 = checkcast:E[](E[].class, invokevirtual:E[](Class<E>::getEnumConstants, p0:Class<E>))
            var_5_77 = arraylength:int(var_4_72:E[])
            var_6_80 = and:int(ldc:int(-11346), ldc:int(11344))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(967405055))
                
                if (cmpge:boolean(var_6_80:int, var_5_77:int)) {
                    looporswitchbreak()
                }
                
                var_7_9F = loadelement:E extends Enum<E>[expected:Enum<E>](var_4_72:E[], var_6_80:int)
                invokevirtual:void(\u392e\ud171\uc229\ufcaf\u3d64::\u6d99\u6fb0\ub102\u8413\u8350, this:\u392e\ud171\uc229\ufcaf\u3d64, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>, invokevirtual:String(String::toUpperCase, invokevirtual:String(String::substring, invokevirtual:String(Enum<E>::toString, var_7_9F:Enum<E>), and:int(ldc:int(-26501), ldc:int(18308)), xor:int(ldc:int(4289), ldc:int(4288))))), invokevirtual:String(String::toLowerCase, invokevirtual:String(String::substring, invokevirtual:String(Enum<E>::toString, var_7_9F:Enum<E>), and:int(ldc:int(8199), ldc:int(18689)), invokevirtual:int(String::length, invokevirtual:String(Enum<E>::toString, var_7_9F:Enum<E>)))))), invokevirtual:int(Enum::ordinal, var_7_9F:Enum<E>))
                inc:int(var_6_80, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7ce1\u8258\u4cd9\u120d\u6d69() {
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
            return:int(getfield:int(\u392e\ud171\uc229\ufcaf\u3d64::\u4c04\u416d\u8aa5\u52d3\u7af6, this:\u392e\ud171\uc229\ufcaf\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public void \u8413\u8df4\u3776\u8d98\ucb79(int p0) {
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
            putfield:int(\u392e\ud171\uc229\ufcaf\u3d64::\u4c04\u416d\u8aa5\u52d3\u7af6, this:\u392e\ud171\uc229\ufcaf\u3d64, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3bc9\u8753\ua068\u0800\u93a2() {
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
            return:String(ternaryop:String(cmple:boolean(invokeinterface:int(List<E>::size, invokevirtual:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\u3bc9\u72f1\u5db4\u0800\ub6ab, this:\u392e\ud171\uc229\ufcaf\u3d64)), ldc:int(0)), aconstnull:String(), checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, invokevirtual:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\u3bc9\u72f1\u5db4\u0800\ub6ab, this:\u392e\ud171\uc229\ufcaf\u3d64), invokevirtual:int(\u392e\ud171\uc229\ufcaf\u3d64::\u7ce1\u8258\u4cd9\u120d\u6d69, this:\u392e\ud171\uc229\ufcaf\u3d64)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8413\uc229\u6fb0\uc7fe\u5f50(int p0, int p1) {
        var_3_61 : int
        stack_C5_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(993706710), ldc:int(2000517119))
            p0 = sub:int(p0:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u600f\u8bb0\u392e\ud36e, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            p1 = sub:int(p1:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u4f52\u446c\u8308\u0c95, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            
            if (cmpge:boolean(p0:int, ldc:int(-10))) {
                if (cmple:boolean(p0:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))) {
                    if (cmpge:boolean(p1:int, ldc:int(0))) {
                        if (cmple:boolean(p1:int, add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokespecial:int(\u392e\ud171\uc229\ufcaf\u3d64::\u6b5f\ua562\ud158\u8d98\ub7dc, this:\u392e\ud171\uc229\ufcaf\u3d64)))) {
                            stack_C5_0 = and:int[expected:boolean](ldc:int(20745), ldc:int(8387))
                            return:boolean(stack_C5_0:boolean)
                        }
                    }
                }
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(2008786174))
            stack_C5_0 = and:int[expected:boolean](ldc:int(1549), ldc:int(-9888))
            return:boolean(stack_C5_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6bb9\u36d3\u965f\u5f50\ub32d$0(java.lang.String p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p1, int p2) {
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
            invokevirtual:void(\u392e\ud171\uc229\ufcaf\u3d64::\u8413\u8df4\u3776\u8d98\ucb79, this:\u392e\ud171\uc229\ufcaf\u3d64, invokeinterface:int(List<E>::indexOf, getfield:List<String>(\u392e\ud171\uc229\ufcaf\u3d64::\uc246\u6fb0\u9af2\u88c5\u3e75, this:\u392e\ud171\uc229\ufcaf\u3d64), p0:String[expected:Object]))
            invokevirtual:void(\u3bd6\u156b\u8258\u0b8e\u4492::\ub83f\u67d0\u3e75\ua61f\u34df, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:\u3bd6\u156b\u8258\u0b8e\u4492])
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
            putstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\u392e\ud171\uc229\ufcaf\u3d64::\u5245\u5bc4\u6198\uf9c5\uff55, invokevirtual:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::\u2dcc\u3e2a\u7049\u3bc9\u1187\u836c, invokevirtual:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, initobject:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::<init>, ldc:int(1250067), ldc:int(-15329770)), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6))), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(-169855581), ldc:int(-1245105057))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\ud171\uc229\ufcaf\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-102490475))
            var_5_81 = and:int(ldc:int(-30196), ldc:int(28979))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17667), ldc:int(-18404)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B1:int, ldc:int(-557431))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(8896), ldc:int(8897)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(9221), ldc:int(2713)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_DA:int, ldc:int(-135965147))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1), ldc:int(523)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1955553061))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1754120026))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2039007309))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1365336552))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2131800191))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-808391840))
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(799057171))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-102558565))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0631)
                            }
                            
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-972507275))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1438428738))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1168429957))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-996221434))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(154487084))
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(277211624))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1083100918))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-136897517))
                        var_11_EB = and:int(ldc:int(-2531), ldc:int(2402))
                        goto(Label_1571)
                    }
                    
                    Label_0631:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(342981937))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(315471032))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(601175066))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(529112835))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1193001404))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-745052585))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-203260033))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0774:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1945541454))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1344315153))
                            goto(Label_0631)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2023237838))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1075546691))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1461411841))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-389068527))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0774)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-882111370))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-70058753))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(294), ldc:int(295))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1013:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-645175459))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1638711891))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0774)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(778642196))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-203508735))
                        var_11_EB = and:int(ldc:int(13020), ldc:int(-13021))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1520825301))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1802171330))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-615089263))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1564249007))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1602790450))
                            goto(Label_0774)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(841198752))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1277077849))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1872122785))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(16098016))
                            goto(Label_1013)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2017692027))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-460367525))
                            goto(Label_0774)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2097467639))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-202195311))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1452:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-822192870))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1836468139))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1275275613))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(48016937))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1763354422))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1218019815))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(750093394))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1423631749))
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0631)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-443254051))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-238805647))
                        var_17_6BC = add:int(var_16_119:int, and:int(ldc:int(5249), ldc:int(769)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-171846353))
                
                if (cmple:boolean(var_5_81 = var_17_6BC:int, sub:int(var_6_88:int, xor:int(ldc:int(25616), ldc:int(25617))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-662009066))
            goto(Label_0108)
        }
    }
}
