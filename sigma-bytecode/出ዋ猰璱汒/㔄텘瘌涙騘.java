public class \u51fa\u12cb\u7330\u74b1\u6c52.\u3504\ud158\u760c\u6d99\u9a18 {
    public void \u3504\ud158\u760c\u6d99\u9a18(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5) {
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
    
    public void \u4cd9\uceb8\uc229\u416d\ud217\u12cb() {
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
            invokevirtual:void(\u3504\ud158\u760c\u6d99\u9a18::\ub1b9\u8350\u67e9\u69d9\u47c2\ub8be, this:\u3504\ud158\u760c\u6d99\u9a18)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8350\u74b1\u7049\u5d20\ub18d\u071d() {
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
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
        var_3_83 : int
        var_5_69 : HashMap<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>
        var_6_74 : Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>
        var_7_C6 : \u12cb\u93a2\ubf56\uc229\u8d90
        var_8_E2 : \uf94d\u97e6\u6198\uc3e3\u7d52
        var_6_A7 : int
        var_7_B3 : Iterator<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>
        var_8_120 : Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>
        
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
            var_3_83 = and:int(ldc:int(693308060), ldc:int(-553260914))
            var_5_69 = initobject:HashMap<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>(HashMap<K, V>::<init>)
            var_6_74 = invokeinterface:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>(List<\u12cb\u93a2\ubf56\uc229\u8d90>::iterator, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_83:int, ldc:int(1)), ldc:int(0))) {
                    var_3_83 = and:int(var_3_83:int, ldc:int(-2016830579))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_74:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>)) {
                        var_7_C6 = checkcast:\u12cb\u93a2\ubf56\uc229\u8d90(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90.class, invokeinterface:\u12cb\u93a2\ubf56\uc229\u8d90(Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>::next, var_6_74:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>))
                        
                        if (instanceof:boolean(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u97e6\u6198\uc3e3\u7d52.class, var_7_C6:\u12cb\u93a2\ubf56\uc229\u8d90)) {
                            var_8_E2 = checkcast:\uf94d\u97e6\u6198\uc3e3\u7d52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u97e6\u6198\uc3e3\u7d52.class, var_7_C6:\uf94d\u97e6\u6198\uc3e3\u7d52)
                            invokevirtual:\uf94d\u97e6\u6198\uc3e3\u7d52(HashMap<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>::put, var_5_69:HashMap<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>, invokestatic:Integer(Integer::valueOf, getfield:int(\uf94d\u97e6\u6198\uc3e3\u7d52::\u416d\u4179\u5db4\u4179\u839e, var_8_E2:\uf94d\u97e6\u6198\uc3e3\u7d52)), var_8_E2:\uf94d\u97e6\u6198\uc3e3\u7d52)
                        }
                        
                        var_3_83 = and:int(var_3_83:int, ldc:int(363187704))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_83:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_83 = and:int(var_3_83:int, ldc:int(-2123493459))
            }
            
            var_6_A7 = ldc:int(75)
            var_7_B3 = invokeinterface:Iterator<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>(Set<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>::iterator, invokevirtual:Set<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>(HashMap<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>::entrySet, var_5_69:HashMap<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_B3:Iterator<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>)) {
                var_8_120 = checkcast:Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>(java.util.Map.Entry<java.lang.Integer, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u97e6\u6198\uc3e3\u7d52>.class, invokeinterface:Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>(Iterator<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>::next, var_7_B3:Iterator<Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>>))
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u960f\u64ab\u8cae\ub8be, checkcast:\uf94d\u97e6\u6198\uc3e3\u7d52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u97e6\u6198\uc3e3\u7d52.class, invokeinterface:\uf94d\u97e6\u6198\uc3e3\u7d52(Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>::getValue, var_8_120:Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>)), var_6_A7:int)
                var_6_A7 = add:int(var_6_A7:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, checkcast:\uf94d\u97e6\u6198\uc3e3\u7d52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u97e6\u6198\uc3e3\u7d52.class, invokeinterface:\uf94d\u97e6\u6198\uc3e3\u7d52(Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>::getValue, var_8_120:Entry<Integer, \uf94d\u97e6\u6198\uc3e3\u7d52>))))
            }
            
            invokespecial:void(\uafe7\u72f1\u7e3f\uc238\u34df::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\uafe7\u72f1\u7e3f\uc238\u34df], p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_2_61 : int
        var_4_71 : float
        stack_BD_0 : int [generated]
        stack_BD_1 : int [generated]
        var_2_BC : int
        var_5_C7 : int
        var_6_D6 : int
        stack_1BA_0 : float [generated]
        var_2_1B6 : int
        stack_1F6_0 : int [generated]
        stack_1F6_1 : int [generated]
        var_2_1F5 : int
        stack_238_0 : float [generated]
        stack_22C_0 : float [generated]
        stack_22B_0 : float [generated]
        stack_22B_1 : float [generated]
        
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
            var_2_61 = and:int(ldc:int(1740084483), ldc:int(-654652341))
            p0 = invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u3504\ud158\u760c\u6d99\u9a18::\u8308\u9937\u8cae\uae87\u9033, this:\u3504\ud158\u760c\u6d99\u9a18))
            var_4_71 = invokestatic:float(\u183a\ud7e8\u156b\u62da\ub7dc::\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e, p0:float, ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u97b7\u62da\u527a\ubefe\u98a4, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90], add:float(ldc:float(0.8f), mul:float(var_4_71:float, ldc:float(0.2f))), add:float(ldc:float(0.8f), mul:float(var_4_71:float, ldc:float(0.2f))))
            stack_BD_0 = f2i:int(mul:float(mul:float(i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u8350\u1187\u6c56\ub32d\u927d, this:\u3504\ud158\u760c\u6d99\u9a18)), ldc:float(0.2f)), sub:float(ldc:float(1.0f), var_4_71:float)))
            
            if (logicalnot:boolean(getfield:boolean(\u3504\ud158\u760c\u6d99\u9a18::\ua3b4\u88c5\u3776\u3e2a\u120d, this:\u3504\ud158\u760c\u6d99\u9a18))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1475599902))
                stack_BD_1 = and:int(ldc:int(3367), ldc:int(4609))
            }
            else {
                stack_BD_1 = ldc:int(-1)
            }
            
            var_2_BC = and:int(var_2_61:int, ldc:int(1404493107))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u5245\u8aa5\u385b\ube23\u3e2a, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90], mul:int(stack_BD_0:int, stack_BD_1:int))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u516c\ubefe\u7d52\u960f\u71ae, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
            var_5_C7 = ldc:int(10)
            var_6_D6 = invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, ldc:int(-723724), invokestatic:float(\u960f\u385b\u93a2\uc84e\u7006::\u76bc\u6b0d\ufcaf\u7d52\u6b0d\uf995, p0:float, ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7330\uf995\u7af6\uc29a\u960f\u3bc9, i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18), div:int(var_5_C7:int, and:int(ldc:int(4363), ldc:int(17410))))), i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18), div:int(var_5_C7:int, and:int(ldc:int(8211), ldc:int(21062))))), i2f:float(sub:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u8350\u1187\u6c56\ub32d\u927d, this:\u3504\ud158\u760c\u6d99\u9a18), var_5_C7:int)), i2f:float(sub:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\ub8be\u7873\u36d3\ub102\u8258, this:\u3504\ud158\u760c\u6d99\u9a18), var_5_C7:int)), ldc:float(35.0f), p0:float)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18), div:int(var_5_C7:int, and:int(ldc:int(18726), ldc:int(1666))))), i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18), div:int(var_5_C7:int, and:int(ldc:int(9579), ldc:int(22))))), i2f:float(add:int(sub:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18), div:int(var_5_C7:int, and:int(ldc:int(12423), ldc:int(338)))), getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u8350\u1187\u6c56\ub32d\u927d, this:\u3504\ud158\u760c\u6d99\u9a18))), i2f:float(add:int(sub:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18), div:int(var_5_C7:int, xor:int(ldc:int(18457), ldc:int(18459)))), getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\ub8be\u7873\u36d3\ub102\u8258, this:\u3504\ud158\u760c\u6d99\u9a18))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(p0:float, ldc:float(0.25f))))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u97e6\u98a4\ubded\u527a\u836c\u4975, i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18)), i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18)), i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u8350\u1187\u6c56\ub32d\u927d, this:\u3504\ud158\u760c\u6d99\u9a18)), i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\ub8be\u7873\u36d3\ub102\u8258, this:\u3504\ud158\u760c\u6d99\u9a18)), i2f:float(var_5_C7:int), var_6_D6:int)
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslatef, i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18)), i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18)), ldc:float(0.0f))
            
            if (logicalnot:boolean(getfield:boolean(\u3504\ud158\u760c\u6d99\u9a18::\ua3b4\u88c5\u3776\u3e2a\u120d, this:\u3504\ud158\u760c\u6d99\u9a18))) {
                var_2_BC = and:int(var_2_BC:int, ldc:int(-273491009))
                stack_1BA_0 = ldc:float(-90.0f)
            }
            else {
                stack_1BA_0 = ldc:float(90.0f)
            }
            
            var_2_1B6 = and:int(var_2_BC:int, ldc:int(-184616149))
            invokestatic:void(GL11::glRotatef, stack_1BA_0:float, ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f))
            invokestatic:void(GL11::glTranslatef, i2f:float(neg:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18))), i2f:float(neg:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18))), ldc:float(0.0f))
            stack_1F6_0 = getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18)
            
            if (logicalnot:boolean(getfield:boolean(\u3504\ud158\u760c\u6d99\u9a18::\ua3b4\u88c5\u3776\u3e2a\u120d, this:\u3504\ud158\u760c\u6d99\u9a18))) {
                var_2_1B6 = and:int(var_2_1B6:int, ldc:int(1623168786))
                stack_1F6_1 = and:int(ldc:int(-13302), ldc:int(13125))
            }
            else {
                stack_1F6_1 = getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\ub8be\u7873\u36d3\ub102\u8258, this:\u3504\ud158\u760c\u6d99\u9a18)
            }
            
            var_2_1F5 = and:int(var_2_1B6:int, ldc:int(-357381433))
            stack_238_0 = i2f:float(add:int(stack_1F6_0:int, stack_1F6_1:int))
            stack_22C_0 = i2f:float(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18))
            stack_22B_0 = i2f:float(div:int(sub:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u8350\u1187\u6c56\ub32d\u927d, this:\u3504\ud158\u760c\u6d99\u9a18), ldc:int(47)), xor:int(ldc:int(277), ldc:int(279))))
            
            if (logicalnot:boolean(getfield:boolean(\u3504\ud158\u760c\u6d99\u9a18::\ua3b4\u88c5\u3776\u3e2a\u120d, this:\u3504\ud158\u760c\u6d99\u9a18))) {
                var_2_1F5 = and:int(var_2_1F5:int, ldc:int(1442309903))
                stack_22B_1 = ldc:float(1.0f)
            }
            else {
                stack_22B_1 = ldc:float(-1.5f)
            }
            
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, stack_238_0:float, add:float(stack_22C_0:float, mul:float(stack_22B_0:float, stack_22B_1:float)), ldc:float(18.0f), ldc:float(47.0f), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\ub7dc\u6bb9\u6d69\u92ee\u71ae), var_6_D6:int)
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ubded\u5654\u120d\u7330\u516c), i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18), ldc:int(25))), i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18), ldc:int(20))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u3504\ud158\u760c\u6d99\u9a18::\uc2e8\ucb79\u0b8e\u392e\u36d3, this:\u3504\ud158\u760c\u6d99\u9a18)), loadelement:String(getstatic:String[](\u3504\ud158\u760c\u6d99\u9a18::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(-24563), ldc:int(-24561))))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.8f), p0:float)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18), ldc:int(25))), i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18), ldc:int(68))), i2f:float(sub:int(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u3504\ud158\u760c\u6d99\u9a18), getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u8350\u1187\u6c56\ub32d\u927d, this:\u3504\ud158\u760c\u6d99\u9a18)), ldc:int(25))), i2f:float(add:int(getfield:int(\u3504\ud158\u760c\u6d99\u9a18::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u3504\ud158\u760c\u6d99\u9a18), ldc:int(69))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.05f), p0:float)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u62da\ubded\uc31c\ubefe\u4e72\u494c(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u1833\uc31c\u7e3f\uae5d\uae5d p0) {
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
            invokeinterface:boolean(List<\u1833\uc31c\u7e3f\uae5d\uae5d>::add, getfield:List<\u1833\uc31c\u7e3f\uae5d\uae5d>(\u3504\ud158\u760c\u6d99\u9a18::\u9937\u16f6\u59ec\u3a62\u8bb0, this:\u3504\ud158\u760c\u6d99\u9a18), p0:\u1833\uc31c\u7e3f\uae5d\uae5d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u99f7\u4d85\uc9f6\u6ec6\u8413\u3a62() {
        var_1_61 : int
        var_3_6B : Iterator<\u1833\uc31c\u7e3f\uae5d\uae5d>
        
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
            var_1_61 = and:int(ldc:int(168702753), ldc:int(-25822367))
            var_3_6B = invokeinterface:Iterator<\u1833\uc31c\u7e3f\uae5d\uae5d>(List<\u1833\uc31c\u7e3f\uae5d\uae5d>::iterator, getfield:List<\u1833\uc31c\u7e3f\uae5d\uae5d>(\u3504\ud158\u760c\u6d99\u9a18::\u9937\u16f6\u59ec\u3a62\u8bb0, this:\u3504\ud158\u760c\u6d99\u9a18))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(489599985))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_6B:Iterator<\u1833\uc31c\u7e3f\uae5d\uae5d>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(\u1833\uc31c\u7e3f\uae5d\uae5d::\ubcb0\u760c\u7bad\u9af2\u4ab3\u760c, checkcast:\u1833\uc31c\u7e3f\uae5d\uae5d(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u1833\uc31c\u7e3f\uae5d\uae5d.class, invokeinterface:\u1833\uc31c\u7e3f\uae5d\uae5d(Iterator<\u1833\uc31c\u7e3f\uae5d\uae5d>::next, var_3_6B:Iterator<\u1833\uc31c\u7e3f\uae5d\uae5d>)), this:\u3504\ud158\u760c\u6d99\u9a18)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u6c52\u3bc9\u93a2\u92ff\u56bd\u6b5f(\u59ec\u8413\u97e6\uc229\u3776.\u8c8a\ud12e\u624e\ubded\ud4fe p0) {
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
            invokeinterface:boolean(List<\u8c8a\ud12e\u624e\ubded\ud4fe>::add, getfield:List<\u8c8a\ud12e\u624e\ubded\ud4fe>(\u3504\ud158\u760c\u6d99\u9a18::\u5db4\uc2bd\u8389\u0800\u718f, this:\u3504\ud158\u760c\u6d99\u9a18), p0:\u8c8a\ud12e\u624e\ubded\ud4fe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \ub1b9\u8350\u67e9\u69d9\u47c2\ub8be() {
        var_1_61 : int
        var_3_6B : Iterator<\u8c8a\ud12e\u624e\ubded\ud4fe>
        
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
            var_1_61 = and:int(ldc:int(1362649840), ldc:int(1328295660))
            var_3_6B = invokeinterface:Iterator<\u8c8a\ud12e\u624e\ubded\ud4fe>(List<\u8c8a\ud12e\u624e\ubded\ud4fe>::iterator, getfield:List<\u8c8a\ud12e\u624e\ubded\ud4fe>(\u3504\ud158\u760c\u6d99\u9a18::\u5db4\uc2bd\u8389\u0800\u718f, this:\u3504\ud158\u760c\u6d99\u9a18))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-378916365))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_6B:Iterator<\u8c8a\ud12e\u624e\ubded\ud4fe>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(\u8c8a\ud12e\u624e\ubded\ud4fe::\u3dd3\ube23\u946b\u97b7\u52d3\ub83f, checkcast:\u8c8a\ud12e\u624e\ubded\ud4fe(\u59ec\u8413\u97e6\uc229\u3776.\u8c8a\ud12e\u624e\ubded\ud4fe.class, invokeinterface:\u8c8a\ud12e\u624e\ubded\ud4fe(Iterator<\u8c8a\ud12e\u624e\ubded\ud4fe>::next, var_3_6B:Iterator<\u8c8a\ud12e\u624e\ubded\ud4fe>)), this:\u3504\ud158\u760c\u6d99\u9a18)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3e2a\u69d9\ub7dc\u446c\u97e6\u2dcc$1(\u71f1\uc910\u3bc9\u516c\u93a2.\uc3e3\ubefe\u9033\uc84e\u6cfe p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3bd6\u156b\u8258\u0b8e\u4492 p1) {
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
            invokevirtual:void(\uc3e3\ubefe\u9033\uc84e\u6cfe::\uafe7\u946b\ua562\ucef1\u93a2\ud4fe, p0:\uc3e3\ubefe\u9033\uc84e\u6cfe, and:int(ldc:int(25174), ldc:int(-25175)))
            invokevirtual:void(\u3bd6\u156b\u8258\u0b8e\u4492::\ub83f\u67d0\u3e75\ua61f\u34df, this:\u3504\ud158\u760c\u6d99\u9a18[expected:\u3bd6\u156b\u8258\u0b8e\u4492])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u92ff\ub6ab\u7049\u8df4\u760c\u6b5f$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            invokevirtual:void(\u3504\ud158\u760c\u6d99\u9a18::\u99f7\u4d85\uc9f6\u6ec6\u8413\u3a62, this:\u3504\ud158\u760c\u6d99\u9a18)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_226 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_1EA_0 : byte[] [generated]
        stack_249_0 : byte[] [generated]
        stack_2E9_0 : byte[] [generated]
        stack_33D_0 : byte[] [generated]
        var_4_1C4 : int
        var_3_1C9 : byte[]
        var_5_1CA : int
        var_0_263 : int
        expr_249 : byte [generated]
        stack_29B_2 : byte [generated]
        stack_26F_0 : byte [generated]
        expr_2E9 : byte [generated]
        expr_9E : int [generated]
        expr_D7 : int [generated]
        var_2_10E : byte[]
        expr_112 : int [generated]
        var_3_32B : byte[]
        var_5_32C : int
        var_3_154 : String
        stack_1BD_0 : String[] [generated]
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
        var_0_226 = and:int(ldc:int(2138187032), ldc:int(-25168485))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_148_0 = stack_1EA_0 = stack_249_0 = stack_2E9_0 = stack_33D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("KOz/BiL19dXk5AUL+5tyfdw=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1C4 = expr_6E:int
        var_3_1C9 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1CA = expr_6E:int
        Label_0460:
        
        while (cmpeq:boolean(and:int(var_0_226:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0537)
            }
            
            var_0_226 = and:int(var_0_226:int, ldc:int(-27068542))
            var_5_1CA = add:int(var_5_1CA:int, ldc:int(-1))
            storeelement:byte(var_3_1C9:byte[], var_5_1CA:int, add:byte(loadelement:byte(stack_1EA_0:byte[], var_5_1CA:int), ldc:byte(11)))
            
            if (cmpne:boolean(var_5_1CA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_148_0 = stack_1EA_0 = stack_249_0 = stack_2E9_0 = stack_33D_0 = var_3_1C9:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0705)
        Label_0537:
        
        while (cmpne:boolean(and:int(var_0_226:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_226 = and:int(var_0_226:int, ldc:int(918485288))
                goto(Label_0460)
            }
            
            var_0_263 = and:int(var_0_226:int, ldc:int(-26325068))
            var_5_1CA = add:int(var_5_1CA:int, ldc:int(-1))
            expr_249 = stack_29B_2 = loadelement(stack_249_0, var_5_1CA)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CA:int, ldc:int(3)), neg:int(var_4_1C4:int)), ldc:int(0))) {
                stack_29B_2 = stack_26F_0 = add:byte(expr_249:byte, loadelement:byte(var_3_1C9:byte[], add:int(var_5_1CA:int, ldc:int(3))))
                goto(Label_0639)
            }
            
            Label_0598:
            
            if (cmpne:boolean(and:int(var_0_263:int, ldc:int(512)), ldc:int(0))) {
                var_0_263 = and:int(var_0_263:int, ldc:int(-353736327))
            }
            else {
                var_0_263 = and:int(var_0_263:int, ldc:int(2146684135))
                stack_29B_2 = stack_26F_0 = add:byte(expr_249:byte, ldc:byte(3))
            }
            
            Label_0639:
            
            if (cmpne:boolean(and:int(var_0_263:int, ldc:int(262144)), ldc:int(0))) {
                var_0_263 = and:int(var_0_263:int, ldc:int(1188750001))
                goto(Label_0598)
            }
            
            var_0_226 = and:int(var_0_263:int, ldc:int(2138758849))
            storeelement:byte(var_3_1C9:byte[], var_5_1CA:int, stack_29B_2:byte)
            
            if (cmpne:boolean(var_5_1CA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_148_0 = stack_1EA_0 = stack_249_0 = stack_2E9_0 = stack_33D_0 = var_3_1C9:byte[]
            goto(Label_0163)
        }
        
        var_0_226 = and:int(var_0_226:int, ldc:int(-1970751139))
        Label_0705:
        
        while (cmpne:boolean(and:int(var_0_226:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_226 = and:int(var_0_226:int, ldc:int(2044694829))
                goto(Label_0460)
            }
            
            var_0_226 = and:int(var_0_226:int, ldc:int(2130668996))
            var_5_1CA = add:int(var_5_1CA:int, ldc:int(-1))
            expr_2E9 = loadelement:byte(stack_2E9_0:byte[], var_5_1CA:int)
            storeelement:byte(var_3_1C9:byte[], var_5_1CA:int, xor:int(or:int(and:int(shl:int(expr_2E9:byte, and:int(ldc:int(516), ldc:int(16438))), ldc:int(-16)), and:int(shr:int(expr_2E9:byte[expected:int], xor:int(ldc:int(2131), ldc:int(2135))), ldc:int(15))), ldc:int(78)))
            
            if (cmpne:boolean(var_5_1CA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_148_0 = stack_1EA_0 = stack_249_0 = stack_2E9_0 = stack_33D_0 = var_3_1C9:byte[]
            goto(Label_0220)
        }
        
        goto(Label_0537)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_226 = and:int(var_0_226:int, ldc:int(454427783))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_226:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_226:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_226 = and:int(var_0_226:int, ldc:int(-17140505))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1C4 = expr_9E:int
                var_3_1C9 = newarray:byte[](byte.class, expr_9E:int)
                var_5_1CA = expr_9E:int
                goto(Label_0537)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_226:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_226 = and:int(var_0_226:int, ldc:int(-1151532458))
        }
        else {
            if (cmpne:boolean(and:int(var_0_226:int, ldc:int(262144)), ldc:int(0))) {
                var_0_226 = and:int(var_0_226:int, ldc:int(1546263944))
                goto(Label_0115)
            }
            
            var_0_226 = and:int(var_0_226:int, ldc:int(-26233540))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_1C4 = expr_D7:int
                var_3_1C9 = newarray:byte[](byte.class, expr_D7:int)
                var_5_1CA = expr_D7:int
                goto(Label_0705)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_226 = and:int(var_0_226:int, ldc:int(1852134407))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_226 = and:int(var_0_226:int, ldc:int(-737247636))
                goto(Label_0115)
            }
            
            var_0_226 = and:int(var_0_226:int, ldc:int(-9536311))
            var_2_10E = stack_10E_0:byte[]
            expr_112 = add:int(arraylength:int(stack_110_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_32B = newarray:byte[](byte.class, expr_112:int)
                var_5_32C = expr_112:int
                
                loop {
                    var_0_226 = and:int(var_0_226:int, ldc:int(2138010843))
                    var_5_32C = add:int(var_5_32C:int, ldc:int(-1))
                    storeelement:byte(var_3_32B:byte[], var_5_32C:int, add:int(shl:int(loadelement:byte(stack_33D_0:byte[], var_5_32C:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_10E:byte[], add:int(var_5_32C:int, xor:int(ldc:int(1152), ldc:int(1153)))), ldc:int(4)), xor:int(ldc:int(16525), ldc:int(16514)))))
                    
                    if (cmpne:boolean(var_5_32C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_148_0 = stack_1EA_0 = stack_249_0 = stack_2E9_0 = stack_33D_0 = var_3_32B:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_226 = and:int(var_0_226:int, ldc:int(-1398264434))
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_226:int, ldc:int(4)), ldc:int(0))) {
            var_0_226 = and:int(var_0_226:int, ldc:int(378610296))
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_226:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1BD_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(22915), ldc:int(583)))
            expr_166 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4746), ldc:int(4745)))
            storeelement:String(expr_166:String[], xor:int(ldc:int(8305), ldc:int(8307)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(2770), ldc:int(-2771)), and:int(ldc:int(27911), ldc:int(564))))
            storeelement:String(expr_166:String[], and:int(ldc:int(1633), ldc:int(4109)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(5188), ldc:int(16799)), and:int(ldc:int(9239), ldc:int(16623))))
            storeelement:String(expr_166:String[], and:int(ldc:int(-13789), ldc:int(8668)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(13343), ldc:int(903)), xor:int(ldc:int(6277), ldc:int(6293))))
            putstatic:String[](\u3504\ud158\u760c\u6d99\u9a18::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_166:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_671 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_67C : int
        
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
        var_3_671 = and:int(ldc:int(690453267), ldc:int(-1138758729))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3504\ud158\u760c\u6d99\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_671 = and:int(var_3_671:int, ldc:int(1476341635))
            var_5_80 = and:int(ldc:int(28784), ldc:int(-28789))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3347), ldc:int(-3348)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_671:int, ldc:int(2118470444))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(16409), ldc:int(16408)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(24641), ldc:int(24640)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_671 = and:int(var_3_D9:int, ldc:int(1682378511))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(3083), ldc:int(8321)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1286700849))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1790219044))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1170159056))
                        goto(Label_0562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-508453911))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0562)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1393343257))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(2062366621))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(547034923))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-781683410))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(379714431))
                        var_11_EA = and:int(ldc:int(18857), ldc:int(-18862))
                        goto(Label_1517)
                    }
                    
                    Label_0562:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(405452654))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1480239996))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(125895115))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1208247908))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1342804744))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1762641324))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1765826970))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(2078759717))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0712:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1017862332))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(546355695))
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(28334498))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1286529139))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1264932236))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(73865862))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-806455155))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1956778008))
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1862642438))
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1010709540))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(2129), ldc:int(2128))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0965:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1944613589))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-37030381))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(2134648355))
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-851861758))
                        var_11_EA = and:int(ldc:int(5688), ldc:int(-5946))
                    }
                    
                    Label_1115:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1828739342))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-457641591))
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1671793780))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1978866537))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1383)
                            }
                        }
                    }
                    
                    Label_1230:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(741159481))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(456735504))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1115)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-399448400))
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1747026138))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(365908521))
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1965243218))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(743522280))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                        goto(Label_1517)
                    }
                    
                    Label_1383:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1158101950))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1179922115))
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(2129509141))
                        goto(Label_0562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(883411404))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_671 = and:int(var_3_671:int, ldc:int(2031721420))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67C = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-800472937))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1368953483))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-2123777933))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-882608470))
                        goto(Label_0712)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1439182925))
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-317236460))
                        var_17_67C = add:int(var_16_118:int, and:int(ldc:int(16421), ldc:int(1155)))
                        looporswitchbreak()
                    }
                }
                
                var_3_671 = and:int(var_3_671:int, ldc:int(1505434447))
                
                if (cmple:boolean(var_5_80 = var_17_67C:int, sub:int(var_6_87:int, and:int(ldc:int(2057), ldc:int(8325))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
            var_3_671 = and:int(var_3_671:int, ldc:int(2082783422))
            goto(Label_0108)
        }
    }
}
