public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc84e\u760c\u6c56\u52d3\u8640\u647c {
    public void \uc84e\u760c\u6c56\u52d3\u8640\u647c() {
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
            invokespecial:Object(Object::<init>, this:\uc84e\u760c\u6c56\u52d3\u8640\u647c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \ud12e\u5fe1\u8640\u8753\u0b8e\ud217(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0) {
        var_1_5F : int
        stack_83_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1067963460), ldc:int(-374822978))
            
            if (cmpne:boolean(p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, aconstnull:\uf9c5\ud158\u4975\uf94d\ud523\uc31c())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-50528258))
                stack_83_0 = invokestatic:int(\uc84e\u760c\u6c56\u52d3\u8640\u647c::\ud12e\u5fe1\u8640\u8753\u0b8e\ud217, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
            }
            else {
                stack_83_0 = and:int(ldc:int(20005), ldc:int(-24104))
            }
            
            return:int(stack_83_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static int \ud12e\u5fe1\u8640\u8753\u0b8e\ud217(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p0) {
        var_1_BD : int
        stack_F0_0 : int [generated]
        
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
        var_1_BD = and:int(ldc:int(-1570922416), ldc:int(-35788573))
        
        if (cmpne:boolean(p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_BD:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0163)
                }
                
                if (cmpeq:boolean(and:int(var_1_BD:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_BD = and:int(var_1_BD:int, ldc:int(-86038287))
                    
                    if (cmpeq:boolean(p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e))) {
                        return:int(and:int(ldc:int(18606), ldc:int(-18607)))
                    }
                }
                
                Label_0129:
                
                if (cmpne:boolean(and:int(var_1_BD:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_BD = and:int(var_1_BD:int, ldc:int(1827894925))
                        loopcontinue()
                    }
                    
                    var_1_BD = and:int(var_1_BD:int, ldc:int(-1176589275))
                    
                    if (cmpeq:boolean(p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b))) {
                        stack_F0_0 = and:int(ldc:int(2113), ldc:int(17807))
                        looporswitchbreak()
                    }
                }
                
                Label_0163:
                
                if (cmpne:boolean(and:int(var_1_BD:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0129)
                }
                
                if (cmpeq:boolean(and:int(var_1_BD:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_BD = and:int(var_1_BD:int, ldc:int(-528488528))
                    stack_F0_0 = and:int(ldc:int(-23815), ldc:int(23810))
                    looporswitchbreak()
                }
                
                var_1_BD = and:int(var_1_BD:int, ldc:int(858476691))
            }
            
            return:int(stack_F0_0:int)
        }
        
        return:int(ldc:int(-1))
    }
    
    public static boolean \u6b5f\u4f52\ufcaf\ub8be\u8d90\u494c(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0) {
        var_1_5F : int
        stack_89_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(905486275), ldc:int(-1346437253))
            
            if (cmpne:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1335803209))
                stack_89_0 = and:int(ldc:int(953), ldc:int(-954))
            }
            else {
                stack_89_0 = xor:int(ldc:int(9236), ldc:int(9237))
            }
            
            return:boolean(stack_89_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u5fe1\u7d52\u3d64\u6ec6\u69d9\u2dcc(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0) {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-237552), ldc:int(-35319535))
            
            if (cmpne:boolean(invokestatic:int(\uc84e\u760c\u6c56\u52d3\u8640\u647c::\ud12e\u5fe1\u8640\u8753\u0b8e\ud217, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-36391469))
                stack_8B_0 = and:int(ldc:int(3613), ldc:int(-11806))
            }
            else {
                stack_8B_0 = and:int(ldc:int(16643), ldc:int(1101))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ubff1\u9a18\u2dcc\uc246\u120d\u67e9(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0) {
        var_1_5F : int
        stack_89_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(2132480614), ldc:int(-1083294521))
            
            if (cmpne:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1853845247))
                stack_89_0 = and:int(ldc:int(-25863), ldc:int(25862))
            }
            else {
                stack_89_0 = xor:int(ldc:int(308), ldc:int(309))
            }
            
            return:boolean(stack_89_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\ud158\u7043\u527a\ua068\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5B5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5C0 : int
        
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
        var_3_5B5 = and:int(ldc:int(-887989484), ldc:int(-872998121))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc84e\u760c\u6c56\u52d3\u8640\u647c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(523992924))
            var_5_7D = and:int(ldc:int(17349), ldc:int(-26598))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8395), ldc:int(-8656)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5B5:int, ldc:int(-809787395))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(6491), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(24600), ldc:int(24601)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5B5 = and:int(var_3_CA:int, ldc:int(-1678525481))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(777), ldc:int(16449)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1223328129))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1855838466))
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(411212616))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1118759477))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1948263562))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(729861262))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-2112735239))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1821551705))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-2125593827))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-549569605))
                            var_11_DB = and:int(ldc:int(20230), ldc:int(-28615))
                            goto(Label_1343)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(624811761))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-10829868))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1888950450))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(604794259))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1934797965))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1396597825))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-26145466))
                            loopcontinue()
                        }
                        
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1619584066))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-157863091))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-2090387983))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(883093829))
                            loopcontinue()
                        }
                        
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1889559754))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(13824), ldc:int(13825))
                                goto(Label_0979)
                            }
                        }
                    }
                    
                    Label_0849:
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-994084166))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-2139227991))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1625670767))
                        var_11_DB = and:int(ldc:int(-2250), ldc:int(2249))
                    }
                    
                    Label_0979:
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1144801232))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1989040778))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-743298211))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1424387275))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-382860644))
                            loopcontinue()
                        }
                        
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(268074935))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1212)
                            }
                        }
                    }
                    
                    Label_1098:
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1366566507))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0979)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-35281801))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5B5 = and:int(var_3_5B5:int, ldc:int(315886346))
                            loopcontinue()
                        }
                        
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(454975382))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1343)
                    }
                    
                    Label_1212:
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(859266270))
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1030488202))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1010173296))
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1605503067))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(48245904))
                        loopcontinue()
                    }
                    
                    var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-15246411))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1343:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1354:
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1603257258))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1336585554))
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(1896643720))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(116508362))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5B5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-1891648650))
                        var_17_5C0 = add:int(var_16_109:int, xor:int(ldc:int(17088), ldc:int(17089)))
                        looporswitchbreak()
                    }
                    
                    var_3_5B5 = and:int(var_3_5B5:int, ldc:int(-2109935702))
                }
                
                var_3_5B5 = and:int(var_3_5B5:int, ldc:int(794197918))
                
                if (cmple:boolean(var_5_7D = var_17_5C0:int, sub:int(var_6_84:int, xor:int(ldc:int(1248), ldc:int(1249))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5B5:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
