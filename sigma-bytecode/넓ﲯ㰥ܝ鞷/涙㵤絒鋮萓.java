public class \ub113\ufcaf\u3c25\u071d\u97b7.\u6d99\u3d64\u7d52\u92ee\u8413 {
    public void \u6d99\u3d64\u7d52\u92ee\u8413() {
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
            invokespecial:Object(Object::<init>, this:\u6d99\u3d64\u7d52\u92ee\u8413)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\ud12e\u64f2\u5d20\u6b5f\u965f \u6c52\u4ab3\u8d98\u7049\ub7dc\u8258() {
        var_0_64 : int
        var_2_68 : File
        stack_85_0 : \ud12e\u64f2\u5d20\u6b5f\u965f [generated]
        
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
        var_0_64 = and:int(and:int(ldc:int(-1201281810), ldc:int(-97112774)), ldc:int(-1204755219))
        var_2_68 = invokestatic:File(\u6d99\u3d64\u7d52\u92ee\u8413::\u5bc4\ufe34\uc238\u5f50\u6bb9\u8640)
        
        try {
            var_0_64 = and:int(var_0_64:int, ldc:int(-1083478869))
            stack_85_0 = checkcast:\ud12e\u64f2\u5d20\u6b5f\u965f(\u56bd\u8413\u647c\u5bc4\ud158.\ud12e\u64f2\u5d20\u6b5f\u965f.class, invokevirtual:\ud12e\u64f2\u5d20\u6b5f\u965f(\u3d4b\ud217\u839e\u624e\u6cfe\u3c25::\u0a06\ua61f\u97b7\uceb8\u156b\u5d20, getstatic:\u3d4b\ud217\u839e\u624e\u6cfe\u3c25(\u6d99\u3d64\u7d52\u92ee\u8413::\u97e6\u3a62\uc29a\u16f6\u647c\u5db4), invokestatic:String(FileUtils::readFileToString, var_2_68:File, getstatic:Charset(StandardCharsets::UTF_8)), ldc:Class<\ud12e\u64f2\u5d20\u6b5f\u965f>(\u56bd\u8413\u647c\u5bc4\ud158.\ud12e\u64f2\u5d20\u6b5f\u965f.class)))
            var_0_64 = and:int(var_0_64:int, ldc:int(-14193428))
            return:\ud12e\u64f2\u5d20\u6b5f\u965f(stack_85_0:\ud12e\u64f2\u5d20\u6b5f\u965f)
        }
        catch (java.io.IOException var_3_8A) {
            return:\ud12e\u64f2\u5d20\u6b5f\u965f(initobject:\ud12e\u64f2\u5d20\u6b5f\u965f(\ud12e\u64f2\u5d20\u6b5f\u965f::<init>))
        }
    }
    
    public static void \u9937\ua3b4\u760c\u494c\u34df\u839e(\u56bd\u8413\u647c\u5bc4\ud158.\ud12e\u64f2\u5d20\u6b5f\u965f p0) {
        var_1_96 : int
        var_3_68 : File
        
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
            var_1_96 = and:int(and:int(ldc:int(801486931), ldc:int(-1402020761)), ldc:int(1020133059))
            var_3_68 = invokestatic:File(\u6d99\u3d64\u7d52\u92ee\u8413::\u5bc4\ufe34\uc238\u5f50\u6bb9\u8640)
            
            try {
                do {
                    if (cmpne:boolean(and:int(var_1_96:int, ldc:int(128)), ldc:int(0))) {
                        var_1_96 = and:int(var_1_96:int, ldc:int(1317766547))
                    }
                    else {
                        var_1_96 = and:int(var_1_96:int, ldc:int(-1093796969))
                        invokestatic:void(FileUtils::writeStringToFile, var_3_68:File, invokevirtual:String(\u3d4b\ud217\u839e\u624e\u6cfe\u3c25::\u120d\u4c2b\ud36e\ud158\u8c8a\u9033, getstatic:\u3d4b\ud217\u839e\u624e\u6cfe\u3c25(\u6d99\u3d64\u7d52\u92ee\u8413::\u97e6\u3a62\uc29a\u16f6\u647c\u5db4), p0:\ud12e\u64f2\u5d20\u6b5f\u965f[expected:\u12b2\u8258\u6198\u6c52\uf9c5\u9033]), getstatic:Charset(StandardCharsets::UTF_8))
                    }
                } while (cmpne:boolean(and:int(var_1_96:int, ldc:int(32)), ldc:int(0)))
                
                var_1_96 = and:int(var_1_96:int, ldc:int(-286794745))
            }
            catch (java.io.IOException stack_9E_0) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.io.File \u5bc4\ufe34\uc238\u5f50\u6bb9\u8640() {
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
            return:File(initobject:File(File::<init>, getfield:File(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u836c\u416d\ubefe\u92ff\uf94d, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), loadelement:String(getstatic:String[](\u6d99\u3d64\u7d52\u92ee\u8413::\u98a4\ud4fe\ubcb0\ub171\u3bd6\u3bc9), and:int(ldc:int(-32537), ldc:int(16136)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_235 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1E5_0 : byte[] [generated]
        stack_247_0 : byte[] [generated]
        stack_2B7_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_178 : byte[]
        var_4_179 : int
        expr_A0 : int [generated]
        var_5_1C8 : int
        var_3_1CD : byte[]
        var_4_1CE : int
        expr_1E5 : byte [generated]
        var_0_23D : int
        expr_247 : byte [generated]
        stack_283_2 : byte [generated]
        stack_262_0 : byte [generated]
        expr_CB : int [generated]
        expr_F6 : int [generated]
        var_3_2A6 : byte[]
        var_4_2A7 : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
            var_0_235 = and:int(ldc:int(-1296675739), ldc:int(380986548))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1E5_0 = stack_247_0 = stack_2B7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("G9IIGgR/7YQMK+AKFdXsC+qeF5fr7oyA"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_178 = newarray:byte[](byte.class, expr_6D:int)
                var_4_179 = expr_6D:int
                
                loop {
                    var_0_235 = and:int(var_0_235:int, ldc:int(-1208498349))
                    var_4_179 = add:int(var_4_179:int, ldc:int(-1))
                    storeelement:byte(var_3_178:byte[], var_4_179:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_179:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_179:int, and:int(ldc:int(5421), ldc:int(26755)))), ldc:int(5)), and:int(ldc:int(24815), ldc:int(5639)))))
                    
                    if (cmpne:boolean(var_4_179:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1E5_0 = stack_247_0 = stack_2B7_0 = var_3_178:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_235:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_235:int, ldc:int(1253069021))
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_235:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_235:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_235:int, ldc:int(2083137950))
                    goto(Label_0165)
                }
                
                var_0_235 = and:int(var_0_235:int, ldc:int(-759849015))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1C8 = expr_A0:int
                var_3_1CD = newarray:byte[](byte.class, expr_A0:int)
                var_4_1CE = expr_A0:int
                Label_0464:
                
                while (cmpeq:boolean(and:int(var_0_235:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_235:int, ldc:int(-16988573))
                    var_4_1CE = add:int(var_4_1CE:int, ldc:int(-1))
                    expr_1E5 = loadelement:byte(stack_1E5_0:byte[], var_4_1CE:int)
                    storeelement:byte(var_3_1CD:byte[], var_4_1CE:int, or:int(and:int(shl:int(expr_1E5:byte, xor:int(ldc:int(1121), ldc:int(1125))), ldc:int(-16)), and:int(shr:int(expr_1E5:byte[expected:int], xor:int(ldc:int(-16222), ldc:int(-16218))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_1CE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1E5_0 = stack_247_0 = stack_2B7_0 = var_3_1CD:byte[]
                    goto(Label_0165)
                }
                
                Label_0554:
                
                while (cmpeq:boolean(and:int(var_0_235:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_23D = and:int(var_0_235:int, ldc:int(855083795))
                    var_4_1CE = add:int(var_4_1CE:int, ldc:int(-1))
                    expr_247 = stack_283_2 = loadelement(stack_247_0, var_4_1CE)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1CE:int, ldc:int(2)), neg:int(var_5_1C8:int)), ldc:int(0))) {
                        stack_283_2 = stack_262_0 = add:byte(expr_247:byte, loadelement:byte(var_3_1CD:byte[], add:int(var_4_1CE:int, ldc:int(2))))
                        goto(Label_0626)
                    }
                    
                    Label_0596:
                    
                    if (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(512)), ldc:int(0))) {
                        var_0_23D = and:int(var_0_23D:int, ldc:int(2126368695))
                        stack_283_2 = stack_262_0 = add:byte(expr_247:byte, ldc:byte(2))
                    }
                    
                    Label_0626:
                    
                    if (cmpeq:boolean(and:int(var_0_23D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0596)
                    }
                    
                    var_0_235 = and:int(var_0_23D:int, ldc:int(-537075722))
                    storeelement:byte(var_3_1CD:byte[], var_4_1CE:int, stack_283_2:byte)
                    
                    if (cmpne:boolean(var_4_1CE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1E5_0 = stack_247_0 = stack_2B7_0 = var_3_1CD:byte[]
                    goto(Label_0208)
                }
                
                var_0_235 = and:int(var_0_235:int, ldc:int(-1717033820))
                goto(Label_0464)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_235:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_235:int, ldc:int(453504475))
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_235:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_235:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_235 = and:int(var_0_235:int, ldc:int(-742651733))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_1C8 = expr_CB:int
                        var_3_1CD = newarray:byte[](byte.class, expr_CB:int)
                        var_4_1CE = expr_CB:int
                        goto(Label_0554)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_0_235:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_235:int, ldc:int(4096)), ldc:int(0))) {
                        var_0_235 = and:int(var_0_235:int, ldc:int(130717365))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_235:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_235 = and:int(var_0_235:int, ldc:int(-134344695))
                    expr_F6 = arraylength:int(stack_F6_0:byte[])
                    
                    if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                        var_3_2A6 = newarray:byte[](byte.class, expr_F6:int)
                        var_4_2A7 = expr_F6:int
                        
                        loop {
                            var_0_235 = and:int(var_0_235:int, ldc:int(519463857))
                            var_4_2A7 = add:int(var_4_2A7:int, ldc:int(-1))
                            storeelement:byte(var_3_2A6:byte[], var_4_2A7:int, xor:byte(add:byte(loadelement:byte(stack_2B7_0:byte[], var_4_2A7:int), ldc:byte(44)), ldc:byte(26)))
                            
                            if (cmpne:boolean(var_4_2A7:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1E5_0 = stack_247_0 = stack_2B7_0 = var_3_2A6:byte[]
                    }
                }
                
                Label_0251:
                
                if (cmpeq:boolean(and:int(var_0_235:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_235:int, ldc:int(354675656))
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_235:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_235 = and:int(var_0_235:int, ldc:int(-1831280407))
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_235:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_165_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17449), ldc:int(6273)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10245), ldc:int(10244)))
            storeelement:String(expr_144:String[], and:int(ldc:int(8725), ldc:int(-8734)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(22363), ldc:int(-30716)), and:int(ldc:int(7415), ldc:int(8471))))
            putstatic:String[](\u6d99\u3d64\u7d52\u92ee\u8413::\u98a4\ud4fe\ubcb0\ub171\u3bd6\u3bc9, expr_144:String[])
            putstatic:\u3d4b\ud217\u839e\u624e\u6cfe\u3c25(\u6d99\u3d64\u7d52\u92ee\u8413::\u97e6\u3a62\uc29a\u16f6\u647c\u5db4, initobject:\u3d4b\ud217\u839e\u624e\u6cfe\u3c25(\u3d4b\ud217\u839e\u624e\u6cfe\u3c25::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u12cb\u62da\u6fb0\u6435\u7d52\ub19c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_64A : int
        
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
        var_3_63F = and:int(ldc:int(1876203333), ldc:int(2144845605))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d99\u3d64\u7d52\u92ee\u8413[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(-714210))
        }
        else {
            var_3_63F = and:int(var_3_63F:int, ldc:int(-1008740963))
            var_5_85 = and:int(ldc:int(-31833), ldc:int(31832))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22552), ldc:int(-22553)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_63F:int, ldc:int(-606290025))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(20520), ldc:int(20521)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(21057), ldc:int(3099)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_63F = and:int(var_3_DA:int, ldc:int(1205654965))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2145), ldc:int(20483)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2044506141))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(921415905))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1242845823))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1008804431))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-148317311))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1534344296))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(80023469))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1016852299))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2039321689))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-829304971))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-201345113))
                        var_11_EB = and:int(ldc:int(-27504), ldc:int(25454))
                        goto(Label_1492)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(454251566))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1576774864))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(527624595))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-192052871))
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(940727042))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1936243346))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-740917409))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1306459971))
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(473228730))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1647499077))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1454536294))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-939687987))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0817:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1279926753))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-310631594))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1192580992))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1443627565))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1428128116))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-404881563))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(24577), ldc:int(3633))
                                goto(Label_1061)
                            }
                        }
                    }
                    
                    Label_0944:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-336273567))
                        var_11_EB = and:int(ldc:int(11456), ldc:int(-11457))
                    }
                    
                    Label_1061:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1382859709))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1986404726))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1546366843))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(611119606))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(787833488))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1910313062))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1207287201))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1344)
                            }
                        }
                    }
                    
                    Label_1197:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1473275615))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(147585377))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-299859079))
                            goto(Label_1061)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1422657323))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(895955009))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-730023793))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-270674521))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1492)
                    }
                    
                    Label_1344:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1084817842))
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-263318205))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1529601707))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1540015780))
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1161472144))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1148613665))
                        loopcontinue()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(1341464511))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1492:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1503:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1992446152))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1638476453))
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1543249221))
                        var_17_64A = add:int(var_16_119:int, xor:int(ldc:int(75), ldc:int(74)))
                        looporswitchbreak()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(-1875391630))
                }
                
                var_3_63F = and:int(var_3_63F:int, ldc:int(1610071357))
                
                if (cmple:boolean(var_5_85 = var_17_64A:int, sub:int(var_6_8C:int, and:int(ldc:int(4751), ldc:int(17505))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(483964629))
            goto(Label_0106)
        }
    }
}
