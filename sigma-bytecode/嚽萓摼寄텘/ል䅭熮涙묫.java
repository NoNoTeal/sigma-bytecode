public class \u56bd\u8413\u647c\u5bc4\ud158.\u120d\u416d\u71ae\u6d99\ubb2b {
    public void \u120d\u416d\u71ae\u6d99\ubb2b(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u12b2\u4bc8\ub1b9\u516c\u61a4 p0, java.lang.String p1) {
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
            putfield:\u12b2\u4bc8\ub1b9\u516c\u61a4(\u120d\u416d\u71ae\u6d99\ubb2b::\u6435\u6d99\uc31c\ub1b9\ucfaf\u071d, this:\u120d\u416d\u71ae\u6d99\ubb2b, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4)
            invokespecial:Thread(Thread::<init>, this:\u120d\u416d\u71ae\u6d99\ubb2b, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_135 : int
        var_3_79 : BufferedReader
        var_4_EC : String
        var_5_12F : IOException
        
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
            var_1_135 = and:int(and:int(ldc:int(1982719240), ldc:int(-1243699327)), ldc:int(-1245937790))
            var_3_79 = initobject:BufferedReader(BufferedReader::<init>, initobject:InputStreamReader[expected:Reader](InputStreamReader::<init>, getstatic:InputStream(System::in), getstatic:Charset(StandardCharsets::UTF_8)))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_135:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_135 = and:int(var_1_135:int, ldc:int(-981916584))
                        goto(Label_0204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_135:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_135 = and:int(var_1_135:int, ldc:int(-769289867))
                    }
                    else {
                        var_1_135 = and:int(var_1_135:int, ldc:int(934197114))
                        
                        if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u836c\u62da\u8aa5\u156b\uc3e3\ubefe, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e](\u120d\u416d\u71ae\u6d99\ubb2b::\u6435\u6d99\uc31c\ub1b9\ucfaf\u071d, this:\u120d\u416d\u71ae\u6d99\ubb2b))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0167:
                    
                    if (cmpeq:boolean(and:int(var_1_135:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_135 = and:int(var_1_135:int, ldc:int(-1718175509))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_135:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_135 = and:int(var_1_135:int, ldc:int(-1224853984))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u5245\u8389\uceb8\u51b2\u3d64\u4c04, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e](\u120d\u416d\u71ae\u6d99\ubb2b::\u6435\u6d99\uc31c\ub1b9\ucfaf\u071d, this:\u120d\u416d\u71ae\u6d99\ubb2b)))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0204:
                    
                    if (cmpeq:boolean(and:int(var_1_135:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_135 = and:int(var_1_135:int, ldc:int(-589713874))
                        goto(Label_0167)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_135:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_135 = and:int(var_1_135:int, ldc:int(-31693527))
                    
                    if (cmpeq:boolean(var_4_EC = invokevirtual:String(BufferedReader::readLine, var_3_79:BufferedReader), aconstnull:String())) {
                        looporswitchbreak()
                    }
                    
                    do {
                        if (cmpne:boolean(and:int(var_1_135:int, ldc:int(1)), ldc:int(0))) {
                            var_1_135 = and:int(var_1_135:int, ldc:int(-1245257734))
                        }
                        else {
                            var_1_135 = and:int(var_1_135:int, ldc:int(1044378820))
                        }
                    } while (cmpne:boolean(and:int(var_1_135:int, ldc:int(32)), ldc:int(0)))
                    
                    var_1_135 = and:int(var_1_135:int, ldc:int(2124264591))
                    invokevirtual:void(\u12b2\u4bc8\ub1b9\u516c\u61a4::\u4d85\ub19c\u4179\u97b7\u72f1\u4cd9, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4(\u120d\u416d\u71ae\u6d99\ubb2b::\u6435\u6d99\uc31c\ub1b9\ucfaf\u071d, this:\u120d\u416d\u71ae\u6d99\ubb2b), var_4_EC:String, invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u88c5\ud171\ub113\u6435\ud51e::\u8413\ub70c\u183a\ub171\u5140\u759a, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e](\u120d\u416d\u71ae\u6d99\ubb2b::\u6435\u6d99\uc31c\ub1b9\ucfaf\u071d, this:\u120d\u416d\u71ae\u6d99\ubb2b)))
                }
            }
            catch (java.io.IOException var_5_12F) {
                var_1_135 = and:int(var_1_135:int, ldc:int(917368434))
                invokeinterface:void(Logger::error, invokestatic:Logger(\u12b2\u4bc8\ub1b9\u516c\u61a4::\u1833\u9a18\u0b8e\u0c95\u3a62\u965f), loadelement:String(getstatic:String[](\u120d\u416d\u71ae\u6d99\ubb2b::\u6b5f\uc3e3\ufe34\u9af2\u8350\u51b2), and:int(ldc:int(11841), ldc:int(-12114))), var_5_12F:IOException[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1C9 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1DB_0 : byte[] [generated]
        stack_227_0 : byte[] [generated]
        stack_2A7_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_166 : byte[]
        var_4_167 : int
        expr_A0 : int [generated]
        var_5_1B6 : int
        var_3_1BB : byte[]
        var_4_1BC : int
        var_0_23F : int
        expr_227 : byte [generated]
        stack_273_2 : byte [generated]
        stack_24A_0 : byte [generated]
        expr_CB : int [generated]
        expr_FE : int [generated]
        var_3_296 : byte[]
        var_4_297 : int
        expr_2AA : byte [generated]
        var_3_12A : String
        stack_15D_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
            var_0_1C9 = and:int(ldc:int(1352754312), ldc:int(-168596625))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1DB_0 = stack_227_0 = stack_2A7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HJ6iqqKeFKq2ry6mtryuKrikvV6wpLAaurzRXNGdY2Vg"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_166 = newarray:byte[](byte.class, expr_6D:int)
                var_4_167 = expr_6D:int
                
                loop {
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1605491098))
                    var_4_167 = add:int(var_4_167:int, ldc:int(-1))
                    storeelement:byte(var_3_166:byte[], var_4_167:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_167:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_167:int, and:int(ldc:int(8225), ldc:int(16773)))), ldc:int(5)), and:int(ldc:int(647), ldc:int(5447)))))
                    
                    if (cmpne:boolean(var_4_167:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1DB_0 = stack_227_0 = stack_2A7_0 = var_3_166:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0259)
                }
                
                if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1398751652))
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-1945910700))
                    goto(Label_0165)
                }
                
                var_0_1C9 = and:int(var_0_1C9:int, ldc:int(2042119886))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1B6 = expr_A0:int
                var_3_1BB = newarray:byte[](byte.class, expr_A0:int)
                var_4_1BC = expr_A0:int
                Label_0446:
                
                while (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(4)), ldc:int(0))) {
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-119506869))
                    var_4_1BC = add:int(var_4_1BC:int, ldc:int(-1))
                    storeelement:byte(var_3_1BB:byte[], var_4_1BC:int, add:byte(loadelement:byte(stack_1DB_0:byte[], var_4_1BC:int), ldc:byte(75)))
                    
                    if (cmpne:boolean(var_4_1BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1DB_0 = stack_227_0 = stack_2A7_0 = var_3_1BB:byte[]
                    goto(Label_0165)
                }
                
                var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-2028413287))
                Label_0522:
                
                while (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(4)), ldc:int(0))) {
                    var_0_23F = and:int(var_0_1C9:int, ldc:int(-240785592))
                    var_4_1BC = add:int(var_4_1BC:int, ldc:int(-1))
                    expr_227 = stack_273_2 = loadelement(stack_227_0, var_4_1BC)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1BC:int, ldc:int(4)), neg:int(var_5_1B6:int)), ldc:int(0))) {
                        stack_273_2 = stack_24A_0 = add:byte(expr_227:byte, loadelement:byte(var_3_1BB:byte[], add:int(var_4_1BC:int, ldc:int(4))))
                        goto(Label_0602)
                    }
                    
                    Label_0564:
                    
                    if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(256)), ldc:int(0))) {
                        var_0_23F = and:int(var_0_23F:int, ldc:int(417245986))
                    }
                    else {
                        var_0_23F = and:int(var_0_23F:int, ldc:int(1626856509))
                        stack_273_2 = stack_24A_0 = add:byte(expr_227:byte, ldc:byte(4))
                    }
                    
                    Label_0602:
                    
                    if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(4)), ldc:int(0))) {
                        var_0_23F = and:int(var_0_23F:int, ldc:int(895455910))
                        goto(Label_0564)
                    }
                    
                    var_0_1C9 = and:int(var_0_23F:int, ldc:int(1458962188))
                    storeelement:byte(var_3_1BB:byte[], var_4_1BC:int, stack_273_2:byte)
                    
                    if (cmpne:boolean(var_4_1BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1DB_0 = stack_227_0 = stack_2A7_0 = var_3_1BB:byte[]
                    goto(Label_0208)
                }
                
                var_0_1C9 = and:int(var_0_1C9:int, ldc:int(65526335))
                goto(Label_0446)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0259)
                }
                
                if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(64)), ldc:int(0))) {
                        var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1868033824))
                        loopcontinue()
                    }
                    
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1642129611))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_1B6 = expr_CB:int
                        var_3_1BB = newarray:byte[](byte.class, expr_CB:int)
                        var_4_1BC = expr_CB:int
                        goto(Label_0522)
                    }
                }
                
                Label_0208:
                
                if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-215884668))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(8)), ldc:int(0))) {
                        var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1684153955))
                        loopcontinue()
                    }
                    
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(2028594268))
                    expr_FE = arraylength:int(stack_FE_0:byte[])
                    
                    if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                        var_3_296 = newarray:byte[](byte.class, expr_FE:int)
                        var_4_297 = expr_FE:int
                        
                        loop {
                            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1256681375))
                            var_4_297 = add:int(var_4_297:int, ldc:int(-1))
                            expr_2AA = xor:byte(loadelement:byte(stack_2A7_0:byte[], var_4_297:int), ldc:byte(61))
                            storeelement:byte(var_3_296:byte[], var_4_297:int, or:int(and:int(shl:int(expr_2AA:byte, and:int(ldc:int(18436), ldc:int(71))), ldc:int(-16)), and:int(shr:int(expr_2AA:byte[expected:int], and:int(ldc:int(20548), ldc:int(9365))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_297:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_1DB_0 = stack_227_0 = stack_2A7_0 = var_3_296:byte[]
                    }
                }
                
                Label_0259:
                
                if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(7232), ldc:int(7233)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18241), ldc:int(2209)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-19893), ldc:int(18836)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-23077), ldc:int(18980)), and:int(ldc:int(6817), ldc:int(16676))))
            putstatic:String[](\u120d\u416d\u71ae\u6d99\ubb2b::\u6b5f\uc3e3\ufe34\u9af2\u8350\u51b2, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\ub102\u7049\uc84e\u0c95\u7049(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(1042095629), ldc:int(2142596895))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u120d\u416d\u71ae\u6d99\ubb2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(2056746893))
            var_5_7D = and:int(ldc:int(23051), ldc:int(-23052))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20298), ldc:int(-20331)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_645:int, ldc:int(980922222))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8417), ldc:int(519)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(12617), ldc:int(37)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_CA:int, ldc:int(-1147802907))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(17952), ldc:int(17953)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-863637381))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2063639863))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1530796321))
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-267896240))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2082964082))
                    }
                    else {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2056707062))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1609097512))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(32136489))
                        goto(Label_1087)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1065923120))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-249796848))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(175975985))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1044177773))
                        var_11_DB = and:int(ldc:int(12716), ldc:int(-13295))
                        goto(Label_1471)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1399489345))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1076820599))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-798861886))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1994584716))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(680443175))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1444087399))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1143672243))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(493906062))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1791609247))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1228441067))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1711105914))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(352710693))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(295681422))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(2145167918))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-14584306))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1257510642))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1390899457))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-8544658))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(6409), ldc:int(16549))
                                goto(Label_1087)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1994364242))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1253712731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(89359262))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1924245722))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-21666940))
                        var_11_DB = and:int(ldc:int(12690), ldc:int(-14744))
                    }
                    
                    Label_1087:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1075581429))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1010093871))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(314144852))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(300619222))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1055067283))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1099545826))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1334)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1353192517))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1087)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1038694495))
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1715895356))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-120234))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1471)
                    }
                    
                    Label_1334:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-806301029))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2003493979))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1717900435))
                        goto(Label_1087)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1229623821))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1355688128))
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(1073061573))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1886703022))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(749520686))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-211904849))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1496503457))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1842992432))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-8512962))
                        var_17_650 = add:int(var_16_109:int, xor:int(ldc:int(4224), ldc:int(4225)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(1758127846))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(1042203348))
                
                if (cmple:boolean(var_5_7D = var_17_650:int, sub:int(var_6_84:int, xor:int(ldc:int(-32507), ldc:int(-32508))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
