public class \u12b2\u4e72\u8df4\u67e9\u67e9.\ucb79\ud36e\u98a4\u6d69\ub70c\u8350 {
    public void \ucb79\ud36e\u98a4\u6d69\ub70c\u8350() {
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
            invokespecial:Object(Object::<init>, this:\ucb79\ud36e\u98a4\u6d69\ub70c\u8350)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub18d\uae5d\u7330\u6d99\ub19c\u4ab3() {
        var_0_64 : int
        var_2_78 : InputStream
        var_0_137 : int
        var_3_86 : InputStreamReader
        stack_BA_0 : Gson [generated]
        stack_BA_1 : InputStreamReader [generated]
        expr_A6 : \u8aa5\u0c95\u88c5\u8d90\ua068\u5f50 [generated]
        stack_BA_2 : Type [generated]
        
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
            var_0_64 = and:int(and:int(ldc:int(1824556230), ldc:int(-353201465)), ldc:int(1635905476))
            var_2_78 = invokevirtual:InputStream(ClassLoader::getResourceAsStream, invokevirtual:ClassLoader(Class<T>::getClassLoader, ldc:Class<\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4.class)), loadelement:String(getstatic:String[](\ucb79\ud36e\u98a4\u6d69\ub70c\u8350::\u92ff\ud158\u7c6b\u3e2a\uae5d\ub19c), and:int(ldc:int(31492), ldc:int(-31557))))
            var_0_137 = and:int(var_0_64:int, ldc:int(-877178))
            var_3_86 = initobject:InputStreamReader(InputStreamReader::<init>, var_2_78:InputStream)
            
            try {
                loop {
                    Label_0135:
                    
                    if (cmpne:boolean(and:int(var_0_137:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_137 = and:int(var_0_137:int, ldc:int(1379280361))
                        goto(Label_0218)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_137:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0195)
                    }
                    
                    var_0_137 = and:int(var_0_137:int, ldc:int(1721678230))
                    stack_BA_0 = invokestatic:Gson(\u8308\u16f6\u71f1\uc3e3\uc2bd\u7c6b::\ubded\u983f\u6d99\u34df\u647c\ub19c)
                    stack_BA_1 = var_3_86:InputStreamReader
                    expr_A6 = initobject:\u8aa5\u0c95\u88c5\u8d90\ua068\u5f50(\u8aa5\u0c95\u88c5\u8d90\ua068\u5f50::<init>)
                    var_0_137 = and:int(var_0_137:int, ldc:int(2092684756))
                    stack_BA_2 = invokevirtual:Type(\u8aa5\u0c95\u88c5\u8d90\ua068\u5f50::getType, expr_A6:\u8aa5\u0c95\u88c5\u8d90\ua068\u5f50)
                    var_0_137 = and:int(var_0_137:int, ldc:int(-477911070))
                    putstatic:Map<String, \ub6ab\u61a4\ua61f\u5140\ua6bd\u9af2>(\ucb79\ud36e\u98a4\u6d69\ub70c\u8350::\u4ab3\uc910\u8753\u836c\uc7fe\u76bc, checkcast:Map(java.util.Map.class, invokevirtual:Object(Gson::fromJson, stack_BA_0:Gson, stack_BA_1:InputStreamReader[expected:Reader], stack_BA_2:Type)))
                    
                    try {
                        loop {
                            Label_0195:
                            
                            if (cmpeq:boolean(and:int(var_0_137:int, ldc:int(524288)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_0_137:int, ldc:int(16777216)), ldc:int(0))) {
                                    loopcontinue(Label_0135)
                                }
                                
                                var_0_137 = and:int(var_0_137:int, ldc:int(-205981424))
                                invokevirtual:void(InputStreamReader::close, var_3_86:InputStreamReader)
                            }
                            
                            Label_0218:
                            
                            if (cmpeq:boolean(and:int(var_0_137:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_0_137 = and:int(var_0_137:int, ldc:int(-1508660550))
                        }
                        
                        if (cmpne:boolean(and:int(var_0_137:int, ldc:int(33554432)), ldc:int(0))) {
                            var_0_137 = and:int(var_0_137:int, ldc:int(-130572752))
                            loopcontinue()
                        }
                        
                        var_0_137 = and:int(var_0_137:int, ldc:int(-442657421))
                    }
                    catch (java.io.IOException var_4_104) {
                        var_0_137 = and:int(var_0_137:int, ldc:int(-403524600))
                    }
                    
                    looporswitchbreak()
                }
            }
            finally {
                try {
                    do {
                        if (cmpne:boolean(and:int(var_0_137:int, ldc:int(8)), ldc:int(0))) {
                            var_0_137 = and:int(var_0_137:int, ldc:int(-839941812))
                        }
                        else {
                            var_0_137 = and:int(var_0_137:int, ldc:int(2124590653))
                            invokevirtual:void(InputStreamReader::close, var_3_86:InputStreamReader)
                        }
                    } while (cmpne:boolean(and:int(var_0_137:int, ldc:int(524288)), ldc:int(0)))
                    
                    var_0_137 = and:int(var_0_137:int, ldc:int(-272185348))
                }
                catch (java.io.IOException stack_13F_0) {
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_7B : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1A7_0 : byte[] [generated]
        stack_1FC_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_124 : int
        var_3_129 : byte[]
        var_5_12A : int
        var_0_130 : int
        expr_13A : byte [generated]
        stack_176_2 : byte [generated]
        stack_155_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_196 : byte[]
        var_5_197 : int
        expr_B5 : int [generated]
        var_3_1EB : byte[]
        var_5_1EC : int
        expr_1FC : byte [generated]
        var_3_EA : String
        stack_11D_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_7B = and:int(ldc:int(1662181468), ldc:int(1709171437))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1A7_0 = stack_1FC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3RAEPwvy6cH3Dg32BPRF/voOtUgA/PK3D/IEAgAAGFH0UUKtTcO+U7M8M+X+xMDLIAwbHA=="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_124 = expr_6B:int
                var_3_129 = newarray:byte[](byte.class, expr_6B:int)
                var_5_12A = expr_6B:int
                
                loop {
                    var_0_130 = and:int(var_0_7B:int, ldc:int(2001963357))
                    var_5_12A = add:int(var_5_12A:int, ldc:int(-1))
                    expr_13A = stack_176_2 = loadelement(expr_65, var_5_12A)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_12A:int, ldc:int(4)), neg:int(var_4_124:int)), ldc:int(0))) {
                        stack_176_2 = stack_155_0 = add:byte(expr_13A:byte, loadelement:byte(var_3_129:byte[], add:int(var_5_12A:int, ldc:int(4))))
                        goto(Label_0357)
                    }
                    
                    Label_0327:
                    
                    if (cmpne:boolean(and:int(var_0_130:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_130 = and:int(var_0_130:int, ldc:int(2046296031))
                        stack_176_2 = stack_155_0 = add:byte(expr_13A:byte, ldc:byte(4))
                    }
                    
                    Label_0357:
                    
                    if (cmpne:boolean(and:int(var_0_130:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0327)
                    }
                    
                    var_0_7B = and:int(var_0_130:int, ldc:int(2099702503))
                    storeelement:byte(var_3_129:byte[], var_5_12A:int, stack_176_2:byte)
                    
                    if (cmpne:boolean(var_5_12A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1A7_0 = stack_1FC_0 = var_3_129:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(128)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(1275822527))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(128)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(1964748156))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_196 = newarray:byte[](byte.class, expr_91:int)
                        var_5_197 = expr_91:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(-440756530))
                            var_5_197 = add:int(var_5_197:int, ldc:int(-1))
                            storeelement:byte(var_3_196:byte[], var_5_197:int, add:int(shl:int(loadelement:byte(stack_1A7_0:byte[], var_5_197:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_197:int, and:int(ldc:int(25609), ldc:int(2115)))), ldc:int(4)), xor:int(ldc:int(13573), ldc:int(13578)))))
                            
                            if (cmpne:boolean(var_5_197:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1A7_0 = stack_1FC_0 = var_3_196:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(256)), ldc:int(0))) {
                        var_0_7B = and:int(var_0_7B:int, ldc:int(-917002037))
                        loopcontinue()
                    }
                    
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-181684140))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_1EB = newarray:byte[](byte.class, expr_B5:int)
                        var_5_1EC = expr_B5:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(2067722695))
                            var_5_1EC = add:int(var_5_1EC:int, ldc:int(-1))
                            expr_1FC = loadelement:byte(stack_1FC_0:byte[], var_5_1EC:int)
                            storeelement:byte(var_3_1EB:byte[], var_5_1EC:int, add:int(xor:int(or:int(and:int(shl:int(expr_1FC:byte, xor:int(ldc:int(-30640), ldc:int(-30636))), ldc:int(-16)), and:int(shr:int(expr_1FC:byte[expected:int], xor:int(ldc:int(-31742), ldc:int(-31738))), ldc:int(15))), ldc:int(48)), ldc:int(79)))
                            
                            if (cmpne:boolean(var_5_1EC:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1A7_0 = stack_1FC_0 = var_3_1EB:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(64)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(1851930821))
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_7B = and:int(var_0_7B:int, ldc:int(763337079))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_11D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(239), ldc:int(16913)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18439), ldc:int(9761)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(-15408), ldc:int(9263)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(-5115), ldc:int(1002)), xor:int(ldc:int(20547), ldc:int(20592))))
            putstatic:String[](\ucb79\ud36e\u98a4\u6d69\ub70c\u8350::\u92ff\ud158\u7c6b\u3e2a\uae5d\ub19c, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u7330\u7049\ud51e\u4179\u7ce1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63E : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_649 : int
        
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
        var_3_63E = and:int(ldc:int(442626943), ldc:int(464238463))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\ud36e\u98a4\u6d69\ub70c\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
            var_3_63E = and:int(var_3_63E:int, ldc:int(-479052727))
        }
        else {
            var_3_63E = and:int(var_3_63E:int, ldc:int(-1628579969))
            var_5_85 = and:int(ldc:int(-31293), ldc:int(22588))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21299), ldc:int(21298)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63E:int, ldc:int(518127615))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(65), ldc:int(64)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16905), ldc:int(16904)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63E = and:int(var_3_D2:int, ldc:int(2049949695))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(11265), ldc:int(13)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(927098189))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(894763635))
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-90663975))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1997053320))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-97936898))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1499418866))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1266688558))
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-392848763))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1170235906))
                            var_11_E3 = and:int(ldc:int(-10100), ldc:int(10066))
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(2110837850))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(265938627))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-452741486))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1222879324))
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1557921712))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-317337479))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1810608251))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-546458241))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1606818176))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-206594596))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(516136165))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1633004444))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(2098664416))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-612379649))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0805:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(654888756))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1559054425))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(89042617))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-979518302))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1521090046))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(26625), ldc:int(5699))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-890324165))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0805)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1487614073))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(1374779005))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1687030401))
                        var_11_E3 = and:int(ldc:int(-31608), ldc:int(15125))
                    }
                    
                    Label_1068:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1823358411))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-2063055305))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(732435531))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(927556967))
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(978253049))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(977132414))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1334)
                            }
                        }
                    }
                    
                    Label_1195:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1427569247))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(922909370))
                            goto(Label_1068)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(1988365234))
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(2025864190))
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(1474194388))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1592243070))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1463)
                    }
                    
                    Label_1334:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-883393208))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1094543198))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-606628917))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(991557782))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63E = and:int(var_3_63E:int, ldc:int(-1696099330))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_649 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(516092282))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-2008746945))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1999680610))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-752443507))
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-316444041))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1937635676))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(506715519))
                        var_17_649 = add:int(var_16_111:int, and:int(ldc:int(2817), ldc:int(1071)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63E = and:int(var_3_63E:int, ldc:int(518897663))
                
                if (cmple:boolean(var_5_85 = var_17_649:int, sub:int(var_6_8C:int, and:int(ldc:int(3209), ldc:int(33))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
