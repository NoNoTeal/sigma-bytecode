public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\uff55\ufe34\u8bb0\u6c52\uc31c {
    public void \uff55\ufe34\u8bb0\u6c52\uc31c(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, float p7, float p8, float p9, float p10) {
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
    
    public float[] \u64f2\ua562\u4ab3\ucb79\uff55() {
        var_3_64 : int
        var_4_74 : float
        var_5_83 : float
        var_6_94 : float
        var_7_A3 : float
        var_8_B4 : float
        expr_BD : float[] [generated]
        
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
            var_3_64 = getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c)
            var_4_74 = i2f:float(sub:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u8350\u1187\u6c56\ub32d\u927d, this:\uff55\ufe34\u8bb0\u6c52\uc31c), mul:int(var_3_64:int, xor:int(ldc:int(2561), ldc:int(2563)))))
            var_5_83 = div:float(i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u4d85\u3d4b\u51fa\u516c\u385b, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_3_64:int)), var_4_74:float)
            var_6_94 = sub:float(ldc:float(1.0f), div:float(i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u4d85\u3d4b\u51fa\u516c\u385b, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_3_64:int)), var_4_74:float))
            var_7_A3 = div:float(i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u0a06\ub32d\uc84e\u6b5f\uc2e8, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_3_64:int)), var_4_74:float)
            var_8_B4 = sub:float(ldc:float(1.0f), div:float(i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u0a06\ub32d\uc84e\u6b5f\uc2e8, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_3_64:int)), var_4_74:float))
            expr_BD = newarray:float[](float.class, and:int(ldc:int(12164), ldc:int(5)))
            storeelement:float(expr_BD:float[], and:int(ldc:int(11353), ldc:int(-11354)), var_5_83:float)
            storeelement:float(expr_BD:float[], xor:int(ldc:int(3089), ldc:int(3088)), var_6_94:float)
            storeelement:float(expr_BD:float[], and:int(ldc:int(5143), ldc:int(16458)), var_7_A3:float)
            storeelement:float(expr_BD:float[], and:int(ldc:int(6259), ldc:int(24587)), var_8_B4:float)
            return:float[](expr_BD:float[])
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u446c\u7330\u7873\u6bb9(float p0, float p1, float p2, float p3) {
        var_7_75 : float
        
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
            var_7_75 = i2f:float(sub:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u8350\u1187\u6c56\ub32d\u927d, this:\uff55\ufe34\u8bb0\u6c52\uc31c), mul:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c), and:int(ldc:int(6154), ldc:int(34)))))
            invokevirtual:void(\uc246\ucfaf\u7bad\u8cae\u8d98::\ua3b4\u88c5\u3776\u3e2a\u120d, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98(\uff55\ufe34\u8bb0\u6c52\uc31c::\u4d85\u3d4b\u51fa\u516c\u385b, this:\uff55\ufe34\u8bb0\u6c52\uc31c), add:float(i2f:float(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), mul:float(var_7_75:float, p0:float)), add:float(i2f:float(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), mul:float(var_7_75:float, sub:float(ldc:float(1.0f), p1:float))))
            invokevirtual:void(\uc246\ucfaf\u7bad\u8cae\u8d98::\ua3b4\u88c5\u3776\u3e2a\u120d, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98(\uff55\ufe34\u8bb0\u6c52\uc31c::\u0a06\ub32d\uc84e\u6b5f\uc2e8, this:\uff55\ufe34\u8bb0\u6c52\uc31c), add:float(i2f:float(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), mul:float(var_7_75:float, p2:float)), add:float(i2f:float(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), mul:float(var_7_75:float, sub:float(ldc:float(1.0f), p3:float))))
            return:void()
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
            invokespecial:void(\uafe7\u72f1\u7e3f\uc238\u34df::\uafe7\u47c2\ufcaf\u9255\u960f, this:\uff55\ufe34\u8bb0\u6c52\uc31c[expected:\uafe7\u72f1\u7e3f\uc238\u34df], p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_4_7F : float[]
        var_5_85 : int
        var_6_97 : float
        var_7_A3 : float
        var_8_AF : float
        var_9_BB : float
        var_10_C7 : float
        var_11_112 : ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>
        var_12_16E : \ud12e\u3dd3\u5245\ud217\u7c6b
        var_15_1C4 : List<\u760c\uff55\ucfaf\u4bc8\uf94d>
        var_16_22D : Iterator<\u760c\uff55\ucfaf\u4bc8\uf94d>
        var_17_316 : \u760c\uff55\ucfaf\u4bc8\uf94d
        
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
            invokevirtual:void(\u8d98\ua068\u4492\u9af2\u5f50::\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3d64\ua3b4\ufcaf\u97b7\u7ce1, this:\uff55\ufe34\u8bb0\u6c52\uc31c), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\uf9c5\u5140\ud158\u4492\u3dd3))
            
            if (cmpeq:boolean(invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3d64\ua3b4\ufcaf\u97b7\u7ce1, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), ldc:float(1.0f))) {
                putfield:\u8d98\ua068\u4492\u9af2\u5f50(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3d64\ua3b4\ufcaf\u97b7\u7ce1, this:\uff55\ufe34\u8bb0\u6c52\uc31c, initobject:\u8d98\ua068\u4492\u9af2\u5f50(\u8d98\ua068\u4492\u9af2\u5f50::<init>, xor:int(ldc:int(17498), ldc:int(16774)), and:int(ldc:int(-1917), ldc:int(1900))))
            }
            
            var_4_7F = invokevirtual:float[](\uff55\ufe34\u8bb0\u6c52\uc31c::\u64f2\ua562\u4ab3\ucb79\uff55, this:\uff55\ufe34\u8bb0\u6c52\uc31c)
            var_5_85 = getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3504\u385b\uafe7\ub83f\u6d69, this:\uff55\ufe34\u8bb0\u6c52\uc31c)
            var_6_97 = i2f:float(sub:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u8350\u1187\u6c56\ub32d\u927d, this:\uff55\ufe34\u8bb0\u6c52\uc31c), mul:int(var_5_85:int, and:int(ldc:int(20754), ldc:int(66)))))
            var_7_A3 = loadelement:float(var_4_7F:float[], and:int(ldc:int(4712), ldc:int(-5865)))
            var_8_AF = loadelement:float(var_4_7F:float[], and:int(ldc:int(17231), ldc:int(2049)))
            var_9_BB = loadelement:float(var_4_7F:float[], and:int(ldc:int(2626), ldc:int(386)))
            var_10_C7 = loadelement:float(var_4_7F:float[], and:int(ldc:int(19715), ldc:int(11)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u97e6\u98a4\ubded\u527a\u836c\u4975, i2f:float(add:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\uff55\ufe34\u8bb0\u6c52\uc31c), var_5_85:int)), i2f:float(add:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u6c56\u4f52\ubb2b\u8308\u9937, this:\uff55\ufe34\u8bb0\u6c52\uc31c), var_5_85:int)), i2f:float(sub:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u8350\u1187\u6c56\ub32d\u927d, this:\uff55\ufe34\u8bb0\u6c52\uc31c), mul:int(var_5_85:int, and:int(ldc:int(518), ldc:int(2155))))), i2f:float(sub:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\ub8be\u7873\u36d3\ub102\u8258, this:\uff55\ufe34\u8bb0\u6c52\uc31c), mul:int(var_5_85:int, and:int(ldc:int(134), ldc:int(2562))))), ldc:float(3.0f), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.05f), p0:float)))
            var_11_112 = initobject:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>(ArrayList<E>::<init>)
            invokeinterface:boolean(List<\u760c\uff55\ucfaf\u4bc8\uf94d>::add, var_11_112:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>[expected:List<\u760c\uff55\ucfaf\u4bc8\uf94d>], initobject:\u760c\uff55\ucfaf\u4bc8\uf94d(\u760c\uff55\ucfaf\u4bc8\uf94d::<init>, ldc:double(0.0), ldc:double(0.0)))
            invokeinterface:boolean(List<\u760c\uff55\ucfaf\u4bc8\uf94d>::add, var_11_112:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>[expected:List<\u760c\uff55\ucfaf\u4bc8\uf94d>], initobject:\u760c\uff55\ucfaf\u4bc8\uf94d(\u760c\uff55\ucfaf\u4bc8\uf94d::<init>, f2d:double(var_7_A3:float), f2d:double(var_8_AF:float)))
            invokeinterface:boolean(List<\u760c\uff55\ucfaf\u4bc8\uf94d>::add, var_11_112:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>[expected:List<\u760c\uff55\ucfaf\u4bc8\uf94d>], initobject:\u760c\uff55\ucfaf\u4bc8\uf94d(\u760c\uff55\ucfaf\u4bc8\uf94d::<init>, f2d:double(var_9_BB:float), f2d:double(var_10_C7:float)))
            invokeinterface:boolean(List<\u760c\uff55\ucfaf\u4bc8\uf94d>::add, var_11_112:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>[expected:List<\u760c\uff55\ucfaf\u4bc8\uf94d>], initobject:\u760c\uff55\ucfaf\u4bc8\uf94d(\u760c\uff55\ucfaf\u4bc8\uf94d::<init>, ldc:double(1.0), ldc:double(1.0)))
            var_12_16E = initobject:\ud12e\u3dd3\u5245\ud217\u7c6b(\ud12e\u3dd3\u5245\ud217\u7c6b::<init>, f2d:double(mul:float(div:float(ldc:float(1.0f), var_6_97:float), ldc:float(2.0f))))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u3776\uc229\u8308\u5db4\ub7dc\u7049, d2f:float(add:double(add:double(i2d:double(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), mul:double(f2d:double(var_6_97:float), invokevirtual:double(\ud12e\u3dd3\u5245\ud217\u7c6b::\u7d52\u3776\u7ce1\u97e6\ud158\u6d99, var_12_16E:\ud12e\u3dd3\u5245\ud217\u7c6b, var_11_112:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>[expected:List<\u760c\uff55\ucfaf\u4bc8\uf94d>], mul:float(invokestatic:float(Math::min, ldc:float(0.8f), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\uff55\ufe34\u8bb0\u6c52\uc31c::\u3d64\ua3b4\ufcaf\u97b7\u7ce1, this:\uff55\ufe34\u8bb0\u6c52\uc31c))), ldc:float(1.25f))))), i2d:double(var_5_85:int))), i2f:float(add:int(sub:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u6c56\u4f52\ubb2b\u8308\u9937, this:\uff55\ufe34\u8bb0\u6c52\uc31c), div:int(var_5_85:int, xor:int(ldc:int(1602), ldc:int(1600)))), getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\ub8be\u7873\u36d3\ub102\u8258, this:\uff55\ufe34\u8bb0\u6c52\uc31c))), ldc:float(14.0f), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u67e9\u624e\u7043\u4c2b\ubf56)), p0:float))
            var_15_1C4 = invokevirtual:List<\u760c\uff55\ucfaf\u4bc8\uf94d>(\ud12e\u3dd3\u5245\ud217\u7c6b::\ufe34\uc7fe\u760c\u9937\uc4d2\u47c2, var_12_16E:\ud12e\u3dd3\u5245\ud217\u7c6b, var_11_112:ArrayList<\u760c\uff55\ucfaf\u4bc8\uf94d>[expected:List<\u760c\uff55\ucfaf\u4bc8\uf94d>])
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslatef, i2f:float(add:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\uff55\ufe34\u8bb0\u6c52\uc31c), var_5_85:int)), i2f:float(add:int(getfield:int(\uff55\ufe34\u8bb0\u6c52\uc31c::\u6c56\u4f52\ubb2b\u8308\u9937, this:\uff55\ufe34\u8bb0\u6c52\uc31c), var_5_85:int)), ldc:float(0.0f))
            invokestatic:void(GL11::glLineWidth, ldc:float(1.0f))
            invokestatic:void(GL11::glColor4d, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0), f2d:double(mul:float(ldc:float(0.6f), p0:float)))
            invokestatic:void(GL11::glAlphaFunc, xor:int(ldc:int(1507), ldc:int(2020)), ldc:float(0.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ube23\u624e\u2dcc\u3a62\uf9c5\u8389, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9), getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\u5f50\u8cae\u0c95\u6cfe\u92ee\u3e2a), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\uc246\ub6ab\u12b2\u7ce1\u71ae\u8258))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(28451), ldc:int(3056)))
            invokestatic:void(GL11::glBegin, and:int(ldc:int(26667), ldc:int(1495)))
            invokestatic:void(GL11::glVertex2f, ldc:float(0.0f), var_6_97:float)
            var_16_22D = invokeinterface:Iterator<\u760c\uff55\ucfaf\u4bc8\uf94d>(List<\u760c\uff55\ucfaf\u4bc8\uf94d>::iterator, var_15_1C4:List<\u760c\uff55\ucfaf\u4bc8\uf94d>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_16_22D:Iterator<\u760c\uff55\ucfaf\u4bc8\uf94d>)) {
                var_17_316 = checkcast:\u760c\uff55\ucfaf\u4bc8\uf94d(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\uff55\ucfaf\u4bc8\uf94d.class, invokeinterface:\u760c\uff55\ucfaf\u4bc8\uf94d(Iterator<\u760c\uff55\ucfaf\u4bc8\uf94d>::next, var_16_22D:Iterator<\u760c\uff55\ucfaf\u4bc8\uf94d>))
                invokestatic:void(GL11::glVertex2d, mul:double(invokevirtual:double(\u760c\uff55\ucfaf\u4bc8\uf94d::\u0c95\u34df\u5db4\uc84e\uf9c5\u36d3, var_17_316:\u760c\uff55\ucfaf\u4bc8\uf94d), f2d:double(var_6_97:float)), mul:double(sub:double(ldc:double(1.0), invokevirtual:double(\u760c\uff55\ucfaf\u4bc8\uf94d::\u6c52\u9a18\u3504\u718f\u64f2\u6ec6, var_17_316:\u760c\uff55\ucfaf\u4bc8\uf94d)), f2d:double(var_6_97:float)))
            }
            
            invokestatic:void(GL11::glVertex2f, var_6_97:float, ldc:float(0.0f))
            invokestatic:void(GL11::glEnd)
            invokestatic:void(GL11::glLineWidth, ldc:float(3.0f))
            invokestatic:void(GL11::glColor4d, ldc:double(0.0), ldc:double(0.20000000298023224), ldc:double(0.4000000059604645), ldc:double(0.20000000298023224))
            invokestatic:void(GL11::glBegin, and:int(ldc:int(643), ldc:int(9287)))
            invokestatic:void(GL11::glVertex2f, ldc:float(0.0f), var_6_97:float)
            invokestatic:void(GL11::glVertex2f, i2f:float(add:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u4d85\u3d4b\u51fa\u516c\u385b, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_5_85:int), and:int(ldc:int(6405), ldc:int(24615)))), i2f:float(add:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u4d85\u3d4b\u51fa\u516c\u385b, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_5_85:int), and:int(ldc:int(8197), ldc:int(45)))))
            invokestatic:void(GL11::glEnd)
            invokestatic:void(GL11::glBegin, xor:int(ldc:int(1051), ldc:int(1048)))
            invokestatic:void(GL11::glVertex2f, var_6_97:float, ldc:float(0.0f))
            invokestatic:void(GL11::glVertex2f, i2f:float(add:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u0a06\ub32d\uc84e\u6b5f\uc2e8, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_5_85:int), and:int(ldc:int(133), ldc:int(21525)))), i2f:float(add:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, getfield:\uc246\ucfaf\u7bad\u8cae\u8d98[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\uff55\ufe34\u8bb0\u6c52\uc31c::\u0a06\ub32d\uc84e\u6b5f\uc2e8, this:\uff55\ufe34\u8bb0\u6c52\uc31c)), var_5_85:int), and:int(ldc:int(1029), ldc:int(16493)))))
            invokestatic:void(GL11::glEnd)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
            invokestatic:void(GL11::glPopMatrix)
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\uff55\ufe34\u8bb0\u6c52\uc31c[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc238\u76bc\ubcb0\ud217\u7043$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            invokevirtual:void(\u3bd6\u156b\u8258\u0b8e\u4492::\ub83f\u67d0\u3e75\ua61f\u34df, this:\uff55\ufe34\u8bb0\u6c52\uc31c[expected:\u3bd6\u156b\u8258\u0b8e\u4492])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1BE : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_1D1_0 : byte[] [generated]
        stack_24E_0 : byte[] [generated]
        stack_289_0 : byte[] [generated]
        stack_2DF_0 : byte[] [generated]
        var_4_1A9 : int
        var_3_1AE : byte[]
        var_5_1AF : int
        var_0_1C7 : int
        expr_1D1 : byte [generated]
        stack_211_2 : byte [generated]
        stack_1EE_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_277 : byte[]
        var_5_278 : int
        expr_109 : int [generated]
        var_3_2CD : byte[]
        var_5_2CE : int
        expr_2DF : byte [generated]
        var_3_154 : String
        stack_1A2_0 : String[] [generated]
        expr_166 : String[] [generated]
        
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
        var_0_1BE = and:int(ldc:int(1923346607), ldc:int(-1398282499))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_148_0 = stack_1D1_0 = stack_24E_0 = stack_289_0 = stack_2DF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("RtgekA2Hr5H7")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A9 = expr_6E:int
        var_3_1AE = newarray:byte[](byte.class, expr_6E:int)
        var_5_1AF = expr_6E:int
        Label_0433:
        
        while (cmpeq:boolean(and:int(var_0_1BE:int, ldc:int(64)), ldc:int(0))) {
            var_0_1C7 = and:int(var_0_1BE:int, ldc:int(1016063420))
            var_5_1AF = add:int(var_5_1AF:int, ldc:int(-1))
            expr_1D1 = stack_211_2 = loadelement(stack_1D1_0, var_5_1AF)
            
            if (cmplt:boolean(add:int(add:int(var_5_1AF:int, ldc:int(5)), neg:int(var_4_1A9:int)), ldc:int(0))) {
                stack_211_2 = stack_1EE_0 = add:byte(expr_1D1:byte, loadelement:byte(var_3_1AE:byte[], add:int(var_5_1AF:int, ldc:int(5))))
                goto(Label_0510)
            }
            
            Label_0478:
            
            if (cmpne:boolean(and:int(var_0_1C7:int, ldc:int(131072)), ldc:int(0))) {
                var_0_1C7 = and:int(var_0_1C7:int, ldc:int(949988943))
                stack_211_2 = stack_1EE_0 = add:byte(expr_1D1:byte, ldc:byte(5))
            }
            
            Label_0510:
            
            if (cmpeq:boolean(and:int(var_0_1C7:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0478)
            }
            
            var_0_1BE = and:int(var_0_1C7:int, ldc:int(1654634269))
            storeelement:byte(var_3_1AE:byte[], var_5_1AF:int, stack_211_2:byte)
            
            if (cmpne:boolean(var_5_1AF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_148_0 = stack_1D1_0 = stack_24E_0 = stack_289_0 = stack_2DF_0 = var_3_1AE:byte[]
            goto(Label_0115)
        }
        
        var_0_1BE = and:int(var_0_1BE:int, ldc:int(-367845414))
        Label_0567:
        
        while (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(-1396464338))
            var_5_1AF = add:int(var_5_1AF:int, ldc:int(-1))
            storeelement:byte(var_3_1AE:byte[], var_5_1AF:int, add:byte(loadelement:byte(stack_24E_0:byte[], var_5_1AF:int), ldc:byte(64)))
            
            if (cmpne:boolean(var_5_1AF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_148_0 = stack_1D1_0 = stack_24E_0 = stack_289_0 = stack_2DF_0 = var_3_1AE:byte[]
            goto(Label_0172)
        }
        
        goto(Label_0433)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(256)), ldc:int(0))) {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(-6475346))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(64)), ldc:int(0))) {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(923370509))
        }
        else {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(-1531449700))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1A9 = expr_A7:int
                var_3_1AE = newarray:byte[](byte.class, expr_A7:int)
                var_5_1AF = expr_A7:int
                goto(Label_0567)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1BE = and:int(var_0_1BE:int, ldc:int(977853932))
                goto(Label_0115)
            }
            
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(597146287))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_277 = newarray:byte[](byte.class, expr_D9:int)
                var_5_278 = expr_D9:int
                
                loop {
                    var_0_1BE = and:int(var_0_1BE:int, ldc:int(985904700))
                    var_5_278 = add:int(var_5_278:int, ldc:int(-1))
                    storeelement:byte(var_3_277:byte[], var_5_278:int, add:int(shl:int(loadelement:byte(stack_289_0:byte[], var_5_278:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_278:int, xor:int(ldc:int(4166), ldc:int(4167)))), ldc:int(5)), xor:int(ldc:int(-32383), ldc:int(-32378)))))
                    
                    if (cmpne:boolean(var_5_278:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_148_0 = stack_1D1_0 = stack_24E_0 = stack_289_0 = stack_2DF_0 = var_3_277:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_1BE:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1BE:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1BE = and:int(var_0_1BE:int, ldc:int(-1602570627))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(-20729940))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_2CD = newarray:byte[](byte.class, expr_109:int)
                var_5_2CE = expr_109:int
                
                loop {
                    var_0_1BE = and:int(var_0_1BE:int, ldc:int(567013757))
                    var_5_2CE = add:int(var_5_2CE:int, ldc:int(-1))
                    expr_2DF = loadelement:byte(stack_2DF_0:byte[], var_5_2CE:int)
                    storeelement:byte(var_3_2CD:byte[], var_5_2CE:int, xor:int(or:int(and:int(shl:int(expr_2DF:byte, and:int(ldc:int(788), ldc:int(9348))), ldc:int(-16)), and:int(shr:int(expr_2DF:byte[expected:int], xor:int(ldc:int(4106), ldc:int(4110))), ldc:int(15))), ldc:int(25)))
                    
                    if (cmpne:boolean(var_5_2CE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_148_0 = stack_1D1_0 = stack_24E_0 = stack_289_0 = stack_2DF_0 = var_3_2CD:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(64)), ldc:int(0))) {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(1830929536))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(1726454317))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_1BE:int, ldc:int(64)), ldc:int(0))) {
            var_0_1BE = and:int(var_0_1BE:int, ldc:int(-878533496))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1A2_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6466), ldc:int(42)))
        expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5266), ldc:int(774)))
        storeelement:String(expr_166:String[], and:int(ldc:int(-30890), ldc:int(30889)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(31042), ldc:int(-32196)), and:int(ldc:int(1156), ldc:int(16710))))
        storeelement:String(expr_166:String[], and:int(ldc:int(8229), ldc:int(1369)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(770), ldc:int(774)), xor:int(ldc:int(-31484), ldc:int(-31476))))
        putstatic:String[](\uff55\ufe34\u8bb0\u6c52\uc31c::\u8df4\ubefe\ubcb0\uc2bd\ua3b4, expr_166:String[])
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A8 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6B3 : int
        
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
        var_3_6A8 = and:int(ldc:int(-801431867), ldc:int(-1804079259))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\ufe34\u8bb0\u6c52\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(161539654))
        }
        else {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-42817603))
            var_5_8A = and:int(ldc:int(-21985), ldc:int(21920))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(23074), ldc:int(-23079)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6A8:int, ldc:int(-1166879035))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(265), ldc:int(11335)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8843), ldc:int(21537)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6A8 = and:int(var_3_DA:int, ldc:int(-697254035))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8578), ldc:int(8579)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1378201180))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-637730000))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1900346220))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(731826948))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1495379801))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1139785022))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1284379107))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(602915270))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(62889659))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-295318593))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1694217805))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-470419571))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1225520932))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-751569355))
                        var_11_EB = and:int(ldc:int(4712), ldc:int(-4729))
                        goto(Label_1571)
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(250230992))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1118755159))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1374075015))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1057249488))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1191636784))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1648709993))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1443676108))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1091309923))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-633708929))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1925319339))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-729800940))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1240570295))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(161278189))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-251754939))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(16513), ldc:int(11281))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(571549725))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-583569497))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1372558573))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1257123097))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(41546318))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-874313739))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1673855417))
                        var_11_EB = and:int(ldc:int(-5897), ldc:int(5896))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(967022791))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1099568514))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-2023835674))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-230773217))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-554643444))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1340113231))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1500316553))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1759007096))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1258729963))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(263636162))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(906022357))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1685574445))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(749742170))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1638227930))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-297182752))
                        loopcontinue()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1204127977))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B3 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1904772651))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1436005320))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-589246290))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(667800618))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1283463291))
                        var_17_6B3 = add:int(var_16_119:int, and:int(ldc:int(16673), ldc:int(17)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1894663334))
                }
                
                var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-781074867))
                
                if (cmple:boolean(var_5_8A = var_17_6B3:int, sub:int(var_6_91:int, xor:int(ldc:int(9480), ldc:int(9481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
