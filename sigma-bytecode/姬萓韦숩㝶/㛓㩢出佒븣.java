public class \u59ec\u8413\u97e6\uc229\u3776.\u36d3\u3a62\u51fa\u4f52\ube23 {
    public void \u36d3\u3a62\u51fa\u4f52\ube23(java.net.DatagramPacket p0) {
        var_4_75 : byte[]
        stack_12C_0 : String [generated]
        expr_10C : Object[] [generated]
        
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
            invokespecial:Object(Object::<init>, this:\u36d3\u3a62\u51fa\u4f52\ube23)
            putfield:long(\u36d3\u3a62\u51fa\u4f52\ube23::\u97e6\u5245\uc229\u5db4\u9af2\u8bb0, this:\u36d3\u3a62\u51fa\u4f52\ube23, invokevirtual:long(Date::getTime, initobject:Date(Date::<init>)))
            var_4_75 = invokevirtual:byte[](DatagramPacket::getData, p0:DatagramPacket)
            storeelement:byte(putfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\ubf56\u385b\ua068\u5654\uc7fe\ub19c, this:\u36d3\u3a62\u51fa\u4f52\ube23, newarray:byte[](byte.class, and:int(ldc:int(17028), ldc:int(8247)))), and:int(ldc:int(-7615), ldc:int(4402)), loadelement:byte(var_4_75:byte[], and:int(ldc:int(20495), ldc:int(3235))))
            storeelement:byte(getfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\ubf56\u385b\ua068\u5654\uc7fe\ub19c, this:\u36d3\u3a62\u51fa\u4f52\ube23), and:int(ldc:int(4641), ldc:int(19665)), loadelement:byte(var_4_75:byte[], and:int(ldc:int(1028), ldc:int(4228))))
            storeelement:byte(getfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\ubf56\u385b\ua068\u5654\uc7fe\ub19c, this:\u36d3\u3a62\u51fa\u4f52\ube23), xor:int(ldc:int(1104), ldc:int(1106)), loadelement:byte(var_4_75:byte[], and:int(ldc:int(597), ldc:int(1037))))
            storeelement:byte(getfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\ubf56\u385b\ua068\u5654\uc7fe\ub19c, this:\u36d3\u3a62\u51fa\u4f52\ube23), xor:int(ldc:int(38), ldc:int(37)), loadelement:byte(var_4_75:byte[], ldc:int(6)))
            putfield:String(\u36d3\u3a62\u51fa\u4f52\ube23::\uc229\u446c\u071d\u51fa\u51b2\u8640, this:\u36d3\u3a62\u51fa\u4f52\ube23, initobject:String(String::<init>, getfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\ubf56\u385b\ua068\u5654\uc7fe\ub19c, this:\u36d3\u3a62\u51fa\u4f52\ube23), getstatic:Charset(StandardCharsets::UTF_8)))
            putfield:int(\u36d3\u3a62\u51fa\u4f52\ube23::\uc3e3\u6cfe\u7bad\u5f50\u64f2\ud51e, this:\u36d3\u3a62\u51fa\u4f52\ube23, invokevirtual:int(Random::nextInt, initobject:Random(Random::<init>), ldc:int(16777216)))
            stack_12C_0 = loadelement:String(getstatic:String[](\u36d3\u3a62\u51fa\u4f52\ube23::\u8308\ua068\ub1b9\u16f6\u7e3f\ub1b9), and:int(ldc:int(-20667), ldc:int(20664)))
            expr_10C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(10240), ldc:int(10242)))
            storeelement:Object(expr_10C:Object[], and:int(ldc:int(13398), ldc:int(-13920)), getfield:String[expected:Object](\u36d3\u3a62\u51fa\u4f52\ube23::\uc229\u446c\u071d\u51fa\u51b2\u8640, this:\u36d3\u3a62\u51fa\u4f52\ube23))
            storeelement:Object(expr_10C:Object[], xor:int(ldc:int(1553), ldc:int(1552)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u36d3\u3a62\u51fa\u4f52\ube23::\uc3e3\u6cfe\u7bad\u5f50\u64f2\ud51e, this:\u36d3\u3a62\u51fa\u4f52\ube23)))
            putfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\uc229\u3776\u4cd9\u47c2\ubb2b\u416d, this:\u36d3\u3a62\u51fa\u4f52\ube23, invokevirtual:byte[](String::getBytes, invokestatic:String(String::format, stack_12C_0:String, expr_10C:Object[]), getstatic:Charset(StandardCharsets::UTF_8)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Boolean \u8bb0\ufe34\u6c52\u983f\u0c95\u64f2(long p0) {
        var_3_5F : int
        stack_88_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(1091141033), ldc:int(2069849225))
            
            if (cmpge:boolean(getfield:long(\u36d3\u3a62\u51fa\u4f52\ube23::\u97e6\u5245\uc229\u5db4\u9af2\u8bb0, this:\u36d3\u3a62\u51fa\u4f52\ube23), p0:long)) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1239405514))
                stack_88_0 = and:int(ldc:int(4853), ldc:int(-5878))
            }
            else {
                stack_88_0 = and:int(ldc:int(18261), ldc:int(6305))
            }
            
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, stack_88_0:boolean[expected:int]))
        }
        
        goto(Label_0006)
    }
    
    public int \u47c2\uff55\u6ec6\u6ec6\u8d90\ud51e() {
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
            return:int(getfield:int(\u36d3\u3a62\u51fa\u4f52\ube23::\uc3e3\u6cfe\u7bad\u5f50\u64f2\ud51e, this:\u36d3\u3a62\u51fa\u4f52\ube23))
        }
        
        goto(Label_0006)
    }
    
    public byte[] \u392e\u6bb9\u6ec6\u4e72\u4c04\u4daf() {
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
            return:byte[](getfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\uc229\u3776\u4cd9\u47c2\ubb2b\u416d, this:\u36d3\u3a62\u51fa\u4f52\ube23))
        }
        
        goto(Label_0006)
    }
    
    public byte[] \ud4fe\u7d52\u8cae\u5fe1\u62da\u5db4() {
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
            return:byte[](getfield:byte[](\u36d3\u3a62\u51fa\u4f52\ube23::\ubf56\u385b\ua068\u5654\uc7fe\ub19c, this:\u36d3\u3a62\u51fa\u4f52\ube23))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CD : int
        expr_6B : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_174_0 : byte[] [generated]
        stack_1EE_0 : byte[] [generated]
        stack_228_0 : byte[] [generated]
        stack_293_0 : byte[] [generated]
        stack_2FC_0 : byte[] [generated]
        stack_374_0 : byte[] [generated]
        var_4_1BA : int
        var_3_1BF : byte[]
        var_5_1C0 : int
        expr_293 : byte [generated]
        var_0_314 : int
        expr_2FC : byte [generated]
        stack_340_2 : byte [generated]
        stack_317_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_217 : byte[]
        var_5_218 : int
        expr_D9 : int [generated]
        expr_10B : int [generated]
        expr_145 : int [generated]
        var_3_363 : byte[]
        var_5_364 : int
        var_3_180 : String
        stack_1B3_0 : String[] [generated]
        expr_192 : String[] [generated]
        
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
        var_0_1CD = and:int(ldc:int(-433705953), ldc:int(1297534014))
        expr_6B = arraylength:int(stack_9B_0 = stack_9D_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1EE_0 = stack_228_0 = stack_293_0 = stack_2FC_0 = stack_374_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("T2ZzhY+s6A==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BA = expr_6B:int
        var_3_1BF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C0 = expr_6B:int
        Label_0450:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_1CD = and:int(var_0_1CD:int, ldc:int(1121236358))
                goto(Label_0623)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-151007841))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, xor:byte(loadelement:byte(stack_1EE_0:byte[], var_5_1C0:int), ldc:byte(104)))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1EE_0 = stack_228_0 = stack_293_0 = stack_2FC_0 = stack_374_0 = var_3_1BF:byte[]
            goto(Label_0112)
        }
        
        var_0_1CD = and:int(var_0_1CD:int, ldc:int(1143984511))
        goto(Label_0728)
        Label_0623:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1563389951))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_293 = loadelement:byte(stack_293_0:byte[], var_5_1C0:int)
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, or:int(and:int(shl:int(expr_293:byte, xor:int(ldc:int(4096), ldc:int(4100))), ldc:int(-16)), and:int(shr:int(expr_293:byte[expected:int], and:int(ldc:int(17012), ldc:int(2439))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1EE_0 = stack_228_0 = stack_293_0 = stack_2FC_0 = stack_374_0 = var_3_1BF:byte[]
            goto(Label_0222)
        }
        
        var_0_1CD = and:int(var_0_1CD:int, ldc:int(-929421262))
        Label_0728:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            var_0_314 = and:int(var_0_1CD:int, ldc:int(1703919519))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_2FC = stack_340_2 = loadelement(stack_2FC_0, var_5_1C0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1C0:int, ldc:int(3)), neg:int(var_4_1BA:int)), ldc:int(0))) {
                stack_340_2 = stack_317_0 = add:byte(expr_2FC:byte, loadelement:byte(var_3_1BF:byte[], add:int(var_5_1C0:int, ldc:int(3))))
                goto(Label_0807)
            }
            
            Label_0777:
            
            if (cmpne:boolean(and:int(var_0_314:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_314 = and:int(var_0_314:int, ldc:int(-148493281))
                stack_340_2 = stack_317_0 = add:byte(expr_2FC:byte, ldc:byte(3))
            }
            
            Label_0807:
            
            if (cmpeq:boolean(and:int(var_0_314:int, ldc:int(2)), ldc:int(0))) {
                var_0_314 = and:int(var_0_314:int, ldc:int(-1940956299))
                goto(Label_0777)
            }
            
            var_0_1CD = and:int(var_0_314:int, ldc:int(1821297727))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, stack_340_2:byte)
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1EE_0 = stack_228_0 = stack_293_0 = stack_2FC_0 = stack_374_0 = var_3_1BF:byte[]
            goto(Label_0272)
        }
        
        var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1787467130))
        goto(Label_0623)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(16)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1363074797))
            goto(Label_0330)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-452989377))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_217 = newarray:byte[](byte.class, expr_9F:int)
                var_5_218 = expr_9F:int
                
                loop {
                    var_0_1CD = and:int(var_0_1CD:int, ldc:int(-144277761))
                    var_5_218 = add:int(var_5_218:int, ldc:int(-1))
                    storeelement:byte(var_3_217:byte[], var_5_218:int, add:int(shl:int(loadelement:byte(stack_228_0:byte[], var_5_218:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_218:int, xor:int(ldc:int(594), ldc:int(595)))), ldc:int(7)), xor:int(ldc:int(660), ldc:int(661)))))
                    
                    if (cmpne:boolean(var_5_218:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1EE_0 = stack_228_0 = stack_293_0 = stack_2FC_0 = stack_374_0 = var_3_217:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(128)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1699865848))
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(4)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1756659719))
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-966312769))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1BA = expr_D9:int
                var_3_1BF = newarray:byte[](byte.class, expr_D9:int)
                var_5_1C0 = expr_D9:int
                goto(Label_0623)
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(262144)), ldc:int(0))) {
                var_0_1CD = and:int(var_0_1CD:int, ldc:int(1550069958))
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1849159262))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_4_1BA = expr_10B:int
                var_3_1BF = newarray:byte[](byte.class, expr_10B:int)
                var_5_1C0 = expr_10B:int
                goto(Label_0728)
            }
        }
        
        Label_0272:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(257437899))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(131072)), ldc:int(0))) {
                var_0_1CD = and:int(var_0_1CD:int, ldc:int(1998173723))
                goto(Label_0222)
            }
            
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(2093452542))
            expr_145 = arraylength:int(stack_145_0:byte[])
            
            if (cmpne:boolean(expr_145:int, ldc:int(0))) {
                var_3_363 = newarray:byte[](byte.class, expr_145:int)
                var_5_364 = expr_145:int
                
                loop {
                    var_0_1CD = and:int(var_0_1CD:int, ldc:int(1167048446))
                    var_5_364 = add:int(var_5_364:int, ldc:int(-1))
                    storeelement:byte(var_3_363:byte[], var_5_364:int, add:byte(loadelement:byte(stack_374_0:byte[], var_5_364:int), ldc:byte(101)))
                    
                    if (cmpne:boolean(var_5_364:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_143_0 = stack_145_0 = stack_174_0 = stack_1EE_0 = stack_228_0 = stack_293_0 = stack_2FC_0 = stack_374_0 = var_3_363:byte[]
            }
        }
        
        Label_0330:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(16)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1440095230))
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(2)), ldc:int(0))) {
            var_3_180 = initobject:String(String::<init>, stack_174_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B3_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8388), ldc:int(8389)))
            expr_192 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19593), ldc:int(4103)))
            storeelement:String(expr_192:String[], and:int(ldc:int(-4344), ldc:int(245)), invokevirtual:String[expected:String](String::substring, var_3_180:String, and:int(ldc:int(-12183), ldc:int(9874)), and:int(ldc:int(13062), ldc:int(17511))))
            putstatic:String[](\u36d3\u3a62\u51fa\u4f52\ube23::\u8308\ua068\ub1b9\u16f6\u7e3f\ub1b9, expr_192:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4cd9\u12b2\uae87\u0c95\ufcaf\u1187(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_678 : int
        
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
        var_3_66D = and:int(ldc:int(544459479), ldc:int(896857039))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u36d3\u3a62\u51fa\u4f52\ube23[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
            var_3_66D = and:int(var_3_66D:int, ldc:int(1761429991))
            var_5_7D = and:int(ldc:int(-17916), ldc:int(17866))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12042), ldc:int(11785)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_66D:int, ldc:int(687818703))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(129), ldc:int(128)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4370), ldc:int(4371)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_66D = and:int(var_3_D2:int, ldc:int(2021650639))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-16312), ldc:int(-16311)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-558586165))
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(801291721))
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-209622534))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-94548288))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1913224445))
                    }
                    else {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(763000543))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0854)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-598506389))
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-566880282))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(598485703))
                        goto(Label_0854)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1231639603))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(491945852))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-541336648))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1586477361))
                        var_11_E3 = and:int(ldc:int(-2987), ldc:int(938))
                        goto(Label_1516)
                    }
                    
                    Label_0572:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1910861924))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1943632862))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1454740349))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1222334103))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(964523751))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0854)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1649364533))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-2071446646))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-908222867))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1894286210))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1560071949))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1226648279))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(462110195))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1621421168))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1183259179))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0854:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1432289420))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1863319034))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1987796947))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(553578957))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(17540), ldc:int(17541))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1019747826))
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1776901240))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(2110123400))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1124697401))
                        var_11_E3 = and:int(ldc:int(-12178), ldc:int(12161))
                    }
                    
                    Label_1109:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-978682781))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-703246283))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-151822913))
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(289755157))
                            goto(Label_0854)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1117502298))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(767328739))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1752781950))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-68007723))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1387)
                            }
                        }
                    }
                    
                    Label_1257:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1188653843))
                            goto(Label_1109)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1733581135))
                            goto(Label_0854)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(890987474))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-895832975))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-101424179))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1516)
                    }
                    
                    Label_1387:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-189836540))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-600809124))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-285161872))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1500309544))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66D = and:int(var_3_66D:int, ldc:int(1778220789))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1516:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_678 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1527:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-504986719))
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1436502725))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(2015510641))
                        goto(Label_0854)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(91037530))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(988464493))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-151631673))
                        var_17_678 = add:int(var_16_111:int, and:int(ldc:int(8893), ldc:int(3395)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66D = and:int(var_3_66D:int, ldc:int(1861282263))
                
                if (cmple:boolean(var_5_7D = var_17_678:int, sub:int(var_6_84:int, xor:int(ldc:int(129), ldc:int(128))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_66D = and:int(var_3_66D:int, ldc:int(-1896829814))
            goto(Label_0106)
        }
    }
}
