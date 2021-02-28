public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe {
    public void \u7e3f\u0800\ub70c\ud36e\u8640\ud4fe(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0, java.nio.file.Path p1, java.util.zip.ZipOutputStream p2) {
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
            putfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u0a06\u4bc8\u4179\u5db4\u6b0d\u7043, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be)
            putfield:Path(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u8640\uc84e\u4f52\uc910\u5654\ub7dc, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe, p1:Path)
            putfield:ZipOutputStream(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u3e2a\uf9c5\u836c\ub113\u4cd9\u3776, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe, p2:ZipOutputStream)
            invokespecial:SimpleFileVisitor(SimpleFileVisitor::<init>, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path p0, java.nio.file.attribute.BasicFileAttributes p1) {
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
        
        if (logicalnot:boolean(invokeinterface:boolean(Path::endsWith, p0:Path, loadelement:String(getstatic:String[](\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u98a4\u9033\ubded\ub6ab\u960f\u3504), and:int(ldc:int(-11881), ldc:int(11872)))))) {
            invokevirtual:void(ZipOutputStream::putNextEntry, getfield:ZipOutputStream(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u3e2a\uf9c5\u836c\ub113\u4cd9\u3776, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe), initobject:ZipEntry(ZipEntry::<init>, invokevirtual:String(String::replace, invokeinterface:String(Path::toString, invokeinterface:Path(Path::resolve, getfield:Path(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u8640\uc84e\u4f52\uc910\u5654\ub7dc, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe), invokeinterface:Path(Path::relativize, invokestatic:Path(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u16f6\u527a\ucb79\u64f2\u72f1\uc87f, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u0a06\u4bc8\u4179\u5db4\u6b0d\u7043, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe)), p0:Path))), ldc:char(92), ldc:char(47))))
            invokevirtual:long(ByteSource::copyTo, invokestatic:ByteSource(Files::asByteSource, invokeinterface:File(Path::toFile, p0:Path)), getfield:ZipOutputStream[expected:OutputStream](\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u3e2a\uf9c5\u836c\ub113\u4cd9\u3776, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe))
            invokevirtual:void(ZipOutputStream::closeEntry, getfield:ZipOutputStream(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u3e2a\uf9c5\u836c\ub113\u4cd9\u3776, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe))
            return:FileVisitResult(getstatic:FileVisitResult(FileVisitResult::CONTINUE))
        }
        
        return:FileVisitResult(getstatic:FileVisitResult(FileVisitResult::CONTINUE))
    }
    
    public java.nio.file.FileVisitResult visitFile(java.lang.Object p0, java.nio.file.attribute.BasicFileAttributes p1) {
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
            return:FileVisitResult(invokevirtual:FileVisitResult(\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::visitFile, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe, checkcast:Path(java.nio.file.Path.class, p0:Object[expected:Path]), p1:BasicFileAttributes))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A8 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_248_0 : byte[] [generated]
        stack_2C8_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_17E : byte[]
        var_4_17F : int
        expr_98 : int [generated]
        var_5_1CE : int
        var_3_1D3 : byte[]
        var_4_1D4 : int
        expr_1EE : byte [generated]
        var_0_260 : int
        expr_248 : byte [generated]
        stack_294_2 : byte [generated]
        stack_26B_0 : byte [generated]
        expr_CB : int [generated]
        expr_FE : int [generated]
        var_3_2B7 : byte[]
        var_4_2B8 : int
        var_3_142 : String
        stack_175_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
            var_0_A8 = and:int(ldc:int(1050923612), ldc:int(749985114))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1EB_0 = stack_248_0 = stack_2C8_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BPJ9dRD/enZWLqywsA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_17E = newarray:byte[](byte.class, expr_6D:int)
                var_4_17F = expr_6D:int
                
                loop {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(1051413362))
                    var_4_17F = add:int(var_4_17F:int, ldc:int(-1))
                    storeelement:byte(var_3_17E:byte[], var_4_17F:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_17F:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_17F:int, and:int(ldc:int(9233), ldc:int(897)))), ldc:int(3)), xor:int(ldc:int(1044), ldc:int(1035)))))
                    
                    if (cmpne:boolean(var_4_17F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1EB_0 = stack_248_0 = stack_2C8_0 = var_3_17E:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0259)
                }
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(16)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(2076721347))
                    goto(Label_0157)
                }
                
                var_0_A8 = and:int(var_0_A8:int, ldc:int(1878784247))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1CE = expr_98:int
                var_3_1D3 = newarray:byte[](byte.class, expr_98:int)
                var_4_1D4 = expr_98:int
                Label_0470:
                
                while (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-1359778474))
                    var_4_1D4 = add:int(var_4_1D4:int, ldc:int(-1))
                    expr_1EE = add:byte(loadelement:byte(stack_1EB_0:byte[], var_4_1D4:int), ldc:byte(17))
                    storeelement:byte(var_3_1D3:byte[], var_4_1D4:int, or:int(and:int(shl:int(expr_1EE:byte, xor:int(ldc:int(2370), ldc:int(2374))), ldc:int(-16)), and:int(shr:int(expr_1EE:byte[expected:int], xor:int(ldc:int(1027), ldc:int(1031))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_1D4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1EB_0 = stack_248_0 = stack_2C8_0 = var_3_1D3:byte[]
                    goto(Label_0157)
                }
                
                Label_0563:
                
                while (cmpne:boolean(and:int(var_0_A8:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_260 = and:int(var_0_A8:int, ldc:int(-1398054058))
                    var_4_1D4 = add:int(var_4_1D4:int, ldc:int(-1))
                    expr_248 = stack_294_2 = loadelement(stack_248_0, var_4_1D4)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1D4:int, ldc:int(4)), neg:int(var_5_1CE:int)), ldc:int(0))) {
                        stack_294_2 = stack_26B_0 = add:byte(expr_248:byte, loadelement:byte(var_3_1D3:byte[], add:int(var_4_1D4:int, ldc:int(4))))
                        goto(Label_0635)
                    }
                    
                    Label_0597:
                    
                    if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(536870912)), ldc:int(0))) {
                        var_0_260 = and:int(var_0_260:int, ldc:int(1478742129))
                    }
                    else {
                        var_0_260 = and:int(var_0_260:int, ldc:int(-290366221))
                        stack_294_2 = stack_26B_0 = add:byte(expr_248:byte, ldc:byte(4))
                    }
                    
                    Label_0635:
                    
                    if (cmpeq:boolean(and:int(var_0_260:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_260 = and:int(var_0_260:int, ldc:int(63245159))
                        goto(Label_0597)
                    }
                    
                    var_0_A8 = and:int(var_0_260:int, ldc:int(1826734166))
                    storeelement:byte(var_3_1D3:byte[], var_4_1D4:int, stack_294_2:byte)
                    
                    if (cmpne:boolean(var_4_1D4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1EB_0 = stack_248_0 = stack_2C8_0 = var_3_1D3:byte[]
                    goto(Label_0208)
                }
                
                goto(Label_0470)
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(1452299015))
                    goto(Label_0259)
                }
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(1)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(821898466))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-1096155816))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_1CE = expr_CB:int
                        var_3_1D3 = newarray:byte[](byte.class, expr_CB:int)
                        var_4_1D4 = expr_CB:int
                        goto(Label_0563)
                    }
                }
                
                Label_0208:
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-385902874))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(64)), ldc:int(0))) {
                        var_0_A8 = and:int(var_0_A8:int, ldc:int(1369193631))
                        loopcontinue()
                    }
                    
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(2126333810))
                    expr_FE = arraylength:int(stack_FE_0:byte[])
                    
                    if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                        var_3_2B7 = newarray:byte[](byte.class, expr_FE:int)
                        var_4_2B8 = expr_FE:int
                        
                        loop {
                            var_0_A8 = and:int(var_0_A8:int, ldc:int(-273327397))
                            var_4_2B8 = add:int(var_4_2B8:int, ldc:int(-1))
                            storeelement:byte(var_3_2B7:byte[], var_4_2B8:int, xor:byte(loadelement:byte(stack_2C8_0:byte[], var_4_2B8:int), ldc:byte(29)))
                            
                            if (cmpne:boolean(var_4_2B8:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_1EB_0 = stack_248_0 = stack_2C8_0 = var_3_2B7:byte[]
                    }
                }
                
                Label_0259:
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(1503490889))
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(256)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-1980415723))
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_A8 = and:int(var_0_A8:int, ldc:int(-867470703))
            }
            
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_175_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24577), ldc:int(5331)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8961), ldc:int(17489)))
            storeelement:String(expr_154:String[], and:int(ldc:int(23808), ldc:int(-23815)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(18604), ldc:int(-18622)), xor:int(ldc:int(10245), ldc:int(10249))))
            putstatic:String[](\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe::\u98a4\u9033\ubded\ub6ab\u960f\u3504, expr_154:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u56bd\u67e9\uff55\u92ff\u12b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_673 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_67E : int
        
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
        var_3_673 = and:int(ldc:int(-18284405), ldc:int(-1258741379))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7e3f\u0800\ub70c\ud36e\u8640\ud4fe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
            var_3_673 = and:int(var_3_673:int, ldc:int(1542017839))
            var_5_7D = and:int(ldc:int(5420), ldc:int(-5437))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1593), ldc:int(1592)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_673:int, ldc:int(-100835383))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8321), ldc:int(17439)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(25), ldc:int(8197)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_673 = and:int(var_3_CA:int, ldc:int(-221307553))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2057), ldc:int(5089)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(204133708))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-922356667))
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0853)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1524294616))
                    }
                    else {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-168213299))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0555)
                            }
                            
                            goto(Label_0853)
                        }
                    }
                    
                    Label_0377:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(211094053))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(2139555623))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(429417068))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1849268436))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1221329995))
                        goto(Label_0853)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1208553355))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1036999787))
                            var_11_DB = and:int(ldc:int(5345), ldc:int(-21738))
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0555:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1724227702))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(105274785))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1107000291))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1752911375))
                        goto(Label_0853)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(320999694))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-197856958))
                            goto(Label_0377)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(938408335))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0853)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(888189324))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(622759187))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1086019741))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1795471916))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1295182536))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(206176097))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-879364548))
                            goto(Label_0377)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1268899210))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-537039111))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0853:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(2146422016))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(2114156201))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1180454175))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-2145464121))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-780346947))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0377)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1055158004))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1748434999))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(25105), ldc:int(1293))
                                goto(Label_1151)
                            }
                        }
                    }
                    
                    Label_0989:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1894849294))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0853)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(856523323))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(992695834))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(86427186))
                            goto(Label_0377)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1797554194))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1747048977))
                        var_11_DB = and:int(ldc:int(2516), ldc:int(-6653))
                    }
                    
                    Label_1151:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-867182193))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0989)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1348183216))
                            goto(Label_0853)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1211938589))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-553863409))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1393)
                            }
                        }
                    }
                    
                    Label_1261:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(136459170))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(630939103))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-606647181))
                            goto(Label_1151)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0989)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0853)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(905236508))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0377)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1797652387))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1393:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-2007863321))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1030620273))
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1867147904))
                        goto(Label_0853)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(725445320))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_673 = and:int(var_3_673:int, ldc:int(1006412459))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-256985645))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1695623958))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-696277376))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0853)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1316931938))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1417042510))
                        goto(Label_0377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1357766941))
                        var_17_67E = add:int(var_16_109:int, xor:int(ldc:int(16548), ldc:int(16549)))
                        looporswitchbreak()
                    }
                }
                
                var_3_673 = and:int(var_3_673:int, ldc:int(-553771829))
                
                if (cmple:boolean(var_5_7D = var_17_67E:int, sub:int(var_6_84:int, and:int(ldc:int(8257), ldc:int(5005))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
