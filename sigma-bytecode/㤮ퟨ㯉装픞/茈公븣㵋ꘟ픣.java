public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8308\u516c\ube23\u3d4b\ua61f\ud523 {
    public void \u8308\u516c\ube23\u3d4b\ua61f\ud523(\u516c\u3d64\u718f\ub171\u6b5f.\ubefe\u7049\u6ec6\ub1b9\u8350\u7bad p0, java.lang.String p1, java.lang.String p2, int p3, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p4, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p5) {
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
            putfield:\ubefe\u7049\u6ec6\ub1b9\u8350\u7bad(\u8308\u516c\ube23\u3d4b\ua61f\ud523::\ub171\ua6bd\u97b7\ua6bd\u4179\u6198, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523, p0:\ubefe\u7049\u6ec6\ub1b9\u8350\u7bad)
            putfield:String(\u8308\u516c\ube23\u3d4b\ua61f\ud523::\u3504\u156b\u71ae\u3dd3\u6cfe\u8413, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523, p2:String)
            putfield:int(\u8308\u516c\ube23\u3d4b\ua61f\ud523::\u7d52\u52d3\u16f6\uc229\u7bad\uc3e3, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523, p3:int)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8308\u516c\ube23\u3d4b\ua61f\ud523::\u7006\ud523\u9a18\uff55\u516c\uafe7, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523, p4:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u8308\u516c\ube23\u3d4b\ua61f\ud523::\u3776\u51fa\u7bad\ub7dc\u3dd3\u6ec6, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523, p5:\ud12e\u946b\u97b7\u51b2\u3d64)
            invokespecial:Thread(Thread::<init>, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
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
    
    private static void lambda$\u64f2\u8c8a\u6d99\u6d99\u5f50\u12cb$2(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u385b\u7049\uae87\ub7dc\u6fb0\u8d98 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:\u385b\u7049\uae87\ub7dc\u6fb0\u8d98[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u071d\ud4fe\u47c2\u3a62\uc229\u9033$1(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u385b\u7049\uae87\ub7dc\u6fb0\u8d98 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:\u385b\u7049\uae87\ub7dc\u6fb0\u8d98[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud51e\uf995\u3e75\u69d9\u4f4a\ud523$0(net.minecraft.util.text.ITextComponent p0) {
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
    
    static {
        var_0_1CE : int
        expr_6E : int [generated]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_1E1_0 : byte[] [generated]
        stack_238_0 : byte[] [generated]
        stack_296_0 : byte[] [generated]
        var_4_1B9 : int
        var_3_1BE : byte[]
        var_5_1BF : int
        expr_1E1 : byte [generated]
        var_0_28C : int
        expr_296 : byte [generated]
        stack_2C6_2 : byte [generated]
        var_2_9D : byte[]
        expr_A1 : int [generated]
        var_3_226 : byte[]
        var_5_227 : int
        expr_C9 : int [generated]
        var_3_F8 : String
        stack_1B2_0 : String[] [generated]
        expr_10A : String[] [generated]
        
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
        var_0_1CE = and:int(ldc:int(1021112269), ldc:int(-357237048))
        expr_6E = arraylength:int(stack_9D_0 = stack_9F_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_1E1_0 = stack_238_0 = stack_296_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("f4fHvIVYoZBboHdIiFCJeGThH6REY/DcqLBkKGhMhaicUAuRkYCcC6NgVKxEiFC5QEiol2REkPyMlHAwbM0GHh64")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1B9 = expr_6E:int
        var_3_1BE = newarray:byte[](byte.class, expr_6E:int)
        var_5_1BF = expr_6E:int
        Label_0449:
        
        while (cmpne:boolean(and:int(var_0_1CE:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1CE = and:int(var_0_1CE:int, ldc:int(1035894643))
            var_5_1BF = add:int(var_5_1BF:int, ldc:int(-1))
            expr_1E1 = loadelement:byte(stack_1E1_0:byte[], var_5_1BF:int)
            storeelement:byte(var_3_1BE:byte[], var_5_1BF:int, xor:int(add:int(or:int(and:int(shl:int(expr_1E1:byte, xor:int(ldc:int(-32576), ldc:int(-32572))), ldc:int(-16)), and:int(shr:int(expr_1E1:byte[expected:int], xor:int(ldc:int(27), ldc:int(31))), ldc:int(15))), ldc:int(24)), ldc:int(35)))
            
            if (cmpne:boolean(var_5_1BF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_1E1_0 = stack_238_0 = stack_296_0 = var_3_1BE:byte[]
            goto(Label_0115)
        }
        
        var_0_1CE = and:int(var_0_1CE:int, ldc:int(-1805948918))
        Label_0639:
        
        while (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_28C = and:int(var_0_1CE:int, ldc:int(831973964))
            var_5_1BF = add:int(var_5_1BF:int, ldc:int(-1))
            expr_296 = loadelement:byte(stack_296_0:byte[], var_5_1BF:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1BF:int, ldc:int(4)), neg:int(var_4_1B9:int)), ldc:int(0))) {
                var_0_28C = and:int(var_0_28C:int, ldc:int(-421691401))
                stack_2C6_2 = add:byte(expr_296:byte, ldc:byte(4))
            }
            else {
                stack_2C6_2 = add:byte(expr_296:byte, loadelement:byte(var_3_1BE:byte[], add:int(var_5_1BF:int, ldc:int(4))))
            }
            
            var_0_1CE = and:int(var_0_28C:int, ldc:int(-1224835248))
            storeelement:byte(var_3_1BE:byte[], var_5_1BF:int, stack_2C6_2:byte)
            
            if (cmpne:boolean(var_5_1BF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_1E1_0 = stack_238_0 = stack_296_0 = var_3_1BE:byte[]
            goto(Label_0206)
        }
        
        goto(Label_0449)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_1CE:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1CE = and:int(var_0_1CE:int, ldc:int(-529325768))
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(64)), ldc:int(0))) {
            var_0_1CE = and:int(var_0_1CE:int, ldc:int(-538178540))
        }
        else {
            var_0_1CE = and:int(var_0_1CE:int, ldc:int(-352321979))
            var_2_9D = stack_9D_0:byte[]
            expr_A1 = add:int(arraylength:int(stack_9F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A1:int, ldc:int(0))) {
                var_3_226 = newarray:byte[](byte.class, expr_A1:int)
                var_5_227 = expr_A1:int
                
                loop {
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(1021144690))
                    var_5_227 = add:int(var_5_227:int, ldc:int(-1))
                    storeelement:byte(var_3_226:byte[], var_5_227:int, add:int(shl:int(loadelement:byte(stack_238_0:byte[], var_5_227:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_9D:byte[], add:int(var_5_227:int, xor:int(ldc:int(18945), ldc:int(18944)))), ldc:int(6)), xor:int(ldc:int(1062), ldc:int(1061)))))
                    
                    if (cmpne:boolean(var_5_227:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_1E1_0 = stack_238_0 = stack_296_0 = var_3_226:byte[]
            }
        }
        
        Label_0166:
        
        if (cmpne:boolean(and:int(var_0_1CE:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(16384)), ldc:int(0))) {
                var_0_1CE = and:int(var_0_1CE:int, ldc:int(2102472234))
                goto(Label_0115)
            }
            
            var_0_1CE = and:int(var_0_1CE:int, ldc:int(2090139355))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_1B9 = expr_C9:int
                var_3_1BE = newarray:byte[](byte.class, expr_C9:int)
                var_5_1BF = expr_C9:int
                goto(Label_0639)
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0166)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1CE = and:int(var_0_1CE:int, ldc:int(1638355601))
            goto(Label_0115)
        }
        
        var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1B2_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3334), ldc:int(47)))
        expr_10A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1090), ldc:int(1092)))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(3079), ldc:int(3074)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(3233), ldc:int(-19618)), and:int(ldc:int(15969), ldc:int(-16098))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(24579), ldc:int(6667)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(-26005), ldc:int(26004)), xor:boolean[expected:int](ldc:boolean(0), ldc:boolean(1))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(2053), ldc:int(26420)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(505), ldc:int(8197)), and:int(ldc:int(1034), ldc:int(10503))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(16018), ldc:int(-16019)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(18778), ldc:int(162)), and:int(ldc:int(543), ldc:int(4347))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(8202), ldc:int(1410)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-27384), ldc:int(-27373)), and:int(ldc:int(57), ldc:int(5673))))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(4896), ldc:int(4897)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(59), ldc:int(16553)), xor:int(ldc:int(1635), ldc:int(1570))))
        putstatic:String[](\u8308\u516c\ube23\u3d4b\ua61f\ud523::\u34df\u16f6\u873d\u76bc\uc3e3\u76bc, expr_10A:String[])
    }
    
    public void \u12b2\u7ce1\u4c2b\u8c8a\u64f2\u392e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BE : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_6C9 : int
        
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
        var_3_6BE = and:int(ldc:int(1013983732), ldc:int(1009180142))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8308\u516c\ube23\u3d4b\ua61f\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-73791274))
        }
        else {
            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1546018285))
            var_5_8A = and:int(ldc:int(26695), ldc:int(-30792))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7756), ldc:int(-7885)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_6BE:int, ldc:int(-1628701707))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(16400), ldc:int(16401)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(2071), ldc:int(29697)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_6BE = and:int(var_3_E2:int, ldc:int(-1649271300))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16963), ldc:int(2189)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1876610606))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-528901965))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(2065289268))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1413513051))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(155016545))
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-91263709))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0643)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(861676480))
                    }
                    else {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1074628108))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0643)
                            }
                            
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0443:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(858656046))
                        goto(Label_1599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1693062345))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(287354419))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-359577319))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-723393012))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1749676551))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(157713519))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1658421030))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-555074074))
                        var_11_F3 = and:int(ldc:int(22916), ldc:int(-31135))
                        goto(Label_1588)
                    }
                    
                    Label_0643:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1276030097))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-2022354266))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0443)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(2087415286))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(502254356))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1746645044))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1499913164))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0643)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-342169677))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1035337205))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0876:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(702592349))
                        goto(Label_1599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1079726524))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1003023777))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(2096090908))
                            goto(Label_0643)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-765168103))
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-933511253))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-562287633))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(513), ldc:int(217))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1017:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-831826812))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(177754465))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(2080446495))
                            goto(Label_0876)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-984228987))
                            goto(Label_0643)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-2131202720))
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1476735600))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1100391962))
                        var_11_F3 = and:int(ldc:int(-27255), ldc:int(19056))
                    }
                    
                    Label_1191:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(929591893))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1017)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1435610604))
                            goto(Label_0876)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0643)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0443)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(536631782))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1428)
                            }
                        }
                    }
                    
                    Label_1295:
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(919125758))
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1191)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1017)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0876)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1444194768))
                            goto(Label_0643)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-648395261))
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1567336206))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(514018791))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1588)
                    }
                    
                    Label_1428:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(10424307))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1222454903))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-814883995))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1186588616))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-961999885))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-2145108114))
                        goto(Label_0643)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1260218578))
                        loopcontinue()
                    }
                    
                    var_3_6BE = and:int(var_3_6BE:int, ldc:int(1571127277))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1588:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C9 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1599:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(675903060))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1754044068))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(697984653))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(858668077))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-2085214859))
                        goto(Label_0643)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1712362951))
                        goto(Label_0443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(489589238))
                        var_17_6C9 = add:int(var_16_121:int, and:int(ldc:int(3), ldc:int(77)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1082511377))
                
                if (cmple:boolean(var_5_8A = var_17_6C9:int, sub:int(var_6_91:int, and:int(ldc:int(10561), ldc:int(4749))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1218012706))
            goto(Label_0108)
        }
    }
}
