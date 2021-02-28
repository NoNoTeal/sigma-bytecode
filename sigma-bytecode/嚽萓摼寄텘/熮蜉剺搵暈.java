public class \u56bd\u8413\u647c\u5bc4\ud158.\u71ae\u8709\u527a\u6435\uf9c5 {
    public void \u71ae\u8709\u527a\u6435\uf9c5(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
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
            invokespecial:Object(Object::<init>, this:\u71ae\u8709\u527a\u6435\uf9c5)
            putfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\u8753\u51fa\u0800\u8350\ud7e8, this:\u71ae\u8709\u527a\u6435\uf9c5, p0:String)
            putfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\ufcaf\u760c\u759a\u8cae\u5f50, this:\u71ae\u8709\u527a\u6435\uf9c5, p1:String)
            putfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\u67e9\u5140\u8c8a\u3e75\uc31c, this:\u71ae\u8709\u527a\u6435\uf9c5, p2:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u71ae\u8709\u527a\u6435\uf9c5(byte[] p0) {
        var_4_7E : byte[]
        var_5_92 : byte[]
        var_6_AC : SecretKeySpec
        var_7_C0 : Cipher
        var_8_F5 : \uc910\ub6ab\uafe7\ud217\u7330\u600f
        
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
            invokespecial:Object(Object::<init>, this:\u71ae\u8709\u527a\u6435\uf9c5)
            var_4_7E = invokestatic:byte[](Arrays::copyOf, invokestatic:byte[](\u120d\uf995\u4c2b\u8d98\u527a::\u62da\u7006\u392e\u5d20\ua068, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(-12136), ldc:int(10085)))), ldc:int(16))
            var_5_92 = invokevirtual:byte[](String::getBytes, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(16577), ldc:int(2817))))
            var_6_AC = initobject:SecretKeySpec(SecretKeySpec::<init>, var_4_7E:byte[], loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(24963), ldc:int(3154))))
            
            try {
                var_7_C0 = invokestatic:Cipher(Cipher::getInstance, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), xor:int(ldc:int(834), ldc:int(833))))
                invokevirtual:void(Cipher::init, var_7_C0:Cipher, and:int(ldc:int(18446), ldc:int(13138)), var_6_AC:SecretKeySpec[expected:Key], initobject:IvParameterSpec[expected:AlgorithmParameterSpec](IvParameterSpec::<init>, var_5_92:byte[]))
                var_8_F5 = initobject:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::<init>, initobject:String(String::<init>, invokevirtual:byte[](Cipher::doFinal, var_7_C0:Cipher, p0:byte[])))
                
                if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, var_8_F5:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), xor:int(ldc:int(4264), ldc:int(4268))))) {
                    putfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\u8753\u51fa\u0800\u8350\ud7e8, this:\u71ae\u8709\u527a\u6435\uf9c5, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, var_8_F5:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(2062), ldc:int(28981)))))
                }
                
                if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, var_8_F5:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), xor:int(ldc:int(16907), ldc:int(16910))))) {
                    putfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\ufcaf\u760c\u759a\u8cae\u5f50, this:\u71ae\u8709\u527a\u6435\uf9c5, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, var_8_F5:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(2093), ldc:int(17605)))))
                }
                
                if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, var_8_F5:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(22543), ldc:int(6))))) {
                    putfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\u67e9\u5140\u8c8a\u3e75\uc31c, this:\u71ae\u8709\u527a\u6435\uf9c5, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, var_8_F5:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(5159), ldc:int(902)))))
                }
            }
            catch (java.security.InvalidKeyException | java.security.InvalidAlgorithmParameterException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException | \u6ec6\ubb2b\uf94d\u6d99\u4f52.\ud4fe\uc246\u92ff\u40a9\u0800\u40a9 | javax.crypto.IllegalBlockSizeException | javax.crypto.BadPaddingException ex_18F) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public byte[] \u3dd3\u960f\uf995\u9937\u516c() {
        var_1_64 : int
        var_3_78 : byte[]
        var_1_7D : int
        var_4_8C : byte[]
        var_1_92 : int
        var_5_A6 : SecretKeySpec
        var_1_AC : int
        var_6_BB : Cipher
        stack_105_0 : Throwable [generated]
        
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
        var_1_64 = and:int(and:int(ldc:int(308830713), ldc:int(1980612825)), ldc:int(-494276167))
        var_3_78 = invokestatic:byte[](Arrays::copyOf, invokestatic:byte[](\u120d\uf995\u4c2b\u8d98\u527a::\u62da\u7006\u392e\u5d20\ua068, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(-13156), ldc:int(9025)))), ldc:int(16))
        var_1_7D = and:int(var_1_64:int, ldc:int(-738299655))
        var_4_8C = invokevirtual:byte[](String::getBytes, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), xor:int(ldc:int(8194), ldc:int(8195))))
        var_1_92 = and:int(var_1_7D:int, ldc:int(1466562267))
        var_5_A6 = initobject:SecretKeySpec(SecretKeySpec::<init>, var_3_78:byte[], loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), xor:int(ldc:int(5121), ldc:int(5123))))
        
        try {
            var_1_AC = and:int(var_1_92:int, ldc:int(1919873497))
            var_6_BB = invokestatic:Cipher(Cipher::getInstance, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(15415), ldc:int(459))))
            
            do {
                if (cmpne:boolean(and:int(var_1_AC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_AC = and:int(var_1_AC:int, ldc:int(-824485891))
                    invokevirtual:void(Cipher::init, var_6_BB:Cipher, xor:int(ldc:int(-32239), ldc:int(-32240)), var_5_A6:SecretKeySpec[expected:Key], initobject:IvParameterSpec[expected:AlgorithmParameterSpec](IvParameterSpec::<init>, var_4_8C:byte[]))
                }
            } while (cmpeq:boolean(and:int(var_1_AC:int, ldc:int(1)), ldc:int(0)))
            
            return:byte[](invokevirtual:byte[](Cipher::doFinal, var_6_BB:Cipher, invokevirtual:byte[](String::getBytes, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::toString, invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\u71ae\u8709\u527a\u6435\uf9c5::\u120d\u960f\ua61f\u5fe1\u1187, this:\u71ae\u8709\u527a\u6435\uf9c5)))))
        }
        catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException | java.security.InvalidKeyException | java.security.InvalidAlgorithmParameterException | javax.crypto.IllegalBlockSizeException | javax.crypto.BadPaddingException ex_105) {
            invokevirtual:void(Throwable::printStackTrace, stack_105_0:Throwable)
            return:byte[](aconstnull:byte[]())
        }
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\uc910\ub6ab\uafe7\ud217\u7330\u600f \u120d\u960f\ua61f\u5fe1\u1187() {
        var_3_67 : \uc910\ub6ab\uafe7\ud217\u7330\u600f
        
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
            var_3_67 = initobject:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::<init>)
            invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_67:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(388), ldc:int(588))), getfield:String[expected:Object](\u71ae\u8709\u527a\u6435\uf9c5::\u8753\u51fa\u0800\u8350\ud7e8, this:\u71ae\u8709\u527a\u6435\uf9c5))
            invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_67:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), xor:int(ldc:int(2048), ldc:int(2053))), getfield:String[expected:Object](\u71ae\u8709\u527a\u6435\uf9c5::\ufcaf\u760c\u759a\u8cae\u5f50, this:\u71ae\u8709\u527a\u6435\uf9c5))
            invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_67:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1), and:int(ldc:int(24934), ldc:int(1694))), getfield:String[expected:Object](\u71ae\u8709\u527a\u6435\uf9c5::\u67e9\u5140\u8c8a\u3e75\uc31c, this:\u71ae\u8709\u527a\u6435\uf9c5))
            return:\uc910\ub6ab\uafe7\ud217\u7330\u600f(var_3_67:\uc910\ub6ab\uafe7\ud217\u7330\u600f)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A8 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_87_0 : byte[] [generated]
        stack_89_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_22D_0 : byte[] [generated]
        stack_28D_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1C0 : byte[]
        var_4_1C1 : int
        expr_89 : int [generated]
        var_5_210 : int
        var_3_215 : byte[]
        var_4_216 : int
        expr_233 : byte [generated]
        var_0_283 : int
        expr_28D : byte [generated]
        stack_2BB_2 : byte [generated]
        expr_AD : int [generated]
        var_3_E2 : String
        stack_1B7_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
            var_0_A8 = and:int(ldc:int(-539535074), ldc:int(-838902569))
            expr_65 = var_2_69 = stack_87_0 = stack_89_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_22D_0 = stack_28D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("WVlZaOlgsnjhkbI5iOno2bkRgbmSChLKCTDxAcphKVGhmeABOcphYVlpQYGhOeF5qTEhykHg6RHZb+mIqZAK8QlXMxFp0Goyw3iZgTKhcQF5ASFGpmYA"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1C0 = newarray:byte[](byte.class, expr_6D:int)
                var_4_1C1 = expr_6D:int
                
                loop {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-1612914849))
                    var_4_1C1 = add:int(var_4_1C1:int, ldc:int(-1))
                    storeelement:byte(var_3_1C0:byte[], var_4_1C1:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1C1:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1C1:int, xor:int(ldc:int(16512), ldc:int(16513)))), ldc:int(7)), xor:int(ldc:int(3456), ldc:int(3457)))))
                    
                    if (cmpne:boolean(var_4_1C1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_89_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_22D_0 = stack_28D_0 = var_3_1C0:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_0_A8 = and:int(var_0_A8:int, ldc:int(-1344381409))
                expr_89 = arraylength:int(stack_89_0:byte[])
                
                if (cmpeq:boolean(expr_89:int, ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_5_210 = expr_89:int
                var_3_215 = newarray:byte[](byte.class, expr_89:int)
                var_4_216 = expr_89:int
                Label_0536:
                
                while (cmpne:boolean(and:int(var_0_A8:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-33793257))
                    var_4_216 = add:int(var_4_216:int, ldc:int(-1))
                    expr_233 = xor:byte(add:byte(loadelement:byte(stack_22D_0:byte[], var_4_216:int), ldc:byte(93)), ldc:byte(15))
                    storeelement:byte(var_3_215:byte[], var_4_216:int, or:int(and:int(shl:int(expr_233:byte, xor:int(ldc:int(2052), ldc:int(2048))), ldc:int(-16)), and:int(shr:int(expr_233:byte[expected:int], xor:int(ldc:int(-30711), ldc:int(-30707))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_216:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_22D_0 = stack_28D_0 = var_3_215:byte[]
                    goto(Label_0142)
                }
                
                Label_0632:
                
                while (cmpne:boolean(and:int(var_0_A8:int, ldc:int(4)), ldc:int(0))) {
                    var_0_283 = and:int(var_0_A8:int, ldc:int(-1342808418))
                    var_4_216 = add:int(var_4_216:int, ldc:int(-1))
                    expr_28D = loadelement:byte(stack_28D_0:byte[], var_4_216:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_216:int, ldc:int(3)), neg:int(var_5_210:int)), ldc:int(0))) {
                        var_0_283 = and:int(var_0_283:int, ldc:int(-839591113))
                        stack_2BB_2 = add:byte(expr_28D:byte, ldc:byte(3))
                    }
                    else {
                        stack_2BB_2 = add:byte(expr_28D:byte, loadelement:byte(var_3_215:byte[], add:int(var_4_216:int, ldc:int(3))))
                    }
                    
                    var_0_A8 = and:int(var_0_283:int, ldc:int(-1376977793))
                    storeelement:byte(var_3_215:byte[], var_4_216:int, stack_2BB_2:byte)
                    
                    if (cmpne:boolean(var_4_216:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_22D_0 = stack_28D_0 = var_3_215:byte[]
                    goto(Label_0178)
                }
                
                goto(Label_0536)
                Label_0142:
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_A8 = and:int(var_0_A8:int, ldc:int(-1884574319))
                        loopcontinue()
                    }
                    
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-537502666))
                    expr_AD = arraylength:int(stack_AD_0:byte[])
                    
                    if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                        var_5_210 = expr_AD:int
                        var_3_215 = newarray:byte[](byte.class, expr_AD:int)
                        var_4_216 = expr_AD:int
                        goto(Label_0632)
                    }
                }
                
                Label_0178:
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-558447869))
                    goto(Label_0142)
                }
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(64)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_A8 = and:int(var_0_A8:int, ldc:int(-1556708077))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B7_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(39), ldc:int(1031)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(101), ldc:int(98)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(22386), ldc:int(10)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-12953), ldc:int(12824)), xor:int(ldc:int(19488), ldc:int(19491))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(16387), ldc:int(8967)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(4371), ldc:int(17443)), xor:int(ldc:int(20621), ldc:int(20634))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(2582), ldc:int(1070)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(16435), ldc:int(16420)), and:int(ldc:int(693), ldc:int(105))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(16390), ldc:int(16387)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(4162), ldc:int(4195)), xor:int(ldc:int(1082), ldc:int(1040))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(1409), ldc:int(2575)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(5183), ldc:int(42)), xor:int(ldc:int(10262), ldc:int(10284))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-18183), ldc:int(18182)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(289), ldc:int(283)), and:int(ldc:int(20718), ldc:int(2638))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(6409), ldc:int(6413)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(5198), ldc:int(19070)), xor:int(ldc:int(7232), ldc:int(7190))))
            putstatic:String[](\u71ae\u8709\u527a\u6435\uf9c5::\u8d90\u5140\u960f\u99f7\ubff1, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6bb9\ub7dc\u494c\ua61f\u3dd3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_664 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66F : int
        
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
        var_3_664 = and:int(ldc:int(1579898527), ldc:int(-43001897))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u8709\u527a\u6435\uf9c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_664 = and:int(var_3_664:int, ldc:int(-90862013))
        }
        else {
            var_3_664 = and:int(var_3_664:int, ldc:int(2097084087))
            var_5_85 = and:int(ldc:int(26660), ldc:int(-30821))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7161), ldc:int(2856)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_664:int, ldc:int(527310847))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(517), ldc:int(3081)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4105), ldc:int(10049)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_664 = and:int(var_3_DA:int, ldc:int(-1640333793))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(5381), ldc:int(26737)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-156165980))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1721515609))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-162534009))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(861487597))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1056626263))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1288068417))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(2001871003))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1199278067))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1512532874))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1726923110))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(24134534))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(125270829))
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1929848865))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1575663543))
                            var_11_EB = and:int(ldc:int(-4388), ldc:int(4387))
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1495081514))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-91765116))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-558575217))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-420526350))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1869758992))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1031503807))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0733:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-2005048043))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1953210791))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(742249475))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1991448989))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1672237909))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-683210093))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(2104434679))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0880:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-2125162551))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1884869313))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1657823425))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(1089), ldc:int(145))
                                goto(Label_1149)
                            }
                        }
                    }
                    
                    Label_0984:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-59160825))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(830157448))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1150843096))
                            goto(Label_0880)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-921264574))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-48648249))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-51759457))
                        var_11_EB = and:int(ldc:int(-22845), ldc:int(4412))
                    }
                    
                    Label_1149:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1033589610))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1438186768))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0984)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1951998331))
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-107819200))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1799659492))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1124157857))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1419)
                            }
                        }
                    }
                    
                    Label_1281:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1196543224))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1759695031))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1149)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-64726037))
                            goto(Label_0984)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-867034969))
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(247968017))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-600107049))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1419:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1927407281))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_664 = and:int(var_3_664:int, ldc:int(-557949409))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1220337701))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-835795131))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1561800832))
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-39151977))
                        var_17_66F = add:int(var_16_119:int, xor:int(ldc:int(24836), ldc:int(24837)))
                        looporswitchbreak()
                    }
                }
                
                var_3_664 = and:int(var_3_664:int, ldc:int(-1108683137))
                
                if (cmple:boolean(var_5_85 = var_17_66F:int, sub:int(var_6_8C:int, and:int(ldc:int(17447), ldc:int(9041))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
            var_3_664 = and:int(var_3_664:int, ldc:int(-1302233611))
            goto(Label_0106)
        }
    }
}
