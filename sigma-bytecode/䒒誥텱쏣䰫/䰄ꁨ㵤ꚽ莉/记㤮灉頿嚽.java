public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8bb0\u392e\u7049\u983f\u56bd {
    public void \u8bb0\u392e\u7049\u983f\u56bd() {
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
    
    public void \u4daf\u69d9\ucb79\u8cae\u7049(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub83f\u36d3\u62da\u3a62\u8d90 p0) {
        var_4_77 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_5_D7 : double
        var_7_E8 : float
        var_8_F9 : String
        var_9_FC : int
        var_10_1CC : float
        var_11_1E0 : double
        var_13_1F4 : double
        var_10_22F : float
        var_11_243 : double
        var_13_257 : double
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:\ud158\u839e\u7006\uc3e3\u446c]))) {
            return:void()
        }
        
        var_4_77 = aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()
        
        if (logicalor:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u4f52\u873d\u5bc4\u647c\u4c2b, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\u8389\u9255\ubff1\ud12e\uc910>(\u59ec\u8413\u97e6\uc229\u3776.\u8389\u9255\ubff1\ud12e\uc910.class))), logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), xor:int(ldc:int(303), ldc:int(295))))))) {
            if (cmpne:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())) {
                var_4_77 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776))
            }
            else {
                if (cmpne:boolean(getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                    var_4_77 = getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8)
                }
            }
        }
        
        if (cmpne:boolean(var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
            var_5_D7 = invokestatic:double(Math::sqrt, add:double(mul:double(invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p0:\ub83f\u36d3\u62da\u3a62\u8d90), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p0:\ub83f\u36d3\u62da\u3a62\u8d90)), mul:double(invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p0:\ub83f\u36d3\u62da\u3a62\u8d90), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p0:\ub83f\u36d3\u62da\u3a62\u8d90))))
            var_7_E8 = invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), and:int(ldc:int(134), ldc:int(4182))))
            var_8_F9 = invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), and:int(ldc:int(66), ldc:int(2102))))
            var_9_FC = ldc:int(-1)
            
            switch (invokevirtual:int(String::hashCode, var_8_F9:String)) {
                case 63955982:
                    if (invokevirtual:boolean(String::equals, var_8_F9:String, loadelement:String[expected:Object](getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), xor:int(ldc:int(-24502), ldc:int(-24503))))) {
                        var_9_FC = and:int(ldc:int(-17471), ldc:int(1086))
                        looporswitchbreak()
                    }
                    
                    looporswitchbreak()
                
                case 75271786:
                    if (invokevirtual:boolean(String::equals, var_8_F9:String, loadelement:String[expected:Object](getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), and:int(ldc:int(1028), ldc:int(11030))))) {
                        var_9_FC = xor:int(ldc:int(20486), ldc:int(20487))
                        looporswitchbreak()
                    }
                    
                    looporswitchbreak()
                
                case -1854418717:
                    if (invokevirtual:boolean(String::equals, var_8_F9:String, loadelement:String[expected:Object](getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), and:int(ldc:int(2053), ldc:int(1175))))) {
                        var_9_FC = and:int(ldc:int(1539), ldc:int(378))
                        looporswitchbreak()
                    }
                    
                    looporswitchbreak()
            }
            
            switch (var_9_FC:int) {
                case 0:
                    invokevirtual:void(\u8bb0\u392e\u7049\u983f\u56bd::\u8aa5\u647c\u7873\u446c\u36d3, this:\u8bb0\u392e\u7049\u983f\u56bd, var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f, var_5_D7:double, f2d:double(var_7_E8:float), p0:\ub83f\u36d3\u62da\u3a62\u8d90)
                    looporswitchbreak()
                
                case 1:
                    var_10_1CC = d2f:float(invokestatic:double(Math::toRadians, f2d:double(sub:float(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u6435\uc84e\ud4fe\ubb2b\u183a\u8aa5, var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:float(180.0f)))))
                    var_11_1E0 = sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f)), f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_10_1CC:float), var_7_E8:float)))
                    var_13_1F4 = add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f)), f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_10_1CC:float), var_7_E8:float)))
                    invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\u4f4a\u8753\ub32d\u3e75\ud523, p0:\ub83f\u36d3\u62da\u3a62\u8d90, sub:double(var_11_1E0:double, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\uc4d2\u5f50\ud51e\uf9c5\u74b1, p0:\ub83f\u36d3\u62da\u3a62\u8d90, sub:double(var_13_1F4:double, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    looporswitchbreak()
                
                case 2:
                    var_10_22F = d2f:float(mul:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(3.141592653589793)))
                    var_11_243 = sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f)), f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_10_22F:float), var_7_E8:float)))
                    var_13_257 = add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, var_4_77:\u7d52\u718f\u3776\u6fb0\ub83f)), f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_10_22F:float), var_7_E8:float)))
                    invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\u4f4a\u8753\ub32d\u3e75\ud523, p0:\ub83f\u36d3\u62da\u3a62\u8d90, sub:double(var_11_243:double, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\uc4d2\u5f50\ud51e\uf9c5\u74b1, p0:\ub83f\u36d3\u62da\u3a62\u8d90, sub:double(var_13_257:double, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))))
                    looporswitchbreak()
            }
        }
    }
    
    public void \u8aa5\u647c\u7873\u446c\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, double p1, double p2, \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub83f\u36d3\u62da\u3a62\u8d90 p3) {
        var_7_166 : int
        var_9_79 : double
        var_15_AE : double
        var_17_BD : double
        var_17_11E : double
        var_25_147 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_17_187 : double
        var_17_1E8 : double
        var_7_232 : int
        var_26_271 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_27_282 : String
        
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
        var_7_166 = and:int(ldc:int(-449941631), ldc:int(-844660820))
        var_9_79 = mul:double(mul:double(div:double(p1:double, mul:double(mul:double(p2:double, ldc:double(3.141592653589793)), ldc:double(2.0))), ldc:double(360.0)), i2d:double(getfield:int(\u8bb0\u392e\u7049\u983f\u56bd::\u600f\u8cae\u9255\u9033\u983f, this:\u8bb0\u392e\u7049\u983f\u56bd)))
        var_15_AE = sub:double(div:double(mul:double(invokestatic:double(Math::atan2, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f))), ldc:double(180.0)), ldc:double(3.141592653589793)), ldc:double(90.0))
        var_17_BD = div:double(mul:double(add:double(var_15_AE:double, var_9_79:double), ldc:double(3.141592653589793)), ldc:double(180.0))
        var_17_11E = div:double(mul:double(sub:double(div:double(mul:double(invokestatic:double(Math::atan2, sub:double(add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), mul:double(invokestatic:double(Math::cos, var_17_BD:double), p2:double)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), sub:double(sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), mul:double(invokestatic:double(Math::sin, var_17_BD:double), p2:double)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))), ldc:double(180.0)), ldc:double(3.141592653589793)), ldc:double(90.0)), ldc:double(3.141592653589793)), ldc:double(180.0))
        invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\u4f4a\u8753\ub32d\u3e75\ud523, p3:\ub83f\u36d3\u62da\u3a62\u8d90, mul:double(neg:double(invokestatic:double(Math::sin, var_17_11E:double)), p1:double))
        invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\uc4d2\u5f50\ud51e\uf9c5\u74b1, p3:\ub83f\u36d3\u62da\u3a62\u8d90, mul:double(invokestatic:double(Math::cos, var_17_11E:double), p1:double))
        var_25_147 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u946b\u5fe1\u7e3f\u7043\u3d64\u624e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\ub83f\u36d3\u62da\u3a62\u8d90::\u416d\ubefe\uc238\ucfaf\ua3b4, p3:\ub83f\u36d3\u62da\u3a62\u8d90))
        
        if (cmpeq:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_25_147:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p3:\ub83f\u36d3\u62da\u3a62\u8d90))) {
            if (cmpeq:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_25_147:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p3:\ub83f\u36d3\u62da\u3a62\u8d90))) {
                goto(Label_0536)
            }
        }
        
        Label_0343:
        
        if (cmpeq:boolean(and:int(var_7_166:int, ldc:int(8)), ldc:int(0))) {
            var_7_166 = and:int(var_7_166:int, ldc:int(-310579245))
            putfield:int(\u8bb0\u392e\u7049\u983f\u56bd::\u600f\u8cae\u9255\u9033\u983f, this:\u8bb0\u392e\u7049\u983f\u56bd, mul:int(getfield:int(\u8bb0\u392e\u7049\u983f\u56bd::\u600f\u8cae\u9255\u9033\u983f, this:\u8bb0\u392e\u7049\u983f\u56bd), ldc:int(-1)))
            var_9_79 = mul:double(var_9_79:double, ldc:double(-1.0))
            var_17_187 = div:double(mul:double(add:double(var_15_AE:double, var_9_79:double), ldc:double(3.141592653589793)), ldc:double(180.0))
            var_17_1E8 = div:double(mul:double(sub:double(div:double(mul:double(invokestatic:double(Math::atan2, sub:double(add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), mul:double(invokestatic:double(Math::cos, var_17_187:double), p2:double)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), sub:double(sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), mul:double(invokestatic:double(Math::sin, var_17_187:double), p2:double)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))), ldc:double(180.0)), ldc:double(3.141592653589793)), ldc:double(90.0)), ldc:double(3.141592653589793)), ldc:double(180.0))
            invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\u4f4a\u8753\ub32d\u3e75\ud523, p3:\ub83f\u36d3\u62da\u3a62\u8d90, mul:double(neg:double(invokestatic:double(Math::sin, var_17_1E8:double)), p1:double))
            invokevirtual:void(\ub83f\u36d3\u62da\u3a62\u8d90::\uc4d2\u5f50\ud51e\uf9c5\u74b1, p3:\ub83f\u36d3\u62da\u3a62\u8d90, mul:double(invokestatic:double(Math::cos, var_17_1E8:double), p1:double))
        }
        
        Label_0536:
        
        if (cmpeq:boolean(and:int(var_7_166:int, ldc:int(128)), ldc:int(0))) {
            var_7_166 = and:int(var_7_166:int, ldc:int(-1945411249))
            goto(Label_0343)
        }
        
        var_7_232 = and:int(var_7_166:int, ldc:int(-574656595))
        var_26_271 = initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p3:\ub83f\u36d3\u62da\u3a62\u8d90)), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u8350\ubcb0\u416d\ubf56\ua068, p3:\ub83f\u36d3\u62da\u3a62\u8d90)), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p3:\ub83f\u36d3\u62da\u3a62\u8d90)))
        var_27_282 = invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), xor:int(ldc:int(7239), ldc:int(7245))))
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_27_282:String, loadelement:String[expected:Object](getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), and:int(ldc:int(21247), ldc:int(8207)))))) {
            if (getfield:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\u4492\u74b1\u8d98\u8753\u12cb, this:\u8bb0\u392e\u7049\u983f\u56bd)) {
                goto(Label_0763)
            }
            
            if (logicalnot:boolean(invokespecial:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\ua3b4\u97b7\u5d20\ua068\ud158, this:\u8bb0\u392e\u7049\u983f\u56bd, var_26_271:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))) {
                goto(Label_0763)
            }
            
            if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\u98a4\ub1b9\u4cd9\u6b5f\u7ce1>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\ub1b9\u4cd9\u6b5f\u7ce1.class)))) {
                goto(Label_0763)
            }
            
            putfield:int(\u8bb0\u392e\u7049\u983f\u56bd::\u600f\u8cae\u9255\u9033\u983f, this:\u8bb0\u392e\u7049\u983f\u56bd, mul:int(getfield:int(\u8bb0\u392e\u7049\u983f\u56bd::\u600f\u8cae\u9255\u9033\u983f, this:\u8bb0\u392e\u7049\u983f\u56bd), ldc:int(-1)))
            putfield:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\u4492\u74b1\u8d98\u8753\u12cb, this:\u8bb0\u392e\u7049\u983f\u56bd, and:int[expected:boolean](ldc:int(2563), ldc:int(16853)))
        }
        
        Label_0663:
        
        if (cmpeq:boolean(and:int(var_7_232:int, ldc:int(2048)), ldc:int(0))) {
            var_7_232 = and:int(var_7_232:int, ldc:int(942447011))
            goto(Label_0763)
        }
        
        if (cmpeq:boolean(and:int(var_7_232:int, ldc:int(128)), ldc:int(0))) {
            var_7_232 = and:int(var_7_232:int, ldc:int(414120308))
        }
        else {
            var_7_232 = and:int(var_7_232:int, ldc:int(-546934847))
            
            if (getfield:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\u4492\u74b1\u8d98\u8753\u12cb, this:\u8bb0\u392e\u7049\u983f\u56bd)) {
                if (cmpgt:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)), p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), xor:int(ldc:int(4225), ldc:int(4231)))))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_27_282:String, loadelement:String[expected:Object](getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), xor:int(ldc:int(1336), ldc:int(1333)))))) {
                        var_7_232 = and:int(var_7_232:int, ldc:int(-1765802528))
                        invokestatic:void(\u3e75\u8413\u3711\u4daf\ub1b9::\u6c56\u760c\ub83f\u0800\u34df, p3:\ub83f\u36d3\u62da\u3a62\u8d90, p1:double)
                        
                        if (invokevirtual:boolean(String::equals, var_27_282:String, loadelement:String[expected:Object](getstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6), xor:int(ldc:int(4195), ldc:int(4207))))) {
                            var_26_271 = initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p3:\ub83f\u36d3\u62da\u3a62\u8d90)), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u8350\ubcb0\u416d\ubf56\ua068, p3:\ub83f\u36d3\u62da\u3a62\u8d90)), add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p3:\ub83f\u36d3\u62da\u3a62\u8d90)))
                            
                            if (invokespecial:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\ua3b4\u97b7\u5d20\ua068\ud158, this:\u8bb0\u392e\u7049\u983f\u56bd, var_26_271:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)) {
                                if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\u98a4\ub1b9\u4cd9\u6b5f\u7ce1>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\ub1b9\u4cd9\u6b5f\u7ce1.class))))) {
                                    invokestatic:void(\u3e75\u8413\u3711\u4daf\ub1b9::\u6c56\u760c\ub83f\u0800\u34df, p3:\ub83f\u36d3\u62da\u3a62\u8d90, ldc:double(0.0))
                                }
                            }
                        }
                    }
                    else {
                        invokestatic:void(\u3e75\u8413\u3711\u4daf\ub1b9::\u6c56\u760c\ub83f\u0800\u34df, p3:\ub83f\u36d3\u62da\u3a62\u8d90, ldc:double(0.0))
                    }
                }
            }
        }
        
        Label_0718:
        
        if (cmpne:boolean(and:int(var_7_232:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_7_232:int, ldc:int(1048576)), ldc:int(0))) {
                return:void()
            }
            
            goto(Label_0663)
        }
        
        Label_0763:
        
        if (cmpeq:boolean(and:int(var_7_232:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0718)
        }
        
        if (cmpne:boolean(and:int(var_7_232:int, ldc:int(64)), ldc:int(0))) {
            var_7_232 = and:int(var_7_232:int, ldc:int(-2033376637))
            goto(Label_0663)
        }
        
        var_7_232 = and:int(var_7_232:int, ldc:int(-37847057))
        
        if (logicalnot:boolean(getfield:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\u4492\u74b1\u8d98\u8753\u12cb, this:\u8bb0\u392e\u7049\u983f\u56bd))) {
            goto(Label_0663)
        }
        
        if (invokespecial:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\ua3b4\u97b7\u5d20\ua068\ud158, this:\u8bb0\u392e\u7049\u983f\u56bd, var_26_271:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)) {
            goto(Label_0663)
        }
        
        putfield:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\u4492\u74b1\u8d98\u8753\u12cb, this:\u8bb0\u392e\u7049\u983f\u56bd, and:int[expected:boolean](ldc:int(8722), ldc:int(-8723)))
        goto(Label_0663)
    }
    
    private boolean \ua3b4\u97b7\u5d20\ua068\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p0) {
        var_2_61 : int
        var_2_78 : int
        stack_FF_0 : int [generated]
        
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
        var_2_61 = and:int(ldc:int(479780237), ldc:int(-933569129))
        
        if (cmpge:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:double(1.0))) {
            var_2_78 = and:int(var_2_61:int, ldc:int(-514269729))
            
            if (cmpne:boolean(invokeinterface:long(Stream<T>::count, invokevirtual:Stream<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>(\u516c\u5bc4\u494c\ub1b9\u5245::\ucfaf\u9033\ucb79\u9255\uc31c\u7049, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u516c\u5bc4\u494c\ub1b9\u5245](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ud36e\ub19c\uc4d2\ua562\u759a\u5654, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u965f\ud158\u71f1\u7bad\u8350\u071d, p0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, ldc:double(-0.15), ldc:double(0.0), ldc:double(-0.15)), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u965f\ud158\u71f1\u7bad\u8350\u071d, p0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, ldc:double(0.15), f2d:double(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7ce1\u392e\ufe34\u3a62\u4492\u3a62, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:double(0.15))), ldc:double(0.0), neg:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))))), ldc:double(0.0)))), ldc:long(0L))) {
                var_2_78 = and:int(var_2_78:int, ldc:int(1899683295))
                stack_FF_0 = and:int(ldc:int(-21215), ldc:int(17116))
            }
            else {
                stack_FF_0 = xor:int(ldc:int(-22520), ldc:int(-22519))
            }
            
            return:boolean(stack_FF_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(2057), ldc:int(835)))
    }
    
    private boolean \u4c04\ub18d\u4975\u839e\ud158(double p0, double p1, double p2) {
        var_7_63 : int
        stack_B3_0 : int [generated]
        
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
            var_7_63 = and:int(ldc:int(-1998636909), ldc:int(-67406536))
            
            if (cmpne:boolean(invokeinterface:long(Stream<T>::count, invokevirtual:Stream<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>(\u516c\u5bc4\u494c\ub1b9\u5245::\ucfaf\u9033\ucb79\u9255\uc31c\u7049, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u516c\u5bc4\u494c\ub1b9\u5245](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, getfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4daf\ubded\u93a2\u52d3\u3c25\u0b8e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))), p0:double, p1:double, p2:double))), ldc:long(0L))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(1574943409))
                stack_B3_0 = and:int(ldc:int(4615), ldc:int(-6672))
            }
            else {
                stack_B3_0 = and:int(ldc:int(16947), ldc:int(12609))
            }
            
            return:boolean(stack_B3_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3e75\ud12e\ua562\u97b7\u9937$0(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            putfield:boolean(\u8bb0\u392e\u7049\u983f\u56bd::\u4492\u74b1\u8d98\u8753\u12cb, this:\u8bb0\u392e\u7049\u983f\u56bd, and:int[expected:boolean](ldc:int(-19613), ldc:int(3224)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u97b7\u4c2b\u97b7\u7e3f\u3a62() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u4d85\u98a4\u624e\u1187\u7043() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8bb0\u392e\u7049\u983f\u56bd::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_38A : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_332_0 : byte[] [generated]
        stack_39D_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_2C2 : byte[]
        var_4_2C3 : int
        expr_98 : int [generated]
        var_5_313 : int
        var_3_318 : byte[]
        var_4_319 : int
        expr_338 : byte [generated]
        var_0_393 : int
        expr_39D : byte [generated]
        stack_3CD_2 : byte [generated]
        expr_C9 : int [generated]
        var_3_F1 : String
        stack_2B9_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
            var_0_38A = and:int(ldc:int(1518173505), ldc:int(1979528169))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_332_0 = stack_39D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Ay/ycbDa80FaMzaPqTXD26r2/PMzgnOasne0tvIPNyXys3H32ky39rf2+DYyMrRxOXdg9/x0dy/4MHT0cvit9zZ/LHA+Mmm2+De0qvnxNavzvLJnsvk0tCqHafYzM3L29vb29vdjsrEnNbXCp7TDdDVxwyj39vJxMvAyN7HxK7Hxsjb3Nn70dvK28fY3Jv/1+OY/Q3cndMI3tFrDNbO09vZ+dXUmv0G39upPKqRzt/329gwavrBz9nXD2Df0cnwlTLU2sVpMt7b1dvV2cCb0ssC0tcM1HdoYntqY"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_2C2 = newarray:byte[](byte.class, expr_70:int)
                var_4_2C3 = expr_70:int
                
                loop {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-262162749))
                    var_4_2C3 = add:int(var_4_2C3:int, ldc:int(-1))
                    storeelement:byte(var_3_2C2:byte[], var_4_2C3:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_2C3:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_2C3:int, and:int(ldc:int(20753), ldc:int(1539)))), ldc:int(2)), xor:int(ldc:int(63), ldc:int(0)))))
                    
                    if (cmpne:boolean(var_4_2C3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_332_0 = stack_39D_0 = var_3_2C2:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(2)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-1751335907))
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_38A = and:int(var_0_38A:int, ldc:int(1851555009))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_313 = expr_98:int
                var_3_318 = newarray:byte[](byte.class, expr_98:int)
                var_4_319 = expr_98:int
                Label_0795:
                
                while (cmpne:boolean(and:int(var_0_38A:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(242580757))
                    var_4_319 = add:int(var_4_319:int, ldc:int(-1))
                    expr_338 = add:byte(xor:byte(loadelement:byte(stack_332_0:byte[], var_4_319:int), ldc:byte(6)), ldc:byte(69))
                    storeelement:byte(var_3_318:byte[], var_4_319:int, or:int(and:int(shl:int(expr_338:byte, xor:int(ldc:int(6), ldc:int(2))), ldc:int(-16)), and:int(shr:int(expr_338:byte[expected:int], and:int(ldc:int(516), ldc:int(24830))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_319:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_332_0 = stack_39D_0 = var_3_318:byte[]
                    goto(Label_0157)
                }
                
                Label_0893:
                
                while (cmpne:boolean(and:int(var_0_38A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_393 = and:int(var_0_38A:int, ldc:int(-1545700127))
                    var_4_319 = add:int(var_4_319:int, ldc:int(-1))
                    expr_39D = loadelement:byte(stack_39D_0:byte[], var_4_319:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_319:int, ldc:int(6)), neg:int(var_5_313:int)), ldc:int(0))) {
                        var_0_393 = and:int(var_0_393:int, ldc:int(436026389))
                        stack_3CD_2 = add:byte(expr_39D:byte, ldc:byte(6))
                    }
                    else {
                        stack_3CD_2 = add:byte(expr_39D:byte, loadelement:byte(var_3_318:byte[], add:int(var_4_319:int, ldc:int(6))))
                    }
                    
                    var_0_38A = and:int(var_0_393:int, ldc:int(727085483))
                    storeelement:byte(var_3_318:byte[], var_4_319:int, stack_3CD_2:byte)
                    
                    if (cmpne:boolean(var_4_319:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_332_0 = stack_39D_0 = var_3_318:byte[]
                    goto(Label_0206)
                }
                
                var_0_38A = and:int(var_0_38A:int, ldc:int(709328112))
                goto(Label_0795)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-474535173))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(4096)), ldc:int(0))) {
                        var_0_38A = and:int(var_0_38A:int, ldc:int(-1460918547))
                        loopcontinue()
                    }
                    
                    var_0_38A = and:int(var_0_38A:int, ldc:int(2085893729))
                    expr_C9 = arraylength:int(stack_C9_0:byte[])
                    
                    if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                        var_5_313 = expr_C9:int
                        var_3_318 = newarray:byte[](byte.class, expr_C9:int)
                        var_4_319 = expr_C9:int
                        goto(Label_0893)
                    }
                }
                
                Label_0206:
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2B9_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17425), ldc:int(12368)))
            expr_103 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16912), ldc:int(9598)))
            storeelement:String(expr_103:String[], xor:int(ldc:int(1412), ldc:int(1413)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(10022), ldc:int(-10039)), and:int(ldc:int(16687), ldc:int(2095))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(8196), ldc:int(8206)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(12390), ldc:int(12361)), and:int(ldc:int(16951), ldc:int(319))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(3073), ldc:int(3074)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(8759), ldc:int(4223)), and:int(ldc:int(766), ldc:int(5437))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(577), ldc:int(591)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(316), ldc:int(765)), and:int(ldc:int(371), ldc:int(8771))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(148), ldc:int(153)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32461), ldc:int(-32400)), xor:int(ldc:int(1881), ldc:int(1822))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(224), ldc:int(226)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(583), ldc:int(21575)), and:int(ldc:int(203), ldc:int(379))))
            storeelement:String(expr_103:String[], and:int(ldc:int(524), ldc:int(167)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(18523), ldc:int(587)), xor:int(ldc:int(18513), ldc:int(18433))))
            storeelement:String(expr_103:String[], and:int(ldc:int(22639), ldc:int(1039)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(6232), ldc:int(25716)), and:int(ldc:int(15060), ldc:int(85))))
            storeelement:String(expr_103:String[], and:int(ldc:int(20489), ldc:int(10572)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(1071), ldc:int(1147)), and:int(ldc:int(1246), ldc:int(2142))))
            storeelement:String(expr_103:String[], and:int(ldc:int(9695), ldc:int(16390)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(108), ldc:int(50)), xor:int(ldc:int(-32508), ldc:int(-32416))))
            storeelement:String(expr_103:String[], and:int(ldc:int(1047), ldc:int(8871)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(16396), ldc:int(16488)), xor:int(ldc:int(-29666), ldc:int(-29594))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(20563), ldc:int(20566)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(1033), ldc:int(1137)), and:int(ldc:int(638), ldc:int(2174))))
            storeelement:String(expr_103:String[], and:int(ldc:int(1711), ldc:int(16652)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(1150), ldc:int(24830)), and:int(ldc:int(667), ldc:int(4227))))
            storeelement:String(expr_103:String[], and:int(ldc:int(23592), ldc:int(-23849)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(1171), ldc:int(23011)), xor:int(ldc:int(4230), ldc:int(4105))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(224), ldc:int(235)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4303), ldc:int(1199)), and:int(ldc:int(174), ldc:int(9470))))
            storeelement:String(expr_103:String[], and:int(ldc:int(141), ldc:int(12569)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(12990), ldc:int(18862)), and:int(ldc:int(3034), ldc:int(17627))))
            putstatic:String[](\u8bb0\u392e\u7049\u983f\u56bd::\uc84e\ubff1\u92ff\uc29a\u6ec6, expr_103:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(-84459262), ldc:int(-722010329))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\u392e\u7049\u983f\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-218107498))
            var_5_81 = and:int(ldc:int(26706), ldc:int(-32472))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7222), ldc:int(6197)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_69F:int, ldc:int(-189382234))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-16240), ldc:int(-16239)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(24609), ldc:int(6147)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_D1:int, ldc:int(-675320325))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-16112), ldc:int(-16111)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1323902758))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2035083269))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-321407631))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-264978015))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(980651928))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(858663515))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-37998238))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-151070790))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(184392507))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1458420214))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1721530002))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(567649717))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1612302316))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1307781220))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1330281078))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-252218445))
                            var_11_E2 = and:int(ldc:int(19237), ldc:int(-19320))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-457327635))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(995495654))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1056553020))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1311521702))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1702024111))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-201931889))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0756:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1036317378))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(300632044))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(339393492))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-671623714))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(333973970))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1713651534))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-485860547))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(355187042))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-788597829))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(133), ldc:int(27257))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-494752810))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(264374104))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(630058956))
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1655747507))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-557884426))
                        var_11_E2 = and:int(ldc:int(14862), ldc:int(-15328))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1948128275))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2042561327))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-245304064))
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1534429158))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1968995117))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-641761417))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(554089122))
                            goto(Label_0756)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-341066512))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-167817245))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(75251454))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2018845420))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1599302058))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(311726406))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1690007739))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-771764477))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-141145175))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-734344688))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1327786909))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1747029333))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-692691090))
                        var_17_6AA = add:int(var_16_110:int, xor:int(ldc:int(6404), ldc:int(6405)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(833253194))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-721982541))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, xor:int(ldc:int(-31552), ldc:int(-31551))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
