public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T> {
    public void \ubcb0\u51fa\u8350\ub171\u392e\uc2e8() {
        var_3_6F : float
        var_4_77 : int
        
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
            invokespecial:\u8cae\ub83f\u8c8a\u7c6b\u8389\u7d52(\u8cae\ub83f\u8c8a\u7c6b\u8389\u7d52::<init>, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>)
            putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>, newarray:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e.class, getstatic:int(\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\ud158\u67d0\ud523\ucfaf\ub6ab\ub83f)))
            var_3_6F = ldc:float(-3.5f)
            var_4_77 = and:int(ldc:int(-397), ldc:int(396))
            
            while (cmplt:boolean(var_4_77:int, arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>)))) {
                invokevirtual:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, storeelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>), var_4_77:int, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\uc3e3\u3504\u52d3\u5fe1\u9af2\u8709), var_4_77:int), and:int(ldc:int(8713), ldc:int(-8714))), loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\uc3e3\u3504\u52d3\u5fe1\u9af2\u8709), var_4_77:int), xor:int(ldc:int(27648), ldc:int(27649))))), mul:float(i2f:float(loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), and:int(ldc:int(7104), ldc:int(-7137)))), ldc:float(-0.5f)), ldc:float(0.0f), mul:float(i2f:float(loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), xor:int(ldc:int(1352), ldc:int(1354)))), ldc:float(-0.5f)), i2f:float(loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), and:int(ldc:int(18983), ldc:int(-23080)))), i2f:float(loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), and:int(ldc:int(77), ldc:int(11041)))), i2f:float(loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), xor:int(ldc:int(1153), ldc:int(1155)))))
                invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\uc229\uc910\u6c52\u7043\u624e\ufcaf, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>), var_4_77:int), ldc:float(0.0f), i2f:float(sub:int(ldc:int(24), loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), xor:int(ldc:int(-16350), ldc:int(-16349))))), var_3_6F:float)
                
                if (cmplt:boolean(var_4_77:int, sub:int(arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>)), and:int(ldc:int(1941), ldc:int(18443))))) {
                    var_3_6F = add:float(var_3_6F:float, mul:float(i2f:float(add:int(loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), var_4_77:int), and:int(ldc:int(2594), ldc:int(25875))), loadelement:int(loadelement:int[](getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1), add:int(var_4_77:int, and:int(ldc:int(1), ldc:int(4243)))), xor:int(ldc:int(12801), ldc:int(12803))))), ldc:float(0.5f)))
                }
                
                inc:int(var_4_77, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e> \uc87f\u3711\u183a\u156b\u5fe1\uf9c5() {
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
            return:Iterable<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>(invokestatic:List<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>[expected:Iterable<\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e>](Arrays::asList, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>)))
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(T extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, float p1, float p2, float p3, float p4, float p5) {
        var_7_61 : int
        var_9_6A : int
        
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
            var_7_61 = and:int(ldc:int(-1880622929), ldc:int(-1075361875))
            var_9_6A = and:int(ldc:int(-589), ldc:int(588))
            
            loop {
                var_7_61 = and:int(var_7_61:int, ldc:int(-539653971))
                
                if (cmpge:boolean(var_9_6A:int, arraylength:int(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>)))) {
                    looporswitchbreak()
                }
                
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9033\u67e9\u3d64\ufe34\u12cb\u3dd3, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>), var_9_6A:int), mul:float(mul:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, add:float(mul:float(p3:float, ldc:float(0.9f)), mul:float(mul:float(i2f:float(var_9_6A:int), ldc:float(0.15f)), ldc:float(3.1415927f)))), ldc:float(3.1415927f)), ldc:float(0.01f)), i2f:float(add:int(and:int(ldc:int(1), ldc:int(25157)), invokestatic:int(Math::abs, sub:int(var_9_6A:int, and:int(ldc:int(18954), ldc:int(4182))))))))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u72f1\u5245\u12b2\u873d\u2dcc\uae5d, loadelement:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e[](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u51b2\u7c6b\uc87f\uf9c5\ufcaf\u759a, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>), var_9_6A:int), mul:float(mul:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, add:float(mul:float(p3:float, ldc:float(0.9f)), mul:float(mul:float(i2f:float(var_9_6A:int), ldc:float(0.15f)), ldc:float(3.1415927f)))), ldc:float(3.1415927f)), ldc:float(0.1f)), i2f:float(invokestatic:int(Math::abs, sub:int(var_9_6A:int, xor:int(ldc:int(28928), ldc:int(28930)))))))
                inc:int(var_9_6A, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_67 : int[][] [generated]
        stack_AB_1 : int [generated]
        expr_79 : int[] [generated]
        stack_E8_1 : int [generated]
        expr_BB : int[] [generated]
        stack_12A_1 : int [generated]
        expr_F8 : int[] [generated]
        stack_16C_1 : int [generated]
        expr_13A : int[] [generated]
        expr_177 : int[][] [generated]
        stack_1AB_1 : int [generated]
        expr_189 : int[] [generated]
        stack_1DD_1 : int [generated]
        expr_1BB : int[] [generated]
        stack_20A_1 : int [generated]
        expr_1ED : int[] [generated]
        stack_237_1 : int [generated]
        expr_21A : int[] [generated]
        
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
            expr_67 = newarray:int[][](int[].class, and:int(ldc:int(3348), ldc:int(25262)))
            stack_AB_1 = and:int(ldc:int(19152), ldc:int(-19153))
            expr_79 = newarray:int[](int.class, xor:int(ldc:int(520), ldc:int(523)))
            storeelement:int(expr_79:int[], and:int(ldc:int(22089), ldc:int(-22090)), and:int(ldc:int(8204), ldc:int(581)))
            storeelement:int(expr_79:int[], and:int(ldc:int(643), ldc:int(16437)), xor:int(ldc:int(8717), ldc:int(8718)))
            storeelement:int(expr_79:int[], xor:int(ldc:int(24643), ldc:int(24641)), xor:int(ldc:int(4872), ldc:int(4874)))
            storeelement:int[](expr_67:int[][], stack_AB_1:int, expr_79:int[])
            stack_E8_1 = and:int(ldc:int(1193), ldc:int(20993))
            expr_BB = newarray:int[](int.class, xor:int(ldc:int(8964), ldc:int(8967)))
            storeelement:int(expr_BB:int[], and:int(ldc:int(-25393), ldc:int(24880)), ldc:int(6))
            storeelement:int(expr_BB:int[], and:int(ldc:int(4897), ldc:int(16515)), xor:int(ldc:int(2055), ldc:int(2051)))
            storeelement:int(expr_BB:int[], xor:int(ldc:int(20497), ldc:int(20499)), xor:int(ldc:int(270), ldc:int(267)))
            storeelement:int[](expr_67:int[][], stack_E8_1:int, expr_BB:int[])
            stack_12A_1 = and:int(ldc:int(163), ldc:int(578))
            expr_F8 = newarray:int[](int.class, and:int(ldc:int(30723), ldc:int(771)))
            storeelement:int(expr_F8:int[], and:int(ldc:int(22736), ldc:int(-22737)), xor:int(ldc:int(10561), ldc:int(10562)))
            storeelement:int(expr_F8:int[], and:int(ldc:int(3275), ldc:int(513)), xor:int(ldc:int(2466), ldc:int(2465)))
            storeelement:int(expr_F8:int[], xor:int(ldc:int(-32638), ldc:int(-32640)), xor:int(ldc:int(5120), ldc:int(5121)))
            storeelement:int[](expr_67:int[][], stack_12A_1:int, expr_F8:int[])
            stack_16C_1 = xor:int(ldc:int(41), ldc:int(42))
            expr_13A = newarray:int[](int.class, xor:int(ldc:int(8216), ldc:int(8219)))
            storeelement:int(expr_13A:int[], and:int(ldc:int(-21257), ldc:int(21256)), xor:int(ldc:int(4224), ldc:int(4225)))
            storeelement:int(expr_13A:int[], and:int(ldc:int(2049), ldc:int(1033)), and:int(ldc:int(12290), ldc:int(18531)))
            storeelement:int(expr_13A:int[], and:int(ldc:int(522), ldc:int(28678)), and:int(ldc:int(2637), ldc:int(5121)))
            storeelement:int[](expr_67:int[][], stack_16C_1:int, expr_13A:int[])
            putstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1, expr_67:int[][])
            expr_177 = newarray:int[][](int[].class, xor:int(ldc:int(258), ldc:int(262)))
            stack_1AB_1 = and:int(ldc:int(7702), ldc:int(-7991))
            expr_189 = newarray:int[](int.class, and:int(ldc:int(2178), ldc:int(8994)))
            storeelement:int(expr_189:int[], and:int(ldc:int(12969), ldc:int(-12970)), and:int(ldc:int(27879), ldc:int(-28392)))
            storeelement:int(expr_189:int[], and:int(ldc:int(17649), ldc:int(6145)), and:int(ldc:int(9537), ldc:int(-13654)))
            storeelement:int[](expr_177:int[][], stack_1AB_1:int, expr_189:int[])
            stack_1DD_1 = and:int(ldc:int(1027), ldc:int(25201))
            expr_1BB = newarray:int[](int.class, and:int(ldc:int(670), ldc:int(5154)))
            storeelement:int(expr_1BB:int[], and:int(ldc:int(-22463), ldc:int(21914)), and:int(ldc:int(8588), ldc:int(-8589)))
            storeelement:int(expr_1BB:int[], xor:int(ldc:int(2092), ldc:int(2093)), and:int(ldc:int(19101), ldc:int(5125)))
            storeelement:int[](expr_177:int[][], stack_1DD_1:int, expr_1BB:int[])
            stack_20A_1 = and:int(ldc:int(2050), ldc:int(782))
            expr_1ED = newarray:int[](int.class, and:int(ldc:int(3), ldc:int(70)))
            storeelement:int(expr_1ED:int[], and:int(ldc:int(22030), ldc:int(-24271)), and:int(ldc:int(-29560), ldc:int(13141)))
            storeelement:int(expr_1ED:int[], xor:int(ldc:int(65), ldc:int(64)), ldc:int(14))
            storeelement:int[](expr_177:int[][], stack_20A_1:int, expr_1ED:int[])
            stack_237_1 = and:int(ldc:int(16451), ldc:int(3595))
            expr_21A = newarray:int[](int.class, xor:int(ldc:int(896), ldc:int(898)))
            storeelement:int(expr_21A:int[], and:int(ldc:int(18985), ldc:int(-23082)), and:int(ldc:int(-2376), ldc:int(2374)))
            storeelement:int(expr_21A:int[], and:int(ldc:int(8323), ldc:int(18249)), ldc:int(18))
            storeelement:int[](expr_177:int[][], stack_237_1:int, expr_21A:int[])
            putstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\uc3e3\u3504\u52d3\u5fe1\u9af2\u8709, expr_177:int[][])
            putstatic:int(\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\ud158\u67d0\ud523\ucfaf\ub6ab\ub83f, arraylength:int(getstatic:int[][](\ubcb0\u51fa\u8350\ub171\u392e\uc2e8::\u0c95\u6c56\u62da\uae87\u600f\ubff1)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4975\u6198\u516c\ubcb0\u7049\u4f4a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(-1030058969), ldc:int(-770001025))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubcb0\u51fa\u8350\ub171\u392e\uc2e8<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-981347628))
        }
        else {
            var_3_634 = and:int(var_3_634:int, ldc:int(-1630339597))
            var_5_85 = and:int(ldc:int(10635), ldc:int(-11660))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3207), ldc:int(-11416)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_634:int, ldc:int(-1019818185))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(2049), ldc:int(25137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(9995), ldc:int(193)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_DA:int, ldc:int(-1409893253))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(4248), ldc:int(4249)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(738240847))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1306601701))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(616922761))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(366236871))
                    }
                    else {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1946222937))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1129728650))
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(732388622))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(835193346))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1323094765))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-948452185))
                            var_11_EB = and:int(ldc:int(-15325), ldc:int(9164))
                            goto(Label_1473)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-220390200))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1598700770))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1314919945))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(794037546))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1483078952))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-157878289))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1443852951))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1624416597))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1195988264))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1555166336))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1050971722))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-434635601))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1628713608))
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-148264701))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(512838350))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2013331461))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(11285), ldc:int(16385))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(428756057))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1509301868))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-487910170))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(625653200))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(598406335))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1145715396))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1386602792))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1745635345))
                        var_11_EB = and:int(ldc:int(9323), ldc:int(-9324))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(456839818))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(2114784368))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(384037789))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-99326220))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1230118611))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2024083977))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1318)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-199328678))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(766816841))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(10416413))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-338294185))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-311847754))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1904826949))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1473)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1318:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-601388466))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-104661015))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1349831317))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(561748669))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1780577740))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-426958297))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-978258593))
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1346468421))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-917650282))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1119607009))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(78012330))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-847862786))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2017467345))
                        var_17_63F = add:int(var_16_119:int, xor:int(ldc:int(4100), ldc:int(4101)))
                        looporswitchbreak()
                    }
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-879569669))
                
                if (cmple:boolean(var_5_85 = var_17_63F:int, sub:int(var_6_8C:int, and:int(ldc:int(17953), ldc:int(5))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(1681472156))
            goto(Label_0106)
        }
    }
}
