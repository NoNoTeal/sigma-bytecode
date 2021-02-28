public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u5654\u624e\u4cd9\u8bb0\u62da\u7049 {
    public void \u5654\u624e\u4cd9\u8bb0\u62da\u7049() {
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
            invokespecial:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe(\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe::<init>, this:\u5654\u624e\u4cd9\u8bb0\u62da\u7049, getstatic:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d::\u759a\u6bb9\u4daf\u7330\ud51e\ub70c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\ucef1\ub70c\u8bb0\ub171\u600f() {
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
        invokespecial:void(\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe::\u5bc4\ucef1\ub70c\u8bb0\ub171\u600f, this:\u5654\u624e\u4cd9\u8bb0\u62da\u7049[expected:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe])
        
        if (invokestatic:boolean(\uc7fe\ud217\u416d\u4c2b\u47c2\ufe34::\u97e6\u4c04\ud523\u97b7\u6d69\u1187, invokevirtual:ByteBuffer(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\u718f\u7bad\u7d52\u946b\u7049\u8640, this:\u5654\u624e\u4cd9\u8bb0\u62da\u7049[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b]))) {
            return:void()
        }
        
        athrow(initobject:\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7(\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7::<init>, and:int(ldc:int(1007), ldc:int(21487)), loadelement:String(getstatic:String[](\u5654\u624e\u4cd9\u8bb0\u62da\u7049::\u8df4\u8bb0\u4179\uff55\u516c\u7d52), and:int(ldc:int(-13873), ldc:int(13872)))))
    }
    
    static {
        var_0_24D : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1A8_0 : byte[] [generated]
        stack_1FB_0 : byte[] [generated]
        stack_26E_0 : byte[] [generated]
        stack_2C9_0 : byte[] [generated]
        var_4_17C : int
        var_3_181 : byte[]
        var_5_182 : int
        expr_1AB : byte [generated]
        var_0_2BF : int
        expr_2C9 : byte [generated]
        stack_2F7_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1EA : byte[]
        var_5_1EB : int
        expr_DB : int [generated]
        expr_10E : int [generated]
        var_3_142 : String
        stack_175_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_24D = and:int(ldc:int(-2008776034), ldc:int(1487312493))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A8_0 = stack_1FB_0 = stack_26E_0 = stack_2C9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("hzl1+HJSZmpFRWwTPa8Gbqo4Q68JX2k9JDlFQ3WBqEMJ5Nrh3lPZ")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17C = expr_6B:int
        var_3_181 = newarray:byte[](byte.class, expr_6B:int)
        var_5_182 = expr_6B:int
        Label_0388:
        
        while (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(1)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(-251091241))
                goto(Label_0578)
            }
            
            var_0_24D = and:int(var_0_24D:int, ldc:int(450486989))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_1AB = add:byte(loadelement:byte(stack_1A8_0:byte[], var_5_182:int), ldc:byte(41))
            storeelement:byte(var_3_181:byte[], var_5_182:int, or:int(and:int(shl:int(expr_1AB:byte, xor:int(ldc:int(195), ldc:int(199))), ldc:int(-16)), and:int(shr:int(expr_1AB:byte[expected:int], and:int(ldc:int(4892), ldc:int(2084))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A8_0 = stack_1FB_0 = stack_26E_0 = stack_2C9_0 = var_3_181:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0669)
        Label_0578:
        
        while (cmpne:boolean(and:int(var_0_24D:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(1853150433))
                goto(Label_0388)
            }
            
            var_0_24D = and:int(var_0_24D:int, ldc:int(1012784765))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            storeelement:byte(var_3_181:byte[], var_5_182:int, xor:byte(loadelement:byte(stack_26E_0:byte[], var_5_182:int), ldc:byte(110)))
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A8_0 = stack_1FB_0 = stack_26E_0 = stack_2C9_0 = var_3_181:byte[]
            goto(Label_0224)
        }
        
        var_0_24D = and:int(var_0_24D:int, ldc:int(-861657169))
        Label_0669:
        
        while (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(8)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(1894554680))
                goto(Label_0388)
            }
            
            var_0_2BF = and:int(var_0_24D:int, ldc:int(717864524))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_2C9 = loadelement:byte(stack_2C9_0:byte[], var_5_182:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_182:int, ldc:int(5)), neg:int(var_4_17C:int)), ldc:int(0))) {
                var_0_2BF = and:int(var_0_2BF:int, ldc:int(1585878590))
                stack_2F7_2 = add:byte(expr_2C9:byte, ldc:byte(5))
            }
            else {
                stack_2F7_2 = add:byte(expr_2C9:byte, loadelement:byte(var_3_181:byte[], add:int(var_5_182:int, ldc:int(5))))
            }
            
            var_0_24D = and:int(var_0_2BF:int, ldc:int(737344270))
            storeelement:byte(var_3_181:byte[], var_5_182:int, stack_2F7_2:byte)
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A8_0 = stack_1FB_0 = stack_26E_0 = stack_2C9_0 = var_3_181:byte[]
            goto(Label_0275)
        }
        
        var_0_24D = and:int(var_0_24D:int, ldc:int(-468791742))
        goto(Label_0578)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(2048)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(-1228438859))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(512)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(-1873446211))
            goto(Label_0224)
        }
        
        if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(1805116191))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1EA = newarray:byte[](byte.class, expr_A0:int)
                var_5_1EB = expr_A0:int
                
                loop {
                    var_0_24D = and:int(var_0_24D:int, ldc:int(-1351297298))
                    var_5_1EB = add:int(var_5_1EB:int, ldc:int(-1))
                    storeelement:byte(var_3_1EA:byte[], var_5_1EB:int, add:int(shl:int(loadelement:byte(stack_1FB_0:byte[], var_5_1EB:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1EB:int, xor:int(ldc:int(-22016), ldc:int(-22015)))), ldc:int(4)), xor:int(ldc:int(804), ldc:int(811)))))
                    
                    if (cmpne:boolean(var_5_1EB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A8_0 = stack_1FB_0 = stack_26E_0 = stack_2C9_0 = var_3_1EA:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(481402809))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(32)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(1508364926))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(512)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(1289029348))
                goto(Label_0112)
            }
            
            var_0_24D = and:int(var_0_24D:int, ldc:int(-845310002))
            expr_DB = arraylength:int(stack_DB_0:byte[])
            
            if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                var_4_17C = expr_DB:int
                var_3_181 = newarray:byte[](byte.class, expr_DB:int)
                var_5_182 = expr_DB:int
                goto(Label_0578)
            }
        }
        
        Label_0224:
        
        if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(256)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(-842935952))
        }
        else {
            if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(32768)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(1772196873))
                goto(Label_0112)
            }
            
            var_0_24D = and:int(var_0_24D:int, ldc:int(1029028847))
            expr_10E = arraylength:int(stack_10E_0:byte[])
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_4_17C = expr_10E:int
                var_3_181 = newarray:byte[](byte.class, expr_10E:int)
                var_5_182 = expr_10E:int
                goto(Label_0669)
            }
        }
        
        Label_0275:
        
        if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0224)
        }
        
        if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(4)), ldc:int(0))) {
            var_0_24D = and:int(var_0_24D:int, ldc:int(-1002037518))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_175_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17283), ldc:int(17)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(723), ldc:int(22529)))
        storeelement:String(expr_154:String[], and:int(ldc:int(10801), ldc:int(-10802)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(5314), ldc:int(-5315)), and:int(ldc:int(238), ldc:int(6694))))
        putstatic:String[](\u5654\u624e\u4cd9\u8bb0\u62da\u7049::\u8df4\u8bb0\u4179\uff55\u516c\u7d52, expr_154:String[])
    }
    
    public void \u7049\u67e9\u7af6\u40a9\u97e6\u12cb(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(-883738560), ldc:int(-537494657))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5654\u624e\u4cd9\u8bb0\u62da\u7049[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-141630650))
        }
        else {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-300729606))
            var_5_85 = and:int(ldc:int(29778), ldc:int(-29787))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3528), ldc:int(-19914)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5ED:int, ldc:int(-581535025))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(48), ldc:int(49)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(137), ldc:int(81)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_DA:int, ldc:int(-664883612))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(24577), ldc:int(263)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1310)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1693313241))
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-776850776))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2997076))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(71116144))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1166874037))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1060563964))
                        goto(Label_1310)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1715940699))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(301013719))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1405965039))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-699241606))
                            var_11_EB = and:int(ldc:int(29296), ldc:int(-29301))
                            goto(Label_1429)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1156031822))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(903563243))
                        goto(Label_1310)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1608995487))
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1184436198))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(429884574))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-795690126))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1310)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1237953550))
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1281523095))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2012965303))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-28115896))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-301065531))
                        goto(Label_1310)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-585239927))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2133561801))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1813030803))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1182391754))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1065137683))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(436024954))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-562108198))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(5633), ldc:int(16385))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-552428905))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1310)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2079861849))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1655425866))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(749880741))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-459871548))
                        var_11_EB = and:int(ldc:int(696), ldc:int(-26299))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-162398842))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-533919206))
                        goto(Label_1310)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1806773492))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1808372130))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1310)
                            }
                        }
                    }
                    
                    Label_1165:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1433808822))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(125412065))
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(961558640))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1204627254))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(620703364))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(687873858))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-663487016))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1429)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1310:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(213001983))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1117825947))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-466077334))
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1254740535))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1429:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1440:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1310)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1741733416))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1112282151))
                        var_17_5F8 = add:int(var_16_119:int, and:int(ldc:int(8705), ldc:int(2125)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-163840657))
                
                if (cmple:boolean(var_5_85 = var_17_5F8:int, sub:int(var_6_8C:int, xor:int(ldc:int(-11264), ldc:int(-11263))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-681604868))
            goto(Label_0106)
        }
    }
}
