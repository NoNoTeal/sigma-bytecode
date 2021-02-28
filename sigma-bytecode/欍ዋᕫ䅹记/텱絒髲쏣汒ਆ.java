public class \u6b0d\u12cb\u156b\u4179\u8bb0.\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06 {
    public void \ud171\u7d52\u9af2\uc3e3\u6c52\u0a06(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0, java.nio.file.Path p1) {
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
            putfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u56bd\u51b2\u9033\u9a18\u927d\u4ab3, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be)
            putfield:Path(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u839e\u960f\u8308\u516c\u6cfe\u7006, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06, p1:Path)
            invokespecial:SimpleFileVisitor(SimpleFileVisitor::<init>, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path p0, java.nio.file.attribute.BasicFileAttributes p1) {
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
            
            if (logicalnot:boolean(invokeinterface:boolean(Path::equals, p0:Path, getfield:Path[expected:Object](\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u839e\u960f\u8308\u516c\u6cfe\u7006, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06)))) {
                invokeinterface:void(Logger::debug, invokestatic:Logger(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\u0b8e\u4492\ufe34\u4ab3\u4bc8\ube23), loadelement:String(getstatic:String[](\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u8bb0\u9033\u3d64\u960f\uf94d\ud7e8), and:int(ldc:int(-20774), ldc:int(20772))), p0:Path[expected:Object])
                invokestatic:void(Files::delete, p0:Path)
            }
            
            return:FileVisitResult(getstatic:FileVisitResult(FileVisitResult::CONTINUE))
        }
        
        goto(Label_0006)
    }
    
    public java.nio.file.FileVisitResult postVisitDirectory(java.nio.file.Path p0, java.io.IOException p1) {
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
        
        if (cmpeq:boolean(p1:IOException, aconstnull:IOException())) {
            if (invokeinterface:boolean(Path::equals, p0:Path, invokestatic:Path[expected:Object](\uae87\ub19c\u9937\u836c\u34df\ub8be::\u16f6\u527a\ucb79\u64f2\u72f1\uc87f, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u56bd\u51b2\u9033\u9a18\u927d\u4ab3, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06)))) {
                invokevirtual:void(\ub7dc\u64f2\u385b\ud171\u760c::close, invokestatic:\ub7dc\u64f2\u385b\ud171\u760c(\uae87\ub19c\u9937\u836c\u34df\ub8be::\uc238\u9af2\u5fe1\u6fb0\ub32d\uafe7, getfield:\uae87\ub19c\u9937\u836c\u34df\ub8be(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u56bd\u51b2\u9033\u9a18\u927d\u4ab3, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06)))
                invokestatic:boolean(Files::deleteIfExists, getfield:Path(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u839e\u960f\u8308\u516c\u6cfe\u7006, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06))
            }
            
            invokestatic:void(Files::delete, p0:Path)
            return:FileVisitResult(getstatic:FileVisitResult(FileVisitResult::CONTINUE))
        }
        
        athrow(p1:IOException)
    }
    
    public java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object p0, java.io.IOException p1) {
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
            return:FileVisitResult(invokevirtual:FileVisitResult(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::postVisitDirectory, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06, checkcast:Path(java.nio.file.Path.class, p0:Object[expected:Path]), p1:IOException))
        }
        
        goto(Label_0006)
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
            return:FileVisitResult(invokevirtual:FileVisitResult(\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::visitFile, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06, checkcast:Path(java.nio.file.Path.class, p0:Object[expected:Path]), p1:BasicFileAttributes))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19F : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_149_0 : byte[] [generated]
        stack_1B1_0 : byte[] [generated]
        stack_21E_0 : byte[] [generated]
        var_4_12C : int
        var_3_131 : byte[]
        var_5_132 : int
        expr_149 : byte [generated]
        var_0_1A7 : int
        expr_1B1 : byte [generated]
        stack_1ED_2 : byte [generated]
        stack_1CC_0 : byte [generated]
        var_0_7B : int
        expr_8F : int [generated]
        var_2_B9 : byte[]
        expr_BD : int [generated]
        var_3_20D : byte[]
        var_5_20E : int
        var_3_F2 : String
        stack_125_0 : String[] [generated]
        expr_104 : String[] [generated]
        
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
        var_0_19F = and:int(ldc:int(1492533044), ldc:int(-241640259))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B9_0 = stack_BB_0 = stack_E6_0 = stack_149_0 = stack_1B1_0 = stack_21E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Id5nZ8bKQoMAYIB1")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_12C = expr_6B:int
        var_3_131 = newarray:byte[](byte.class, expr_6B:int)
        var_5_132 = expr_6B:int
        Label_0308:
        
        while (cmpne:boolean(and:int(var_0_19F:int, ldc:int(16)), ldc:int(0))) {
            var_0_19F = and:int(var_0_19F:int, ldc:int(-464880131))
            var_5_132 = add:int(var_5_132:int, ldc:int(-1))
            expr_149 = loadelement:byte(stack_149_0:byte[], var_5_132:int)
            storeelement:byte(var_3_131:byte[], var_5_132:int, xor:int(add:int(or:int(and:int(shl:int(expr_149:byte, and:int(ldc:int(2374), ldc:int(18084))), ldc:int(-16)), and:int(shr:int(expr_149:byte[expected:int], xor:int(ldc:int(13379), ldc:int(13383))), ldc:int(15))), ldc:int(78)), ldc:int(59)))
            
            if (cmpne:boolean(var_5_132:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_E6_0 = stack_149_0 = stack_1B1_0 = stack_21E_0 = var_3_131:byte[]
            goto(Label_0112)
        }
        
        Label_0404:
        
        while (cmpeq:boolean(and:int(var_0_19F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1A7 = and:int(var_0_19F:int, ldc:int(2108907312))
            var_5_132 = add:int(var_5_132:int, ldc:int(-1))
            expr_1B1 = stack_1ED_2 = loadelement(stack_1B1_0, var_5_132)
            
            if (cmplt:boolean(add:int(add:int(var_5_132:int, ldc:int(2)), neg:int(var_4_12C:int)), ldc:int(0))) {
                stack_1ED_2 = stack_1CC_0 = add:byte(expr_1B1:byte, loadelement:byte(var_3_131:byte[], add:int(var_5_132:int, ldc:int(2))))
                goto(Label_0476)
            }
            
            Label_0446:
            
            if (cmpne:boolean(and:int(var_0_1A7:int, ldc:int(16)), ldc:int(0))) {
                var_0_1A7 = and:int(var_0_1A7:int, ldc:int(-800874945))
                stack_1ED_2 = stack_1CC_0 = add:byte(expr_1B1:byte, ldc:byte(2))
            }
            
            Label_0476:
            
            if (cmpne:boolean(and:int(var_0_1A7:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0446)
            }
            
            var_0_19F = and:int(var_0_1A7:int, ldc:int(-656573123))
            storeelement:byte(var_3_131:byte[], var_5_132:int, stack_1ED_2:byte)
            
            if (cmpne:boolean(var_5_132:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_E6_0 = stack_149_0 = stack_1B1_0 = stack_21E_0 = var_3_131:byte[]
            goto(Label_0148)
        }
        
        var_0_19F = and:int(var_0_19F:int, ldc:int(1851087904))
        goto(Label_0308)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_19F:int, ldc:int(32)), ldc:int(0))) {
            var_0_7B = and:int(var_0_19F:int, ldc:int(585513547))
            goto(Label_0194)
        }
        
        if (cmpeq:boolean(and:int(var_0_19F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_19F = and:int(var_0_19F:int, ldc:int(-375284496))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_12C = expr_8F:int
                var_3_131 = newarray:byte[](byte.class, expr_8F:int)
                var_5_132 = expr_8F:int
                goto(Label_0404)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_19F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_7B = and:int(var_0_19F:int, ldc:int(-1845696078))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_19F:int, ldc:int(2048)), ldc:int(0))) {
                var_0_19F = and:int(var_0_19F:int, ldc:int(-1938584812))
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_19F:int, ldc:int(1301961979))
            var_2_B9 = stack_B9_0:byte[]
            expr_BD = add:int(arraylength:int(stack_BB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                var_3_20D = newarray:byte[](byte.class, expr_BD:int)
                var_5_20E = expr_BD:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(2003369652))
                    var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
                    storeelement:byte(var_3_20D:byte[], var_5_20E:int, add:int(shl:int(loadelement:byte(stack_21E_0:byte[], var_5_20E:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_B9:byte[], add:int(var_5_20E:int, and:int(ldc:int(2049), ldc:int(1059)))), ldc:int(5)), and:int(ldc:int(16807), ldc:int(9759)))))
                    
                    if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_E6_0 = stack_149_0 = stack_1B1_0 = stack_21E_0 = var_3_20D:byte[]
            }
        }
        
        Label_0194:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_19F = and:int(var_0_7B:int, ldc:int(1494548860))
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_19F = and:int(var_0_7B:int, ldc:int(1280565549))
            goto(Label_0112)
        }
        
        var_3_F2 = initobject:String(String::<init>, stack_E6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_125_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6164), ldc:int(6165)))
        expr_104 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12729), ldc:int(1027)))
        storeelement:String(expr_104:String[], and:int(ldc:int(22122), ldc:int(-22123)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(2093), ldc:int(-2094)), xor:int(ldc:int(6419), ldc:int(6424))))
        putstatic:String[](\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06::\u8bb0\u9033\u3d64\u960f\uf94d\ud7e8, expr_104:String[])
    }
    
    public void \u0c95\u4cd9\u4975\u6d99\u4ab3\u8308(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_652 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_65D : int
        
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
        var_3_652 = and:int(ldc:int(1194313566), ldc:int(-461519506))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_652 = and:int(var_3_652:int, ldc:int(443708716))
        }
        else {
            var_3_652 = and:int(var_3_652:int, ldc:int(-546463882))
            var_5_85 = and:int(ldc:int(-722), ldc:int(721))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(15433), ldc:int(-31820)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_652:int, ldc:int(-37898400))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(9745), ldc:int(37)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(17433), ldc:int(263)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_652 = and:int(var_3_DA:int, ldc:int(2088626126))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16393), ldc:int(6225)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1590783941))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1910695645))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1331232503))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-739524956))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-987405955))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1688869942))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-139460762))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1911966141))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-516104795))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1393695378))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1698555217))
                            var_11_EB = and:int(ldc:int(-888), ldc:int(819))
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(184427647))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(878460203))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1732307854))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1204510907))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1651913404))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(424287823))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-429008947))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1496660698))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1812786373))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1347898458))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(428741097))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-264272488))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-165786838))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(1152382841))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1168418695))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(889780436))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-966307334))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-998922332))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-726694562))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(1233), ldc:int(4099))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-2115361899))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(695316860))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1423564229))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1317611003))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(351085454))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-948973569))
                        var_11_EB = and:int(ldc:int(24624), ldc:int(-24625))
                    }
                    
                    Label_1123:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1882888431))
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(660055726))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-78260337))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(2097005890))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1378)
                            }
                        }
                    }
                    
                    Label_1230:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-2066187281))
                            goto(Label_1123)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1833382892))
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1940767756))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-2114233075))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1604282633))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(633636864))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-4342301))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1508)
                    }
                    
                    Label_1378:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1473499261))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1451927091))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1811904361))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(283267018))
                        loopcontinue()
                    }
                    
                    var_3_652 = and:int(var_3_652:int, ldc:int(1605221715))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1270860706))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-785723562))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1336664649))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-940582934))
                        var_17_65D = add:int(var_16_119:int, and:int(ldc:int(129), ldc:int(5639)))
                        looporswitchbreak()
                    }
                }
                
                var_3_652 = and:int(var_3_652:int, ldc:int(1681907707))
                
                if (cmple:boolean(var_5_85 = var_17_65D:int, sub:int(var_6_8C:int, xor:int(ldc:int(24644), ldc:int(24645))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_652 = and:int(var_3_652:int, ldc:int(-152602988))
            goto(Label_0106)
        }
    }
}
