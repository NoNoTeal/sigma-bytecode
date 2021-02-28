public class \u51fa\u12cb\u7330\u74b1\u6c52.\ucb79\u5245\u36d3\u5bc4\u3d4b {
    public void \ucb79\u5245\u36d3\u5bc4\u3d4b(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u67e9\u7873\u97e6\u88c5\u385b p0, java.lang.String p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f p2) {
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
            putfield:\u67e9\u7873\u97e6\u88c5\u385b(\ucb79\u5245\u36d3\u5bc4\u3d4b::\ua068\ub102\u927d\u983f\u1833, this:\ucb79\u5245\u36d3\u5bc4\u3d4b, p0:\u67e9\u7873\u97e6\u88c5\u385b)
            putfield:\u8cae\uc4d2\ub18d\u647c\u718f(\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4d85\u3dd3\u983f\u7043\u97e6, this:\ucb79\u5245\u36d3\u5bc4\u3d4b, p2:\u8cae\uc4d2\ub18d\u647c\u718f)
            invokespecial:Thread(Thread::<init>, this:\ucb79\u5245\u36d3\u5bc4\u3d4b, p1:String)
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
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f lambda$\u3e75\u156b\u5140\ua61f\u61a4\ua3b4$0(com.mojang.datafixers.util.Either p0) {
        var_2_75 : int
        var_4_88 : \u8cae\uc4d2\ub18d\u647c\u718f
        var_5_94 : Iterator<\u7330\u0c95\u5f50\uc229\u8cae>
        stack_195_0 : String [generated]
        expr_17E : Object[] [generated]
        var_5_198 : String
        var_6_1C0 : \u5db4\uff55\u8d98\uf9c5\ufe34
        stack_1E0_0 : \u67e9\u7873\u97e6\u88c5\u385b [generated]
        stack_1DD_0 : String [generated]
        expr_1CF : \u5db4\uff55\u8d98\uf9c5\ufe34[] [generated]
        
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
        var_2_75 = and:int(ldc:int(1140358995), ldc:int(737410843))
        
        if (invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(Either::right, p0:Either))) {
            invokeinterface:void(Logger::error, invokestatic:Logger(\u67e9\u7873\u97e6\u88c5\u385b::\ua61f\u4f4a\uc229\ua068\u927d\u183a), loadelement:String(getstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753), and:int(ldc:int(18598), ldc:int(-27047))), invokevirtual:Object(Optional<Object>::get, invokevirtual:Optional(Either::right, p0:Either)))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u8cae\u836c\u516c\u4975\u8258::\uceb8\u600f\uc2bd\uf9c5\uc84e\u5140, invokestatic:\u8cae\u836c\u516c\u4975\u8258(\u67e9\u7873\u97e6\u88c5\u385b::\ua068\u960f\u600f\ua61f\u120d\u3c25, getfield:\u67e9\u7873\u97e6\u88c5\u385b(\ucb79\u5245\u36d3\u5bc4\u3d4b::\ua068\ub102\u927d\u983f\u1833, this:\ucb79\u5245\u36d3\u5bc4\u3d4b))))) {
                goto(Label_0196)
            }
            
            invokestatic:List(\u67e9\u7873\u97e6\u88c5\u385b::\u12b2\u4cd9\u52d3\u965f\u61a4\uf94d, getfield:\u67e9\u7873\u97e6\u88c5\u385b(\ucb79\u5245\u36d3\u5bc4\u3d4b::\ua068\ub102\u927d\u983f\u1833, this:\ucb79\u5245\u36d3\u5bc4\u3d4b), invokestatic:List<\u8389\u8350\ub171\u6b0d\u071d>(\u5f50\u92ff\ub32d\uae87\u718f::\u7e3f\u8753\ua61f\u4ab3\u3d64\u92ee, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753), xor:int(ldc:int(26752), ldc:int(26753))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(20136), ldc:int(-32427)))), newarray:\u5db4\uff55\u8d98\uf9c5\ufe34[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5db4\uff55\u8d98\uf9c5\ufe34.class, and:int(ldc:int(21185), ldc:int(-23268)))))
            goto(Label_0196)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_2_75:int, ldc:int(8192)), ldc:int(0))) {
            var_2_75 = and:int(var_2_75:int, ldc:int(-2092812497))
        }
        else {
            var_4_88 = checkcast:\u8cae\uc4d2\ub18d\u647c\u718f(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f.class, invokevirtual:\u8cae\uc4d2\ub18d\u647c\u718f(Optional<\u8cae\uc4d2\ub18d\u647c\u718f>::get, invokevirtual:Optional(Either::left, p0:Either)))
            var_5_94 = invokeinterface:Iterator<\u7330\u0c95\u5f50\uc229\u8cae>(List<\u7330\u0c95\u5f50\uc229\u8cae>::iterator, getfield:List<\u7330\u0c95\u5f50\uc229\u8cae>(\u8cae\uc4d2\ub18d\u647c\u718f::\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_88:\u8cae\uc4d2\ub18d\u647c\u718f))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_5_94:Iterator)) {
                invokevirtual:void(\u8cae\u836c\u516c\u4975\u8258::\u64f2\u516c\ua61f\u92ff\u6198\u8d98, invokestatic:\u8cae\u836c\u516c\u4975\u8258(\u67e9\u7873\u97e6\u88c5\u385b::\ua068\u960f\u600f\ua61f\u120d\u3c25, getfield:\u67e9\u7873\u97e6\u88c5\u385b(\ucb79\u5245\u36d3\u5bc4\u3d4b::\ua068\ub102\u927d\u983f\u1833, this:\ucb79\u5245\u36d3\u5bc4\u3d4b)), checkcast:\u7330\u0c95\u5f50\uc229\u8cae(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7330\u0c95\u5f50\uc229\u8cae.class, invokeinterface:\u7330\u0c95\u5f50\uc229\u8cae(Iterator<\u7330\u0c95\u5f50\uc229\u8cae>::next, var_5_94:Iterator<\u7330\u0c95\u5f50\uc229\u8cae>)))
            }
            
            if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u7330\u0c95\u5f50\uc229\u8cae>(\u8cae\uc4d2\ub18d\u647c\u718f::\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_88:\u8cae\uc4d2\ub18d\u647c\u718f)))) {
                return:\u8cae\uc4d2\ub18d\u647c\u718f(var_4_88:\u8cae\uc4d2\ub18d\u647c\u718f)
            }
            
            if (invokevirtual:boolean(\u8cae\u836c\u516c\u4975\u8258::\uceb8\u600f\uc2bd\uf9c5\uc84e\u5140, invokestatic:\u8cae\u836c\u516c\u4975\u8258(\u67e9\u7873\u97e6\u88c5\u385b::\ua068\u960f\u600f\ua61f\u120d\u3c25, getfield:\u67e9\u7873\u97e6\u88c5\u385b(\ucb79\u5245\u36d3\u5bc4\u3d4b::\ua068\ub102\u927d\u983f\u1833, this:\ucb79\u5245\u36d3\u5bc4\u3d4b)))) {
                stack_195_0 = loadelement:String(getstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753), xor:int(ldc:int(-31743), ldc:int(-31741)))
                expr_17E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17185), ldc:int(8257)))
                storeelement:Object(expr_17E:Object[], and:int(ldc:int(-20150), ldc:int(19125)), loadelement:String[expected:Object](getstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753), xor:int(ldc:int(96), ldc:int(99))))
                var_5_198 = invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, stack_195_0:String, expr_17E:Object[])
                var_6_1C0 = invokestatic:\u5db4\uff55\u8d98\uf9c5\ufe34(\u5db4\uff55\u8d98\uf9c5\ufe34::\uf94d\ufcaf\u9af2\u67e9\u40a9\u4f52, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753), xor:int(ldc:int(-32746), ldc:int(-32750))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(505), ldc:int(-506)))), loadelement:String(getstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753), and:int(ldc:int(2181), ldc:int(4871))))
                stack_1E0_0 = getfield:\u67e9\u7873\u97e6\u88c5\u385b(\ucb79\u5245\u36d3\u5bc4\u3d4b::\ua068\ub102\u927d\u983f\u1833, this:\ucb79\u5245\u36d3\u5bc4\u3d4b)
                stack_1DD_0 = var_5_198:String
                expr_1CF = newarray:\u5db4\uff55\u8d98\uf9c5\ufe34[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5db4\uff55\u8d98\uf9c5\ufe34.class, and:int(ldc:int(209), ldc:int(1061)))
                storeelement:\u5db4\uff55\u8d98\uf9c5\ufe34(expr_1CF:\u5db4\uff55\u8d98\uf9c5\ufe34[], and:int(ldc:int(-31244), ldc:int(6666)), var_6_1C0:\u5db4\uff55\u8d98\uf9c5\ufe34)
                invokestatic:List(\u67e9\u7873\u97e6\u88c5\u385b::\u12b2\u4cd9\u52d3\u965f\u61a4\uf94d, stack_1E0_0:\u67e9\u7873\u97e6\u88c5\u385b, invokestatic:List<\u8389\u8350\ub171\u6b0d\u071d>(\u5f50\u92ff\ub32d\uae87\u718f::\u7e3f\u8753\ua61f\u4ab3\u3d64\u92ee, stack_1DD_0:String, expr_1CF:\u5db4\uff55\u8d98\uf9c5\ufe34[]))
            }
            
            return:\u8cae\uc4d2\ub18d\u647c\u718f(aconstnull:\u8cae\uc4d2\ub18d\u647c\u718f())
        }
        
        Label_0196:
        
        if (cmpne:boolean(and:int(var_2_75:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_75 = and:int(var_2_75:int, ldc:int(1904791162))
            goto(Label_0106)
        }
        
        return:\u8cae\uc4d2\ub18d\u647c\u718f(aconstnull:\u8cae\uc4d2\ub18d\u647c\u718f())
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_20A_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_19D : byte[]
        var_4_19E : int
        expr_91 : int [generated]
        var_5_1ED : int
        var_3_1F2 : byte[]
        var_4_1F3 : int
        expr_20A : byte [generated]
        var_0_261 : int
        expr_26B : byte [generated]
        stack_29B_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_DA : String
        stack_194_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(1599058377), ldc:int(-681425449))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_20A_0 = stack_26B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Aormuvh8dP+uOS48jD/Luew/u3gKPT77fvplErW4swZ//fqp7Oygc4z9Ojio9T3+jrZ7/Hx4Jzn+PfS7o/h8f7D+uOl6/WBxfXk44D0u+7i/ij0++3+rtGL6zCD7qHy/fIz4eTx8oX5q+7i/ij0++3+rtGL6zCD7qnk5vsz/PH5q+7i/ij0++3+rtGL6zCD7qnk5vswtff55TiA+uHx51BoU1A=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_19D = newarray:byte[](byte.class, expr_6D:int)
                var_4_19E = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-4801029))
                    var_4_19E = add:int(var_4_19E:int, ldc:int(-1))
                    storeelement:byte(var_3_19D:byte[], var_4_19E:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_19E:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_19E:int, and:int(ldc:int(161), ldc:int(73)))), ldc:int(2)), and:int(ldc:int(18879), ldc:int(575)))))
                    
                    if (cmpne:boolean(var_4_19E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_20A_0 = stack_26B_0 = var_3_19D:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(972901258))
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(2134508007))
                expr_91 = arraylength:int(stack_91_0:byte[])
                
                if (cmpeq:boolean(expr_91:int, ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_5_1ED = expr_91:int
                var_3_1F2 = newarray:byte[](byte.class, expr_91:int)
                var_4_1F3 = expr_91:int
                Label_0501:
                
                while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1999786481))
                    var_4_1F3 = add:int(var_4_1F3:int, ldc:int(-1))
                    expr_20A = loadelement:byte(stack_20A_0:byte[], var_4_1F3:int)
                    storeelement:byte(var_3_1F2:byte[], var_4_1F3:int, add:int(xor:int(or:int(and:int(shl:int(expr_20A:byte, xor:int(ldc:int(66), ldc:int(70))), ldc:int(-16)), and:int(shr:int(expr_20A:byte[expected:int], and:int(ldc:int(5124), ldc:int(2582))), ldc:int(15))), ldc:int(65)), ldc:int(79)))
                    
                    if (cmpne:boolean(var_4_1F3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_20A_0 = stack_26B_0 = var_3_1F2:byte[]
                    goto(Label_0150)
                }
                
                Label_0597:
                
                while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_261 = and:int(var_0_5F:int, ldc:int(-138395704))
                    var_4_1F3 = add:int(var_4_1F3:int, ldc:int(-1))
                    expr_26B = loadelement:byte(stack_26B_0:byte[], var_4_1F3:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1F3:int, ldc:int(4)), neg:int(var_5_1ED:int)), ldc:int(0))) {
                        var_0_261 = and:int(var_0_261:int, ldc:int(-672089610))
                        stack_29B_2 = add:byte(expr_26B:byte, ldc:byte(4))
                    }
                    else {
                        stack_29B_2 = add:byte(expr_26B:byte, loadelement:byte(var_3_1F2:byte[], add:int(var_4_1F3:int, ldc:int(4))))
                    }
                    
                    var_0_5F = and:int(var_0_261:int, ldc:int(1996771785))
                    storeelement:byte(var_3_1F2:byte[], var_4_1F3:int, stack_29B_2:byte)
                    
                    if (cmpne:boolean(var_4_1F3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_20A_0 = stack_26B_0 = var_3_1F2:byte[]
                    goto(Label_0186)
                }
                
                goto(Label_0501)
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(-676100423))
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1698828))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_1ED = expr_B5:int
                        var_3_1F2 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_1F3 = expr_B5:int
                        goto(Label_0597)
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_194_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2054), ldc:int(8391)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2919), ldc:int(8198)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(3027), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(-3565), ldc:int(1516)), xor:int(ldc:int(11), ldc:int(14))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(4657), ldc:int(-5042)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(1028), ldc:int(1025)), and:int(ldc:int(10337), ldc:int(17443))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(5281), ldc:int(5284)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(-16232), ldc:int(-16199)), xor:int(ldc:int(6554), ldc:int(6615))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(2049), ldc:int(25145)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(584), ldc:int(517)), and:int(ldc:int(19832), ldc:int(105))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(20672), ldc:int(20674)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(48), ldc:int(88)), xor:int(ldc:int(320), ldc:int(448))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(14692), ldc:int(143)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(25732), ldc:int(384)), and:int(ldc:int(443), ldc:int(10470))))
            putstatic:String[](\ucb79\u5245\u36d3\u5bc4\u3d4b::\u4c2b\u67d0\u72f1\u5fe1\u8753, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5db4\ud7e8\u6cfe\ucfaf\ufcaf\ucb79(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_674 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67F : int
        
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
        var_3_674 = and:int(ldc:int(926567506), ldc:int(-1254254657))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\u5245\u36d3\u5bc4\u3d4b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(1109572085))
        }
        else {
            var_3_674 = and:int(var_3_674:int, ldc:int(905662366))
            var_5_8A = and:int(ldc:int(-16177), ldc:int(16160))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2595), ldc:int(-2596)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_674:int, ldc:int(-154223274))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(195), ldc:int(14353)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2333), ldc:int(161)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_674 = and:int(var_3_DA:int, ldc:int(-1260522029))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(129), ldc:int(4687)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1906152737))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-124345520))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1995997832))
                        goto(Label_0739)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1516637708))
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-24441178))
                    }
                    else {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1546250139))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-396484366))
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(357181621))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1670373478))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1359561465))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1760588101))
                        goto(Label_0739)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1664284346))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-596089186))
                        var_11_EB = and:int(ldc:int(-4838), ldc:int(4836))
                        goto(Label_1530)
                    }
                    
                    Label_0597:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1696206630))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1502798544))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2146734207))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1031581988))
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-479147787))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-322774052))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-176382313))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0739:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2124126781))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2009512728))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1064548536))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1255162626))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1130191481))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1195790781))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(377637973))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0739)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1464125958))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1262905678))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(29073), ldc:int(1573))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0978:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1284009721))
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1977561412))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-75568586))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0739)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1349188130))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1232466409))
                        var_11_EB = and:int(ldc:int(-1716), ldc:int(1713))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1065753087))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-123964160))
                            goto(Label_0978)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(205824734))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0739)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-318853142))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1626593922))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1404)
                            }
                        }
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1512221450))
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-88964941))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-915313366))
                            goto(Label_0978)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1393744481))
                            goto(Label_0739)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(918243517))
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(362585938))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1530)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1404:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-993540250))
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-566795587))
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0739)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1461461329))
                        loopcontinue()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(1551746451))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1530:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1541:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(422212739))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(136493717))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0739)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1690709350))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1126183782))
                        var_17_67F = add:int(var_16_119:int, and:int(ldc:int(16471), ldc:int(3593)))
                        looporswitchbreak()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-1067198333))
                }
                
                var_3_674 = and:int(var_3_674:int, ldc:int(-709190178))
                
                if (cmple:boolean(var_5_8A = var_17_67F:int, sub:int(var_6_91:int, and:int(ldc:int(16911), ldc:int(129))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
