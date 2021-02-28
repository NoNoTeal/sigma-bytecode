public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u6d69\u67d0\u3d64\ube23\u4f52 {
    public void \u6d69\u67d0\u3d64\ube23\u4f52() {
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
            invokespecial:Object(Object::<init>, this:\u6d69\u67d0\u3d64\ube23\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
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
    
    public static \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u0800\u6c56\u47c2\ufe34\u5db4 \u64f2\u3711\uc87f\ub102\ufe34\u8df4(java.nio.file.Path p0, java.util.Collection<java.nio.file.Path> p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
        var_7_61 : int
        var_9_6C : \u0800\u6c56\u47c2\ufe34\u5db4
        var_10_205 : \u8413\u6fb0\uf9c5\u6435\u7bad
        
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
        var_7_61 = and:int(ldc:int(2105583675), ldc:int(-277893893))
        var_9_6C = initobject:\u0800\u6c56\u47c2\ufe34\u5db4(\u0800\u6c56\u47c2\ufe34\u5db4::<init>, p0:Path, p1:Collection<Path>)
        
        if (logicalnot:boolean(p2:boolean)) {
            if (logicalnot:boolean(p3:boolean)) {
                goto(Label_0198)
            }
        }
        
        Label_0114:
        
        if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0398)
        }
        
        if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(-239761142))
            goto(Label_0324)
        }
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(16)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(-1722763201))
            invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, invokevirtual:\u3e2a\ub6ab\u6d69\u983f\u965f(\u3e2a\ub6ab\u6d69\u983f\u965f::\ud36e\u0a06\ub113\u3bd6\u7ce1\u7049, initobject:\u3e2a\ub6ab\u6d69\u983f\u965f(\u3e2a\ub6ab\u6d69\u983f\u965f::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4), initobject:\u8258\u7af6\u98a4\u5d20\u8bb0[expected:\uff55\u97b7\u97b7\u5245\u71ae](\u8258\u7af6\u98a4\u5d20\u8bb0::<init>)))
        }
        
        Label_0198:
        
        if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0398)
        }
        
        if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(-579697794))
            goto(Label_0324)
        }
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_7_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0114)
            }
            
            var_7_61 = and:int(var_7_61:int, ldc:int(-907498309))
            
            if (p2:boolean) {
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u67d0\u67d0\u61a4\ub83f\u4f52(\u67d0\u67d0\u61a4\ub83f\u4f52::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(131072)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(598070191))
            goto(Label_0398)
        }
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(1024)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(-175706928))
        }
        else {
            if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(16)), ldc:int(0))) {
                var_7_61 = and:int(var_7_61:int, ldc:int(410836836))
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0114)
            }
            
            var_7_61 = and:int(var_7_61:int, ldc:int(-1988395265))
            
            if (p3:boolean) {
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u51b2\u8d98\u8df4\u392e\ub171(\u51b2\u8d98\u8df4\u392e\ub171::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                var_10_205 = initobject:\u8413\u6fb0\uf9c5\u6435\u7bad(\u8413\u6fb0\uf9c5\u6435\u7bad::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4)
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, var_10_205:\u8413\u6fb0\uf9c5\u6435\u7bad[expected:\u8cae\u3d64\u965f\u3c25\u7006])
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u99f7\u12b2\u0a06\ub171\ucb79(\u99f7\u12b2\u0a06\ub171\ucb79::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, var_10_205:\u8413\u6fb0\uf9c5\u6435\u7bad))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u836c\u3504\uc87f\ud171\u8aa5(\u836c\u3504\uc87f\ud171\u8aa5::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\ud4fe\u7bad\ud7e8\uc238\u99f7(\ud4fe\u7bad\ud7e8\uc238\u99f7::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u839e\u47c2\u647c\uceb8\uf995(\u839e\u47c2\u647c\uceb8\uf995::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u51b2\u4975\u446c\ubb2b\u4daf(\u51b2\u4975\u446c\ubb2b\u4daf::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
            }
        }
        
        Label_0324:
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(4)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(1759918122))
        }
        else {
            if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0251)
            }
            
            if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(16)), ldc:int(0))) {
                var_7_61 = and:int(var_7_61:int, ldc:int(1879614145))
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(8192)), ldc:int(0))) {
                var_7_61 = and:int(var_7_61:int, ldc:int(1708672907))
                goto(Label_0114)
            }
            
            var_7_61 = and:int(var_7_61:int, ldc:int(1601039675))
            
            if (p4:boolean) {
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u183a\uf995\u0c95\u9937\u5db4(\u183a\uf995\u0c95\u9937\u5db4::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
            }
        }
        
        Label_0398:
        
        if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0324)
        }
        
        if (cmpeq:boolean(and:int(var_7_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(65536)), ldc:int(0))) {
            var_7_61 = and:int(var_7_61:int, ldc:int(787872065))
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_7_61:int, ldc:int(8192)), ldc:int(0))) {
            if (p5:boolean) {
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u4ab3\u98a4\ud217\u873d\u40a9(\u4ab3\u98a4\ud217\u873d\u40a9::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u4daf\uc246\u4ab3\ubcb0\u6b5f(\u4daf\uc246\u4ab3\ubcb0\u6b5f::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u40a9\u3bd6\u839e\uf9c5\u071d(\u40a9\u3bd6\u839e\uf9c5\u071d::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
                invokevirtual:void(\u0800\u6c56\u47c2\ufe34\u5db4::\uc29a\u74b1\u5fe1\u7043\u7bad\u1833, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4, initobject:\u6b0d\u0b8e\u9a18\u36d3\u9a18(\u6b0d\u0b8e\u9a18\u36d3\u9a18::<init>, var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4))
            }
            
            return:\u0800\u6c56\u47c2\ufe34\u5db4(var_9_6C:\u0800\u6c56\u47c2\ufe34\u5db4)
        }
        
        goto(Label_0114)
    }
    
    private static java.nio.file.Path lambda$\u4c2b\u8350\u3a62\ub8be\uc238\u960f$0(java.lang.String p0) {
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
            return:Path(invokestatic:Path(Paths::get, p0:String, newarray:String[](java.lang.String.class, and:int(ldc:int(-18388), ldc:int(1745)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_36D : int
        expr_6E : int [generated]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_380_0 : byte[] [generated]
        stack_3D4_0 : byte[] [generated]
        stack_43B_0 : byte[] [generated]
        stack_4C0_0 : byte[] [generated]
        var_4_359 : int
        var_3_35E : byte[]
        var_5_35F : int
        expr_380 : byte [generated]
        var_0_454 : int
        expr_43B : byte [generated]
        stack_48B_2 : byte [generated]
        stack_460_0 : byte [generated]
        var_2_AD : byte[]
        expr_B1 : int [generated]
        var_3_3C2 : byte[]
        var_5_3C3 : int
        expr_DE : int [generated]
        expr_10B : int [generated]
        var_3_4AE : byte[]
        var_5_4AF : int
        var_3_139 : String
        stack_352_0 : String[] [generated]
        expr_14B : String[] [generated]
        
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
        var_0_36D = and:int(ldc:int(1752094245), ldc:int(1802959886))
        expr_6E = arraylength:int(stack_AD_0 = stack_AF_0 = stack_DC_0 = stack_DE_0 = stack_109_0 = stack_10B_0 = stack_12D_0 = stack_380_0 = stack_3D4_0 = stack_43B_0 = stack_4C0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MFdHznjuV30Rvs5tL2++l+6H3g72ljBXR8543ldNRwd/+M6ObS9vvpfuh94O9pYwV0fOeBf2teYZ7j+V5mc3P9XOljBXR854Fx+lB1fOdw/u5l/4Z7Zd3j8GB5YwV0fOeFcXhT8XH4AHtm0vb76X7ofeDvYveG+Qhr59L+YvNpdPQBcfkIa+fS/mL1Y37jjQb84teB8fdV/wD65tX4a+3rc3rncPGa5HnX9v9n7WBw8f5kcHfxfeD/YX1i9vvpe+N74fX18/Bx9/b9YXH08XHweW9uZnNz8Hjhc3Fx8f9ge2N653D+kxyR8=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_359 = expr_6E:int
        var_3_35E = newarray:byte[](byte.class, expr_6E:int)
        var_5_35F = expr_6E:int
        Label_0865:
        
        while (cmpne:boolean(and:int(var_0_36D:int, ldc:int(1024)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(1038955629))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            expr_380 = loadelement:byte(stack_380_0:byte[], var_5_35F:int)
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, add:int(or:int(and:int(shl:int(expr_380:byte, xor:int(ldc:int(-32725), ldc:int(-32721))), ldc:int(-16)), and:int(shr:int(expr_380:byte[expected:int], xor:int(ldc:int(8240), ldc:int(8244))), ldc:int(15))), ldc:int(15)))
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_109_0 = stack_10B_0 = stack_12D_0 = stack_380_0 = stack_3D4_0 = stack_43B_0 = stack_4C0_0 = var_3_35E:byte[]
            goto(Label_0115)
        }
        
        var_0_36D = and:int(var_0_36D:int, ldc:int(1984783463))
        Label_1051:
        
        while (cmpne:boolean(and:int(var_0_36D:int, ldc:int(4096)), ldc:int(0))) {
            var_0_454 = and:int(var_0_36D:int, ldc:int(-1719749015))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            expr_43B = stack_48B_2 = loadelement(stack_43B_0, var_5_35F)
            
            if (cmplt:boolean(add:int(add:int(var_5_35F:int, ldc:int(3)), neg:int(var_4_359:int)), ldc:int(0))) {
                stack_48B_2 = stack_460_0 = add:byte(expr_43B:byte, loadelement:byte(var_3_35E:byte[], add:int(var_5_35F:int, ldc:int(3))))
                goto(Label_1136)
            }
            
            Label_1096:
            
            if (cmpeq:boolean(and:int(var_0_454:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_454 = and:int(var_0_454:int, ldc:int(-823986592))
            }
            else {
                var_0_454 = and:int(var_0_454:int, ldc:int(-293642458))
                stack_48B_2 = stack_460_0 = add:byte(expr_43B:byte, ldc:byte(3))
            }
            
            Label_1136:
            
            if (cmpeq:boolean(and:int(var_0_454:int, ldc:int(1024)), ldc:int(0))) {
                var_0_454 = and:int(var_0_454:int, ldc:int(-997952893))
                goto(Label_1096)
            }
            
            var_0_36D = and:int(var_0_454:int, ldc:int(192290011))
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, stack_48B_2:byte)
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_109_0 = stack_10B_0 = stack_12D_0 = stack_380_0 = stack_3D4_0 = stack_43B_0 = stack_4C0_0 = var_3_35E:byte[]
            goto(Label_0227)
        }
        
        var_0_36D = and:int(var_0_36D:int, ldc:int(-1231250841))
        goto(Label_0865)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(8)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(1517794442))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(2)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(1399093326))
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(-399933182))
        }
        else {
            var_0_36D = and:int(var_0_36D:int, ldc:int(1249148894))
            var_2_AD = stack_AD_0:byte[]
            expr_B1 = add:int(arraylength:int(stack_AF_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B1:int, ldc:int(0))) {
                var_3_3C2 = newarray:byte[](byte.class, expr_B1:int)
                var_5_3C3 = expr_B1:int
                
                loop {
                    var_0_36D = and:int(var_0_36D:int, ldc:int(712382377))
                    var_5_3C3 = add:int(var_5_3C3:int, ldc:int(-1))
                    storeelement:byte(var_3_3C2:byte[], var_5_3C3:int, add:int(shl:int(loadelement:byte(stack_3D4_0:byte[], var_5_3C3:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_AD:byte[], add:int(var_5_3C3:int, and:int(ldc:int(28457), ldc:int(193)))), ldc:int(7)), xor:int(ldc:int(8256), ldc:int(8257)))))
                    
                    if (cmpne:boolean(var_5_3C3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_109_0 = stack_10B_0 = stack_12D_0 = stack_380_0 = stack_3D4_0 = stack_43B_0 = stack_4C0_0 = var_3_3C2:byte[]
            }
        }
        
        Label_0182:
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(-2039438046))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_36D = and:int(var_0_36D:int, ldc:int(1298552794))
            expr_DE = arraylength:int(stack_DE_0:byte[])
            
            if (cmpne:boolean(expr_DE:int, ldc:int(0))) {
                var_4_359 = expr_DE:int
                var_3_35E = newarray:byte[](byte.class, expr_DE:int)
                var_5_35F = expr_DE:int
                goto(Label_1051)
            }
        }
        
        Label_0227:
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0182)
            }
            
            if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(64)), ldc:int(0))) {
                var_0_36D = and:int(var_0_36D:int, ldc:int(-1246692630))
                goto(Label_0115)
            }
            
            var_0_36D = and:int(var_0_36D:int, ldc:int(-109119983))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_3_4AE = newarray:byte[](byte.class, expr_10B:int)
                var_5_4AF = expr_10B:int
                
                loop {
                    var_0_36D = and:int(var_0_36D:int, ldc:int(754250779))
                    var_5_4AF = add:int(var_5_4AF:int, ldc:int(-1))
                    storeelement:byte(var_3_4AE:byte[], var_5_4AF:int, xor:byte(loadelement:byte(stack_4C0_0:byte[], var_5_4AF:int), ldc:byte(60)))
                    
                    if (cmpne:boolean(var_5_4AF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_109_0 = stack_10B_0 = stack_12D_0 = stack_380_0 = stack_3D4_0 = stack_43B_0 = stack_4C0_0 = var_3_4AE:byte[]
            }
        }
        
        Label_0272:
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0227)
        }
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0182)
        }
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_352_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17104), ldc:int(17091)))
            expr_14B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1058), ldc:int(1073)))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(2056), ldc:int(2053)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4161), ldc:int(-4162)), xor:int(ldc:int(12431), ldc:int(12441))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-31702), ldc:int(-31697)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16670), ldc:int(4150)), and:int(ldc:int(21359), ldc:int(47))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(20519), ldc:int(20526)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(4700), ldc:int(4723)), xor:int(ldc:int(-32728), ldc:int(-32661))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(775), ldc:int(17495)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(12483), ldc:int(67)), and:int(ldc:int(16862), ldc:int(8284))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(9227), ldc:int(20707)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-12239), ldc:int(-12179)), xor:int(ldc:int(-32662), ldc:int(-32737))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(19538), ldc:int(4887)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4469), ldc:int(1789)), and:int(ldc:int(14753), ldc:int(199))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(926), ldc:int(913)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1123), ldc:int(1250)), xor:int(ldc:int(2149), ldc:int(2283))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(961), ldc:int(16417)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16590), ldc:int(12431)), xor:int(ldc:int(4419), ldc:int(4579))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(24735), ldc:int(4107)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(108), ldc:int(204)), and:int(ldc:int(1967), ldc:int(18623))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(17277), ldc:int(4236)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(606), ldc:int(753)), and:int(ldc:int(691), ldc:int(434))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(6), ldc:int(2)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-32579), ldc:int(-32753)), xor:int(ldc:int(18842), ldc:int(18722))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1090), ldc:int(1092)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(10342), ldc:int(10462)), and:int(ldc:int(17083), ldc:int(2495))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(318), ldc:int(7248)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(5481), ldc:int(5586)), xor:int(ldc:int(8354), ldc:int(8294))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(583), ldc:int(-584)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(5170), ldc:int(5366)), xor:int(ldc:int(-24452), ldc:int(-24396))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(8215), ldc:int(8198)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8296), ldc:int(8352)), xor:int(ldc:int(1171), ldc:int(1118))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(5145), ldc:int(5143)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(2509), ldc:int(205)), and:int(ldc:int(467), ldc:int(24787))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(2563), ldc:int(2571)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(6764), ldc:int(6847)), xor:int(ldc:int(1467), ldc:int(1377))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(24594), ldc:int(24592)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(18682), ldc:int(8410)), and:int(ldc:int(493), ldc:int(1248))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(11), ldc:int(3086)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(738), ldc:int(12785)), xor:int(ldc:int(142), ldc:int(102))))
            putstatic:String[](\u6d69\u67d0\u3d64\ube23\u4f52::\u3d4b\u5245\u74b1\u7e3f\u6c56\u8df4, expr_14B:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u0b8e\u5d20\ubff1\u7006\u9af2\u8cae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68A : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_695 : int
        
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
        var_3_68A = and:int(ldc:int(-1836224722), ldc:int(-1147180500))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\u67d0\u3d64\ube23\u4f52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(624085902))
        }
        else {
            var_3_68A = and:int(var_3_68A:int, ldc:int(2055561343))
            var_5_8A = and:int(ldc:int(-27342), ldc:int(27340))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10347), ldc:int(-10348)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68A:int, ldc:int(-1798347522))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(4364), ldc:int(4365)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1152), ldc:int(1153)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68A = and:int(var_3_DA:int, ldc:int(-88116386))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(14467), ldc:int(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(896816326))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-2074260433))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-330651134))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(911101366))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1904699455))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-960279501))
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2007967273))
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(730716996))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1580540796))
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1133179434))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1947621026))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1343337088))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-123739474))
                        var_11_EB = and:int(ldc:int(-2782), ldc:int(2653))
                        goto(Label_1545)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1311089408))
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1316826708))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-41513962))
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(736408719))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1690135483))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(2093161667))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1661110228))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0730:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1633148128))
                        goto(Label_0974)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(138243720))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-727718642))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0837:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-426273511))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-869785383))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-309700801))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1478409905))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-743522489))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1504137642))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1003322524))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(53), ldc:int(52))
                                goto(Label_1147)
                            }
                        }
                    }
                    
                    Label_0974:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1717213570))
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(239022577))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1496186199))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1261002656))
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1498231620))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(931822652))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(485847999))
                        var_11_EB = and:int(ldc:int(6850), ldc:int(-6891))
                    }
                    
                    Label_1147:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-832495907))
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1917849854))
                            goto(Label_0974)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(563486580))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1822206494))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2005264238))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1396)
                            }
                        }
                    }
                    
                    Label_1267:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(976566012))
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1490742085))
                            goto(Label_1147)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0974)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-812618486))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-919319418))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(380101356))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1545)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1396:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1628752248))
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-768070379))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2068923128))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0974)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-905744863))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1856531636))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-2052940629))
                        loopcontinue()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(904225868))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1545:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_695 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1556:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(688759915))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-423210587))
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1330176002))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-739279014))
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1994353724))
                        var_17_695 = add:int(var_16_119:int, and:int(ldc:int(18997), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(-377819753))
                }
                
                var_3_68A = and:int(var_3_68A:int, ldc:int(1910860654))
                
                if (cmple:boolean(var_5_8A = var_17_695:int, sub:int(var_6_91:int, xor:int(ldc:int(-31998), ldc:int(-31997))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
