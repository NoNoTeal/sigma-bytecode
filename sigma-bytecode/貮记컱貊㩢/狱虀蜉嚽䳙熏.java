public final class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T> {
    public void \u72f1\u8640\u8709\u56bd\u4cd9\u718f(java.lang.String p0, java.util.List<T> p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u69d9\ub32d\u5245\ub171\u8389\ub83f p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u69d9\ub32d\u5245\ub171\u8389\ub83f p3) {
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
        invokespecial:\u3776\ufe34\ubff1\u6cfe\u0b8e\u6c52(\u3776\ufe34\ubff1\u6cfe\u0b8e\u6c52::<init>, this:\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T>, p2:\u69d9\ub32d\u5245\ub171\u8389\ub83f, p3:\u69d9\ub32d\u5245\ub171\u8389\ub83f)
        putfield:String(\u72f1\u8640\u8709\u56bd\u4cd9\u718f::\u3dd3\ubded\ub70c\u9a18\u92ee\u4e72, this:\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T>, p0:String)
        
        if (logicaland:boolean(cmpne:boolean(p1:List<T>, aconstnull:List<T>()), cmpne:boolean(invokeinterface:int(List::size, p1:List), and:int(ldc:int(18706), ldc:int(5155))))) {
            athrow(initobject:\uafe7\u8389\u76bc\u4975\ucb79\u3c25(\uafe7\u8389\u76bc\u4975\ucb79\u3c25::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u72f1\u8640\u8709\u56bd\u4cd9\u718f::\u836c\u624e\u71ae\u9af2\u8753\ufcaf), and:int(ldc:int(-16973), ldc:int(16972)))), invokestatic:String(String::valueOf, invokeinterface:int(List<E>::size, p1:List<T>))))))
        }
        
        putfield:List<T>(\u72f1\u8640\u8709\u56bd\u4cd9\u718f::\u88c5\u93a2\u6fb0\u4f4a\u5db4\u51b2, this:\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T>, p1:List<T>)
    }
    
    public java.lang.String \ub70c\uafe7\uf995\ud217\uae5d\u6c52() {
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
            return:String(getfield:String(\u72f1\u8640\u8709\u56bd\u4cd9\u718f::\u3dd3\ubded\ub70c\u9a18\u92ee\u4e72, this:\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \u98a4\u3a62\u4f4a\u946b\ud36e\uc229() {
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
            return:List<T>(getfield:List<T>(\u72f1\u8640\u8709\u56bd\u4cd9\u718f::\u88c5\u93a2\u6fb0\u4f4a\u5db4\u51b2, this:\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T>))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\ub19c\ucfaf\u72f1\ud51e\u5245\u3c25 \ua068\u7d52\u8d90\u600f\u59ec\u8640() {
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
            return:\ub19c\ucfaf\u72f1\ud51e\u5245\u3c25(getstatic:\ub19c\ucfaf\u72f1\ud51e\u5245\u3c25(\ub19c\ucfaf\u72f1\ud51e\u5245\u3c25::\ubb2b\u92ee\ucef1\ucb79\u7330\u4c04))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_17F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_191_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_263_0 : byte[] [generated]
        stack_2B8_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_191 : byte [generated]
        var_0_1EC : int
        expr_1F6 : byte [generated]
        stack_232_2 : byte [generated]
        stack_211_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_252 : byte[]
        var_5_253 : int
        expr_FE : int [generated]
        var_3_2A7 : byte[]
        var_5_2A8 : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
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
        var_0_17F = and:int(ldc:int(142793967), ldc:int(194765055))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("fAu/1rmjt7m1J6/aRLUTlzI3Uti9QKmNpbkxSNRCvZWdtzNQyBUfTlI=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpne:boolean(and:int(var_0_17F:int, ldc:int(32)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1412017665))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_191 = loadelement:byte(stack_191_0:byte[], var_5_172:int)
            storeelement:byte(var_3_171:byte[], var_5_172:int, xor:int(or:int(and:int(shl:int(expr_191:byte, xor:int(ldc:int(8518), ldc:int(8514))), ldc:int(-16)), and:int(shr:int(expr_191:byte[expected:int], xor:int(ldc:int(18978), ldc:int(18982))), ldc:int(15))), ldc:int(27)))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        var_0_17F = and:int(var_0_17F:int, ldc:int(-1542627365))
        Label_0473:
        
        while (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1EC = and:int(var_0_17F:int, ldc:int(-990432405))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_1F6 = stack_232_2 = loadelement(stack_1F6_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(2)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_232_2 = stack_211_0 = add:byte(expr_1F6:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(2))))
                goto(Label_0545)
            }
            
            Label_0515:
            
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(-2087841537))
                stack_232_2 = stack_211_0 = add:byte(expr_1F6:byte, ldc:byte(2))
            }
            
            Label_0545:
            
            if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0515)
            }
            
            var_0_17F = and:int(var_0_1EC:int, ldc:int(-762422737))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_232_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_171:byte[]
            goto(Label_0155)
        }
        
        var_0_17F = and:int(var_0_17F:int, ldc:int(1515858243))
        goto(Label_0372)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(720995669))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-839936657))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_16C = expr_96:int
                var_3_171 = newarray:byte[](byte.class, expr_96:int)
                var_5_172 = expr_96:int
                goto(Label_0473)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1266766820))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(8192)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(134360793))
        }
        else {
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(-2115800721))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_252 = newarray:byte[](byte.class, expr_CB:int)
                var_5_253 = expr_CB:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(-805384593))
                    var_5_253 = add:int(var_5_253:int, ldc:int(-1))
                    storeelement:byte(var_3_252:byte[], var_5_253:int, add:int(shl:int(loadelement:byte(stack_263_0:byte[], var_5_253:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_253:int, xor:int(ldc:int(4224), ldc:int(4225)))), ldc:int(5)), xor:int(ldc:int(-30679), ldc:int(-30674)))))
                    
                    if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_252:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(131072)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(1424065241))
        }
        else {
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(-1669258828))
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1007721109))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2A7 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2A8 = expr_FE:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(833314795))
                    var_5_2A8 = add:int(var_5_2A8:int, ldc:int(-1))
                    storeelement:byte(var_3_2A7:byte[], var_5_2A8:int, add:byte(loadelement:byte(stack_2B8_0:byte[], var_5_2A8:int), ldc:byte(22)))
                    
                    if (cmpne:boolean(var_5_2A8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_191_0 = stack_1F6_0 = stack_263_0 = stack_2B8_0 = var_3_2A7:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(8)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1737265898))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_165_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(13441), ldc:int(97)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6336), ldc:int(6337)))
            storeelement:String(expr_144:String[], and:int(ldc:int(13040), ldc:int(-13041)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(24860), ldc:int(-24863)), xor:int(ldc:int(18728), ldc:int(18688))))
            putstatic:String[](\u72f1\u8640\u8709\u56bd\u4cd9\u718f::\u836c\u624e\u71ae\u9af2\u8753\ufcaf, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u5654\u8df4\u960f\u3504\ud158\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F4 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5FF : int
        
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
        var_3_5F4 = and:int(ldc:int(-1690249568), ldc:int(-1814055290))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u72f1\u8640\u8709\u56bd\u4cd9\u718f<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1667415692))
        }
        else {
            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(330349500))
            var_5_85 = and:int(ldc:int(8347), ldc:int(-8860))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23831), ldc:int(17686)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F4:int, ldc:int(2142024321))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(655), ldc:int(26625)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2051), ldc:int(16409)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F4 = and:int(var_3_DA:int, ldc:int(1060478912))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1107), ldc:int(24841)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1153982514))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-11503350))
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-514945641))
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1728280462))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1462907498))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-303763917))
                    }
                    else {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-611282971))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-334391878))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1732598358))
                        goto(Label_1317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(2143445500))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1907282551))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-40653128))
                        var_11_EB = and:int(ldc:int(10262), ldc:int(-10263))
                        goto(Label_1427)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1979421619))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-179197534))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1239852375))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-686038048))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1317)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-748520982))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1619201120))
                        goto(Label_1065)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1995575252))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-115479821))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-2079750023))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1657290449))
                        goto(Label_1317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(586596949))
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-87918018))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1821570854))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-177552467))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(8297), ldc:int(263))
                                goto(Label_1065)
                            }
                        }
                    }
                    
                    Label_0903:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(395275702))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-72862))
                        goto(Label_1317)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1334037089))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(90959527))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-2010184805))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1084178485))
                        var_11_EB = and:int(ldc:int(-27474), ldc:int(27153))
                    }
                    
                    Label_1065:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1004895009))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0903)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1328538711))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-288833458))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1400498899))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1317)
                            }
                        }
                    }
                    
                    Label_1172:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1382761132))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(667954033))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1065)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0903)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1134746024))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1801755630))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(406736214))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1607903053))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1577028341))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1427)
                    }
                    
                    Label_1317:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(605600926))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1861819571))
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1900121738))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1427:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FF = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1438:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1635090542))
                        goto(Label_1317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1065)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(957604085))
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1002999485))
                        var_17_5FF = add:int(var_16_119:int, xor:int(ldc:int(2569), ldc:int(2568)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1465831126))
                
                if (cmple:boolean(var_5_85 = var_17_5FF:int, sub:int(var_6_8C:int, xor:int(ldc:int(2145), ldc:int(2144))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1967689218))
            goto(Label_0106)
        }
    }
}
