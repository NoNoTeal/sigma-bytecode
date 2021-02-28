public class \ub113\uc4d2\u183a\u527a\u6435.\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E> {
    public void \u7330\u120d\ua3b4\u183a\u72f1\u4f4a(E[] p0) {
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
            invokespecial:AbstractList(AbstractList::<init>, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>)
            putfield:Object[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\u7873\u836c\uafe7\u446c\u67e9\u5d20, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>, p0:E[][expected:Object[]])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public E get(int p0) {
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
        
        if (cmplt:boolean(p0:int, arraylength:int(getfield:Object[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\u7873\u836c\uafe7\u446c\u67e9\u5d20, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>)))) {
            return:E(loadelement:Object[expected:E](getfield:Object[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\u7873\u836c\uafe7\u446c\u67e9\u5d20, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>), p0:int))
        }
        
        athrow(initobject:IndexOutOfBoundsException(IndexOutOfBoundsException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\ufcaf\ua562\ud12e\u7873\u3e2a\uceb8), and:int(ldc:int(9300), ldc:int(-11357)))), p0:int), loadelement:String(getstatic:String[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\ufcaf\ua562\ud12e\u7873\u3e2a\uceb8), xor:int(ldc:int(-30672), ldc:int(-30671)))), invokevirtual:int(\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>::size, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>)))))
    }
    
    public int size() {
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
            return:int(arraylength:int(getfield:Object[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\u7873\u836c\uafe7\u446c\u67e9\u5d20, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19A : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1AC_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        stack_26D_0 : byte[] [generated]
        stack_2C2_0 : byte[] [generated]
        var_4_187 : int
        var_3_18C : byte[]
        var_5_18D : int
        var_0_1A2 : int
        expr_1AC : byte [generated]
        stack_1F0_2 : byte [generated]
        stack_1CF_0 : byte [generated]
        expr_8E : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_25C : byte[]
        var_5_25D : int
        expr_FE : int [generated]
        var_3_2B1 : byte[]
        var_5_2B2 : int
        expr_2C5 : byte [generated]
        var_3_132 : String
        stack_180_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_19A = and:int(ldc:int(1745608213), ldc:int(-1287004354))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_233_0 = stack_26D_0 = stack_2C2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("iiFwhV9tU1ITr122MXYlww==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_187 = expr_6B:int
        var_3_18C = newarray:byte[](byte.class, expr_6B:int)
        var_5_18D = expr_6B:int
        Label_0399:
        
        while (cmpne:boolean(and:int(var_0_19A:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_19A:int, ldc:int(-1337330561))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_1AC = stack_1F0_2 = loadelement(stack_1AC_0, var_5_18D)
            
            if (cmplt:boolean(add:int(add:int(var_5_18D:int, ldc:int(3)), neg:int(var_4_187:int)), ldc:int(0))) {
                stack_1F0_2 = stack_1CF_0 = add:byte(expr_1AC:byte, loadelement:byte(var_3_18C:byte[], add:int(var_5_18D:int, ldc:int(3))))
                goto(Label_0479)
            }
            
            Label_0441:
            
            if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-229835527))
            }
            else {
                var_0_1A2 = and:int(var_0_1A2:int, ldc:int(1764425558))
                stack_1F0_2 = stack_1CF_0 = add:byte(expr_1AC:byte, ldc:byte(3))
            }
            
            Label_0479:
            
            if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0441)
            }
            
            var_0_19A = and:int(var_0_1A2:int, ldc:int(1669323924))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, stack_1F0_2:byte)
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_233_0 = stack_26D_0 = stack_2C2_0 = var_3_18C:byte[]
            goto(Label_0112)
        }
        
        var_0_19A = and:int(var_0_19A:int, ldc:int(-1764612912))
        Label_0534:
        
        while (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(-1180115107))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, xor:byte(loadelement:byte(stack_233_0:byte[], var_5_18D:int), ldc:byte(70)))
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_233_0 = stack_26D_0 = stack_2C2_0 = var_3_18C:byte[]
            goto(Label_0147)
        }
        
        var_0_19A = and:int(var_0_19A:int, ldc:int(-530440445))
        goto(Label_0399)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(-15870921))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_187 = expr_8E:int
                var_3_18C = newarray:byte[](byte.class, expr_8E:int)
                var_5_18D = expr_8E:int
                goto(Label_0534)
            }
        }
        
        Label_0147:
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(4096)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(456614828))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(4)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(1833021878))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(646577237))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_25C = newarray:byte[](byte.class, expr_C3:int)
                var_5_25D = expr_C3:int
                
                loop {
                    var_0_19A = and:int(var_0_19A:int, ldc:int(-1520896322))
                    var_5_25D = add:int(var_5_25D:int, ldc:int(-1))
                    storeelement:byte(var_3_25C:byte[], var_5_25D:int, add:int(shl:int(loadelement:byte(stack_26D_0:byte[], var_5_25D:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_25D:int, and:int(ldc:int(2119), ldc:int(12337)))), ldc:int(7)), xor:int(ldc:int(12418), ldc:int(12419)))))
                    
                    if (cmpne:boolean(var_5_25D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_233_0 = stack_26D_0 = stack_2C2_0 = var_3_25C:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(8192)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(1827058703))
        }
        else {
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(2069857293))
                goto(Label_0147)
            }
            
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(16384)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(1804499616))
                goto(Label_0112)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(-519119620))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2B1 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2B2 = expr_FE:int
                
                loop {
                    var_0_19A = and:int(var_0_19A:int, ldc:int(-188096930))
                    var_5_2B2 = add:int(var_5_2B2:int, ldc:int(-1))
                    expr_2C5 = add:byte(loadelement:byte(stack_2C2_0:byte[], var_5_2B2:int), ldc:byte(37))
                    storeelement:byte(var_3_2B1:byte[], var_5_2B2:int, or:int(and:int(shl:int(expr_2C5:byte, and:int(ldc:int(6), ldc:int(21124))), ldc:int(-16)), and:int(shr:int(expr_2C5:byte[expected:int], and:int(ldc:int(2676), ldc:int(12))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2B2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_233_0 = stack_26D_0 = stack_2C2_0 = var_3_2B1:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0147)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(32768)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(421805814))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_180_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32735), ldc:int(-32733)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16770), ldc:int(8778)))
        storeelement:String(expr_144:String[], xor:int(ldc:int(10312), ldc:int(10313)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-21750), ldc:int(21748)), and:int(ldc:int(2072), ldc:int(1036))))
        storeelement:String(expr_144:String[], and:int(ldc:int(17386), ldc:int(-17387)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(4226), ldc:int(4234)), xor:int(ldc:int(-15870), ldc:int(-15859))))
        putstatic:String[](\u7330\u120d\ua3b4\u183a\u72f1\u4f4a::\ufcaf\ua562\ud12e\u7873\u3e2a\uceb8, expr_144:String[])
    }
    
    public void \u93a2\u446c\u9033\u3a62\u61a4\ud51e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_638 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_643 : int
        
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
        var_3_638 = and:int(ldc:int(-1388315967), ldc:int(-1363452880))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7330\u120d\ua3b4\u183a\u72f1\u4f4a<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_638 = and:int(var_3_638:int, ldc:int(-1342530975))
            var_5_7D = and:int(ldc:int(-4000), ldc:int(3991))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13605), ldc:int(13604)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_638:int, ldc:int(-21340963))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-24318), ldc:int(-24317)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(10288), ldc:int(10289)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_638 = and:int(var_3_D2:int, ldc:int(-1107873850))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8224), ldc:int(8225)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1978994832))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1584090670))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-252759742))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1856974608))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1304258648))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1535925135))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(582676117))
                    }
                    else {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-566329456))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-253364077))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(597411291))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1346441225))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-2041147982))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1521845307))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1869965066))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-839508151))
                        var_11_E3 = and:int(ldc:int(-24167), ldc:int(20070))
                        goto(Label_1486)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1665969775))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1918602674))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1777072535))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1530929033))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-398336511))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1371604060))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-713918627))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-765470032))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-722801520))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1856273668))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1925473074))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1226031492))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1499641217))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-949654207))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-302053327))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(18512), ldc:int(18513))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1578114990))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1241066539))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1089442090))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1413303572))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-352154788))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1740297626))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-9913891))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-319637049))
                        var_11_E3 = and:int(ldc:int(18756), ldc:int(-23365))
                    }
                    
                    Label_1097:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1710648200))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1640773985))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(692854876))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(328689410))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1923019796))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1526984413))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1380500136))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1231:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1259211000))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(342713924))
                            goto(Label_1097)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1597296194))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(142473227))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1091110707))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1358:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-758166396))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1743903863))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(319552745))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(910103706))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-537485601))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_643 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(756896372))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1599619273))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1384215406))
                        var_17_643 = add:int(var_16_111:int, and:int(ldc:int(1037), ldc:int(4129)))
                        looporswitchbreak()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-1159547551))
                }
                
                var_3_638 = and:int(var_3_638:int, ldc:int(-1929465880))
                
                if (cmple:boolean(var_5_7D = var_17_643:int, sub:int(var_6_84:int, and:int(ldc:int(5131), ldc:int(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
            var_3_638 = and:int(var_3_638:int, ldc:int(-1220854316))
            goto(Label_0106)
        }
    }
}
